public class PagamentoPix implements Pagamento{

	@Override
	public String processar(double valorAssinatura){
		return "pagamento: pix Brasil no valor de " + valorAssinatura;
	}
}
