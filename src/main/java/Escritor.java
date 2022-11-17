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
            FileOutputStream arquivo = new FileOutputStream("Menu.txt");
            PrintWriter pr = new PrintWriter(arquivo);
            pr.println(" *-- 1 - Introdução--*"
                    + "\n*-- 2 - Jogar--*"
                    + "\n*-- 3 - Creditos--*"
                    + "\n*-- 4 - Sair--*"
                    + "\nEscolha uma opção");

            pr.close();

            arquivo.close();

        } catch (Exception e) {
            System.out.println("Erro ao escrever o arquivo ");
        }
    }
}
