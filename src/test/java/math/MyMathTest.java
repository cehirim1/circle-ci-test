package math;

import org.example.math.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void exceptionsTest(){
        //arrange
        MyMath math = new MyMath();
        //variable assignment is act
        //assert
        assertThrows(ArithmeticException.class, ()->math.divide(10,0));

    }

    @Test
    void divideTest(){

        MyMath math = new MyMath();
        assertDoesNotThrow(()->math.divide(219,21));

    }
}