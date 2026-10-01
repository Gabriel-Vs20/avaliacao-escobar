public class Main{
    public static void main(String[] args){
        
	ContratacaoFrete rodoviario = new ContratacaoFreteRodoviario();
	ContratacaoFrete aereo = new ContratacaoFreteAereo();
	ContratacaoFrete maritimo = new ContratacaoFreteMaritimo();
	rodoviario.contratar("rodoviario", 50000);
	aereo.contratar("aereo", 120000);
	maritimo.contratar("maritimo", 800000);
    }
}