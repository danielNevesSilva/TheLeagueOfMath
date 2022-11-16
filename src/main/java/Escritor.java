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
            FileOutputStream arquivo = new FileOutputStream("Questão10.txt");
            PrintWriter pr = new PrintWriter(arquivo);

       
        pr.println(" Gandalf causa desordem no Bank com seu poder."
                + "\n todos ficam em estado de shock, os guardas avançam para cima de Gandalf e ele vai preso."
                + "\n o plano estar correndo bem."
                + "\n *--GANDALF FOI PRESO--*\n"
                + "\n Gandalf foi pego muito fácil, os guardas prendem com uma corda"
                + "\n agora ele será levado preso para o calabouço do castelo"
                + "\n ..."
                + "\n é colocado um saco no rosto de Gandalf para não saber onde estar"
                + "\n o rei é notificado do ocorrido e fica muito curioso para saber o quem é esse jovem"
                + "\n o que ele faz, e por que ele está causando tantos problemas.");
        pr.println("aperte enter para continuar");
        
        pr.println(" *--Gandalf no calaboço--**\n"
                + "\n tiram saco da cabeça de Gandalf e ele não se encontra em uma cela"
                + "\n sem cama, sem água e sem luz."
                + "\n os guardas que ficam na porta falam que ele ja erá"
                + "\n que o rei khan irá acabar com ele "
                + "\n Gandalf ignora, mas fica preocupado."
                + "\n minutos depois chega um servo do rei falando que Gandalf será julgado"
                + "\n *--momento de tensão--*"
                + "\n hora de começar bolar um plano para se soltar das cordas."
                + "\n Gandalf sabe que se continuar preso não terá a mínima chance."
                + "\n hora de agir.");

        pr.println("Gandalf ta preso e precisa soltar suas mãos para ter chances de lutar contra o rei"
                + "\n então você terá que fazer uma conta rápida para solta as cordas"
                + "\n Eva e Jaime gostam de assar cookies. Eva assou 24 cookies com gotas de chocolate"
                + "\n e Jaime assou p cookies de manteiga de amendoim"
                + "\n Juntos, eles assaram um total de 56 cookies."
                + "\n quantos cookies jaime assou? 32 ");

      
            pr.println("<A> 29");
            pr.println("<B> 30 ");
            pr.println("<C> 32");
            pr.println("<D> 28 ");

            pr.close();

            arquivo.close();

        } catch (Exception e) {
            System.out.println("Erro ao escrever o arquivo ");
        }
    }
}
