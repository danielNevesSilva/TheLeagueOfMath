
import java.util.Scanner;

public class questoes1 {

    private int vida;

    public static void jogo() {

        Scanner sc = new Scanner(System.in);
        String menu, continua;

        System.out.println("aperte enter para continuar");
        continua = sc.nextLine();

        System.out.println("Qual é o vertice da função f(x)=3(x-2)²+4");

        int vida = 3, khan = 2;

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
        System.out.println("");
        continua = sc.nextLine();

        System.out.println("Olá Sr Isaac, como vai as vendas?"
                + "\n-Olá meu jovem, esta indo bem, como posso te ajudar?"
                + "\nEstou com fome e sem dinheiro, poderia me da uma maçã?"
                + "\nClaro, mas voce tera que me responder uma pergunta antes."
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
        System.out.println("Bom Gandalf, até a proxima "
                + "\nGandalf ao volta para vila viu que tem algo errado, as pessoas estão com cara de medo e se escondendo"
                + "\n ele vê que a vila tem alguns guardas que estão lá a mando do rei, fazendo contas erradas cobrando "
                + "\n taxas abusivas de imposto, chegam dois guardas na venda do Isaac para cobrar e ele ver isso acontecendo e tenta agir.");
        System.out.println("aperte enter para ajudar Isaac ");
        continua = sc.nextLine();
        System.out.println("");
        continua = sc.nextLine();

        System.out.println("os guardas falam para o Isaac que a cada maçã vendida ele deve pagar metade do valor da maçã para o rei."
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

        System.out.println("Gandalf viu que eles pegaram dinherio a mais do Isaac e falam para eles devolverem"
                + "\nos guardas olha para Gandalf e riem, fala para ele se calar que não é assunto dele"
                + "\n então Gandalf jogo um poder neles."
                + "\n para Gandalf jogar o poder você deverá acerta a próxima pergunta.");

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
                        + "\n pegue o dinhero e devolva para Isaac"
                        + "\n'os guardas vão ficar de olho em voce a parti de agora, se prepare para o pior'");
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

        System.out.println("\nGandalf corre para fujir dos guardas."
                + "\nGandalf corre para sua antiga casa e vê que sua casa ta cheia de guardas"
                + "\nagora ele vai ter que achar um esconderijo, enquanto as coisas não volta ao normal."
                + "\nGandalf pensa nas montanhas, mas antes ele vai ter que estudar matemática novamente"
                + "\nele percebeu que se fazer contas e de certo vai usar poderes."
                + "\no melhor lugar para aprender matemática é nos livros de matematica."
                + "\nhora de ir para biblioteca, pegar livros de estudo"
                + "\n\nGandalf vai sentido a biblioteca, mas ele percebe que aquantidade de guardas é grande no lugares da vila."
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
                            + "\n hora de escalar, a biblioteca tem buraco na paredes que vai facilitar a subida."
                            + "\n Gandalf começa a subir, chegando na metade da biblioteca ele percebe que tem  dois guardas virando a rua"
                            + "\n e termina de subir rapidamente, chegando ao terraço ele procura a entrada e vai em direção a elá");
                    break;
                case "a":
                case "A":

                    tacerto = true;

                    System.out.println(" *--pela entrada de cargas--*"
                            + "\n hora de correr para entrada de cargas, tem um guarda na porta."
                            + "\n Gandalf procura algo para distrair o guarda, ele encontra uma pedra."
                            + "\n Aperte enter para jogar a pedra");
                    continua = sc.nextLine();
                    System.out.println("");
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
                + "\nvarios corredores os centenas de livros, porém tem muitos espaços vazio entre os livros."
                + "\nGandalf começa vasculhar corredor por corredor, mas não encotra se quer um livro de matematica"
                + "\ndevem ter pegado os livros e guardados em algum tipo de cofre."
                + "\nGandalf passa por um corredor e ver quem tem uma espécie de porta falsa."
                + "\nele chega perto e ver que tem um enigma");
        System.out.println("Aperte enter para ver o enigma");
        System.out.println(" ");
        continua = sc.nextLine();
        boolean tcerto = false;

        do {
            System.out.println("Descubra qual o próximo número da sequência 8, 13, 21, 34, 55, 88 ...");

            System.out.println("<A> = 198 ");
            System.out.println("<B> = 143 ");
            System.out.println("<C> = 138 ");
            System.out.println("<D> = 152");

            menu = sc.next();

            switch (menu) {

                case "B":
                case "b":

                    tcerto = true;
                    System.out.println("Respota certa, bom trabalho");

                    break;

                case "c":
                case "C":

                case "a":
                case "A":

                case "d":
                case "D":

                    System.out.println("RESPOTA ERRADA!");

                    break;
                default:
                    System.out.println("Respota invalida");

            }

        } while (!tcerto);

        System.out.println("\n*--Gandalf acertou o engimar--*"
                + "\nAporta se abre lentamente, dentro do quarto tem um livro, Gandalf pega o livro rapidamente."
                + "\nVOCÊ ADQUIRIU um livro, USE COM SABEDORIA"
                + "\nhora de sair da biblioteca agora vai ser mais dificil sair"
                + "\nA penas uma saida da biblioteca pela saida da frente, mas lembre-se a guarda na porta"
                + "\n ENTÃO CUIDADO!!!");
        System.out.println("aperte enter para ajudar Isaac ");
        continua = sc.nextLine();
        System.out.println("");
        continua = sc.nextLine();
        System.out.println(" Gandalf vai em direção a porta, os guardas escutam um barulho de dentro da biblioteca"
                + "\nPREPARE PARA A BATALHA!!!"
                + "\nPorta de entrada da biblioteca a aberta, os guardas estão te esperando"
                + "\nGuardas 'quem é voce, oque estar fazendo com esse livro na mão, espere isso é um livro de matemática? "
                + "\n passe para ca ou sofra as conseguencias'"
                + "\n Gandalf pega o livro e abre em uma pagina aleatoria e vê uma formula de matemática "
                + "\nx = -b +- raiz b²-4*a*b"
                + "\n              2*a"
                + "\n O poder de Bhaskara, está formula foi descoberta, mas ninguem a soube usa-la"
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
                + "\n o numero de guardas estar aumentando de forma rapida, você tem que fazer algo para despitalos"
                + "\n Gandalf continua correndo, logo a frente tem uma feira de roupas, ótima chance para se camuflar"
                + "\n cuidado, os guardas estão atrás de você");
        System.out.println("Aperte enter para continuar");
        continua = sc.nextLine();
        System.out.println(" ");
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
                + "\n uma banca com itens a maldiçoados com cajados, varinhas e brincos de cavera"
                + "\n muito interesante, mas não no será util agora, quem sabe volta aqui mais tarde."
                + "\n espere, a algo que pode ser util, uma capa preta que vai até o chão isso pode ajudar agora."
                + "\n aperte enter para pegar a capa");
        continua = sc.nextLine();
        System.out.println("");
        continua = sc.nextLine();

        System.out.println("*--Capa adquirida--*");

        System.out.println("\n Os guardas estão na cola de Gandalf, tome cuidado."
                + "\n estar camuflado e não invisivel então saia sem chamar atenção"
                + "\n Gandalf começa andar e sai da vista dos guarda."
                + "\n muito bem, mas ainda não acabou, aqui não é seguro vá para as montanhas."
                + "\n *--SAIU DA FEIRA DE ROUPAS--*"
                + "\n as montanhas ficam ao sul da vila, vá para lá e estara seguro."
                + "\n Gandalf vai sentido as montanha."
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
        System.out.println("aperte enter para ajudar Isaac ");
        continua = sc.nextLine();
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
        System.out.println("\n O rei da vila a muitos anos atras foi meu aprendiz"
                + "\n eu o ensinei um pouco de matemática"
                + "\n não sabia que ele iria virar rei, muito menos que ele tinha tamanha maldade"
                + "\n 'Khan' nome do rei era muito gentil, ajudava todos que o pediam sem hesitar "
                + "\n entretanto eu tive que para de ensinar ele estava desenvolvendo um tipo de magia com a matemática - diz Akaria"
                + "\n agora ele estar perverso e eu tenho que detelo - diz Gandalf"
                + "\n como você vai detelo? ele deve ter aprendido a usar esse poder - diz Akaria"
                + "\n usando sua formula, eu a ja usei na antes e só tenho que aperferço-la - diz Gandalf"
                + "\n Akaria fica com uma cara pensativa, porém decide ajudar Gandalf"
                + "\n *eles pasaram horas estudando matemática*"
                + "\n aperte enter para continuar");
        continua = sc.nextLine();
        System.out.println("");
        continua = sc.nextLine();
        System.out.println("\n\n *--AMANHACEU--*\n"
                + "\n Gandalf estar confiante para enfrentar o rei"
                + "\n hora de fazer isso"
                + "\n Gandalf Agradece Bhaskara Akaria pelos ensinamentos e se despede."
                + "\n hora de pensar como vai chegar ao rei, ele não é uma pessoa de facil acesso"
                + "\n então tera que causar um bom estrago para chamar a sua atenção"
                + "\n o rei é muito ambicioso então vá atras do dinheiro dele."
                + "\n o melhor lugar é um banco entre lá e faça uma bagunça, "
                + "\n eles vão te prender e o Rei Khan vai quere vê quem fez a bagunça"
                + "\n é a oportunidade de chegar nele e o desafialo no mano a mano."
                + "\n ante disso tudo descanse, você presica disso. \n vidas = " + vida
                + "\naperte enter para continuar");

        continua = sc.nextLine();

        System.out.println(" *--No OUTRO DIA--*\n"
                + "\n Hora de ir atras desse rei de meia tigela e liberta esse povo da alienação"
                + "\n Gandalf veste sua capa e seu chapeu e vai para capital da vila..."
                + "\n ele percebe que a cidade tem muito mais guardas que antes, mas ele está disfarçado"
                + "\n a feira de roupas não tem mais, foi destruida e a biblioteca está com a segurança reforçada"
                + "\n vamos ao que interessa o Bank de dinheiros da cidade"
                + "\n Gandafl percebe que o banco não tem guardas na entradada"
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
        System.out.println("");
        continua = sc.nextLine();

        do {
            System.out.println("Calcule o valor de saída, h, quando o valor de entrada, t, é 35."
                    + "\nh=50− 5\n"
                    + "\n      t\n");
            System.out.println("<A> 40");
            System.out.println("<B> 43 ");
            System.out.println("<C> 48");
            System.out.println("<D> 50 ");

            menu = sc.next();

            switch (menu) {

                case "b":
                case "B":

                    tcerto = true;
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

        } while (!tcerto && vida > 0);

        if (vida <= 0) {
            System.out.println("GAME OVER");

            System.exit(vida);

        }

        System.out.println(" Gandalf causa desordem no Bank com seu poder."
                + "\n todos ficam em estado de shock, os guardas avançam para cima de Gandalf e ele vai preso."
                + "\n o plano estar correndo bem."
                + "\n *--GANDALF FOI PRESO--*\n"
                + "\n Gandalf foi pego muito facil, os guardas prendem com uma corda"
                + "\n agora ele será levado preso para o calaboço do castelo"
                + "\n ..."
                + "\n é colocado um saco no rosto de Gandalf para não saber onde estar"
                + "\n o rei é notificado do ocorrido e fica muuito curioso para saber o quem é esse jovem"
                + "\n o que ele faz, e por que ele está causando tantos problemas.");
        System.out.println("aperte enter para continuar");
        continua = sc.nextLine();
        System.out.println(" *--Gandalf no calaboço--**\n"
                + "\n tiram saco da cabeça de Gandalf e ele n se encontra em uma cela"
                + "\n sem cama, sem água e sem luz."
                + "\n os guardas que ficam na porta falam quele ja erá"
                + "\n que o rei khan irá acabar com ele "
                + "\n Gandalf ignora, mas fica preocupado."
                + "\n minutos depois chega um servo do rei falando que Gandalf será julgado"
                + "\n *--momento de tenção--*"
                + "\n hora de começa bolar um plano para se solta das cordas."
                + "\n Gandalf sabe que se continuar preso não terá a minima chance."
                + "\n hora de agir.");

        System.out.println("Gandalf ta preso e precisa solta suas mão para ter chances de lutar contra o rei"
                + "\n então voce tera que fazer uma conta rapida para solta as cordas"
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

                    tcerto = true;
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

        } while (!tcerto && vida > 0);

        if (vida <= 0) {
            System.out.println("GAME OVER");

            System.exit(vida);
        }

        System.out.println("Voce se soltou das cordas, mas segure para parecer que ainda continua preso"
                + "\n chegam mais dois guardas para o escoltalo até o rei khan"
                + "\n os guardas abrem a cela e tiram Gandalf da cela"
                + "\n eles começam a caminhar para o jugamento"
                + "\n durante o caminho, silencio absoluto, ninguem fala nada."
                + "\n até o barulho de um pingo de agua se consegue ouvir"
                + "\n Gandalf por incrivel que pareça continua calmo."
                + "\n chegamos ao jugamento - diz um dos guardas");

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

                    tcerto = true;
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

        } while (!tcerto && vida > 0);

        if (vida <= 0) {
            System.out.println("GAME OVER");

            System.exit(vida);

        }

        System.out.println("Guardas no chão, hora de lutar contra o rei");
    }
}