public class IngressoVIP extends Ingresso{

    private boolean acessoBackstage;
    
    private int numeroLounge;
    
    public IngressoVIP(int codigo, String nomeEvento, String setor, Double valorBase, boolean acessoBackstage,
            int numeroLounge) {
        super(codigo, nomeEvento, setor, valorBase);
        this.acessoBackstage = acessoBackstage;
        this.numeroLounge = numeroLounge;
    }

    @Override 
    public double calcularValorFinal() {

        return getValorBase() + (getValorBase()* 0.8);
    }

	
    @Override 
    public String obterBeneficios() {

        if (acessoBackstage) {
            
            return "Acesso privilegiado ao evento e acesso ao backstage";
        }
        else {
            return "Acesso privilegiado ao evento";
        }
    }

    public boolean isAcessoBackstage() {
        return acessoBackstage;
    }

    public void setAcessoBackstage(boolean acessoBackstage) {
        this.acessoBackstage = acessoBackstage;
    }

    public int getNumeroLounge() {
        return numeroLounge;
    }

    public void setNumeroLounge(int numeroLounge) {
        this.numeroLounge = numeroLounge;
    }

    @Override
    public String toString() {
        return super.toString() + ", IngressoVIP [acessoBackstage=" + acessoBackstage + ", numeroLounge=" + numeroLounge + "]";
    }

    
}
