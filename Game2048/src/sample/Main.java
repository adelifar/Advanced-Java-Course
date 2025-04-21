package sample;

import javafx.application.Application;
import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.geometry.Bounds;
import javafx.geometry.Rectangle2D;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.util.Locale;

public class Main extends Application {
    private GamePane root;

    @Override
    public void start(Stage primaryStage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
        root = new GamePane();
        final Scene scene = new Scene(root);
        scene.getStylesheets().add("sample/game.css");
        if (isARMDevice()) {
            primaryStage.setFullScreen(true);
            primaryStage.setFullScreenExitHint("");
        }
        if (Platform.isSupported(ConditionalFeature.INPUT_TOUCH)) scene.setCursor(Cursor.NONE);

        Bounds gameBounds = root.getGameManager().getLayoutBounds();
        int MARGIN = GamePane.getMargin();
        Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
        double factor = Math.min(visualBounds.getWidth() / (gameBounds.getWidth() + MARGIN), visualBounds.getHeight() / (gameBounds.getHeight() + MARGIN));

        primaryStage.setTitle("2048");
        primaryStage.setScene(scene);
       primaryStage.setMinHeight(gameBounds.getHeight() / 2d);
       primaryStage.setMinWidth(gameBounds.getWidth() / 2d);
       primaryStage.setWidth((gameBounds.getWidth() + MARGIN) * factor);
       primaryStage.setHeight((gameBounds.getHeight() + MARGIN) * factor);
        primaryStage.setOnCloseRequest(event -> {
            event.consume();
            root.getGameManager().quitGame();
        });
        primaryStage.show();
    }

    private boolean isARMDevice() {
        return System.getProperty("os.arch").toUpperCase(Locale.ROOT).contains("ARM");
    }

    @Override
    public void stop() throws Exception {
        root.getGameManager().saveRecord();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
