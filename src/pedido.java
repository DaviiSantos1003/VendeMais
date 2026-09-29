public class pedido {


    private int numero;
    private String cliente;
    private double valorProdutos;
    private entrega entrega;



    public pedido(int numero, String cliente, double valorProdutos, entrega entrega) {
        this.numero = numero;
        this.cliente = cliente;
        this.valorProdutos = valorProdutos;
        this.entrega = entrega;
    }

    public double calcularTotal() {
        return valorProdutos + entrega.calcularFrete();
    }
    
    public int calcularPrazo() {
        return entrega.calcularPrazo();
    }





    @Override
    public String toString() {
        return "Pedido{" +
                "numero=" + numero +
                ", cliente='" + cliente + '\'' +
                ", valorProdutos=" + valorProdutos +
                ", frete=" + entrega.calcularFrete() +
                ", prazo=" + calcularPrazo() +
                ", total=" + calcularTotal() +
                '}';
    }
}