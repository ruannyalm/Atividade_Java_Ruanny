public class att9 {
    public static void main(String[] args) {
        double nota1 = 6.5;
        double nota2 = 8.5;
        double nota3 = 9.5;
        double media = (nota1+nota2+nota3)/3;

        System.out.println("A media final é: "+media);
        if(media > 7){
            System.out.println("Você foi Aprovado!");
        }
        else{
            System.out.println("Você foi Reprovado");
        }

    }
}
