import java.util.Arrays;

public class Sequence {
    public static void main(String[] args) {
        int[] mas = new int[10];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 90);
        }
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));

        boolean sequence = true;
        for (int i = 0; i < mas.length; i++) {
            if (i > 0 && mas[i] < mas[i - 1]) {
                sequence = false;
                break;
            }
        }

        String answer;
        if (sequence) {
            answer = "Да";
        } else {
            answer = "Нет";
        }
        System.out.println("Является ли массив возрастающей последовательностью? " + answer);

    }
}
