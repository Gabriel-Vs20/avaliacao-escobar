public class CfdiMexico implements ComprovanteFiscal{

	@Override
	public String emitir(double valorAssinatura){
		double iva = valorAssinatura * 0.16;
		return "comprovante fiscal: cfdi México com IVA de 16%, imposto de " + iva + " sobre " + valorAssinatura;
	}
}
