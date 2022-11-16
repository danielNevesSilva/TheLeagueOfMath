
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class questao01 {

    private int vida;

    public static void jogo() {

        Scanner sc = new Scanner(System.in);
        String menu, continua;

        System.out.println("aperte enter para continuar");
        continua = sc.nextLine();

        System.out.println("Qual é o vertice da função f(x)=3(x-2)²+4");

        int vida = 5, khan = 2;

        boolean certo = false;

        System.out.println("<A> 1,5 ");
        System.out.println("<B> 4,6 ");
        System.out.println("<C> 2,4 ");
        System.out.println("<D> 3,2 ");

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

        System.out.println("Olá Sr Isaac, como vai as vendas?"
                + "\n-Olá meu jovem, está indo bem, como posso te ajudar?"
                + "\nEstou com fome e sem dinheiro, poderia me da uma maçã?"
                + "\nClaro, mas você tera que me responder uma pergunta antes."
                + "\nOk, qual é a pergunta? \n");
        System.out.println("Dois corpos atraem-se com força proporcional às suas massas e "
                + "\ninversamente proporcional ao quadrado da distância "
                + "\n que separa seus centros de gravidade");
        System.out.println("Pensando nisso, escolha a alternativa que concorde com isso\n");

        System.out.println("<A> Quando um fruto cai de uma arvore ele flutua ate cair no chão ");
        System.out.println("<B> Ao chutar uma bola ela só vai para quando bater em algo ");
        System.out.println("<C> tudo que sobe não desce ");
        System.out.println("<D> Ao jogar um objeto para o alto ele retorna, pos a massa da terra é maior que o objeto ");

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
        System.out.println("Bom Gandalf, até a próxima "
                + "\nGandalf ao volta para vila viu que tem algo errado, as pessoas estão com cara de medo e se escondendo"
                + "\n ele vê que a vila tem alguns guardas que estão lá a mando do rei, fazendo contas erradas cobrando "
                + "\n taxas abusivas de imposto, chegam dois guardas na venda do Isaac para cobrar e ele ver isso acontecendo e tenta agir.");
        System.out.println("aperte enter para ajudar Isaac ");
        continua = sc.nextLine();

        System.out.println("Os guardas falam para o Isaac que a cada maçã vendida ele deve pagar metade do valor da maçã para o rei."
                + "\nO Isaac vende a maçã a 10 dinheiros, Isaac vendeu 7 maçãs."
                + "\nquanto o Isaac deve pagar a eles?");

        System.out.println("<A> 35 dinheiros ");
        System.out.println("<B> 40 dinheiros ");
        System.out.println("<C> 25 dinheiros ");
        System.out.println("<D> 50 dinheiros ");

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

        System.out.println("Gandalf viu que eles pegaram dinheiro a mais do Isaac e falam para eles devolverem"
                + "\nos guardas olha para Gandalf e riem, fala para ele se calar que não é assunto dele"
                + "\n então Gandalf jogou um poder neles."
                + "\n para Gandalf jogar o poder você deverá acertar a próxima pergunta.");

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

        System.out.println("\nGandalf corre para fugir dos guardas."
                + "\nGandalf corre para sua antiga casa e vê que sua casa tá cheia de guardas"
                + "\nagora ele vai ter que achar um esconderijo, enquanto as coisas não volta ao normal."
                + "\nGandalf pensa nas montanhas, mas antes ele vai ter que estudar matemática novamente"
                + "\nele percebeu que se faz contas e de certo vai usar poderes."
                + "\no melhor lugar para aprender matemática é nos livros de matemática."
                + "\nhora de ir para biblioteca, pegar livros de estudo"
                + "\n\nGandalf vai sentido a biblioteca, mas ele percebe que a quantidade de guardas é grande no lugares da vila."
                + "\nA biblioteca fica no centro da vila perto da praça SENAC"
                + "\nA porta da frente é perigosa de entrar, tente achar um outro jeito de entrar");

        do {
            System.out.println("Ah 3 formas de entrar na Biblioteca"
                    + "\n a 1º é pela porta da frente que está com guardas"
                    + "\n a 2º é pela entrada de cargas  "
                    + "\na 3º e ultima forma pelo telhado. ");

            System.out.println("Por qual entrada você quer tentar?");

            System.out.println("<A> = 2º ");
            System.out.println("<B> = 3º");

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

        } while (!tacerto);

        System.out.println("\n*--Gandalf entra na biblioteca--*"
                + "\n A biblioteca está deserta, parece que ninguém entra aqui a tempos"
                + "\n não importa agora tenho que achar os livros"
                + "\nvários corredores os centenas de livros, porém tem muitos espaços vazio entre os livros."
                + "\nGandalf começa vasculhar corredor por corredor, mas não encontra sequer um livro de matemática"
                + "\ndevem ter pegado os livros e guardados em algum tipo de cofre."
                + "\nGandalf passa por um corredor e ver quem tem uma espécie de porta falsa."
                + "\nele chega perto e ver que tem um enigma");
        System.out.println(" ");
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

        System.out.println("\n*--Gandalf acertou o engimar--*"
                + "\nA porta se abre lentamente, dentro do quarto tem um livro, Gandalf pega o livro rapidamente."
                + "\nVOCÊ ADQUIRIU um livro, USE COM SABEDORIA"
                + "\nhora de sair da biblioteca agora vai ser mais difícil sair"
                + "\nA penas uma saída da biblioteca pela saida da frente, mas lembre-se a guarda na porta"
                + "\n ENTÃO CUIDADO!!!");
        System.out.println("aperte enter para ajudar Isaac ");
        continua = sc.nextLine();
        System.out.println(" Gandalf vai em direção a porta, os guardas escutam um barulho de dentro da biblioteca"
                + "\nPREPARE PARA A BATALHA!!!"
                + "\nPorta de entrada da biblioteca a aberta, os guardas estão te esperando"
                + "\nGuardas 'quem é você, o que está fazendo com esse livro na mão, espere isso é um livro de matemática? "
                + "\n passe para cá ou sofra as consequências'"
                + "\n Gandalf pega o livro e abre em uma página aleatória e vê uma fórmula de matemática "
                + "\nx = -b +- raiz b²-4*a*b"
                + "\n              2*a"
                + "\n O poder de Bhaskara, está fórmula foi descoberta, mas ninguem a soube usá-la"
        );
        System.out.println("aperte enter  para continuar");
        continua = sc.nextLine();

        do {
            System.out.println("Calcule as raízes da equação x2 + 12x – 13 = 0 \nescolha a opção correta");
            System.out.println("<A> 13 e 1");
            System.out.println("<B> 13 e 9 ");
            System.out.println("<C> 1 e 18 ");
            System.out.println("<D> 1 e -13 ");

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
        System.out.println(" Gandalf começa a corre pela vila sentido as montanhas, porém tem muitos guardas na vila"
                + "\n eles veêm ele correndo e vão atrás de Gandalf."
                + "\n o número de guardas estar aumentando de forma rápida, você tem que fazer algo para despitalos"
                + "\n Gandalf continua correndo, logo a frente tem uma feira de roupas, ótima chance para se camuflar"
                + "\n cuidado, os guardas estão atrás de você");
        System.out.println("Aperte enter para continuar");
        continua = sc.nextLine();
        System.out.println(" *--FEIRA DE ROUPAS--*"
                + "\n Gandalf entra na feira de roupas e tem uma multidão de pessoas, hora de se camuflar. ");

        System.out.println(" Gandalf estar passando por uma banca de chapeu."
                + "\n O 1º é um Bowler marrom"
                + "\n O 2º é um Homburg preto"
                + "\n O 3º é um Boater de palha");

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

        System.out.println(" *--Chapeu escolhido--*"
                + "\n ainda não é o suficiente, precisa de mais alguma coisa"
                + "\n uma banca com itens amaldiçoados com cajados, varinhas e brincos de caveira"
                + "\n muito interesante, mas não no será útil agora, quem sabe voltar aqui mais tarde."
                + "\n espere, a algo que pode ser útil, uma capa preta que vai até o chão isso pode ajudar agora."
                + "\n aperte enter para pegar a capa");
       
        continua = sc.nextLine();

        System.out.println("*--Capa adquirida--*");

        System.out.println("\n Os guardas estão na cola de Gandalf, tome cuidado."
                + "\n está camuflado e não invisível então saia sem chamar atenção"
                + "\n Gandalf começa andar e sai da vista dos guarda."
                + "\n muito bem, mas ainda não acabou, aqui não é seguro vá para as montanhas."
                + "\n *--SAIU DA FEIRA DE ROUPAS--*"
                + "\n as montanhas ficam ao sul da vila, vá para lá e estará seguro."
                + "\n Gandalf vai sentido as montanhas."
                + "\n *COMEÇA A ANOITECER*"
                + "\n o céu começa a ficar escuro, ainda não é hora de parar"
                + "\n ah uma fogueira no meio do nada com um velho olhando para o céu e escrevendo no chão"
                + "\n Gandalf se aproxima"
                + "\n aperte enter para falar com o velho");

        continua = sc.nextLine();

        System.out.println("\nOlá, o que um senhor como voce estar fazendo no meio do nada? diz Gandalf"
                + "\n estou a olhar as luses no céu, é muito facinante - diz o velho"
                + "\n olhando para o céu? por que? não tem nada demais lá. apenas luses - diz Gandalf"
                + "\n o céu é facinante meu jovem, ah coisas que não não sabemos ainda - diz o velho"
                + "\n Gandalf fica pensativo"
                + "\n e o que você tanto a nota nesse chão? o que é isso? eu ja vi isso antes - diz Gandalf"
                + "\n você fez escreveu a formula de Bhaskara, afinal quem é você? - perguta Gandalf"
                + "\n Eu? haha sou apenas mais uma pessoa - diz o velho"
                + "\n voce tem algum nome? - perguta Gandalf"
                + "\n tenho meu nome é Akaria Bhaskara e tem também quem me chame de Bhaskaracharya - diz Akaria"
                + "\n *--Gandalf congela--*");
        System.out.println("");
        continua = sc.nextLine();
        System.out.println("\n Gandalf pega o livro e diz então foi você que fez essa formula?"
                + "\n akaria olha para o livro e perguta como Gandalf conseguiu aquele livro"
                + "\n eu peguei na biblioteca no centro da vila, mas não é um lugar seguro - diz Gandalf"
                + "\n Akaria fica com um rosto de desconfiado e perguta por que não é seguro"
                + "\n Gandalf diz que desde que ele acordou tem muitas coisas estranhas..."
                + "\n Gandalf conta tudo que aconteceu..."
                + "\n aperte enter para continuar"
        );

        continua = sc.nextLine();
        System.out.println("\n O rei da vila a muitos anos atrás foi meu aprendiz"
                + "\n eu o ensinei um pouco de matemática"
                + "\n não sabia que ele iria virar rei, muito menos que ele tinha tamanha maldade"
                + "\n 'Khan' nome do rei era muito gentil, ajudava todos que o pediam sem hesitar "
                + "\n entretanto eu tive que para de ensinar ele estava desenvolvendo um tipo de magia com a matemática - diz Akaria"
                + "\n agora ele estar perverso e eu tenho que detê-lo - diz Gandalf"
                + "\n como você vai detê-lo? ele deve ter aprendido a usar esse poder - diz Akaria"
                + "\n usando sua fórmula, eu já usei na antes e só tenho que aperfeiçoa-la - diz Gandalf"
                + "\n Akaria fica com uma cara pensativa, porém decide ajudar Gandalf"
                + "\n *eles passam horas estudando matemática*"
                + "\n aperte enter para continuar");
        continua = sc.nextLine();
        System.out.println("\n\n *--AMANHACEU--*\n"
                + "\n Gandalf estar confiante para enfrentar o rei"
                + "\n hora de fazer isso"
                + "\n Gandalf Agradece Bhaskara Akaria pelos ensinamentos e se despede."
                + "\n hora de pensar como vai chegar ao rei, ele não é uma pessoa de fácil acesso"
                + "\n então terá que causar um bom estrago para chamar a sua atenção"
                + "\n o rei é muito ambicioso então vá atrás do dinheiro dele."
                + "\n o melhor lugar é um banco entre lá e faça uma bagunça, "
                + "\n eles vão te prender e o Rei Khan vai querer vê quem fez a bagunça"
                + "\n é a oportunidade de chegar nele e o desafiá lo no mano a mano."
                + "\n ante disso tudo descanse, você precisa disso. \n vidas = " + vida
                + "\naperte enter para continuar");

        continua = sc.nextLine();

        System.out.println(" *--No OUTRO DIA--*\n"
                + "\n Hora de ir atrá   s desse rei de meia tigela e liberta esse povo da alienação"
                + "\n Gandalf veste sua capa e seu chapéu e vai para capital da vila..."
                + "\n ele percebe que a cidade tem muito mais guardas que antes, mas ele está disfarçado"
                + "\n a feira de roupas não tem mais, foi destruída e a biblioteca está com a segurança reforçada"
                + "\n vamos ao que interessa o Bank de dinheiros da cidade"
                + "\n Gandafl percebe que o banco não tem guardas na entrada"
                + "\n muito suspeito mesmo assim temos que entrar."
                + "\n Gandalf vai em direção do Bank "
                + "\naperte enter para continuar ");

        continua = sc.nextLine();
        System.out.println("\n*--Entrou no BANK--*\n"
                + "\n O banco é cheio de mesas varias pessoas trabalhando, pessoas sacando o dinheiro"
                + "\n vá pasa uma mesa e peça o dinheriro do povo"
                + "\n Gandalf caminha para a mesa, mas vê que tem muitos homens parados aos cantos das paredes"
                + "\n com certeza são guardas disfarçados, mas estamos aqui para isso."
                + "\n hora de usar o que aprendeu.");
        System.out.println("aperte enter  para continuar");
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
                    System.out.println("Respota invalida \n voce perdeu uma vida \n vidas restantes: " + vida + "\nhora de fujir. finjasse de morto ele vai te ignorar para fujir ");

            }

        } while (!acertou && vida > 0);

        if (vida <= 0) {
            System.out.println("GAME OVER");

            System.exit(vida);

        }

        System.out.println(" Gandalf causa desordem no Bank com seu poder."
                + "\n todos ficam em estado de shock, os guardas avançam para cima de Gandalf e ele vai preso."
                + "\n o plano estar correndo bem."
                + "\n *--GANDALF FOI PRESO--*\n"
                + "\n Gandalf foi pego muito fácil, os guardas prendem com uma corda"
                + "\n agora ele será levado preso para o calabouço do castelo"
                + "\n ..."
                + "\n é colocado um saco no rosto de Gandalf para não saber onde estar"
                + "\n o rei é notificado do ocorrido e fica muito curioso para saber o quem é esse jovem"
                + "\n o que ele faz, e por que ele está causando tantos problemas.");
        System.out.println("aperte enter para continuar");
        continua = sc.nextLine();
        System.out.println(" *--Gandalf no calaboço--**\n"
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

        System.out.println("Gandalf ta preso e precisa soltar suas mãos para ter chances de lutar contra o rei"
                + "\n então você terá que fazer uma conta rápida para solta as cordas"
                + "\n Eva e Jaime gostam de assar cookies. Eva assou 24 cookies com gotas de chocolate"
                + "\n e Jaime assou p cookies de manteiga de amendoim"
                + "\n Juntos, eles assaram um total de 56 cookies."
                + "\n quantos cookies jaime assou? 32 ");

        do {
            System.out.println("<A> 29");
            System.out.println("<B> 30 ");
            System.out.println("<C> 32");
            System.out.println("<D> 28 ");

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

        } while (!acertou && vida > 0);

        if (vida <= 0) {
            System.out.println("GAME OVER");

            System.exit(vida);
        }

        System.out.println("Você se soltou das cordas, mas segure para parecer que ainda continua preso"
                + "\n chegam mais dois guardas para o escoltá lo até o rei khan"
                + "\n os guardas abrem a cela e tiram Gandalf da cela"
                + "\n eles começam a caminhar para o julgamento"
                + "\n durante o caminho, silêncio absoluto, ninguém fala nada."
                + "\n até o barulho de um pingo de água se consegue ouvir"
                + "\n Gandalf por incrível que pareça continua calmo."
                + "\n chegamos ao julgamento - diz um dos guardas");

        System.out.println("aperte enter para continuar");
        continua = sc.nextLine();
        System.out.println("*--Sala de jugamento--*"
                + "\n as portas se abrem e o rei khan está na sala com mais dois guardas"
                + "\n Gandalf entra sozinho, na sala ficam 4 pessoas."
                + "\n o rei khan, dois guardas e Gandalf."
                + "\n rei khan pergutam quem é Gandalf e o que ele quer com seu reino"
                + "\n Gandalf diz que ele é apenas mais uma pessoa, mas não que ver injustiça"
                + "\n ..."
                + "\n Gandalf solta suas mão levemente"
                + "\n rei khan não fica surpreso, ja sabia que ele poderia fazer isso, porém não baixa a guarda"
                + "\n *--A QUALQUER MOMENTO PODE COMEÇAR UMA LUTA--*"
                + "\n rei khan convida a se juntar a ele"
                + "\n Gandalf responde sem hesita que não e começa a pensar em contas para atacar o rei...");

        System.out.println("O rei tem 2 vidas");
        System.out.println("aperte enter para continuar");
        continua = sc.nextLine();

        System.out.println("Gandalf ja pensa em ataca os guardas para não ter problemas");

        boolean cert = false;
        do {
            System.out.println("vocês irão ter que resolver o seguinte cálculo matemático: ");

            System.out.println("<A> 9x²-6x");
            System.out.println("<B> 6x³-9x ");
            System.out.println("<C> 9x³+6x");
            System.out.println("<D> 9x²+9x");

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

        if (vida <= 0) {
            System.out.println("GAME OVER");

            System.exit(vida);

        }

        System.out.println("Guardas no chão, hora de lutar contra o rei"
                + "\n então Gandalf, você é mais fascinante do que parece."
                + "\n derrubou meu guardas com apenas um golpe. não fique muito confiante"
                + "\n eles nem eram grande coisa mesmo - disse o rei"
                + "\n Gandalf não se abala com as palavras e fica Observando o rei Khan"
                + "\n o rei se irrita e vai para cima de gandalf"
                + "\n *--Batalha vai começar--*");

        do {
            System.out.println("Encontre o valor de x."
                    + "  11x = 11².11³ ");

            System.out.println("<A> x5");
            System.out.println("<B> x7 ");
            System.out.println("<C> x11");
            System.out.println("<D> x0");

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

        if (vida <= 0) {
            System.out.println("GAME OVER");

            System.exit(vida);

        }
        boolean t = false;
        do {
            System.out.println("Gandalf desvio do ataque, hora de contra atacar."
                    + "\n Simplifique.\n"
                    + " Reescreva a expressão na forma 5n"
                    + " 5².5¹");

            System.out.println("<A> 5²");
            System.out.println("<B> 5¹ ");
            System.out.println("<C> 5³");

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

        if (vida <= 0) {
            System.out.println("GAME OVER");

            System.exit(vida);

        }

        System.out.println("Gandalf começa a ficar cansado..."
                + "\n O rei fica abalado com o golpe, mas ainda não caiu."
                + "\n hora de acabar com isso O rei khan começa a fazer contas com os dedos..."
                + "\n Gandalf olha isso e também começa a fazer uma conta..."
                + "\n x = -b +- raiz b²-4*a*b"
                + "\n              2*a"
                + "\n a formula de bhaskara o golpe mais forte de Gandalf."
                + "\n hora de usar o que ele aprendeu com o criador"
                + "\n indo para o tudo ou nada."
                + "\n se acerta agora você irá acabar com tudo.");

        do {
            System.out.println("Calcule as raízes da equação 2x2 – 16x – 18 = 0");

            System.out.println("<A> 9,  0");
            System.out.println("<B> 0, -1");
            System.out.println("<C> 1, -9");
            System.out.println("<D> 9, -1");

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

        if (vida <= 0) {
            System.out.println("GAME OVER");

            System.exit(vida);

        }

        System.out.println("Gandalf acerta o golpe e derruba o rei, mas está muito debilitado."
                + "\n o rei Khan e mandando para fora do reino com tamanha força e poder que Gandalf usa"
                + "\n os guardas que estavão do lado de fora entram paraver o que aconteceu com tamanho barulho"
                + "\n ficam surpreso que Gandalf derrotou o rei e o veneram, declarando ele como rei."
                + "\n Gandalf não queria se torna rei, mas acabou se tornando e terá que guia o reino"
                + "\n Gandalf faz uma escola de matemática chamada Khan Academy e irá leva o povo para a liberdade."
                + ""
                + "\n                            F i m");
  introducao exibir = new introducao();
            exibir.mododejogo();
    }
}
