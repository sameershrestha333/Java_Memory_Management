package garbagecollection.string;

public class StringPoolsDemo {
    public static void main(String[] args) {
        String one = "hello";
        String two = "hello";
        String three = new String("hello");
        String four = new String("hello").intern();

        if (one == two)
            System.out.println("Same");
        else
            System.out.println("Not Same");

        if (one.equals(two))
            System.out.println("Same");
        else
            System.out.println("Not Same");

        if (one == three)
            System.out.println("Same");
        else
            System.out.println("Not Same");
        if (one == four)
            System.out.println("Same");
        else
            System.out.println("Not Same");
    }
}
