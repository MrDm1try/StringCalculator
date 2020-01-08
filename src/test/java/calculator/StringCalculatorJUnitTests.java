package calculator;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorJUnitTests {

    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        StringCalculator.add("1,2");
        Assert.assertTrue(true);
    }

}
