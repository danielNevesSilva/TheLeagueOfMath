
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class questao {

    private int vida;

    public static void jogo() {

        Scanner sc = new Scanner(System.in);
        String menu, continua;

        String path = "C:\\Users\\danie\\ProjetoPi_\\questao1.txt";

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

        int vida = 5, khan = 2;

        boolean certo = false;

        menu = sc.next();

        switch (menu) {

            case "c":
            case "C":

                certo = true;
                System.out.println("Muito bem Gandalf, Então Gandalf pego o e repeliu o ataque do mago, o acertou dando um dano critico"
                        + "\nE consegue escapar do mago e fujindo da");
                break;

            case "a":
            case "A":

            case "b":
            case "B":

            case "d":
            case "D":

                vida--;
                System.out.println("RESPOTA ERRADA! Gandalf toma um grave dano e perde uma vida. \nVidas restantes " + vida + "\nhora de fujir. finjasse de morto ele vai te ignorar jugir");
                break;
            default:
                vida--;
                System.out.println("Respota invalida \n voce perdeu uma vida \n vidas restantes: " + vida + "\nhora de fujir. finjasse de morto ele vai te ignorar para fujir ");

        }

        if (!certo) {

        }

        System.out.println(" floresta e assim chegando a vila onde ele morava. "
                + "\nChegando na vila, ele encotra uma venda do SR Isaac newton , onde vendia maças ");

        System.out.println("Aperte enter para falar com Isaac");
        continua = sc.nextLine();

        String path1 = "C:\\Users\\danie\\ProjetoPi_\\Questao2.txt";

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

        menu = sc.next();

        switch (menu) {

            case "d":
            case "D":

                vida++;
                certo = true;
                System.out.println("Muito bem Gandalf, tome essa maçã "
                        + "\nGandalf ganhou um vida " + vida);
                break;

            case "a":
            case "A":

            case "b":
            case "B":

            case "c":
            case "C":

                System.out.println("RESPOTA ERRADA! Gandalf continua com fome: " + vida);
                break;
            default:
                vida--;
                System.out.println("Respota invalida \n voce perdeu uma vida \n vidas restantes: " + vida);

        }

        if (!certo) {

        }

        String path2 = "C:\\Users\\danie\\ProjetoPi_\\Questao3.txt";

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

        menu = sc.next();

        switch (menu) {

            case "a":
            case "A":

                certo = true;
                System.out.println("Muito bem Gandalf, você acerto");
                break;

            case "c":
            case "C":

            case "b":
            case "B":

            case "d":
            case "D":

                vida--;
                System.out.println("RESPOTA ERRADA! voce prejudicou o Isaac. \nVidas restantes: " + vida);
                break;
            default:
                vida--;
                System.out.println("Respota invalida \n voce perdeu uma vida \n vidas restantes: " + vida);

        }

        if (!certo) {

        }
        String path3 = "C:\\Users\\danie\\ProjetoPi_\\Questao4.txt";

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

        menu = sc.next();

        switch (menu) {

            case "B":
            case "b":

                certo = true;
                System.out.println("Muito bem Gandalf, você acerto na mosca os guardas"
                        + "\n pegue o dinheiro e devolva para Isaac"
                        + "\n'os guardas vão ficar de olho em você a partir de agora, se prepare para o pior'");
                break;

            case "c":
            case "C":

            case "a":
            case "A":

            case "d":
            case "D":

                vida--;
                System.out.println("RESPOTA ERRADA! você errou, os guardam zombaram de você,"
                        + "\nmas vão ficar de olho em você a parti de agora "
                        + "\nVidas restantes: " + vida);
                break;
            default:
                vida--;
                System.out.println("Respota invalida \n você perdeu uma vida \n vidas restantes: " + vida);

        }

        if (!certo && vida > 0) {

        } else if (vida <= 0) {

            System.exit(vida);
        }

        boolean tacerto = false;

        String path4 = "C:\\Users\\danie\\ProjetoPi_\\Questao5.txt";

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

        System.out.println("Por qual entrada você quer tentar?");

        menu = sc.next();

        switch (menu) {

            case "B":
            case "b":

                tacerto = true;
                System.out.println(" *--Pelo o telhado--*"
                        + "\n hora de escalar, a biblioteca tem buraco na parede que vai facilitar a subida."
                        + "\n Gandalf começa a subir, chegando na metade da biblioteca ele percebe que tem  dois guardas virando a rua"
                        + "\n e termina de subir rapidamente, chegando ao terraço ele procura a entrada e vai em direção a ela");
                break;
            case "a":
            case "A":

                tacerto = true;

                System.out.println(" *--pela entrada de cargas--*"
                        + "\n hora de correr para a entrada de cargas, tem um guarda na porta."
                        + "\n Gandalf procura algo para distrair o guarda, ele encontra uma pedra."
                        + "\n Aperte enter para jogar a pedra");
                continua = sc.nextLine();
                System.out.println(" Guarda escuta o barulho e procura"
                        + "\n vê um vulto de um bicho passando e vai atrás"
                        + "\n entrada livre, porém com a porta trancada!"
                        + "\n chute a porta para abrir, Gandalf chuta"
                        + "\n porta aberta.");
                break;
            default:
                System.out.println(" Respota invalida \n vidas restantes: " + vida);
        }

        while (!tacerto);

        String path5 = "C:\\Users\\danie\\ProjetoPi_\\Questao6.txt";

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

        System.out.println(
                " ");
        continua = sc.nextLine();
        boolean tcerto = false;
        Random numero = new Random();

        int numer = numero.nextInt(100), num;

        do {

            System.out.println("Hora do jogo, você terá que acerta qual é o numero entrem 0 e 100"
                    + "\n Digite um numero de 1 a 100");
            num = sc.nextInt();

            if (num == numer) {

                System.out.println("Párabens, você ganhou o jogo!" + numer);

                tcerto = true;

            } else if (num < numer) {

                System.out.println("Numero é maior");

            } else if (num > numer) {
                System.out.println("Numero é menor");

            } else {
                System.out.println("Gamer Over!"
                        + "\n o numero era" + numer);
            }

        } while (!tcerto);

        System.out.println();
        String path6 = "C:\\Users\\danie\\ProjetoPi_\\Questao7.txt";

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

        do {

            menu = sc.next();

            switch (menu) {

                case "d":
                case "D":

                    tcerto = true;
                    System.out.println(" Muito bem Gandalf, Knockout o os guardas"
                            + "\n hora de fujir");
                    break;

                case "c":
                case "C":

                case "a":
                case "A":

                case "b":
                case "B":

                    vida--;
                    System.out.println("RESPOTA ERRADA! você errou, e os guardas te atacaram, tente novamente \nVidas restantes " + vida);
                    break;
                default:
                    vida--;
                    System.out.println("Respota invalida \n você perdeu uma vida \n vidas restantes: " + vida);

            }

        } while (!tcerto && vida > 0);

        if (vida <= 0) {
            System.out.println("GAME OVER");

            System.exit(vida);
        }

        String path7 = "C:\\Users\\danie\\ProjetoPi_\\Questao8.txt";

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

        System.out.println("Escolha um:");

        System.out.println("<A> = 1º");
        System.out.println("<B> = 2º");
        System.out.println("<c> = 3º");

        menu = sc.next();

        switch (menu) {

            case "A":
            case "a":

                System.out.println(" *--Chapeu Bowler--*"
                        + "\n Boa escolha");
                break;
            case "B":
            case "b":

                System.out.println(" *--Chapeu Homburg--*"
                        + "\nHmm interessante");

                break;

            case "C":
            case "c":

                System.out.println(" *--Chapeu boater--*"
                        + "\n Ótima escolha");

                break;
            default:
                System.out.println(" Respota invalida \n vidas restantes: " + vida);

        }
        String path8 = "C:\\Users\\danie\\ProjetoPi_\\Questao9.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path8))) {

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

        boolean acertou = false;

        List alternativas = new ArrayList();

        alternativas.add("101111");
        alternativas.add("101011");
        alternativas.add("111010");
        alternativas.add("101110");
        alternativas.add("101111");
        do {
            Collections.shuffle(alternativas);

            System.out.println("O valor em binario do decimal 47 é");

            System.out.println("A) " + alternativas.get(0));

            System.out.println("B) " + alternativas.get(1));

            System.out.println("C) " + alternativas.get(2));

            System.out.println("D) " + alternativas.get(3));

            System.out.println("E) " + alternativas.get(4));

            System.out.println("Escolhar um alternativa: ");

            menu = sc.next();

            switch (menu) {

                case "A":
                case "a":

                    if (alternativas.get(0).equals("101111")) {

                        System.out.println("Respota correta");

                        acertou = true;

                    } else {
                        vida--;
                        System.out.println("Respota incorreta");
                    }

                    break;

                case "b":
                case "B":

                    if (alternativas.get(1).equals("101111")) {
                        System.out.println("respota correta");
                        acertou = true;

                    } else {
                        vida--;
                        System.out.println("Respota incorreta");
                    }

                    break;

                case "c":
                case "C":

                    if (alternativas.get(2).equals("101111")) {
                        System.out.println("respota correta");
                        acertou = true;

                    } else {
                        vida--;
                        System.out.println("Respota incorreta");
                    }

                    break;

                case "D":
                case "d":

                    if (alternativas.get(3).equals("101111")) {
                        System.out.println("respota correta");
                        acertou = true;

                    } else {
                        vida--;
                        System.out.println("Respota incorreta");
                    }

                    break;

                case "E":
                case "e":

                    if (alternativas.get(4).equals("101111")) {
                        System.out.println("respota correta");
                        acertou = true;

                    } else {
                        vida--;
                        System.out.println("RESPOTA ERRADA! tente novamente \nVidas restantes " + vida);
                    }

                    break;

                default:
                    vida--;
                    System.out.println("Respota invalida \n voce perdeu uma vida \n vidas restantes: " + vida);

            }

        } while (!acertou && vida > 0);

        if (vida <= 0) {
            System.out.println("GAME OVER");

            System.exit(vida);
        }

        System.out.println("Teste");
        System.out.println();
        String path9 = "C:\\Users\\danie\\ProjetoPi_\\Questao10.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path9))) {

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

        menu = sc.next();

        switch (menu) {

            case "c":
            case "C":

                acertou = true;
                System.out.println(" Muito bem Gandalf");
                break;

            case "b":
            case "B":

            case "a":
            case "A":

            case "d":
            case "D":

                vida--;
                System.out.println("RESPOTA ERRADA! tente novamente \nVidas restantes " + vida);
                break;
            default:
                vida--;
                System.out.println("Respota invalida! \n vidas restantes: " + vida);

        }

        while (!acertou && vida > 0);

        if (vida
                <= 0) {
            System.out.println("GAME OVER");

            System.exit(vida);
        }

        String path10 = "C:\\Users\\danie\\ProjetoPi_\\Questao11.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path10))) {

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

        boolean cert = false;

        do {

            menu = sc.next();

            switch (menu) {

                case "b":
                case "B":

                    cert = true;
                    System.out.println(" Muito bem Gandalf");
                    break;

                case "c":
                case "C":

                case "a":
                case "A":

                case "d":
                case "D":

                    vida--;
                    System.out.println("RESPOTA ERRADA! você errou, e os guardas te atacaram, tente novamente \nVidas restantes " + vida);
                    break;
                default:
                    vida--;
                    System.out.println("Respota invalida \n e os guardas te atacaram \n vidas restantes: " + vida);

            }

        } while (!cert && vida > 0);

        if (vida
                <= 0) {
            System.out.println("GAME OVER");

            System.exit(vida);

        }

        String path11 = "C:\\Users\\danie\\ProjetoPi_\\Questao12.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path11))) {

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

        do {

            menu = sc.next();

            switch (menu) {

                case "a":
                case "A":

                    cert = true;
                    System.out.println(" Muito bem Gandalf");
                    break;

                case "c":
                case "C":

                case "b":
                case "B":

                case "d":
                case "D":

                    vida--;
                    System.out.println("RESPOTA ERRADA! você errou, e o Rei Khan te atacou, tente novamente \nVidas restantes " + vida);
                    break;
                default:
                    vida--;
                    System.out.println("Respota invalida \n e os guardas te atacaram \n vidas restantes: " + vida + "\n vidas do rei Khan" + khan);

            }

        } while (!cert && vida > 0);

        if (vida
                <= 0) {
            System.out.println("GAME OVER");

            System.exit(vida);

        }
        String path12 = "C:\\Users\\danie\\ProjetoPi_\\Questao13.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path12))) {

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
        boolean t = false;

        do {

            menu = sc.next();

            switch (menu) {

                case "a":
                case "A":
                    khan--;
                    t = true;
                    System.out.println(" Muito bem Gandalf \n Vidas do rei Khan" + khan);
                    break;

                case "c":
                case "C":

                case "b":
                case "B":

                    vida--;
                    System.out.println("RESPOTA ERRADA! você errou, e o Rei Khan te atacou, tente novamente \nVidas restantes " + vida + "\n vidas do rei Khan" + khan);
                    break;
                default:
                    vida--;
                    System.out.println("Respota invalida \n e os guardas te atacaram \n vidas restantes: " + vida);

            }

        } while (!t && vida > 0);

        if (vida
                <= 0) {
            System.out.println("GAME OVER");

            System.exit(vida);

        }

        String path13 = "C:\\Users\\danie\\ProjetoPi_\\Questao14.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path13))) {

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

        do {

            menu = sc.next();

            switch (menu) {

                case "d":
                case "D":

                    khan--;
                    t = true;
                    System.out.println(" Muito bem Gandalf");
                    break;

                case "c":
                case "C":

                case "b":
                case "B":

                case "a":
                case "A":

                    vida--;
                    System.out.println("RESPOTA ERRADA! você errou, e o Rei Khan te atacou, tente novamente \nVidas restantes " + vida);
                    break;
                default:
                    vida--;
                    System.out.println("Respota invalida \n e os guardas te atacaram \n vidas restantes: " + vida + "\n vidas do rei Khan" + khan);

            }

        } while (!t && vida > 0);

        if (vida
                <= 0) {
            System.out.println("GAME OVER");

            System.exit(vida);

        }

        String path15 = "C:\\Users\\danie\\ProjetoPi_\\Questao16.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path15))) {

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
        menuJogo exibir = new menuJogo();

        exibir.menu();
    }
}
