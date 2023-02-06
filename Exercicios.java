import java.util.Scanner;

class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Double soma, valor1, valor2, valor3;

        System.out.print("digite o primeiro valor:");
        valor1 = scanner .nextDouble();

        System.out.print("digite o segundo valor:");
        valor2 = scanner .nextDouble();

        System.out.print("digite o terceiro  valor:");
        valor3 = scanner.nextDouble();

        soma = valor1 + valor2 + valor3;

        System.out.print(" a soma dos três valores é :"  + soma);


    }

}
