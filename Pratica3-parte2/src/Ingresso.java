public abstract class Ingresso {
    
    private int codigo;
    private String nomeEvento;
    private String setor;
    private Double valorBase;

    public Ingresso(int codigo, String nomeEvento, String setor, Double valorBase) {
		this.codigo = codigo;
		this.nomeEvento = nomeEvento;
		this.setor = setor;
		this.valorBase = valorBase;
	}

   
    public void exibir () {

		System.out.println(this.toString());
    }

    public abstract double calcularValorFinal();

	

    public abstract String obterBeneficios();


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Double getValorBase() {
		return valorBase;
	}

	public void setValorBase(Double valorBase) {
		this.valorBase = valorBase;
	}


	@Override
	public String toString() {
		return "Ingresso [codigo=" + codigo + ", nomeEvento=" + nomeEvento + ", setor=" + setor + ", valorBase="
				+ valorBase + "]";
	}
}
