
import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerTest {
    public static void main(String[] args) {
        //int , short, byte , long
        BigInteger bigNumber=new BigInteger("888888888888888888888888888888888888888888888888888888888888888888888888888888888888");
        BigInteger bigNumber2=new BigInteger("7777777777777777777777777777777777");
        BigInteger bigNumber3=bigNumber.add(bigNumber2);
        System.out.println(bigNumber3);
        bigNumber3=bigNumber.subtract(bigNumber2);
        System.out.println(bigNumber3);

        bigNumber3=bigNumber.multiply(bigNumber2);
        System.out.println(bigNumber3);
        bigNumber3=bigNumber.divide(bigNumber2);
        System.out.println(bigNumber3);

        int sd=bigNumber.compareTo(bigNumber2);
        System.out.println(sd);

        BigDecimal d=new BigDecimal("8585585555555555555555555555555555555555555555555.96854123");
        BigDecimal dd=d.pow(8888);
        System.out.println(dd);

    }
}
