import java.util.*;

public class Main {
    public static void main(String[] args) {
        double res = 0;
        try {
            res = dividedValue(5, 2);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("error");
            return;
        }

        System.out.println(res);

    }

    private static double dividedValue(int first, int second) {
        if (second == 0) {
            throw new ArithmeticException("error");
        }
        if (first == 100) {
            throw new IllegalArgumentException("error");
        }
        return first*1.0 / second;
    }


}