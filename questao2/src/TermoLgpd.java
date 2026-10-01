public class TermoLgpd implements TermoPrivacidade{

	@Override
	public String aceitar(String nomeCliente){
		return "termo de privacidade: conforme a LGPD Brasil, aceito por " + nomeCliente;
	}
}
