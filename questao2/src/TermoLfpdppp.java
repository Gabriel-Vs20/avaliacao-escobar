public class TermoLfpdppp implements TermoPrivacidade{

	@Override
	public String aceitar(String nomeCliente){
		return "termo de privacidade: conforme a LFPDPPP México, aceito por " + nomeCliente;
	}

}
