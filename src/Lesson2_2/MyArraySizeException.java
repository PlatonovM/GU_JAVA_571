package Lesson2_2;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(int stroka,  int colum){
        System.out.println("Размер массива не соответствует размеру 4х4. Колонок " + colum + ", строк " + stroka);
    }
}
