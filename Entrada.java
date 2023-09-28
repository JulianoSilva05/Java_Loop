import java.util.Scanner; //importa a class que é responsavel por pegar dados dos dispositivos de entrada

public class Entrada {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in); //no metodo construtor, coloco o System.in que é responsavel por pegar dados do teclado

        int n1 = 0,n2 = 0, res = 0;

        System.out.println("Digite o primeiro numero");
        n1 = leitor.nextInt();
        System.out.println("Digite o segundo numero");
        n2 = leitor.nextInt();
        res = n1 + n2;


        System.out.printf("A soma de %d com %d é %d",n1,n2,res);
    }
    
}
