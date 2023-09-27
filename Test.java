import org.junit.Test;
import static org.junit.Assert.*;

public class BowlingTicketPriceCalculatorTest {

    @Test
    public void testCalculateTicketPriceUnder4() {
        int age = 2;
        int expectedPrice = 0;
        int actualPrice = BowlingTicketPriceCalculator.calculateTicketPrice(age);
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void testCalculateTicketPriceBetween4And10() {
        int age = 6;
        int expectedPrice = 100000;
        int actualPrice = BowlingTicketPriceCalculator.calculateTicketPrice(age);
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void testCalculateTicketPriceBetween10And18() {
        int age = 15;
        int expectedPrice = 150000;
        int actualPrice = BowlingTicketPriceCalculator.calculateTicketPrice(age);
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void testCalculateTicketPriceAbove18() {
        int age = 25;
        int expectedPrice = 200000;
        int actualPrice = BowlingTicketPriceCalculator.calculateTicketPrice(age);
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void testCalculateTicketPriceNegativeAge() {
        int age = -5;
        int expectedPrice = -1;
        int actualPrice = BowlingTicketPriceCalculator.calculateTicketPrice(age);
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void testCalculateTicketPriceRandomAge() {
        int age = 7;
        int expectedPrice = 100000;
        int actualPrice = BowlingTicketPriceCalculator.calculateTicketPrice(age);
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void testCalculateTicketPriceAnotherRandomAge() {
        int age = 19;
        int expectedPrice = 200000;
        int actualPrice = BowlingTicketPriceCalculator.calculateTicketPrice(age);
        assertEquals(expectedPrice, actualPrice);
    }
}
