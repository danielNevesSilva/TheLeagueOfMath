
import java.util.Scanner;

public class questoes {

    private int vida;

    boolean tacerto = false;

    public void jogo() {
        Scanner sc = new Scanner(System.in);
        String menu, continua;

        System.out.println("aperte enter para continuar");
        continua = sc.nextLine();

        System.out.println("Qual é o vertice da função f(x)=3(x-2)²+4");

        int vida = 3;

        boolean tacerto = false;

        System.out.println("<A> 1,5 ");
        System.out.println("<B> 4,6 ");
        System.out.println("<C> 2,4 ");
        System.out.println("<D> 3,2 ");

        menu = sc.next();

        switch (menu) {

            case "c":
            case "C":

                tacerto = true;
                System.out.println("Muito bem Gandalf, Então Gandalf pego o e repeliu o ataque do mago, o acertou dando um dano critico");
                break;

            case "a":
            case "A":

            case "b":
            case "B":

            case "d":
            case "D":

            case "e":
            case "E":

                vida--;
                System.out.println("RESPOTA ERRADA! Gandalf toma um grave dano e perde uma vida. \nVidas restantes " + vida);
                break;
            default:
                vida--;
                System.out.println("Respota invalida \n voce perdeu uma vida \n vidas restantes" + vida);

        }

        if (!tacerto) {

        }

        System.out.println("E consegue escapar do mago e fujindo da floresta e assim chegando a vila onde ele morava "
                + "chegando na vila, ele encotra uma venda do SR Isaac newton , onde vendia maças ");

        System.out.println("Aperte enter para falar com Isaac");
        continua = sc.nextLine();

        System.out.println("Óla Sr Isaac, como vai as vendas?"
                + "\n-Olá meu jovem, esta indo bem, como posso te ajudar?"
                + "\nEstou com fome e sem dinheiro, poderia me da uma maça?"
                + "\nClaro, mas voce tera que me responder uma pergunta antes."
                + "\nOk, qual é a pergunta \n");
        System.out.println("Dois corpos atraem-se com força proporcional às suas massas e "
                + "\ninversamente proporcional ao quadrado da distância "
                + "\n que separa seus centros de gravidade");
        System.out.println("Pensando nisso, escolha a alternativa que concorde com isso\n");

        System.out.println("<A> Quando um fruto cai de uma arvore ele flutua ate cair no chão ");
        System.out.println("<B> Ao chutar uma bola ela só vai para quando bater em algo ");
        System.out.println("<C> tudo que sobe não desce ");
        System.out.println("<D> ao jogar um objeto para o alto ele retorna, pos a massa da terra é maior que o objeto ");

        menu = sc.next();

        switch (menu) {

            case "d":
            case "D":

                vida++;
                tacerto = true;
                System.out.println("Muito bem Gandalf, tome essa maça "
                        + "Gandalf ganhou um vida " + vida);
                break;

            case "a":
            case "A":

            case "b":
            case "B":

            case "c":
            case "C":

            case "e":
            case "E":

                System.out.println("RESPOTA ERRADA! Gandalf continua com fome " + vida);
                break;
            default:
                System.out.println("Respota invalida");
        }

        if (!tacerto) {

        }
        System.out.println("Bom Gandalf, até a proxima "
                + "\nGandalf ao volta para vila viu que tem algo errado, as pessoas estão com cara de medo e se escondendo"
                + "\n ele ve quem a vila tem alguns guardas que estão lá a mando do rei, fazendo contas erradas cobrando "
                + "\n taxas abusivas de imposto e então que chegam dois guardas na venda do isaac para cobrar e ele ver isso acontecendo e tenta agir."
                + "aperte enter para ajudar isaac ");
        String go = sc.nextLine();

        System.out.println("os guardas falam para o isaac que a cada maça vendida ele deve pagar metade do valor da maça para o rei."
                + "\nO Isaac vende a maça a 10 dinheiros, isaac vendeu 7 maças."
                + "\nquanto o isaac deve pagar a eles?");

        System.out.println("<A> 35 dinheiros ");
        System.out.println("<B> 40 dinheiros ");
        System.out.println("<C> 25 dinheiros ");
        System.out.println("<D> 50 dinheiros ");

        menu = sc.next();

        switch (menu) {

            case "a":
            case "A":

                tacerto = true;
                System.out.println("Muito bem Gandalf, você acerto");
                break;

            case "c":
            case "C":

            case "b":
            case "B":

            case "d":
            case "D":

            case "e":
            case "E":

                vida--;
                System.out.println("RESPOTA ERRADA! voce prejudicou o Isaac. \nVidas restantes " + vida);
                break;
            default:
                vida--;
                System.out.println("Respota invalida \n voce perdeu uma vida \n vidas restantes" + vida);

        }

        if (!tacerto) {

        }

        System.out.println("Gandalf fala que eles pegaram dinherio a mais do Isaac e falam para eles devolverem"
                + "\nos guardas olha para Gandalf e riem, fala para ele se calar que não é assunto dele"
                + "\n então Gandalf jogo um poder neles."
                + "\n para Gandalf jogar o poder voce deverá acerta a proxima perguta.");

        System.out.println("h(x)=0,5(x+4)²+1");
        System.out.println("Qual é a interceptação em y da função? \nesolha a opção correta");

        System.out.println("<A> 9,0 ");
        System.out.println("<B> 0,9 ");
        System.out.println("<C> 1,7 ");
        System.out.println("<D> 1,9 ");

        menu = sc.next();

        switch (menu) {

            case "B":
            case "b":

                tacerto = true;
                System.out.println("Muito bem Gandalf, você acerto na mosca os guarda"
                        + "\n pegue o dinhero deles e o devolva para Isaac"
                        + "os guardas vão ficar de olho em voce a parti de agora, se prepare para o pior");
                break;

            case "c":
            case "C":

            case "a":
            case "A":

            case "d":
            case "D":

            case "e":
            case "E":

                vida--;
                System.out.println("RESPOTA ERRADA! voce errou os guardam zombaram de você, mas vão ficar de olho em voce a parti de agora \nVidas restantes " + vida);
                break;
            default:
                vida--;
                System.out.println("Respota invalida \n voce perdeu uma vida \n vidas restantes" + vida);

        }

        if (!tacerto && vida > 0) {

        } else if (vida <= 0) {

            System.exit(vida);
        }

    }

}
