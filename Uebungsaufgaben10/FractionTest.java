import org.junit.Test;
import static org.junit.Assert.*;


public class FractionTest {

    @Test
    public void add_1_2_and_1_2() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 2);
        Fraction c = a.add(b);
        assertEquals("1", c.toString());
    }
    @Test
    public void add_1_2_and_1_3() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 3);
        Fraction c = a.add(b);
        assertEquals("5/6", c.toString());
    }
    @Test
    public void subtract_1_2_and_1_2() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 2);
        Fraction c = a.subtract(b);
        assertEquals("0", c.toString());
    }
    @Test
    public void subtract_1_2_and_1_3() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 3);
        Fraction c = a.subtract(b);
        assertEquals("1/6", c.toString());
    }
    @Test
    public void multiply_1_2_and_1_2() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 2);
        Fraction c = a.multiply(b);
        assertEquals("1/4", c.toString());
    }
    @Test
    public void multiply_1_2_and_1_3() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 3);
        Fraction c = a.multiply(b);
        assertEquals("1/6", c.toString());
    }
    @Test
    public void divide_1_2_and_1_2() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 2);
        Fraction c = a.divide(b);
        assertEquals("1", c.toString());
    }
    @Test
    public void divide_1_2_and_1_3() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 3);
        Fraction c = a.divide(b);
        assertEquals("3/2", c.toString());
    }
    @Test
    public void string_1_2() {
        Fraction a = new Fraction(1, 2);
        assertEquals("1/2", a.toString());
    }
    @Test
    public void string_1_3() {
        Fraction a = new Fraction(1, 3);
        assertEquals("1/3", a.toString());
    }
    @Test
    public void isInteger_1_2() {
        Fraction a = new Fraction(1, 2);
        assertEquals(false, a.isInteger());
    }
    @Test
    public void isInteger_1_1() {
        Fraction a = new Fraction(1, 1);
        assertEquals(true, a.isInteger());
    }
    @Test
    public void isInteger_2_0() {
        Fraction a = new Fraction(2, 0);
        assertEquals(false, a.isInteger());
    }
    @Test
    public void toInteger_1_2() {
        Fraction a = new Fraction(1, 2);
        assertEquals(0, a.intValue());
    }
    @Test
    public void toInteger_1_1() {
        Fraction a = new Fraction(1, 1);
        assertEquals(1, a.intValue());
    }
    @Test(expected = ArithmeticException.class)
    public void toInteger_2_0() {
        Fraction a = new Fraction(2, 0);
        assertEquals(0, a.intValue());
    }
    @Test
    public void toDouble_1_2() {
        Fraction a = new Fraction(1, 2);
        assertEquals(0.5, a.doubleValue(), 0.0001);
    }
    @Test
    public void toDouble_1_1() {
        Fraction a = new Fraction(1, 1);
        assertEquals(1.0, a.doubleValue(), 0.0001);
    }
    @Test
    public void toDouble_2_0() {
        Fraction a = new Fraction(2, 0);
        assertEquals(Double.NaN, a.doubleValue(), 0.0001);
    }
    @Test
    public void toLong_1_2() {
        Fraction a = new Fraction(1, 2);
        assertEquals(0, a.longValue());
    }
    @Test
    public void toLong_1_1() {
        Fraction a = new Fraction(1, 1);
        assertEquals(1, a.longValue());
    }
    @Test(expected = ArithmeticException.class)
    public void toLong_2_0() {
        Fraction a = new Fraction(2, 0);
        assertEquals(0, a.longValue());
    }
    @Test
    public void toFloat_1_2() {
        Fraction a = new Fraction(1, 2);
        assertEquals(0.5, a.floatValue(), 0.0001);
    }
    @Test
    public void toFloat_1_1() {
        Fraction a = new Fraction(1, 1);
        assertEquals(1.0, a.floatValue(), 0.0001);
    }
    @Test
    public void toFloat_2_0() {
        Fraction a = new Fraction(2, 0);
        assertEquals(Float.NaN, a.floatValue(), 0.0001);
    }
    @Test
    public void isequal_1_2_and_1_2() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 2);
        assertEquals(true, a.equals(b));
    }
    @Test
    public void isequal_1_2_and_1_3() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 3);
        assertEquals(false, a.equals(b));
    }
    @Test
    public void isequal_1_2_and_2_4() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(2, 4);
        assertEquals(true, a.equals(b));
    }
    @Test
    public void compareTo_1_2_and_1_2() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 2);
        assertEquals(0, a.compareTo(b));
    }
    @Test
    public void compareTo_1_2_and_1_3() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 3);
        assertEquals(1, a.compareTo(b));
    }
    @Test
    public void compareTo_1_2_and_2_4() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(2, 4);
        assertEquals(0, a.compareTo(b));
    }
    @Test
    public void create_1_2() {
        Fraction a = new Fraction("1", "2");
        assertEquals("1/2", a.toString());
    }
    @Test
    public void create_1_3() {
        Fraction a = new Fraction("1", "3");
        assertEquals("1/3", a.toString());
    }
    @Test
    public void getNumerator_1_2() {
        Fraction a = new Fraction("1", "2");
        assertEquals("1", a.getNumerator().toString());
    }
    @Test
    public void getNumerator_1_3() {
        Fraction a = new Fraction("1", "3");
        assertEquals("1", a.getNumerator().toString());
    }  
    @Test
    public void getDenominator_1_2() {
        Fraction a = new Fraction("1", "2");
        assertEquals("2", a.getDenominator().toString());
    }
    @Test
    public void getDenominator_1_3() {
        Fraction a = new Fraction("1", "3");
        assertEquals("3", a.getDenominator().toString());
    }
    @Test
    public void hashCode_1_2() {
        Fraction a = new Fraction("1", "2");
        assertEquals(994, a.hashCode());
    }
    @Test
    public void isSubclassofNumber() {
        Fraction a = new Fraction("1", "3");
        assertEquals(true, a instanceof Number);
    }
    @Test
    public void isSubclassofComparable() {
        Fraction a = new Fraction("1", "3");
        assertEquals(true, a instanceof Comparable);
    }
    @Test
    public void isNegative_1_2() {
        Fraction a = new Fraction("1", "2");
        assertEquals(1, a.getNumerator().signum());
    }   
    @Test
    public void isNegative_1_negative_3() {
        Fraction a = new Fraction("1", "-3");
        assertEquals(-1, a.getNumerator().signum());
    }

}