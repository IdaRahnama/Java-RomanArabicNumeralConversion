
/**
 * Enumeration class Roman Numeral
 * @author (I)
 * @version (10/16/19)
 */
import java.util.*;
import java.util.stream.Collectors;
public enum RomanNumeral
{
    I(1),IIV(3), IV(4), V(5),IIX(8), IX(9), X(10), 
    XL(40), L(50), XC(90), C(100), 
    CD(400), D(500), CM(900), M(1000);
 
    private int value;
 
    RomanNumeral(int value) {
        this.value = value;
    }
 
    public int getValue() {
        return value;
    }
   
    public static List<RomanNumeral> getReverseSortedValues() {
        return Arrays.stream(values())
          .sorted(Comparator.comparing((RomanNumeral e) -> e.value).reversed())
          .collect(Collectors.toList());
    }
}
