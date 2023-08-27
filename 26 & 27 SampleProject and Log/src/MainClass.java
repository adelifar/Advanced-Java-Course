import model.Item;
import model.Section;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.logging.*;

public class MainClass {
    private static Section section = new Section();
    static Logger logger = Logger.getLogger("com.tosinso");
    //console handler  file handler
    static ConsoleHandler handler = new ConsoleHandler();

    public static void main(String[] args) {
        FileHandler handler1;
        try {
            handler1 = new FileHandler("fileLog.txt");
//            SimpleFormatter formatter = new SimpleFormatter();
//            handler1.setFormatter(formatter);
            handler1.setFormatter(new Formatter() {
                @Override
                public String format(LogRecord record) {
                    return record.getMessage()+"\n"+record.getLevel()+"\n"+record.getSourceClassName();
                }
            });
        } catch (IOException e) {
            logger.throwing(MainClass.class.getName(),"main",e);
            throw new RuntimeException(e);

        }
        Logger.getGlobal().setLevel(Level.ALL);
        logger.setLevel(Level.ALL);
//      logger.addHandler(handler);
        logger.addHandler(handler1);
        handler.setLevel(Level.ALL);
        logger.entering("MainClass", "Main", "entering in main");
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            showOptions();
            int option = scanner.nextInt();
            assert option > 0 && option <= 5;
            switch (option) {
                case 1:
                    addItem(scanner);
                    break;
                case 2:
                    listItems();
                    break;
                case 3:
                    deleteItem(scanner);
                    break;
                case 4:
                    doneItem(scanner);
                    break;
                case 5:
                    Logger.getGlobal().setLevel(Level.SEVERE);
                    Logger.getGlobal().info("User selected to exit");
                    Logger.getGlobal().warning("We are quitting");
                    Logger.getGlobal().log(new LogRecord(Level.SEVERE, "sdfsdfsdf"));
                    logger.setLevel(Level.SEVERE);
                    logger.info("User selected to exit");
                    logger.warning("We are quitting");
                    logger.log(new LogRecord(Level.SEVERE, "sdfsdfsdf"));
                    logger.log(new LogRecord(Level.FINE, "sdfsdfsdf"));
                    running = false;
                    logger.entering("MainClass", "Main", "entering in main");

                    logger.throwing("MainClass", "main", new Exception());
                    break;
            }
        }
    }

    private static void doneItem(Scanner scanner) {
        System.out.println("Enter Item Id");
        long id = scanner.nextLong();
        boolean f = false;
        for (Item item :
                section.getItems()) {
            if (item.getId() == id) {
                item.setDone(true);
                item.setDoneDate(LocalDateTime.now());
                f = true;
                break;
            }
        }
        if (f)
            System.out.println("Item Done");
        else System.out.println("Item not found");
    }

    private static void deleteItem(Scanner scanner) {
        System.out.println("Enter Item Id");
        long id = scanner.nextLong();
        boolean f = false;
        for (Item item :
                section.getItems()) {
            if (item.getId() == id) {
                section.getItems().remove(item);
                f = true;
                break;
            }
        }
        if (f)
            System.out.println("Item deleted");
        else System.out.println("Item not found");
    }

    private static void listItems() {
        logger.entering("MainClass", "ListItems");
        for (Item item :
                section.getItems()) {
            System.out.println(item);
        }
    }

    private static void addItem(Scanner scanner) {
        System.out.println("Enter title");
        String title = scanner.next();
        System.out.println("Enter description");
        String description = scanner.next();
        System.out.println("Enter priority");
        byte priority = scanner.nextByte();
        long id = section.getItems().size() > 0 ? section.getItems().get(section.getItems().size() - 1).getId() + 1 : 1;
        Item item = new Item(id, title, description, LocalDateTime.now(), false, null, priority);
        section.getItems().add(item);
        System.out.println("Item added");
    }

    private static void showOptions() {
        String str = "1.add todo\n" +
                "2.list todos\n" +
                "3.delete todo item\n" +
                "4.done todo item\n" +
                "5.quit";
        System.out.println(str);
    }
}
