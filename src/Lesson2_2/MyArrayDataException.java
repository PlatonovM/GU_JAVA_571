package Lesson2_2;

public class MyArrayDataException extends NumberFormatException{
    int i,j;
    MyArrayDataException(int i, int j){
        super("Ошибка ввода в ячейке: " + i + "x" + j);
        this.i = i;
        this.j = j;
    }
}
