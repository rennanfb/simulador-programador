import modelos.Estudante;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudante operador = new Estudante();

        String respostaNome = "";
        int respostaCurso = 0;
        int respostaFullStack = 0;
        String respostaTecnologias = "";

        System.out.println("Olá, qual o seu nome?");
        respostaNome = scanner.nextLine();

        System.out.println("Prazer em conhecer você " + respostaNome + " por agora, qual o rumo você gostaria de seguir em sua carreira?");
        System.out.println("Digite 1 Para Front-End ou digite 2 pra Back-End");

        int respostaDirecionamento = scanner.nextInt();

        if (respostaDirecionamento == 1) {
            operador.setDirecionamento("Front-End");
            System.out.println("Com certeza você será otimo no Front-End, Agora só precisa escolher um curso inicial");
            System.out.println("Digite 1 para aprender React ou digite 2 para Aprender Vue");
            respostaCurso = scanner.nextInt();
            if (respostaCurso == 1) {
                operador.setCurso("React");
            } else if (respostaCurso == 2) {
                operador.setCurso("Vue");
            } else {
                System.out.println("Valor Inválido");
            }

        } else if (respostaDirecionamento == 2) {
            operador.setDirecionamento("Back-End");
            System.out.println("Com certeza você será otimo no Back-End, Agora só precisa escolher um curso inicial");
            System.out.println("Digite 1 para aprender C# ou digite 2 para Aprender Java");
            respostaCurso = scanner.nextInt();
                if (respostaCurso == 1) {
                    operador.setCurso("C#");
                } else if (respostaCurso == 2) {
                    operador.setCurso("Java");
                } else {
                    System.out.println("Valor Inválido");
                }

        } else {
            System.out.println("Valor Inválido");
        }

        System.out.println("Depois de muito tempo estudando você finalmente se tornou um grande programador " + operador.getDirecionamento() + " trazendo assim muita felicidade a sua vida e a vida de todos que usam seus programas");
        System.out.println("Agora que você é um mestre em " + operador.getCurso() + ", você está feliz o suficiente, ou gostaria de continuar se aperfeiçoando para se tornar um Dev Full Stack?");
        System.out.println("Digite 1 se estiver bem assim ou digite 2 para continuar estudando novas tecnologias");

        respostaFullStack = scanner.nextInt();

        if (respostaFullStack == 1) {
            System.out.println("Parábens pela vida de programador que você conquistou");
        } else if (respostaFullStack == 2) {
            System.out.println("Digite quais outras tecnologias você gostaria de aprender ou digite sair para finalizar");
            while (!(respostaTecnologias = scanner.next()).equals("sair")) {
                operador.getTecnologias().add(respostaTecnologias);
            }
        }

        System.out.println("Com o passar do tempo sua memoria se tornou cada vez mais cheia de conhecimento e você conseguiu aprender tudo o que sonhou");
        System.out.println("Incrivel, você iniciou como um " + operador.getDirecionamento() + " que sabia apenas " + operador.getCurso());
        System.out.println("Mas hoje você ja domina varias tecnologias como " + operador.getTecnologias() + " meus parabéns");
        System.out.println(respostaNome + " ja é um grande nome que sempre será lembrado entre os programadores");

    }
}
