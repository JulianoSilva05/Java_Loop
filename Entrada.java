import java.util.Scanner; //importa a class que é responsavel por pegar dados dos dispositivos de entrada

public class Entrada {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in); // no metodo construtor, coloco o System.in que é responsavel por pegar
                                                 // dados do teclado

        int n1 = 0, n2 = 0,n3 = 0, soma = 0;
        String nome = "";

        System.out.println("Digite o nome do aluno:");
        nome = leitor.nextLine();

        System.out.println("Digite a primeira nota");
        n1 = leitor.nextInt();
        System.out.println("Digite a segunda nota");
        n2 = leitor.nextInt();
        System.out.println("Digite a terceira nota");
        n3 = leitor.nextInt();   

        soma = (n1 + n2 + n3)/3;

        
        
    }

}
