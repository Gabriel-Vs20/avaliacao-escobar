public class FabricaAssinaturaMexico implements FabricaAssinatura{

  @Override
	public ComprovanteFiscal criarComprovanteFiscal(){
		return new CfdiMexico();
	}
  @Override
	public Pagamento criarPagamento(){
		return new PagamentoSpei();
	}
  @Override
	public TermoPrivacidade criarTermoPrivacidade(){
		return new TermoLfpdppp();
	}
}
