
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class introducao {

    public void mododejogo() {

        Scanner sc = new Scanner(System.in);
        String continuar;
       String path = "C:\\Users\\danie\\ProjetoPi_\\Introducao.txt";

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
        continuar = sc.nextLine();
        menuJogo exibir = new menuJogo();
        exibir.menu();
    }

}
