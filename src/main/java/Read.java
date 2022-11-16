/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author danie
 */
public class Read {

    private Integer valores[] = null;

    public static void main(String[] args) {

        String path = "C:\\Users\\daniel.nsilva20\\ProjetoPi_\\Questao4.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String [] vect = line.split(",");
                
                System.out.println(line);
               
            line = br.readLine();
                }
            
            br.close();
            } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}