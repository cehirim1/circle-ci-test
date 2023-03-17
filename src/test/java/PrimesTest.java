import org.example.primes.PrimalityChecker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class PrimesTest {

    @ParameterizedTest
    @ValueSource(ints={-1,0,1}) //passing values to numbers param to test
    void testIsPrimeBoundary(int number) {
        PrimalityChecker checker = new PrimalityChecker();

        boolean isPrime = checker.isPrime(number);
       assertFalse(checker.isPrime(number));//numbers are not prime, so test will pass
    }

    @ParameterizedTest
    @ValueSource(ints={2,31,41})
    public void testValidPrimeCheck(int num){
        PrimalityChecker check = new PrimalityChecker();
        boolean primeVerify = check.isPrime(num);
        assertTrue(check.isPrime(num));
    }
}