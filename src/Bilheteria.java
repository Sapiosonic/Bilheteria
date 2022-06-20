public class Bilheteria {
    private double valor;
    private int qtde;

    public double getValor() {
        return valor;
    }

    public int getQtde() {
        return qtde;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double calcular() {
        return qtde * valor;
    }

    public void show() {
        System.out.printf(
                "Valor unitario: %.2f\n" +
                        "Qtde: %d\n" +
                        "Total: %.2f",
                getValor(), getQtde(), calcular());
    }

}