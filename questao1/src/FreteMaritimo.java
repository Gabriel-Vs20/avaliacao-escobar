public class FreteMaritimo  extends Frete {

private double percentual = 0.01;

@Override
    public String getModalidade() {
        return "Maritimo";
    }
 @Override
    public double calcularValor(double valorCarga) {
        return valorCarga * percentual;
    }

@Override
    public String getDocumentosExigidos() {
        return "BL e fatura comercial";
    }
}


