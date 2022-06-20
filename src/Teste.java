import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Bilheteria bilheteria = new Bilheteria();

        double valor;
        System.out.println("Informe o valor unitario do produto: ");
        do {
            valor = scanner.nextDouble();
            if (valor > 0) {
                bilheteria.setValor(valor);
            } else {
                System.out.println("Valor invalido! Tente novamente. ");
            }
        } while (valor <= 0);

        int qtde;
        System.out.println("Informe a quantidade de produtos: ");
        do {
            qtde = scanner.nextInt();
            if (qtde > 0) {
                bilheteria.setQtde(qtde);
            } else {
                System.out.println("Quantidade invalida. Tente novamente. ");
            }
        } while (qtde <= 0);

        bilheteria.show();
        scanner.close();
    }
}
