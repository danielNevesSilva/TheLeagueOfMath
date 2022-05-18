
import java.util.Scanner;

public class introducao {

    public void mododejogo() {
        Scanner sc = new Scanner(System.in);
        String continuar;
        System.out.println(" Bem-vindo ao the legend of math "
                + "\n Neste jogo iremos apresentar o pequeno Gandalf "
                + "\n o jogo se passará no tempo medieval e vai falar de um personagem que vive em uma aldeia "
                + "\n o Gandalf é o personagem principal da história");
        System.out.println(" O personagem devenvolverá habilidade de matematica ao longo da historia"
                + "\n essas habilidades serão métedos de matemática feitos durante a história"
                + "\n a historia também contara com a participação de alguns matemáticos famosos da historia"
                + "\n que ajudaram o Gandalf a ter conceitos de matemática ");
        System.out.println("Aperte enter para descobrir como jogar");
        continuar = sc.nextLine();
        System.out.println(" modo de jogar\n para jogar você usará apenas o teclado"
                + " para avançar pelo jogo ");

        System.out.println("Digite enter para volta ao Menu");
        continuar = sc.nextLine();
        menuJogo exibir = new menuJogo();
        exibir.menu();

    }

}
