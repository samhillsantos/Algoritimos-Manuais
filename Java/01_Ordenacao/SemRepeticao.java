import java.util.Scanner;

public class SemRepeticao {
    public static Scanner input = new Scanner(System.in);
    public static int[] vetor = new int[11];

    public static void main(String []args){
        inserirDados();
    }

    public static void inserirDados(){

        for(int index = 1; index < vetor.length; index++){
            System.out.printf("Digite o %d° valor: ", index);
            vetor[index] = input.nextInt();
        }
    
    }

    public static void checarDados(){
       for(int index = 0; index < vetor.length; index++){

       } 
    }
}
