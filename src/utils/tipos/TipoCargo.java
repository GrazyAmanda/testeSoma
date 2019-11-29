package utils.tipos;

public enum TipoCargo {
	ANALISTA("Analista de Sistema"), AUXILIARADM("Auxiliar Administrativo") ,FINANCEIRO("Financeiro");
	   
	private final String descricao;

	TipoCargo (String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return descricao;
    }

}
