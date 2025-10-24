import java.util.Scanner;

public class att10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade aqui: ");
        int idade = entrada.nextInt();

        int meses = idade * 12;
        int dias = idade * 365;

        System.out.println("idade: "+idade+" anos.");
        System.out.println("meses: "+meses+" meses ou "+dias+" dias");

        entrada.close();
    }
}
