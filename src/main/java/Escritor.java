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
            FileOutputStream arquivo = new FileOutputStream("Idealizado.txt");
            PrintWriter pr = new PrintWriter(arquivo);
            pr.println("Este jogo foi idealizado e pensado pelo alunos do senac. São eles "
                    + "\n Daniel Neves \n Matheus Ribeiro \n Rafael Rasquinho \n Marcos vinicius \n Leonardo Freitas "
                    + "\n Nosso grupo escolhemors a materia de Matematica para tecnologia desenvolvimento da informação"
                    + "\n utilizamos como base Khan academy para elaborarmos algumas questões");
            pr.println("Aperte enter para descobrir como jogar");

            pr.close();

            arquivo.close();

        } catch (Exception e) {
            System.out.println("Erro ao escrever o arquivo ");
        }
    }
}
