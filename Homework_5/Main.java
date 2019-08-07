package Homework_5;



public class Main {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
     runOneThread();
     runTwoThreads();
    }

    private static void runTwoThreads() {
        float[] arr = new float[SIZE];

        for (int i = 0; i <arr.length; i++) arr[i]=1.0f;

        long a = System.currentTimeMillis();

        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];

        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);

        //new Thread(() ->calculating(arr1)).start();
        Thread thread1 = new Thread(() ->calculating(arr1), "Thread_1");
        Thread thread2 = new Thread(() ->calculating(arr2), "Thread_2");
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);

        System.out.println(thread1.getName()+ " and "+ thread2.getName()+ " work: "+(System.currentTimeMillis() - a));
    }

    private static void runOneThread() {
        float[] arr = new float[SIZE];
        for (int i = 0; i <arr.length; i++) arr[i]=1.0f;
        long a = System.currentTimeMillis();
        calculating(arr);
        System.out.println(Thread.currentThread().getName()+ " work: "+(System.currentTimeMillis() - a));
    }
    private static void calculating(float [] arr){
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
