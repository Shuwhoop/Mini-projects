import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class EncryptionAlgorithmPasswordmanager {
    public static void main(String[]args) {
        int key = 6;
        String password = "";

        String text = "My current Password";
        System.out.println(text);
        char[] chars = text.toCharArray();
        for (char c: chars) {
            c += key;
            password += c;
            System.out.print(c);
        }
        System.out.println(password);
        File secrets = new File("password.txt");
        try {
            FileWriter writer = new FileWriter(secrets);
            writer.write(password);
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
