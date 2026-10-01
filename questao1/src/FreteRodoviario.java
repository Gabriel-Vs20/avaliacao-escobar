public class FreteRodoviario extends Frete {

private double percentual = 0.02;

@Override
    public String getModalidade() {
        return "Rodoviário";
    }
 @Override
    public double calcularValor(double valorCarga) {
        return valorCarga * percentual;
    }

@Override
    public String getDocumentosExigidos() {
        return "CT-e e MDF-e";
    }
}
