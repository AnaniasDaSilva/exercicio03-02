import java.util.Scanner;

class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        Double quadrado, valor;

        System.out.print("digite um valor:");
        valor= scanner .nextDouble();

      quadrado = valor * valor; 
       System.out.print("A quadrado do valor é:" + quadrado);
    }
}
