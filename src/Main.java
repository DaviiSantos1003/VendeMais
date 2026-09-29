void main() {

    entregaNormal entrega = new entregaNormal();

    pedido pedido = new pedido(1, "Davi", 2000, entrega);

    IO.println(pedido);
}