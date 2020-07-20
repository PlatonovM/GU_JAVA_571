import java.util.Arrays;

public class Lessons {
    public static void main(String[] args) {
        task1InversionArray();
        task2Array8Elements();
        task3ArrEl6();
        task4Square();
        task5MiniMax();
        //task6:
        int[] arraysBalance = new int[] { 1, 1, 1, 5, 9, 15, 2 };
        System.out.println(task6CheckBalance(arraysBalance));
        //task7: не успел

    }
    static void task1InversionArray(){
        int[] binArr = {0,0,1,0,1,0,1,0,1,1,1,0};
        System.out.println(Arrays.toString(binArr));
        for (int i=0; i < binArr.length; i++){
            if(binArr[i] == 0){
                binArr[i] = 1;
            }
            else binArr[i]=0;
        }
        System.out.println(Arrays.toString(binArr));
    }
    static void task2Array8Elements(){
        int[] cos = new int[8];
        for (int i = 0; i < 8; i++){
            cos[i] = i * 3;
        }
        System.out.println(Arrays.toString(cos));
    }
    static void task3ArrEl6(){
        int[] arr ={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void task4Square(){
        int size = 8;
        int[][] arr1 = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i == j){
                    arr1[i][j] = 1;
                }
                else arr1[i][j] = 0;
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void task5MiniMax(){
        int[] arr = {0, 5, -1, 56, 6, 75, 32, 45};
        int min = arr[1];
        int max = arr[1];
        for(int i = 0; i < arr.length; i++){
                if(arr[i] < min) {
                    min = arr[i];
                }
                if(arr[i] > max){
                    max = arr[i];
                }
        }
        System.out.println("Максимальное значение " + max);
        System.out.println("Минимальное значение " + min);
    }
    static boolean task6CheckBalance(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                int leftSum = 0;
                int rightSum = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (j > i) {
                        rightSum += arr[j];
                    } else {
                        leftSum += arr[j];
                    }
                }
                if (leftSum == rightSum) {
                    return true;
                }
            }
            return false;
        }
}