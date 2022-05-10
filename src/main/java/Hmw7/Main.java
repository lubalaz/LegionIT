package Hmw7;

public class Main {
    public static void main(String[] args) {
      int result1 = Game.createFileForGame( Game.Type.SOCCER);
        int result2 = Game.createFileForGame( Game.Type.HOCKEY);
        int result3 = Game.createFileForGame( Game.Type.RUGBY);

        System.out.println("result: "+result2);
        System.out.println("result: "+result3);
    }
}
