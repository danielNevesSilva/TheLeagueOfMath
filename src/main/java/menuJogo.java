
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class menuJogo {

    public static void menu() {
        Scanner sc = new Scanner(System.in);

        int opcao;


        String path = "C:\\Users\\danie\\ProjetoPi_\\Menu.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] vect = line.split(",");

                System.out.println(line);

                line = br.readLine();
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

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
