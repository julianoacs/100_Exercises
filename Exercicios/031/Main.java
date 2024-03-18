import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Joken-Po");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        int jogador = teclado.nextInt();
        switch (jogador) {
            case 1:
                System.out.println("Jogador escolheu Pedra.");
                break;
            case 2:
                System.out.println("Jogador escolheu Papel.");
                break;
            case 3:
                System.out.println("Jogador escolheu Tesoura.");
                break;
            default:
                System.out.println("Opcao Invalida.");
                break;
        }
        int computador = 0;
        computador = (int) (Math.random() * 3 + 1);
        switch (computador) {
            case 1:
                System.out.println("Computador escolheu Pedra.");
                break;
            case 2:
                System.out.println("Computador escolheu Papel.");
                break;
            case 3:
                System.out.println("Computador escolheu Tesoura.");
                break;
        }
        if (jogador == computador) {
            System.out.println("Empate");
        } else if ((jogador == 1 && computador == 3) || (jogador == 2 & computador == 1) || (jogador == 3 && computador == 2)) {
            System.out.println("Jogador Ganhou");
        } else {
            System.out.println("Computador Ganhou");
        }
    }
}
