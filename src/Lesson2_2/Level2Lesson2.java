package Lesson2_2;

public class Level2Lesson2 {
    static int summa;
    public static void main(String[] args) {
        int len1 = 5;   // В этом месте можно сделать сканер для ввода размерности массива
        int len2 = 4;
        String[][] array = new String[len1][len2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Integer.toString(i + j);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        array[0][0] = "O";
        try {
            arraySizeCheck(array);
        } catch (MyArraySizeException e){
            System.out.println("Ошибка ввода размера массива ");
        }

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                try {
                    arrayDataCheck(array, i, j);
                } catch (MyArrayDataException e) {
                    System.out.println("Ошибка ввода данных в ячейке " + e.i + " х " + e.j);
                }
            }
        }
        System.out.println("Сумма: " + summa);
    }


        static void arrayDataCheck(String[][] array, int i, int j) throws MyArrayDataException{
            try {
             summa += Integer.parseInt(array[i][j]);
            } catch (NumberFormatException e) {
                throw new MyArrayDataException(i, j);
            }
        }

        static void arraySizeCheck(String[][] array) throws MyArraySizeException{
            try {
                if (array.length != 4) {
                    throw new MyArraySizeException(array.length, array[0].length);
                }
            } catch (MyArraySizeException e) {
                System.out.println(e.getMessage());
            }
            for (String[] strings : array) {
                if (strings.length != 4) {
                    throw new MyArraySizeException(array.length, strings.length);
                }
            }
        }
//        Устарело
//        try{
//            if(len1 != 4 || len2 != 4){
//                throw new MyArraySizeException();
//            }
//        }
//        catch(MyArrayDataException e){
//        }
    }