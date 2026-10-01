public class FabricaAssinaturaBrasil implements FabricaAssinatura{

	@Override
	public ComprovanteFiscal criarComprovanteFiscal(){
		return new NfseBrasil();
	}
	@Override
	public Pagamento criarPagamento(){
		return new PagamentoPix();
	}
	@Override
	public TermoPrivacidade criarTermoPrivacidade(){
		return new TermoLgpd();
	}
}
