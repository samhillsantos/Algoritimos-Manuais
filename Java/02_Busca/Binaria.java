import java.util.Scanner;
import java.util.Arrays;

public class Binaria{
	public static int vetor[] = new int[11];

    public static void main(String[] args){

    }
	
    public static void gerarVetor(){
		System.out.print("[");
		for(int i = 1; i < vetor.length; i++){
			vetor[i] = i;
			System.out.print(vetor[i] + (i < vetor.length - 1 ? ", " : ""));
		}
		System.out.print("]");
	}

	public static int buscaBinaria(){

		return -1;
	}
}
