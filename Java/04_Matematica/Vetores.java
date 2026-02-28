import java.util.Scanner;

public class Vetores{
    // Declarações globais
    public static Scanner input = new Scanner(System.in);
    public static int[] idades;
    public static final int TAM_MIN = 1;
    public static final int TAM_MAX = 30;

    public static void main(String[] args) {
        int qtdPessoas;
        
        // Verificação de digitação
        do {
            System.out.printf("Digite a quantidade de pessoas Limite %d até %d: ",TAM_MIN, TAM_MAX); 
            qtdPessoas = input.nextInt();
        } while (qtdPessoas < TAM_MIN || qtdPessoas > TAM_MAX); 
        
        idades = new int[qtdPessoas]; 

        // Input de idades
        for(int i = 0; i < qtdPessoas; i+= 1){
            System.out.println("Digite as idades: ");
            idades[i] = input.nextInt();
        }

        // Impressão de inputs
        System.out.printf("[");
        for(int i = 0; i < qtdPessoas; i++){
            System.out.print(idades[i]);
            if(i < qtdPessoas -1){
                System.out.print(", ");
            }
        }
        System.out.printf("]");
    }

    public static int calculoMedia(){
        // Apenas para o java nao dar erro em teste
        return -1;
    }
}
