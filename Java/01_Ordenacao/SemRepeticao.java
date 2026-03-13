import java.util.Scanner;

public class SemRepeticao {
    public static Scanner input = new Scanner(System.in);
    public static int[] vetor = new int[10];

    public static void main(String []args){
        inserirDados();
    }

    public static void inserirDados(){

        for(int index = 0 +1; index < vetor.length; index++){
            System.out.printf("Digite o %d° valor: ", index);
            int temp = input.nextInt();

            if(valorExiste(temp, index)){
                System.out.printf("valor invalido %d ja foi inserido na %d° posição\n", temp, index);
                index--;
            } else{
                vetor[index] = temp;
            }
        }
    }
    
    public static boolean valorExiste(int valor, int limite){
        for(int index = 0; index < limite; index++){
            if(vetor[index] == valor) return true;
        }
        return false;
    }

    public static void imprimirDados(){
        System.out.print("{");

    }
}
