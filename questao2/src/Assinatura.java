public class Assinatura{

	private final ComprovanteFiscal comprovanteFiscal;
	private final Pagamento pagamento;
	private final TermoPrivacidade termoPrivacidade;

	public Assinatura(FabricaAssinatura fabrica){
		this.comprovanteFiscal = fabrica.criarComprovanteFiscal();
		this.pagamento = fabrica.criarPagamento();
		this.termoPrivacidade = fabrica.criarTermoPrivacidade();
	}

	public void ativar(String nomeCliente, double valorAssinatura){
		
		String descricaoComprovante = comprovanteFiscal.emitir(valorAssinatura);
		String descricaoPagamento = pagamento.processar(valorAssinatura);
		String descricaoTermo = termoPrivacidade.aceitar(nomeCliente);
		System.out.println("Resumo");
		System.out.println("cliente: " + nomeCliente);
		System.out.println(descricaoComprovante);
		System.out.println(descricaoPagamento);
		System.out.println(descricaoTermo);
		System.out.println("############################");
	}
}
