package enumtest.enumset;

import java.util.EnumSet;

public class EnumTest {
    public static void main(String[] args) {
        // Creating a set
        EnumSet<SeasonEnum> set1, set2, set3, set4;

        // Adding elements
        set1 = EnumSet.of(SeasonEnum.SPRING,  SeasonEnum.FALL, SeasonEnum.WINTER);
        set2 = EnumSet.complementOf(set1);
        set3 = EnumSet.allOf(SeasonEnum.class);
        set4 = EnumSet.range(SeasonEnum.SUMMER,SeasonEnum.WINTER);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Set 3: " + set3);
        System.out.println("Set 4: " + set4);
    }
}