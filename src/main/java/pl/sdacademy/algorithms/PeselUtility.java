package pl.sdacademy.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PeselUtility {
    public boolean isValid(String pesel) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < pesel.length(); i++) {
            numbers.add(Integer.parseInt(pesel.substring(i, i+1)));
        }
        int verify =
                1 * numbers.get(0)
                + 3 * numbers.get(1)
                + 7 * numbers.get(2)
                + 9 * numbers.get(3)
                + 1 * numbers.get(4)
                + 3 * numbers.get(5)
                + 7 * numbers.get(6)
                + 9 * numbers.get(7)
                + 1 * numbers.get(8)
                + 3 * numbers.get(9)
                + 1 * numbers.get(10);

        return verify % 10 == 0;
    }

    public boolean isMale(String pesel) {
        return Integer.parseInt(pesel.substring(9, 10)) % 2 != 0;
    }
}
