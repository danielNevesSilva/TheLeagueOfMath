/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author danie
 */
public class Escritor {

    public static void main(String[] args) {
        try {
            FileOutputStream arquivo = new FileOutputStream("Questao15.txt");
            PrintWriter pr = new PrintWriter(arquivo);
            pr.println("Gandalf começa a ficar cansado..."
                    + "\n O rei fica abalado com o golpe, mas ainda não caiu."
                    + "\n hora de acabar com isso O rei khan começa a fazer contas com os dedos..."
                    + "\n Gandalf olha isso e também começa a fazer uma conta..."
                    + "\n x = -b +- raiz b²-4*a*b"
                    + "\n              2*a"
                    + "\n a formula de bhaskara o golpe mais forte de Gandalf."
                    + "\n hora de usar o que ele aprendeu com o criador"
                    + "\n indo para o tudo ou nada."
                    + "\n se acerta agora você irá acabar com tudo.");

            pr.println("Calcule as raízes da equação 2x2 – 16x – 18 = 0");
            pr.println("<A> 9,  0");
            pr.println("<B> 0, -1");
            pr.println("<C> 1, -9");
            pr.println("<D> 9, -1");

            pr.close();
            arquivo.close();

        } catch (Exception e) {
            System.out.println("Erro ao escrever o arquivo ");
        }
    }
}
