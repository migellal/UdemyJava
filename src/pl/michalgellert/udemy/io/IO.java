package pl.michalgellert.udemy.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class IO {

    public static void main(String[] args) {

//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//            while (true) {
//                String line = br.readLine();
//                if(line.equals("quit"))
//                    System.exit(0);
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        String separator = File.separator;
        File file = new File("C:" + separator + "dev\\repos\\java\\src\\pl\\michalgellert\\udemy\\io\\abc.txt");
        System.out.println(file.exists());

        try {
            List<String> lines = Files.readAllLines(Paths.get("C:\\dev\\repos\\java\\src\\pl\\michalgellert\\udemy\\io\\abc.txt"), StandardCharsets.ISO_8859_1);
            for (String str : lines) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter("C:\\dev\\repos\\java\\src\\pl\\michalgellert\\udemy\\io\\efg.txt", true);
            writer.write("Hello!");
            writer.write("\r\n");
            writer.write("How are you?");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
