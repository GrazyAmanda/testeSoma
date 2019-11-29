package utils.tipos;

public enum TipoOperacao {
	SAQUEATM("Saque AutoAtendimento"), PAGAMENTODEFOLHA("Pagamento de Folha"), VENDASTEF("Vendas TEF");
	
	private final String descricao;

	TipoOperacao (String descricao) {
        this.descricao = descricao;
    }
	
	public String getDescricao() {
		return descricao;
	}

}
