package Hmw7;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileGames{

    public static void main(String[] args) {

        String file = "HockeyFile.txt";
        FileGames fileGames = new FileGames();
        fileGames.createFile(file);
        fileGames.writeToFile(file, "for Hockey, it 6");

    }
    public void
    createFile(String fileName){
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
           e.printStackTrace();
       }

   }
}