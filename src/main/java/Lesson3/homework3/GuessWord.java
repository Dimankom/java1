package Lesson3.homework3;

import java.util.Scanner;

// Угадать слово
public class GuessWord {

    private static final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
            "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
            "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void wordGame() {
        int count = words.length;
        int randomIndex = (int) (Math.random() * count);
        String target = words[randomIndex];
        System.out.println("Велкам в игру ''Угадай слово''");
        System.out.println("Вам предстоит угадать одно из " + count + " слово");
        System.out.println("Слова на английском языке из категории Овощи и Фрукты ");

        Scanner in = new Scanner(System.in);

        char[] guess = new char[15];
        for (int i = 0; i < 15; i++) {
            guess[i] = '#';
        }
        while (true) {
            System.out.println("Введите ваш вариант:");
            String word = in.next();
            if (word.equals(target)) {
                System.out.println("Вы отгадали слово. Это:" + target);
                System.out.println("Игра завершена");
                return;
            }
            boolean anyEquals = false;
            int minLength = Math.min(word.length(), target.length());
            for (int i = 0; i < minLength; i++) {
                if (word.charAt(i) == target.charAt(i)) {
                    if (guess[i] == '#') {
                        anyEquals = true;
                    }
                    guess[i] = word.charAt(i);

                }
            }
            if (anyEquals) {
                System.out.println("Вы угадали несколько букв ");
            }
            for (int i = 0; i < 15; i++) {
                System.out.print(guess[i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        wordGame();
    }
}
// "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
// "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
// "pineapple", "pumpkin", "potato"