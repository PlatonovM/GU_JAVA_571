public class Lessons {
    public static void main(String[] args) {
        //Переменные
        byte byteVariable = -120;
        int intVariable = 2146999999;
        long longVariable = 200000000;
        float floatVariable = 3.14159f;
        double doubleVariable = 120.5;
        char literaVariable = 'L';
        boolean isTrue = true;

        String stringVariable = "Текст"; //ссылочный тип данных

        System.out.println(task3Calculate(1,2,3,4));
        System.out.println(task4ComparisonOfAmounts(10.0,1.0));
        task5DeterminePositiveOrNegative(-3);
        System.out.println(task6PassedANegativeNumber(-1));
        task7DoGreetings("Миша");
        task8IsLeap(2000); // кратно 400

    }
    static double task3Calculate(double a, double b, double c, double d){
        if (d == 0){
            System.out.println("Detected division by zero");
            System.out.println("В параметрах метода задан делитель равный нулю");
            return 0;
        }
        return (a * (b + (c / d)));
    }
    static boolean task4ComparisonOfAmounts(double a, double b){
        double summ = a + b;
        if (summ >= 10.0 && summ <= 20.0){
            return true;
        }
        return false;
    }
    static void task5DeterminePositiveOrNegative(int a){
        if (a < 0){
            System.out.println("Введеное число является отрицательным!");
        }
        else {
            System.out.println("Введеное число является положительным!");
        }
    }
    static boolean task6PassedANegativeNumber(int a){
        if (a < 0) {
          return true;
        }
        return false;
    }
    static void task7DoGreetings(String a){
        System.out.println("Привет, " + a + "!");
    }
    static boolean task8IsLeap(int y){
        if (y % 400 == 0){
            System.out.println("Високостный!");
              return true;
        } else if(y % 4 == 0 && y % 100 != 0) {
            System.out.println("Високостный!");
              return true;
        }
        System.out.println("Невисокостный!");
              return false;
    }
}
