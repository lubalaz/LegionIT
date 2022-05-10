package FileManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager{


    public static void main(String[] args) {
        String file = "LegionFile.txt";
        FileManager fileManager = new FileManager();
        fileManager.writeToFile(file,  "Expert in preparing sushi to provide patrons" );

    }

    public void createFile(String fileName){
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeToFile(String fileName, String text){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error... Cannot write");
            e.printStackTrace();
        }

    }
}