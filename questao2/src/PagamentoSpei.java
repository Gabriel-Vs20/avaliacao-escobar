public class PagamentoSpei implements Pagamento{

	@Override
	public String processar(double valorAssinatura){
		return "pagamento SPEI México no valor de " +  valorAssinatura;
	}

}
