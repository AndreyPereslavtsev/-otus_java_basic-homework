import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        String[] arrayQuestons = {"1. Вопрос первый", "2. Вопрос второй", "3. Вопрос третий", "4. Вопрос четвертый"};
        String[][] arrayVariant = {
                {"1. Ответ +", "2. Ответ ++", "3. Ответ +++", "4. Ответ ++++"},
                {"1. 2Ответ +", "2. О2твет ++", "3. 2Ответ +++", "4. 2Ответ ++++"},
                {"1. 3Ответ +", "2. Ответ ++", "3. Ответ +++", "4. Ответ ++++"},
                {"1. 4Ответ +", "2. Ответ ++", "3. Ответ +++", "4. Ответ ++++"}
        };
        int[] arrayAnswer = new int[4];
        int[] arrayCorrectAnswer = {1,1,1,1};
        int countCorrectAnswer = 0;
        int countWrongAnswer = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Тест. Ответь на 4 вопроса.");
        System.out.println("После прохождения теста на экране появится результат");

        for (int i = 0; i < arrayQuestons.length; i++) {
            System.out.println(arrayQuestons[i]);
            int k = 0;
            for (int j = 0; j < arrayVariant.length; j++) {
                System.out.println(arrayVariant[k][j]);
            }
            k = scanner.nextInt();
            if (k == arrayCorrectAnswer[k]) {
                countCorrectAnswer++;
            }
            else {
                countWrongAnswer++;
            };

        }
        System.out.println("Количество правильных ответов: "+countCorrectAnswer);
        System.out.println("Количество неправильных ответов: "+countWrongAnswer);
      /*  for (int c = 0; c < 4; c++) {*/
      /*          System.out.println(arrayAnswer[c]);    }*/
    }
}







