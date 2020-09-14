package Lesson2_5;

import java.util.Arrays;

public class ArrayCalc {
    static final int size = 10000000;
    static final int h = size / 2;
    float[] arr = new float[size];

    public void doOne(){
        long start = System.currentTimeMillis();
        Arrays.fill(arr,1F);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        long end = System.currentTimeMillis() - start;
        System.out.println(end);
    }

    public void doTwo(){
        long start = System.currentTimeMillis();
        Arrays.fill(arr,1F);

        float[] a1 = new float[h];
        float[] a2 = new float[h];

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        System.out.println(a1.length);
        System.out.println(a2.length);

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (a1) {
                    System.out.println("Start a1");
                    for (int i = 0; i < a1.length; i++) {
                        a1[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                    }
                    System.out.println("End a1");
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (a2) {
                    System.out.println("Start a2");
                    for (int i = 0; i < a2.length; i++) {
                        a2[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                    }
                    System.out.println("End a2");
                }
            }
        }).start();

        synchronized (a1) {
            synchronized (a2) {
                System.out.println("Final");
                long end = System.currentTimeMillis() - start;
                System.out.println(end);
            }
        }
    }
}
