import java.io.*;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) {
        Properties properties=new Properties();
        properties.setProperty("name","mehdi");
        properties.setProperty("lastName","adeli");
        properties.setProperty("website","tosinso");
        properties.setProperty("color","blue");

        try {
            OutputStream outputStream=new FileOutputStream("property.txt");
            properties.store(outputStream,"this is test property");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String value = properties.getProperty("color");
        System.out.println(value);

        try {
            InputStream stream=new FileInputStream("property.txt");
            properties.load(stream);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String value1 = properties.getProperty("name");
        System.out.println(value1);

    }
}
