
import java.util.Scanner;

public class menuJogo {

    public static void menu() {
        Scanner sc = new Scanner(System.in);

        int opcao;

        System.out.println("*-- 1 - Introdução--*"
                + "\n*-- 2 - Jogar--*"
                + "\n*-- 3 - Creditos--*"
                + "\n*-- 4 - Sair--*");
        System.out.println("Escolha uma opção");

        opcao = sc.nextInt();

        switch (opcao) {
            case 1:

                break;

            case 2:
                System.out.println("Iniciando o jogo, aguarde... ");

                break;
            case 3:

                break;

            case 4:

                System.out.println("Saindo... ");

                break;

            default:

                System.out.println("Nenhuma opção foi selecionada. \n Selecione uma opção");

        }
        if (opcao == 1) {
            introducao exibir = new introducao();
            exibir.mododejogo();

        } else if (opcao == 2) {
            historiaJogo exibir = new historiaJogo();
            exibir.historia();
        } else if (opcao == 3) {

            idealizado exibir = new idealizado();

            exibir.creditos();

        }

    }
}
