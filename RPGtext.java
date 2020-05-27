/*--------------------------------------------*/
//
//  @TADS_Turma C
//
//      RPG Textual desenvolvido por Julio Cesar
//  Renan Araujo, Thiago Gilabel e Luan Oliveira.
//

package rpgtext;

import java.util.Scanner;

/*--------------------------------------------*/

public class RPGtext {
    // Scanner
    static Scanner cap = new Scanner(System.in);

    public static void main(String[] args) {

        /*---------------------------------------*/

        char enter;
        String continu;
        String nome;
        int escolha;

        /*---------------------------------------*/

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

        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("|   Os dados, ou informações pessoais, como preferir,\n"
                + "| são um bem mais precioso que o ser humano tem em sua vida, pois  \n"
                + "| através dele que se esconde quem realmente é. Ao longo do tempo as pessoas \n"
                + "| faziam o máximo para que seus dados, ou melhor, sua vida pessoal\n"
                + "| estivesse o mais escondido possível, as pessoas foram\n"
                + "| mudando a forma de se “esconder”, mas tudo fica \n "
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
                + "| usuário ou usá-las." + "| Sabendo de tudo isso, " + nome
                + "decide se formar em Segurança digital\n"
                + "| e se torna um Ethical Hacker, ou seja, um Hacker Ético com o "
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
        System.out.println("|   ATO I - O VIRUS ");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");

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
        System.out.println("| ' - Olá povo de todas as nações, como podem ter percebido, \n"
                + "| sofreram um ataque vindo de nosso grupo, nós somos o The Anonymous. Temos \n"
                + "| todas as informações guardadas conosco como, arquivos secretos do governo\n"
                + "| ,planos militares contra outros países e diversos conteudos que se soubessem \n"
                + "| ficariam enojados.' ");
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
        System.out.println("| ' - O que queremos? É bem simples. Em 1 semana queremos o valor \n"
                + "| de 10 bilhões de dólares, ou o mundo terá todos os tipos de dados vazados,\n"
                + "| mas não se preocupem nós iremos detalhar com mais calma de como funcionará \n"
                + "| essa transação, por enquanto, fiquem calmos, se não o pânico tomará conta de \n"
                + "| vocês. Até mais, meu povo.' \n" + "| - Desliga o membro finalizando a transmissão. ");
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
        System.out.println("| ' Poderia ser uma solução, mas o grupo só deu uma semana, seria tempo \n"
                + "| insuficiente para fazer tudo isso, ou seja, é inviávelNão vou encontrar respostas\n"
                + "| para essa solução sozinho, talvez mais pessoas tenha conseguido quebrar a criptografia\n"
                + "| do vírus, e só há um lugar onde poderiam discutir isso anonimamente, na Deep Web'\n" + "| Pensou "
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
        System.out.println("| Você tem uma nova messagem de Melissa. Deseja abrir ela?");
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
            System.out.println("|");
            System.out.println("| ' - Olha, garoto, não temos algum interesse ou ganho para parar a Anônimos,\n"
                    + "| nem me ousaria a entrar no caminho deles, mas se quiser saber como ou quem pode detê-los\n"
                    + "|, pergunte ao The Brain. Claro, se conseguir encontrar com ele hahahahah.' ");
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
            System.out.println("");
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
        System.out.println("| Você está na Deep Web. ");
        System.out.println("|");
        System.out.println("| Novo - Você tem uma nova missão! ");
        System.out.println("| 'Encontre o The Brain - Você deve navegar nos misteriosos foruns da Deep Web \n"
                + "| Para encontrar o enigmatico usuario fantasma' \n");
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

    // Funções

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
        System.out.println("| 4| Ricochet ");
        System.out.println("| 5| Cryptocat ");
        System.out.println("| 6| ESTE FORUN ESTÁ BLOQUEADO (DICA: ###.###.0.####) ");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        escolhaForun = cap.nextInt();

        if (escolhaForun == 1) {
            forumUm();
        } else if (escolhaForun == 2) {
            forumDois();
        } else if (escolhaForun == 3) {
            forumTres();
        } else if (escolhaForun == 4) {
            forumQuatro();
        } else if (escolhaForun == 5) {
            forumCinco();
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
            menuForum();
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
            menuForum();
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
            menuForum();
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
        voltarForum = cap.nextInt();

        if (voltarForum == 1) {
            menuForum();
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
        System.out.println("|           | meu site: 27410274921032w.apple.");
        System.out.println("|");
        System.out.println("| <end>");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");

        System.out.println("| Você deseja voltar para o menu de foruns?");
        System.out.println("| 1| Sim");
        voltarForum = cap.nextInt();

        if (voltarForum == 1) {
            menuForum();
        }

    }
}
