import StaticClassesenumExceptions.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @BeforeAll
public static void classSetup(){
        System.out.println("Before all method");
    }
    @AfterAll
    public static void classTearDown(){
        System.out.println("After all method");
    }
    @BeforeEach
    public void beforeTest(){
        System.out.println("Before each method");
    }
    @AfterEach
    public void afterTest(){
        System.out.println("After each method");
    }

    static Stream<Arguments> dataProvider(){
        return  Stream.of(
                Arguments.of(2, 2, 4, Calculator.Type.SUMMARY),
                Arguments.of(4, 2, 2, Calculator.Type.DIVISION),
                Arguments.of(2, 2, 4, Calculator.Type.MULTIPLICATION),
                Arguments.of(5, 2, 3, Calculator.Type.SUBTRACTION)




        );

    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void methodSourceTest(double a, double b, double expectedResult, Calculator.Type type){

  double actualResult = Calculator.calculate(a,b,type);
  assertEquals(expectedResult,actualResult);

    }





    @ParameterizedTest
    @ValueSource(ints = {-10,0,27,22225555, -22225555})
    public void summaryParamsTest(int a){
        double b = 6;
        double expectedResult = b + a;
        double actualResult =  Calculator.calculate(a,b, Calculator.Type.SUMMARY);
        assertEquals(expectedResult, actualResult);

    }


    @Test
    public void summaryTest(){

        double a = 5;
        double b = 6;
        double expectedResult = 11;
       double actualResult =  Calculator.calculate(a,b, Calculator.Type.SUMMARY);
        assertEquals(expectedResult, actualResult);



    }
  @Test
    public void divisionTest(){
      double a = 10;
      double b = 2;
      double expectedResult = 5;
      double actualResult =  Calculator.calculate(a,b, Calculator.Type.DIVISION);
     // assertNull(actualResult);

      assertNotNull(actualResult,"null was returned");
      assertEquals(expectedResult, actualResult, "Division result is incorrect ");
      assertTrue(expectedResult==actualResult);
      assertTrue(actualResult>0);
      assertFalse(actualResult==0);
  }

  @Test
  @DisplayName("NullPointer Exception test")
    public void errorTest(){
      double a = 5;
      double b = 6;
      double expectedResult = 11;
    assertThrows (NullPointerException. class,() -> {Calculator.calculate(a,b,null);});


  }

}
