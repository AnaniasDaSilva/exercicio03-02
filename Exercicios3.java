import java.util.Scanner;

class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        Double quintaParte, valor;

        System.out.print("digite um valor:");
        valor= scanner .nextDouble();

       quintaParte = valor *1/5; 
       System.out.print("A quintaParte do valor é:" + quintaParte);
    }
}