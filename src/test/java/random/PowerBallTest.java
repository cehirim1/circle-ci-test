package random;

import org.example.random.PowerBall;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

class PowerBallTest {

    @RepeatedTest(10)
    void rangeTest() {
        PowerBall power = new PowerBall();
        int[] numbers = power.getNumbers();

        //verify the first 5 nos are in the range [1,69]
        for (int i = 0; i < 5; i++) {
            checkrange(1, 69, numbers[i]);
        }

        //verify that the sixth number is in the range [1,26]
        checkrange(1, 26, numbers[5]);
    }

    private void checkrange(int low, int high, int value) {
        assertTrue(value >= low);
        assertTrue(value <= high);
    }
}