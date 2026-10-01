public class Main{

	public static void main(String[] args){
		Assinatura assinaturaBrasil = new Assinatura(new FabricaAssinaturaBrasil());
		assinaturaBrasil.ativar("assinatura brasil", 499.90);
		Assinatura assinaturaMexico = new Assinatura(new FabricaAssinaturaMexico());
		assinaturaMexico.ativar("assinatura mexico", 1899.00);
	}
}
