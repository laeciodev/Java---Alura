import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String jogarNovamente;
        do {
            int gerarNum = new Random().nextInt(100) + 1;
            int tentativas = 0;
            int numDigitado = 0;

            while (tentativas < 5) {
                System.out.println("Digite um número entre  0 e 100:");
                numDigitado = scanner.nextInt();
                tentativas++;

                if (numDigitado == gerarNum) {
                    System.out.println("Parabéns, você adivinhou o número secreto em " + tentativas + " tentativas!");
                    break;
                } else if (numDigitado < gerarNum) {
                    System.out.println("O número secreto é maior.");
                } else {
                    System.out.println("O número secreto é menor.");
                }
            }
            if (tentativas == 5 && numDigitado != gerarNum) {
                System.out.println("Você não conseguiu adivinhar o número em 5 tentativas.");
            }

            scanner.nextLine();
            System.out.println("\nDeseja jogar novamente? (s/n)");
            jogarNovamente = scanner.nextLine().toLowerCase();

        } while (jogarNovamente.equals("s") || jogarNovamente.equals("sim"));

        System.out.println("Obrigado por jogar! Até a próxima.");
        scanner.close();

    }
}