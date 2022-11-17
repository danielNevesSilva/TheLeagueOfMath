
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 */
/**
 *
 * @author daniel
 */
public class historiaJogo {

    public static void historia() {
        Scanner sc = new Scanner(System.in);

        String continua;

        String path = "C:\\Users\\danie\\ProjetoPi_\\Historia.txt";

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
        continua = sc.nextLine();

        String path1 = "C:\\Users\\danie\\ProjetoPi_\\Historia1.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path1))) {

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
        continua = sc.nextLine();
        String path2 = "C:\\Users\\danie\\ProjetoPi_\\Historia2.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path2))) {

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
        continua = sc.nextLine();
        String path3 = "C:\\Users\\danie\\ProjetoPi_\\Historia3.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path3))) {

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
        continua = sc.nextLine();
        String path4 = "C:\\Users\\danie\\ProjetoPi_\\Historia4.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path4))) {

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
        continua = sc.nextLine();
        String path5 = "C:\\Users\\danie\\ProjetoPi_\\Historia5.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path5))) {

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
        continua = sc.nextLine();
        String path6 = "C:\\Users\\danie\\ProjetoPi_\\Historia6.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path6))) {

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

        questao exibir = new questao();

        exibir.jogo();

    }
}
