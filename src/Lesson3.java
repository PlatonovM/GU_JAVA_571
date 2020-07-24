import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        theGame();
        theWords();
    }
    static void theGame(){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Загадано число от 0 до 9. Угадайте: ");
            int num = random.nextInt(10);
            for (int i = 0; i < 3; i++) {
                int number = sc.nextInt();
                if(number==num){
                    System.out.println("Угадали");
                    break;
                } else if(num > number){
                    System.out.println("Загаданное число больше введенного");
                } else {
                    System.out.println("Загаданное число меньше введенного");
                }
            }
            System.out.println("Повторить игру? 0 - нет. 1 - да.");
            int nextP = sc.nextInt();
            if(nextP == 0) break;
        }
    }
    static void theWords(){
        //Не смог выполнить задачу. Познакомился с посимвольным "разбором" строки и .equals()
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado",  "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Загадано слово из массива: " + Arrays.toString(words));
        Random random = new Random();
        int num = random.nextInt(25);
        for (int i = 0; i < 3; i++) {
            char[] wordChars = words[num].toCharArray();
            for (int j = 0; j < 2; j++) {
                System.out.print(wordChars[j]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("#######");
            String word = sc.next();
            if (word.equals(words[num])) {
                System.out.println("winner");
                break;
            } else {
                System.out.println("fail");
            }
        }
    }
}
