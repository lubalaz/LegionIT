package Hmw7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {
    
    public static final int SOCCER = 11;
    public static final int HOCKEY = 6;
     public static final int RUGBY = 15;




    //enum final constants
    enum Type {
        SOCCER,
        HOCKEY,
        RUGBY,
    }

    public static int createFileForGame(Type type) {
        int result = 0;
        FileGames fileGames = new FileGames();

        switch (type) {
            case SOCCER:
                String fileSoccer = "SOCCER.txt";
                fileGames.createFile(fileSoccer);
                fileGames.writeToFile(fileSoccer, "for Soccer, it 11 " + Type.SOCCER);
                break;
            case HOCKEY:
                String fileHock = "HOCKEY.txt";
                fileGames.createFile(fileHock);
                fileGames.writeToFile(fileHock, "for HOCKEY, it 6 " + Type.HOCKEY);
                break;
            case RUGBY:
                String fileRugby = "RUGBY.txt";
                fileGames.createFile(fileRugby);
                fileGames.writeToFile(fileRugby, "for RUGBY, it 15 " + Type.RUGBY);
                break;

            default:
                result = -1;

        }
        return result;


    }

}