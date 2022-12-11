import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class PlayingCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество карт -");
        int numberofCards = scanner.nextInt();

        String[][] Rank = {{"6"}, {"7"},
                {"8"}, {"9"}, {"10"}, {"Валет"}, {"Дама"}, {"Король"}, {"Туз"}};

        String[][] Suits = {{"Бубна"}, {"Чирвей"},
                {"Пика"}, {"Треф"}};

        for (int i = 0; i < numberofCards; i++) {
            String[] newRankl = Rank[random.nextInt(Rank.length)];
            String[] newSietl = Suits[random.nextInt(Suits.length)];
            System.out.println("Карта - " + Arrays.toString(newRankl) + " Масть - " + Arrays.toString(newSietl));


        }
    }
}
