package garbagecollection.gcAndFinalise;

public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long availableBytes = runtime.freeMemory();
        System.out.println("Available memory :: " + availableBytes / 1024 + "K" + "  OR  MB: " + availableBytes / (1024 * 1024));
        System.out.println("***************************************8");
        // let's create a ton of garbage....
        for (int i = 0; i < 100000000; i++) {
            Customer c;
            c = new Customer("Jonh");
        }
        availableBytes = runtime.freeMemory();
        System.out.println("Available memory :: " + availableBytes / 1024 + "K" + "  OR  MB: " + availableBytes / (1024 * 1024));

        System.gc();
        System.out.println("***************************************8");

        availableBytes = runtime.freeMemory();
        System.out.println("Available memory :: " + availableBytes / 1024 + "K" + "  OR  MB: " + availableBytes / (1024 * 1024));

    }
}
