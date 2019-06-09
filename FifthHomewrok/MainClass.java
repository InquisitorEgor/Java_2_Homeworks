package FifthHomewrok;


public class MainClass {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        runOneThread();
        runTwoThreads();
    }

    private static void runTwoThreads() {

        float[] arr = new float[SIZE];
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];

        for (int i = 0; i < arr.length; i++) arr[i] = 1.0f;

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);

        MainClass mainClass = new MainClass();

        new Thread(() -> mainClass.calculating(arr1)).start();
        new Thread(() -> mainClass.calculating(arr2)).start();

        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);

        System.out.println("Two threads ends with: " + (System.currentTimeMillis() - a));
    }


    public static void runOneThread() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) arr[i] = 1.0f;
        long a = System.currentTimeMillis();
        calculating(arr);
        System.out.println("One thread method ends with: " + (System.currentTimeMillis() - a));


    }

    public static float[] calculating(float[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.4f + arr[i] / 2));
        return arr;
    }

}
