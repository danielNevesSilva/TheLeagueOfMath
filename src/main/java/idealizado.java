
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author danie
 */
public class idealizado {

    public void creditos() {

        Scanner sc = new Scanner(System.in);
        String continuar;

        String path = "C:\\Users\\danie\\ProjetoPi_\\Idealizado.txt";

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

        System.out.println("Aperte enter para volta ao Menu");
        menuJogo exibir = new menuJogo();
        continuar = sc.nextLine();

        exibir.menu();
    }

}
