package StaticClassesenumExceptions;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;

import java.sql.SQLOutput;

public class Main {
    private static final Logger Logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

     //   double result = Calculator.calculate(2,3, Calculator.Type.DIVISION);
     //   System.out.println("result:" + result);


        double result = Calculator.calculate(2,3, Calculator);

       Logger.info("result" + result);


         result = Calculator.calculate(244, 3, Calculator.Type.SUBTRACTION);
        Logger.info("result" + result);
    }
}
