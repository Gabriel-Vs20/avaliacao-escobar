public class FreteAereo extends Frete {

private double percentual = 0.06;

 @Override
    public String getModalidade() {
        return "Aereo";
    }
 @Override
    public double calcularValor(double valorCarga) {
        return valorCarga * percentual;
    }
 @Override
    public String getDocumentosExigidos() {
        return "AWB";
    }
}


