/*--------------------------------------------*/
//
//  @TADS_Turma C - Grupo 2
//
//      RPG Textual desenvolvido por Julio Cesar
//  Renan Araujo, Thiago Gilabel e Luan Oliveira.
//
//
/*--------------------------------------------*/

// Pacotes
package rpgtext;

import java.util.Scanner;

/*--------------------------------------------*/

public class RPGtext {

    /*--------------------------------------------*/
    // Scanner
    static Scanner cap = new Scanner(System.in);

    // Variaveis
    static int senhaUm, senhaDois, senhaTres;
    static int senhaUmForumDois;
    static char enter;
    static String continu;
    static String nome;
    static int escolha;
    static int nv = 1;

    /*--------------------------------------------*/
    public static void main(String[] args) {

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("|   HACKERS & CRACKERS   ");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("|   Digite 'i' para iniciar ou 's' para sair.");
        System.out.println("");

        enter = cap.next().charAt(0);

        limparConsole();

        if (enter == 'i') {
            System.out.println("|   Muito bem.");
            System.out.println("");
            System.out.println("|   Digite algo prosseguir...");
            continu = cap.next();
        } else if (enter == 's') {
            System.exit(0);
        } else if (enter != 's') {
            System.exit(0);
        }

        limparConsole();

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("|   Qual sera o seu nome?   ");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        nome = cap.next();

        limparConsole();

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("|   Sendo assim, seu nome sera " + nome);
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("|   Digite algo para prosseguir...");
        System.out.println("");
        continu = cap.next();

        limparConsole();

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("|   Os dados, ou informações pessoais, como preferir,\n"
                + "| são um bem mais precioso que o ser humano tem em sua vida, pois  \n"
                + "| através dele que se esconde quem realmente é. Ao longo do tempo as pessoas \n"
                + "| faziam o máximo para que seus dados, ou melhor, sua vida pessoal\n"
                + "| estivesse o mais escondido possível, as pessoas foram\n"
                + "| mudando a forma de se “esconder”, mas tudo fica \n"
                + "| diferente no século XXI que as coisas são diferentes \n"
                + "| da era passada, com surgimento da internet a forma de comunicação \n"
                + "| evoluíu, principalmente a tecnologia da informação e dos dados pessoais. \n"
                + "| Os vírus de computadores tiveram sua origem no primeiro vírus de \n"
                + "| computador chamado “The Creeper” O aplicativo invadia a máquina \n"
                + "| e apenas apresentava no monitor a mensagem \"Im the creeper, catch me if you can!\" \n"
                + "| (Eu sou assustador, pegue-me se for capaz!). Com o recado entregue, \n"
                + "| o vírus saltava para outro sistema e repetia a mensagem mais uma vez. Posteriormente,\n"
                + "| foi criado também um precursor do antivírus, o The Reaper, cuja única função \n"
                + "| era eliminar o The Creeper do computador. Os vírus foram \n"
                + "| evoluindo sua força e proposito, atualmente, eles possuem funções de acordo com a\n"
                + "| necessidade do Hacker/Cracker, como roubar informações, danificar a máquina do \n"
                + "| usuário ou usá-las. Sabendo de tudo isso, " + nome + "\n"
                + "| decide se formar em Segurança digital\n"
                + "| e se torna um Ethical Hacker, ou seja, um Hacker Ético com o \n"
                + "| objetivo de deixar a internet mais segura \n"
                + "| para os usuários, ele já desenvolveu diversos sistemas, já resolveu\n"
                + "| brechas de segurança em várias empresas de grande porte como Google, Amazon,\n"
                + "| Nubank, entre várias outras. Possui um CEH (Certifeld Ethical Hacker),\n"
                + "| além de discutir com vários especialistas pelo mundo sobre segurança digital, \n"
                + "| ele sabe ao menos umas 3 linguagens de programação, mas em nenhuma biografia fala\n"
                + "| quais linguagens são, tornando muitas coisas sobre ele um mistério.");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("|   Digite algo para prosseguir...");
        System.out.println("");
        continu = cap.next();

        limparConsole();

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("|   Tudo começa quando um dos diretores de uma grande empresa \n"
                + "| de dados pessoais, recebeu em seu E-mail corporativo uma mensagem de seu \n"
                + "| interesse, era sobre uma compra de uma casa nova, a principio não \n"
                + "| parecia estranho, pois ele estava conversando com um proprietário há \n"
                + "| alguns dias sobre a casa a venda, logo ele clicou no link e não imaginava\n"
                + "| que seria a pior escolha que teria tomado, ele foi vitima de uma \n"
                + "| engenharia social junto com Phishing, um vírus nomeado “You’re too cool”\n"
                + "| (você é tao legal) foi instalado no computador da empresa, o nome \n"
                + "| do vírus seria um agradecimento do Cracker por cair no golpe. " + "\n"
                + "| O pior de tudo isso é que um E-mail foi enviado a todos os funcionários \n"
                + "| da empresa, os E-mails tinham algo muito peculiar, era um E-mail com uma \n"
                + "| mensagem de interesse a quem tinha sido destinado, mas como ele\n"
                + "| sabia disso? Todos os funcionários inocentemente foi clicando no\n"
                + "| link e caos começou, o vírus foi pegando informações de todos os usuários\n"
                + "| do mundo mandando E-mails com o link malicioso, em menos de 24 horas o\n"
                + "| mundo presenciou um dos maiores ataques cibernéticos da história até\n" + "| aquele momento.   "
                + "\n" + "| Todos os computadores, celulares, e outros dispositivos de informação foi\n"
                + "| infectado por um vírus do tipo Ramsonware, todos os arquivos do mundo foram\n"
                + "| criptografados, depois de 2 horas do ataque os responsáveis pelo ataque aparecem \n"
                + "| em público na TV de todo o mundo se auto intitulando como The Anonymous. Transmitem\n"
                + "| a seguinte mensagem: ");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("");
        System.out.println("|   Digite algo para prosseguir...");
        System.out.println("");
        continu = cap.next();

        limparConsole();

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| '' - Olá povo de todas as nações, como podem ter percebido, \n"
                + "| sofreram um ataque vindo de nosso grupo, nós somos o The Anonymous. Temos \n"
                + "| todas as informações guardadas conosco como, arquivos secretos do governo,\n"
                + "| planos militares contra outros países e diversos conteudos que se soubessem \n"
                + "| ficariam enojados.'' ");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("");
        System.out.println("|   Digite algo para prosseguir...");
        System.out.println("");
        continu = cap.next();

        limparConsole();

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| '' - O que queremos? É bem simples. Em 1 semana queremos o valor \n"
                + "| de 10 bilhões de dólares, ou o mundo terá todos os tipos de dados vazados,\n"
                + "| mas não se preocupem nós iremos detalhar com mais calma de como funcionará \n"
                + "| essa transação, por enquanto, fiquem calmos, se não o pânico tomará conta de \n"
                + "| vocês. Até mais, meu povo.'' \n" + "| - Desliga o membro finalizando a transmissão. ");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("");
        System.out.println("|   Digite algo para prosseguir...");
        System.out.println("");
        continu = cap.next();

        limparConsole();

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| '' Poderia ser uma solução, mas o grupo só deu uma semana, seria tempo \n"
                + "| insuficiente para fazer tudo isso, ou seja, é inviávelNão vou encontrar respostas\n"
                + "| para essa solução sozinho, talvez mais pessoas tenha conseguido quebrar a criptografia\n"
                + "| do vírus, e só há um lugar onde poderiam discutir isso anonimamente, na Deep Web''\n" + "| Pensou "
                + nome);
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("");
        System.out.println("|   Digite algo para prosseguir...");
        System.out.println("");
        continu = cap.next();

        limparConsole();

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| Você está acessando o Tor Browser...");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("");
        System.out.println("|   Digite algo para prosseguir...");
        System.out.println("");
        continu = cap.next();

        limparConsole();

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| Você está na Deep Web. ");
        System.out.println("|");
        System.out.println("| !! - >>  Você tem uma nova messagem de Melissa. Deseja abrir ela? << - !!");
        System.out.println("| 1| Sim.");
        System.out.println("| 2| Não.");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("");
        System.out.println("|   Digite algo para prosseguir...");
        System.out.println("");
        escolha = cap.nextInt();

        limparConsole();

        if (escolha == 1) {
            System.out.println("|------------------------------------------|");
            System.out.println("|-------------------------------------->");
            System.out.println("| | v Caixa de Mensagens");
            System.out.println("| | > Melissa");
            System.out.println("|");
            System.out.println("| | olha, garoto, não temos algum interesse ou ganho para parar a Anônimos,\n"
                    + "| | nem me ousaria a entrar no caminho deles, mas se quiser saber como ou quem pode detê-los\n"
                    + "| | pergunte ao The Brain. Claro, se conseguir encontrar com ele hahahahah. ");
            System.out.println("|-------------------------------------->");
            System.out.println("|------------------------------------------|");
            System.out.println("");
            System.out.println("");
            System.out.println("|   Digite algo para prosseguir...");
            System.out.println("");
            continu = cap.next();
        } else if (escolha == 2) {
            System.out.println("|------------------------------------------|");
            System.out.println("|-------------------------------------->");
            System.out.println("|");
            System.out.println("| Você está na Deep Web. Ignorou a mensagem e abriu um forúm anonimo. ");
            System.out.println("|");
            System.out.println("| Você leu a respeito de um  \n" + "| Hacker misterioso chamado de The Brain, \n"
                    + "| seria um boa ideia procurar-lo \n" + "| para conseguir acabar com o Virus da The Anonymous.");
            System.out.println("|");
            System.out.println("|-------------------------------------->");
            System.out.println("|------------------------------------------|");
            System.out.println("");
            System.out.println("|   Digite algo para prosseguir...");
            System.out.println("");
            continu = cap.next();
        }

        limparConsole();

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| >> Novo - Você tem uma nova missão! <<");
        System.out.println("| ''Encontre o The Brain - Você deve navegar nos misteriosos foruns da Deep Web \n"
                + "| Para encontrar o enigmatico usuario fantasma.''");
        System.out.println(
                "| Você deve navegar em fóruns para converter numeros e \n" + "| obter o endereço IP do The Brain.");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("");
        System.out.println("|   Digite algo para prosseguir...");
        System.out.println("");
        continu = cap.next();

        limparConsole();

        menuForum();

        limparConsole();

    }

    /*--------------------------------------------*/
    // Funções
    /*--------------------------------------------*/

    static void limparConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println("");
        }
    }

    static void menuForum() {

        int escolhaForun = 0;

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| Você está na Deep Web. ");
        System.out.println("|");
        System.out.println("| Você esta na busca de foruns. Qual Forum Deseja Acessar? ");
        System.out.println("|");
        System.out.println("| 1| New World ");
        System.out.println("| 2| ForChan ");
        System.out.println("| 3| ReChat ");
        System.out.println("| 4| ESTE FORUM ESTÁ BLOQUEADO (DICA: ###.###.0.####) ");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        escolhaForun = cap.nextInt();

        if (escolhaForun == 1) {
            limparConsole();
            forumUm();
        } else if (escolhaForun == 2) {
            limparConsole();
            forumDois();
        } else if (escolhaForun == 3) {
            limparConsole();
            forumTres();
        } else if (escolhaForun == 4) {
            limparConsole();
            forumSeis();
        }

    }

    static void menuForumDois() {

        int escolhaForun = 0;

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| Você está na Deep Web. ");
        System.out.println("|");
        System.out.println("| Você esta na busca de foruns. Qual Forum Deseja Acessar? ");
        System.out.println("|");
        System.out.println("| 1| New World ");
        System.out.println("| 2| ForChan ");
        System.out.println("| 3| ReChat ");
        System.out.println("| 4| Ricochet ");
        System.out.println("| 5| CryptoCat ");
        System.out.println("| 6| BOSS - The Brain [DERRUBADO] ");
        System.out.println("| 7| ESTE FORUM ESTA BLOQUEADO (DICA: ###)");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        escolhaForun = cap.nextInt();

        if (escolhaForun == 1) {
            limparConsole();
            forumUm();
        } else if (escolhaForun == 2) {
            limparConsole();
            forumDois();
        } else if (escolhaForun == 3) {
            limparConsole();
            forumTres();
        } else if (escolhaForun == 4) {
            limparConsole();
            forumQuatro();
        } else if (escolhaForun == 5) {
            limparConsole();
            forumCinco();
        } else if (escolhaForun == 6) {
            limparConsole();
            forumSeis();
        } else if (escolhaForun == 7) {
            limparConsole();
            forumSete();
        }

    }

    static void forumUm() {

        int voltarForum = 0;

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| [Fórum] NewWorld ");
        System.out.println("|");
        System.out.println("| v gaming · 2 dias atrás ");
        System.out.println("| | Sou um membro direto da Anonymous. Estou aqui para  ");
        System.out.println("| | outro mundo. Através de outros Nicks deixei enigmas separados");
        System.out.println("| | para resolverem, boa sorte. 110010010. (Calcular para hexadecimal) ");
        System.out.println("| | É uma boa oportunidade não acha? Explore os fóruns, resolva o ");
        System.out.println("| | enigma e ataque o Cracker para testar seu vírus. ");
        System.out.println("|               > thebigbuddy · 2 dias atrás ");
        System.out.println("|               (mensagem retratada) ");
        System.out.println("|                       v bittscell · 1 dias atrás");
        System.out.println("|                       | Interessante... parece que a própria mensagem é um enigma");
        System.out.println("|");
        System.out.println("| <end>");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");

        System.out.println("| Você deseja voltar para o menu de foruns?");
        System.out.println("| 1| Sim");
        voltarForum = cap.nextInt();

        if (voltarForum == 1) {
            if (nv == 1) {
                limparConsole();
                menuForum();
            }
            if (nv == 2) {
                limparConsole();
                menuForumDois();
            }
            if (nv == 3){
                limparConsole();
                menuForumTres();
            }
        }

    }

    static void menuForumTres() {

        int escolhaForun = 0;

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| Você está na Deep Web. ");
        System.out.println("|");
        System.out.println("| Você esta na busca de foruns. Qual Forum Deseja Acessar? ");
        System.out.println("|");
        System.out.println("| 1| New World ");
        System.out.println("| 2| ForChan ");
        System.out.println("| 3| ReChat ");
        System.out.println("| 4| Ricochet ");
        System.out.println("| 5| CryptoCat ");
        System.out.println("| 6| BOSS - The Brain [DERRUBADO] ");
        System.out.println("| 7| BOSS - LUCARIO [DERRUBADO]");
        System.out.println("| 8| ESTE FORUM ESTÁ BLOQUEADO (DICA: ####)");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        escolhaForun = cap.nextInt();

        if (escolhaForun == 1) {
            limparConsole();
            forumUm();
        } else if (escolhaForun == 2) {
            limparConsole();
            forumDois();
        } else if (escolhaForun == 3) {
            limparConsole();
            forumTres();
        } else if (escolhaForun == 4) {
            limparConsole();
            forumQuatro();
        } else if (escolhaForun == 5) {
            limparConsole();
            forumCinco();
        } else if (escolhaForun == 6) {
            limparConsole();
            forumSeis();
        } else if (escolhaForun == 7) {
            limparConsole();
            forumSete();
        } else if (escolhaForun == 8){
            limparConsole();
            forumOito();
        }

    }

    static void forumDois() {

        int voltarForum = 0;

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| [Forum] ForChan ");
        System.out.println("|");
        System.out.println("| v ninja · 8 horas atrás ");
        System.out.println("| | Ei, em algum fórum estranho teve mensagem de um tal");
        System.out.println("| | Gaming sla falando de enigma, será algum de vcs??");
        System.out.println("|           v AbstractDeath · 3 horas atrás ");
        System.out.println("|           | Deve ter sido algum engraçadinho, estão lotados desses ");
        System.out.println("|           | caras ultimamente. ");
        System.out.println("| v nojokes23 · 2 horas atrás ");
        System.out.println("|               | Cara... também vi algumas pessoas comentando sobre esse ");
        System.out.println("|               | esse tal enigma. O que será que o Anonymous está planejando");
        System.out.println("|               | agora?");
        System.out.println("|               v frendly1492 · 20 minutos atrás ");
        System.out.println("|                   | Alguém pode entrar em contato comigo? estava navegando ");
        System.out.println("|                   | pelo fórum Cryptocat e acabei achando o tal enigma eu e");
        System.out.println("|                   | e mais um grupo de hackers estamos tentando decodificar.");
        System.out.println("|                   | Me procure no Fórum 'Cryptocat', e digite esse link no ");
        System.out.println("|                   | chat 'private.(SeuCódigo).sakl', para conversarmos no privado.");
        System.out.println("|                   | além disso, descobri algum número estranho tbm. 250, mas não sei o");
        System.out.println("|                   | que significa. (Converter em Octal).");
        System.out.println("|");
        System.out.println("| <end>");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");

        System.out.println("| Você deseja voltar para o menu de foruns?");
        System.out.println("| 1| Sim");
        voltarForum = cap.nextInt();

        if (voltarForum == 1) {
            if (nv == 1) {
                limparConsole();
                menuForum();
            }
            if (nv == 2) {
                limparConsole();
                menuForumDois();
            }
            if (nv == 3){
                limparConsole();
                menuForumTres();
            }
        }
    }

    static void forumTres() {

        int voltarForum = 0;

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| [Forum] ReChat ");
        System.out.println("|");
        System.out.println("| > pilulared63219· 58 minutos atrás ");
        System.out.println("|       > cristianism · 1 hora atrás  ");
        System.out.println("|           v terminator · 56 minutos atrás");
        System.out.println("|           | Todos acharam que eu não ia voltar HAHAHA... pois ");
        System.out.println("|           | bem... eu voltei, estou ficando velho, mas não obsoleto");
        System.out.println("|           | quem quiser uma ajudinha para apagar alguém podemos. ");
        System.out.println("|           | quem quiser uma ajudinha para apagar alguém podemos. ");
        System.out.println("|               v thejudge · 1 dia atrás");
        System.out.println("|               | O reconhecimento da Anonymous é essencial para ");
        System.out.println("|               | o progresso da humanidade estamos à procura dos melhores ");
        System.out.println("|               |  hackers.  ");
        System.out.println("|           v Silkboy · 23 minutos atrás ");
        System.out.println("|           | Cala boca seu retardado. ");
        System.out.println("| v gaming · agora ");
        System.out.println("| | 1 1000 0100 (converta em hexadecimal)");
        System.out.println("|");
        System.out.println("| <end>");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");

        System.out.println("| Você deseja voltar para o menu de foruns?");
        System.out.println("| 1| Sim");
        voltarForum = cap.nextInt();

        if (voltarForum == 1) {
            if (nv == 1) {
                limparConsole();
                menuForum();
            }
            if (nv == 2) {
                limparConsole();
                menuForumDois();
            }
            if (nv == 3){
                limparConsole();
                menuForumTres();
            }
        }

    }

    static void forumQuatro() {

        int voltarForum = 0;

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| [Fórum] Ricochet");
        System.out.println("|");
        System.out.println("| > man000001· 2 anos atrás");
        System.out.println("|       v vostok412 · 2 anos atrás  ");
        System.out.println("| | O que eu acho que significa é que eles não julgarão ");
        System.out.println("| | a humanidade até que estejamos prontos para nos tornarmos ");
        System.out.println("| | pós-físicos. ");
        System.out.println("|           > guynobook002 · 1 anos atrás ");
        System.out.println("|               v constante23 · 1 anos atrás");
        System.out.println("|               | Já faz um tempo, mas lembro que em um dos livros ");
        System.out.println("|               | seu ser para corpos mecânicos e, finalmente, para a realidade  ");
        System.out.println("|               | do próprio espaço. Eu acredito que eles pretendem assistir e não ");
        System.out.println("|               | interferem mais na humanidade. E quando chegar a hora de  ");
        System.out.println("|               | evoluirmos para o nível deles, eles julgarão se somos dignos da");
        System.out.println("|               | verdadeira realidade ");
        System.out.println("|                   > no193more002 · 2 semanas atrás ");
        System.out.println("|                       v unknown · 7 horas atrás ");
        System.out.println("|                       | Do que eles estão falando? da Anonymous, nossa...");
        System.out.println("|                       | essas mensagens já fazem anos, será que eles já ");
        System.out.println("|                       | planejavam esse ataque a muito tempo... ");
        System.out.println("|");
        System.out.println("| <end>");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");

        System.out.println("| Você deseja voltar para o menu de foruns?");
        System.out.println("| 1| Sim");
        System.out.println("| 2| Pensar");
        voltarForum = cap.nextInt();

        if (voltarForum == 1) {
            if (nv == 1) {
                limparConsole();
                menuForum();
            }
            if (nv == 2) {
                limparConsole();
                menuForumDois();
            }
            if (nv == 3){
                limparConsole();
                menuForumTres();
            }
        } else if (voltarForum == 2) {
            System.out.println("| ");
            System.out.println("| | Esse 623 parece estranho, talvez se eu converter em hexadecimal, ");
            System.out.println("| | Talvez possa ser a chave de IP do Hacker Lucario");
            System.out.println("| ");
            System.out.println("| Você deseja voltar para o menu de foruns?");
            System.out.println("| 1| Sim");
            voltarForum = cap.nextInt();

            if (nv == 1) {
                limparConsole();
                menuForum();
            }
            if (nv == 2) {
                limparConsole();
                menuForumDois();
            }
            if (nv == 3){
                limparConsole();
                menuForumTres();
            }
        }

    }

    static void forumCinco() {

        int voltarForum = 0;

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| [Fórum] Cryptocat ");
        System.out.println("|");
        System.out.println("| v thedevil3921 · 1 hora atrás ");
        System.out.println("| | Alguem mesmo acredita nesse tal enigma?  ");
        System.out.println("|       > Humandefault48 · 52 minutos atrás");
        System.out.println("|           > HorseMonkey · 49 minutos atrás");
        System.out.println("|               v therenks · 52 minutos atrás");
        System.out.println("|               | Se alguem quiser alguma ajuda estou aqui para ajudar  ");
        System.out.println("|               | a procurar esse tal enigma.");
        System.out.println("| v sakl · 4 hora atrás ");
        System.out.println("| | Eu conheço o enigma me contate.");
        System.out.println("|       v frendly1492 · 3 horas atrás ");
        System.out.println("|       | Valeu a pena. vlw mano.");
        System.out.println("|           v benks");
        System.out.println("|           | Quem quiser coisas pela metade do preço aqui");
        System.out.println("|           | meu site: 101010011011w.apple.");
        System.out.println("|");
        System.out.println("| <end>");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");

        System.out.println("| Você deseja voltar para o menu de foruns?");
        System.out.println("| 1| Sim");
        System.out.println("| 2| Pensar");
        voltarForum = cap.nextInt();


        if (voltarForum == 1) {
            if (nv == 1) {
                limparConsole();
                menuForum();
            }
            if (nv == 2) {
                limparConsole();
                menuForumDois();
            }
            if (nv == 3){
                limparConsole();
                menuForumTres();
            }
        }
        if (voltarForum == 2) {
            System.out.println("| ");
            System.out.println("| | Talvez eu tenha que convertar algum numero desse forum ");
            System.out.println("| | para decimal.");
            System.out.println("| ");
            System.out.println("| Você deseja voltar para o menu de foruns?");
            System.out.println("| 1| Sim");
            voltarForum = cap.nextInt();

            if (nv == 1) {
                limparConsole();
                menuForum();
            }
            if (nv == 2) {
                limparConsole();
                menuForumDois();
            }
            if (nv == 3){
                limparConsole();
                menuForumTres();
            }
            
        }

    }

    static void forumSeis() {

        int voltarForum = 0;

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| [Fórum] RESTRITO (SENHA) ");
        System.out.println("|");
        System.out.println("|");
        System.out.println("| <end>");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");

        System.out.println("| Você deseja voltar para o menu de foruns?");
        System.out.println("|");
        System.out.println("| 1| Sim");
        System.out.println("| Você obtem a senha de acesso?");
        System.out.println("| 2| Sim");
        voltarForum = cap.nextInt();

        if (voltarForum == 1) {
            if (nv == 1) {
                limparConsole();
                menuForum();
            }
            if (nv == 2) {
                limparConsole();
                menuForumDois();
            }
            if (nv == 3){
                limparConsole();
                menuForumTres();
            }
        }

        else if (voltarForum == 2) {
            limparConsole();
            System.out.println("|------------------------------------------|");
            System.out.println("|-------------------------------------->");
            System.out.println("|");
            System.out.println("| [Fórum] RESTRITO (SENHA) ");
            System.out.println("| | Digite a senha para entrar:");
            System.out.println("| | ###.###.0.####");
            System.out.println("| <end>");
            System.out.println("|");
            System.out.println("|-------------------------------------->");
            System.out.println("|------------------------------------------|");
            senhaUm = cap.nextInt();
        } else {
            limparConsole();
            acessoNegado();
            limparConsole();
        }

        if (senhaUm == 192) {
            limparConsole();
            System.out.println("|------------------------------------------|");
            System.out.println("|-------------------------------------->");
            System.out.println("|");
            System.out.println("| [Fórum] RESTRITO (SENHA) ");
            System.out.println("| | Digite a senha para entrar:");
            System.out.println("| | 192.###.0.###");
            System.out.println("| <end>");
            System.out.println("|");
            System.out.println("|-------------------------------------->");
            System.out.println("|------------------------------------------|");
            senhaDois = cap.nextInt();
        } else {
            limparConsole();
            acessoNegado();
            limparConsole();
        }

        if (senhaDois == 168) {
            limparConsole();
            System.out.println("|------------------------------------------|");
            System.out.println("|-------------------------------------->");
            System.out.println("|");
            System.out.println("| [Fórum] RESTRITO (SENHA) ");
            System.out.println("| | Digite a senha para entrar:");
            System.out.println("| | 192.168.0.###");
            System.out.println("| <end>");
            System.out.println("|");
            System.out.println("|-------------------------------------->");
            System.out.println("|------------------------------------------|");
            senhaDois = cap.nextInt();
        } else {
            limparConsole();
            acessoNegado();
            limparConsole();
        }

        if (senhaDois == 184) {
            limparConsole();
            System.out.println("|------------------------------------------|");
            System.out.println("|-------------------------------------->");
            System.out.println("|");
            System.out.println("| [Fórum] RESTRITO (SENHA) ");
            System.out.println("| | Você conseguiu a entrar no forum. Parabéns.");
            System.out.println("| | 192.168.0.184");
            System.out.println("| <end>");
            System.out.println("|");
            System.out.println("|-------------------------------------->");
            System.out.println("|------------------------------------------|");
            System.out.println("");
            System.out.println("|   Digite algo para prosseguir...");
            System.out.println("");
            continu = cap.next();

            forumSecreto();
        } else {
            limparConsole();
            acessoNegado();
            limparConsole();
        }

    }

    static void forumSecreto() {
        limparConsole();

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| ????????");
        System.out.println("|");
        System.out.println("| v gaming · Agora ");
        System.out.println("| | parabéns garoto, você conseguiu resolver meu enigma.");
        System.out.println(
                "| | bom, pra chegar até aqui vc deve ter muito talento, e nós da Anonimos não podemos deixar ");
        System.out.println("| | que alguém com tanto potencial seja desperdiçado. Proponho que entre em nosso time, o");
        System.out.println("| | que acha? ");
        System.out.println("|");
        System.out.println("| <end>");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");

        System.out.println("| Você aceita?");
        System.out.println("| 1| Sim");
        System.out.println("| 2| Não");
        escolha = cap.nextInt();

        if (escolha == 1) {
            limparConsole();

            System.out.println("|------------------------------------------|");
            System.out.println("|-------------------------------------->");
            System.out.println("|");
            System.out.println("| THE BRAIN");
            System.out.println("|");
            System.out.println("| v gaming · Agora ");
            System.out.println("| |... ");
            System.out.println("|   |...  ");
            System.out.println("|       | Muito bem, seja bem-vindo garoto, sua missão será...");
            System.out.println("| ");
            System.out.println("| ");
            System.out.println("| ");
            System.out.println("| ");
            System.out.println("| | GAME OVER ");
            System.out.println("| | Suas escolhas definem quem você realmente é...");
            System.out.println("| <end>");
            System.out.println("|");
            System.out.println("|-------------------------------------->");
            System.out.println("|------------------------------------------|");
            System.out.println("");
            System.out.println("|   Digite algo para prosseguir...");
            System.out.println("");
            continu = cap.next();

            System.exit(0);
        } else if (escolha == 2) {
            limparConsole();

            System.out.println("|------------------------------------------|");
            System.out.println("|-------------------------------------->");
            System.out.println("|");
            System.out.println("| THE BRAIN");
            System.out.println("|");
            System.out.println("| v gaming · Agora ");
            System.out.println("| |... ");
            System.out.println("| |...  ");
            System.out.println(
                    "| | Acho que vc não sabe com quem está lidando moleque. Que seja, eu te chamei para ser   ");
            System.out.println("| | testemunha de um novo mundo, então EU que digo, SOFRA AS CONSEQUENCIAS.");
            System.out.println("| ");
            System.out.println("| <end>");
            System.out.println("|");
            System.out.println("|-------------------------------------->");
            System.out.println("|------------------------------------------|");
            System.out.println("");
            System.out.println("|   Digite algo para prosseguir...");
            System.out.println("");
            continu = cap.next();

            limparConsole();

            System.out.println("|------------------------------------------|");
            System.out.println("|-------------------------------------->");
            System.out.println("|");
            System.out.println("| >> Novo - Você tem uma nova missão! <<");
            System.out.println("| ''Faça o circuito logico - The Brain é um cracker da Anonymous, e voce precisa''");
            System.out.println("| Hackerar seu PC executando este circuito logico.");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("			S			\n" + "			|			\n" + "			OR			\n"
                    + "	|				|	\n" + "	OR				OR	\n" + " |		 |		 |		 |\n"
                    + "AND		AND		AND		AND");

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("			S			\n" + "			|			\n"
                    + "		-------	OR ------		\n" + "		|		|		\n" + "	-------	OR		OR ------	\n"
                    + "	|				|	\n" + " ----- OR -------		 ------	OR -------\n"
                    + " |		 |		 |		 |\n" + "AND		AND		AND		AND");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|-------------------------------------->");
            System.out.println("|------------------------------------------|");
            System.out.println("");
            System.out.println("|   Digite algo para prosseguir...");
            System.out.println("");
            continu = cap.next();

            nv++;
            segundoAtoMissao();

        }
    }

    static void acessoNegado() {
        limparConsole();
        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| | SENHA INCORRETA.");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("|   Digite algo para prosseguir...");
        System.out.println("");
        continu = cap.next();

        forumSeis();
    }

    static void acessoNegadoDois() {
        limparConsole();
        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| | SENHA INCORRETA.");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("|   Digite algo para prosseguir...");
        System.out.println("");
        continu = cap.next();

        forumSete();
    }

    static void segundoAtoMissao() {

        limparConsole();

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| | Você está na Deep Web. ");
        System.out.println("|");
        System.out.println("| !! - >>  Você tem uma nova messagem de Desconhecido54. Deseja abrir ela? << - !!");
        System.out.println("| 1| Sim.");
        System.out.println("| 2| Não.");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("");
        System.out.println("|   Digite algo para prosseguir...");
        System.out.println("");
        escolha = cap.nextInt();

        if (escolha == 1) {
            System.out.println("|------------------------------------------|");
            System.out.println("|-------------------------------------->");
            System.out.println("| | v Caixa de Mensagens");
            System.out.println("| | > Desconhecido54");
            System.out.println("|");
            System.out.println("| | Ola, rapaz. Enfim, Fiquei sabendo que voce conseguiu derrubar um Hacker da\n"
                    + "| | The Anonymous, parabens. Eu conheco um destes Hackers chefes, assim como o The Brai\n"
                    + "| | Seu nome é Lucario, é tudo que eu posso falar sobre ele.");
            System.out.println("|-------------------------------------->");
            System.out.println("|------------------------------------------|");
            System.out.println("");
            System.out.println("");
            System.out.println("|   Digite algo para prosseguir...");
            System.out.println("");
            continu = cap.next();
        } else if (escolha == 2) {
            System.out.println("|------------------------------------------|");
            System.out.println("|-------------------------------------->");
            System.out.println("|");
            System.out.println("| Você está na Deep Web. Ignorou a mensagem e abriu um forúm anonimo. ");
            System.out.println("|");
            System.out.println("| Você leu a respeito de um  \n" + "| Hacker Chefes da The Anonymous \n"
                    + "| seria um boa ideia procurar-lo \n" + "| para conseguir acabar com o Virus da The Anonymous.");
            System.out.println("|");
            System.out.println("|-------------------------------------->");
            System.out.println("|------------------------------------------|");
            System.out.println("");
            System.out.println("|   Digite algo para prosseguir...");
            System.out.println("");
            continu = cap.next();
        }

        limparConsole();

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| >> Novo - Você tem uma nova missão! <<");
        System.out.println("| ''Encontre o Lucario - Você deve navegar nos misteriosos foruns da Deep Web \n"
                + "| Para encontrar este chefe chamado de Lucario''");
        System.out.println(
                "| Você deve navegar em fóruns para converter numeros e \n" + "| obter o endereço IP de Lucario");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("|   Digite algo para prosseguir...");
        System.out.println("");
        continu = cap.next();

        limparConsole();
        menuForumDois();

    }

    static void forumSete() {

        int voltarForum = 0;

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| [Fórum] RESTRITO (SENHA) ");
        System.out.println("|");
        System.out.println("|");
        System.out.println("| <end>");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");

        System.out.println("| Você deseja voltar para o menu de foruns?");
        System.out.println("|");
        System.out.println("| 1| Sim");
        System.out.println("| Você obtem a senha de acesso?");
        System.out.println("| 2| Sim");
        voltarForum = cap.nextInt();

        if (voltarForum == 1) {
            if (nv == 1) {
                limparConsole();
                menuForum();
            }
            if (nv == 2) {
                limparConsole();
                menuForumDois();
            }
            if (nv == 3){
                limparConsole();
                menuForumTres();
            }
        }
        else if (voltarForum == 2) {
            limparConsole();
            System.out.println("|------------------------------------------|");
            System.out.println("|-------------------------------------->");
            System.out.println("|");
            System.out.println("| [Fórum] RESTRITO (SENHA) ");
            System.out.println("| | Digite a senha para entrar:");
            System.out.println("| | ###");
            System.out.println("| <end>");
            System.out.println("|");
            System.out.println("|-------------------------------------->");
            System.out.println("|------------------------------------------|");
            senhaUmForumDois = cap.nextInt();
        } else {
            limparConsole();
            acessoNegado();
            limparConsole();
        }
        
        if (senhaUmForumDois == 193){
            limparConsole();
            System.out.println("|------------------------------------------|");
            System.out.println("|-------------------------------------->");
            System.out.println("|");
            System.out.println("| [Fórum] RESTRITO (SENHA) ");
            System.out.println("| | Digite a senha para entrar:");
            System.out.println("| | 193");
            System.out.println("| <end>");
            System.out.println("|");
            System.out.println("|-------------------------------------->");
            System.out.println("|------------------------------------------|");
            System.out.println("");
            System.out.println("|   Digite algo para prosseguir...");
            System.out.println("");
            continu = cap.next();

            limparConsole();

            forumLucario();
        }
        else {
            limparConsole();
            acessoNegadoDois();
        }
        

        }
    
    static void forumLucario(){
        limparConsole();

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| USUARIO - LUCARIO");
        System.out.println("|");
        System.out.println("| v lucario · Agora  ");
        System.out.println("| | hum, quem é vc?? E como me descobriu.");
        System.out.println("| | ahh, então foi vc que atacou meu companheiro? Estava te caçando mesmo, ninguém escapa  ");
        System.out.println("| | da Anonymous, agora preparasse para sofrer nosso julgamento");
        System.out.println("| | que acha? ");
        System.out.println("|");
        System.out.println("| <end>");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("|   Digite algo para prosseguir...");
        System.out.println("");
        continu = cap.next();

        limparConsole();

        //Desafio

        nv = 3;

        menuForumTres();
    }

    static void forumOito() {
        int voltarForum = 0;

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| [Fórum] RESTRITO (SENHA) ");
        System.out.println("|");
        System.out.println("|");
        System.out.println("| <end>");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");

        System.out.println("| Você deseja voltar para o menu de foruns?");
        System.out.println("|");
        System.out.println("| 1| Sim");
        System.out.println("| Você obtem a senha de acesso?");
        System.out.println("| 2| Sim");
        voltarForum = cap.nextInt();

        if (voltarForum == 1) {
            if (nv == 1) {
                limparConsole();
                menuForum();
            }
            if (nv == 2) {
                limparConsole();
                menuForumDois();
            }
            if (nv == 3){
                limparConsole();
                menuForumTres();
            }
        }
        else if (voltarForum == 2) {
            limparConsole();
            System.out.println("|------------------------------------------|");
            System.out.println("|-------------------------------------->");
            System.out.println("|");
            System.out.println("| [Fórum] RESTRITO (SENHA) ");
            System.out.println("| | Digite a senha para entrar:");
            System.out.println("| | ####");
            System.out.println("| <end>");
            System.out.println("|");
            System.out.println("|-------------------------------------->");
            System.out.println("|------------------------------------------|");
            senhaUmForumDois = cap.nextInt();
        } else {
            limparConsole();
            acessoNegado();
            limparConsole();
        }
        
        if (senhaUmForumDois == 2715){
            limparConsole();
            System.out.println("|------------------------------------------|");
            System.out.println("|-------------------------------------->");
            System.out.println("|");
            System.out.println("| [Fórum] RESTRITO (SENHA) ");
            System.out.println("| | Digite a senha para entrar:");
            System.out.println("| | 2715");
            System.out.println("| <end>");
            System.out.println("|");
            System.out.println("|-------------------------------------->");
            System.out.println("|------------------------------------------|");
            System.out.println("");
            System.out.println("|   Digite algo para prosseguir...");
            System.out.println("");
            continu = cap.next();

            limparConsole();

            forumAnonymous();
        }
    }

    static void forumAnonymous(){
        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| SEDE ANONYMOUS");
        System.out.println("|");
        System.out.println("| v melissa · Agora  ");
        System.out.println("| | então, vc me encontrou... fiquei surpreso ao saber que acabou com meus companheiros. ");
        System.out.println("| | Só queríamos o dinheiro, mas parece que tens um senso de justiça muito idiota, saiba");
        System.out.println("| | que mesmo vc me derrotando, o que é impossível claro, eu não iria desistir tão fácil");
        System.out.println("| | então preparasse para sofrer AS CONSEQUÊNCIAS. ");
        System.out.println("| |...");
        System.out.println("| |...");
        System.out.println("| |...");
        System.out.println("| |...");
        System.out.println("| | Agora começa a batalha final, será tudo ou nada. Preparado? ");
        System.out.println("| | Então vamos lá. ");
        System.out.println("|");
        System.out.println("| <end>");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("|   Digite algo para prosseguir...");
        System.out.println("");
        continu = cap.next();

        //Desafio 1
        //Desafio 2 
        //Desafio 3

        fimDeJogo();
    
    }

    static void fimDeJogo(){
        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| v ? · Agora  ");
        System.out.println("| | Parabéns menino, você conseguiu, eu sabia que tinha talento, mas ");
        System.out.println("| | não tanto para conseguir derrotar um grupo tão inteligente, superou totalmente ");
        System.out.println("| | minhas expectativas. Agora vou deletar seu vírus e o seu usuário, pela sua");
        System.out.println("| | própria segurança, lembre-se você nunca acessou a deep web, você nunca  ");
        System.out.println("| | atacou Anonymous e nem tem ideia de como isso acabou, mas foi bom");
        System.out.println("| | aconselhá-lo e te acompanhar por tudo isso, então Adeus, mas saiba que esse ");
        System.out.println("| | não é nosso último encontro.");
        System.out.println("| ");
        System.out.println("| | FIM DE JOGO");
        System.out.println("|");
        System.out.println("| <end>");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
    }
}
