public abstract class Frete {

    protected double valorCarga;

    public abstract String getModalidade();

    public abstract double calcularValor(double valorCarga);
    
    public abstract String getDocumentosExigidos();
        
}
