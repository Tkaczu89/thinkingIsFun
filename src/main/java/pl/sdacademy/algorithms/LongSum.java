package pl.sdacademy.algorithms;

import java.math.BigInteger;

public class LongSum {

    public String sum(Long[] longs) {
        BigInteger sum = new BigInteger("0");
        for (Long aLong : longs) {
            sum = sum.add(BigInteger.valueOf(aLong));
        }
        return sum.toString();
    }
}
