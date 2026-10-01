public class NfseBrasil implements ComprovanteFiscal{

	@Override
	public String emitir(double valorAssinatura){
		double iss = valorAssinatura * 0.05;
		return "comprovante fiscal NFS-e Brasil com iss de 5%, imposto de " + iss + " sobre " + valorAssinatura;
	}
}
