
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

        System.out.println("Este jogo foi idealizado e pensado pelo alunos do senac. São eles "
                + "\n Daniel Neves \n Gabriel mota \n Gabriel sousa \n Gabriel Vieira \n Leonardo Viera "
                + "\n Nosso grupo escolhemors a materia de Mate~ática pata tecnologia desenvolvimento da informação"
                + "\n utilizamos como base Khan academy para elaborarmos algumas questões"
                + " ");

        System.out.println("Aperte enter para volta ao Menu");
        menuJogo exibir = new menuJogo();
        continuar = sc.nextLine();

        exibir.menu();
    }

}
