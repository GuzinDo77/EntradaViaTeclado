import java.util.Scanner;
public class Entrada{
    public static void main(String[] args){

        String nome;
        int idade;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Seu nome é "+nome);
        System.out.println("E sua idade é "+idade);
        entrada.close();
    } 
}