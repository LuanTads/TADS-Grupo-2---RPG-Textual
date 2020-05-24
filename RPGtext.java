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
    public static void main(String[] args) {
        
        /*---------------------------------------*/
        
        //  Este 'for' tem a utilidade de limpar o console.
        
        //  for (int i = 0; i < 100; i++){System.out.println("");}
        
        Scanner cap = new Scanner (System.in);
        
        char enter;
        String continu;
        String nome;
        int escolha;
        int atrP;
        
        int atrAd = 0;
        int atrSpy = 0;
        int atrCT = 0;
        
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

        for (int i = 0; i < 100; i++){System.out.println("");}
        
        if (enter == 'i'){
            System.out.println("|   Muito bem.");
            System.out.println("");
            System.out.println("|   Digite algo prosseguir...");
            continu = cap.next();
        } else {
            if (enter == 's'){
                System.exit(0);
            } else {
                if (enter != 's'){
                    System.exit(0);
                }
            }
        }
        
        for (int i = 0; i < 100; i++){System.out.println("");}
        
        
        for (int i = 0; i < 100; i++){System.out.println("");}
        
        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("|   Qual sera o seu nome?   ");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        nome = cap.next();
        
        for (int i = 0; i < 100; i++){System.out.println("");}
        
        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("|   Sendo assim, seu nome sera " + nome);
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("|   Digite qualquer teclea para prosseguir...");
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
                + "| usuário ou usá-las."
                + "| Sabendo de tudo isso, " + nome + "decide se formar em Segurança digital\n"
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
        
        for (int i = 0; i < 100; i++){System.out.println("");}
        
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
                + "| do vírus seria um agradecimento do Cracker por cair no golpe. "
                + "\n"
                + "| O pior de tudo isso é que um E-mail foi enviado a todos os funcionários \n"
                + "| da empresa, os E-mails tinham algo muito peculiar, era um E-mail com uma \n"
                + "| mensagem de interesse a quem tinha sido destinado, mas como ele\n"
                + "| sabia disso? Todos os funcionários inocentemente foi clicando no\n"
                + "| link e caos começou, o vírus foi pegando informações de todos os usuários\n"
                + "| do mundo mandando E-mails com o link malicioso, em menos de 24 horas o\n"
                + "| mundo presenciou um dos maiores ataques cibernéticos da história até\n"
                + "| aquele momento.   "
                + "\n"
                + "| Todos os computadores, celulares, e outros dispositivos de informação foi\n"
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
        
        for (int i = 0; i < 100; i++){System.out.println("");}
        
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
        
        for (int i = 0; i < 100; i++){System.out.println("");}
        
        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| ' - O que queremos? É bem simples. Em 1 semana queremos o valor \n"
                + "| de 10 bilhões de dólares, ou o mundo terá todos os tipos de dados vazados,\n"
                + "| mas não se preocupem nós iremos detalhar com mais calma de como funcionará \n"
                + "| essa transação, por enquanto, fiquem calmos, se não o pânico tomará conta de \n"
                + "| vocês. Até mais, meu povo.' \n"
                + "| - Desliga o membro finalizando a transmissão. ");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("");
        System.out.println("|   Digite algo para prosseguir...");
        System.out.println("");
        continu = cap.next();
        
        for (int i = 0; i < 100; i++){System.out.println("");}
        
        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| ' Poderia ser uma solução, mas o grupo só deu uma semana, seria tempo \n"
                + "| insuficiente para fazer tudo isso, ou seja, é inviávelNão vou encontrar respostas\n"
                + "| para essa solução sozinho, talvez mais pessoas tenha conseguido quebrar a criptografia\n"
                + "| do vírus, e só há um lugar onde poderiam discutir isso anonimamente, na Deep Web'\n"
                + "| Pensou " + nome);
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("");
        System.out.println("|   Digite algo para prosseguir...");
        System.out.println("");
        continu = cap.next();
        
        for (int i = 0; i < 100; i++){System.out.println("");}
        
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
        
        for (int i = 0; i < 100; i++){System.out.println("");}
        
        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| Você está na Deep Web. ");
        System.out.println("|");
        System.out.println("| Você tem uma nova messagem de Melissa. Deseja abrir ela?");
        System.out.println("| 1| Sim.");
        System.out.println("| 2| Não.");
        System.out.println("|")
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("");
        System.out.println("|   Digite algo para prosseguir...");
        System.out.println("");
        escolha = cap.nextInt();

        for (int i = 0; i < 100; i++){System.out.println("");}
        
        if (escolha == 1){
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
        } 
        else if (escolha == 2){
            System.out.println("|------------------------------------------|");
            System.out.println("|-------------------------------------->");
            System.out.println("|");
            System.out.println("| Você está na Deep Web. Ignorou a mensagem e abriu um forúm anonimo. ");
            System.out.println("");
            System.out.println("| Você leu a respeito de um  \n"
                             + "| Hacker misterioso chamado de The Brain, \n"
                             + "| seria um boa ideia procurar-lo \n"
                             + "| para conseguir acabar com o Virus da The Anonymous.");
            System.out.println("|");
            System.out.println("|-------------------------------------->");
            System.out.println("|------------------------------------------|");
            System.out.println("");
            System.out.println("|   Digite algo para prosseguir...");
            System.out.println("");
            continu = cap.next();
        }
        
        for (int i = 0; i < 100; i++){System.out.println("");}
        
        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("| Você está na Deep Web. ");
        System.out.println("|");
        System.out.println("| ");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("");
        System.out.println("|   Digite algo para prosseguir...");
        System.out.println("");
        continu = cap.next();
        
        for (int i = 0; i < 100; i++){System.out.println("");}
        
        System.out.println("|------------------------------------------|");
        System.out.println("|-------------------------------------->");
        System.out.println("|");
        System.out.println("|   Escolha atributos para seu Malware.");
        System.out.println("|");
        System.out.println("|-------------------------------------->");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        System.out.println("|------------------------------------------|");
        System.out.println("|   ATRIBUTOS   ");
        System.out.println("|                                           ");
        System.out.println("|   1|   +5 AdWare");
        System.out.println("|   2|   +5 SpyWare");
        System.out.println("|   3|   +5 Cavalo de Troia");
        System.out.println("|------------------------------------------|");
        System.out.println("");
        
        atrP = cap.nextInt();
        
        if (atrP == 1){
            System.out.println("|   Você escolheu o virus do tipo AdWare e recebeu 5 pontos");
            for (int i = 0; i < 100; i++){System.out.println("");}
            atrAd = 5;
        }  
        else if (atrP == 2){
            System.out.println("|   Você escolheu o virus do tipo SpyWare e recebeu 5 pontos");
            for (int i = 0; i < 100; i++){System.out.println("");}
            atrAd = 5;
        }
        else if (atrP == 3){
            System.out.println("|   Você escolheu o virus do tipo Cavalo de Troia e recebeu 5 pontos");
            for (int i = 0; i < 100; i++){System.out.println("");}
        }   atrCT = 5;
        
        System.out.println("");
        System.out.println("|   Digite qualquer teclea para prosseguir...");
        continu = cap.next();
        System.out.println("");
        
        for (int i = 0; i < 100; i++){System.out.println("");}
        
        

    }    
}
