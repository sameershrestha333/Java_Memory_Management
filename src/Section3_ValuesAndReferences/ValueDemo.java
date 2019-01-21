package Section3_ValuesAndReferences;

public class ValueDemo {
    public static void main(String[] args) {
        int localValue = 5;
        calculate(localValue);
        System.out.println(localValue);

    }

    private static void calculate(int localValueParam) {
        localValueParam = localValueParam * 4;
    }
}
