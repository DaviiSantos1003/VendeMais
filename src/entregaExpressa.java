public class entregaExpressa extends entrega {

    @Override
    public double calcularFrete() {
        return 40;
    }

    @Override
    public int calcularPrazo() {
        return 2;
    }
}