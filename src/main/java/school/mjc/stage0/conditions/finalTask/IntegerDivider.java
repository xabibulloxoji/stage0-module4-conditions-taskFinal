package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
//        if (divider == 0) System.out.println("");
//        else if (dividend % divider == 0) System.out.println("can be divided completely");
//        else System.out.println("cannot be divided completely");
        System.out.println(divider == 0 ? "division by zero" : dividend % divider == 0 ? "can be " +
                "divided completely" : "cannot be divided completely");
    }
}
