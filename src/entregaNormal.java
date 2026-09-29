public class entregaNormal extends entrega {

    @Override
    public double calcularFrete() {
        return 20;
    }

    @Override
    public int calcularPrazo() {
        return 7;
    }
}