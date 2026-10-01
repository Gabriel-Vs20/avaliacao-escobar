public abstract class ContratacaoFrete{

    protected abstract Frete criarFrete();

    public void contratar(String nomeCliente, double valorCarga){
		Frete frete = criarFrete();
		double valor = frete.calcularValor(valorCarga);
		resumo(frete, nomeCliente, valor);
	}
	private void resumo(Frete frete, String nomeCliente, double valor){
        System.out.println("modalidade: " + frete.getModalidade());
		System.out.println("cliente: " + nomeCliente);
		System.out.println("valor do frete: " + valor);
		System.out.println("documentos exigidos: " + frete.getDocumentosExigidos());
	}
    
}
