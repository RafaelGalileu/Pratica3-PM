public class IngressoComum extends Ingresso {

    public IngressoComum(int codigo, String nomeEvento, String setor, Double valorBase) {
        super(codigo, nomeEvento, setor, valorBase);
        
    }

    @Override 
    public double calcularValorFinal() {

        return getValorBase();
    }

    @Override 
    public String obterBeneficios() {

        return "Sem benefícios adicionais";
    }

    @Override
    public String toString() {
        return  super.toString() + ", IngressoComum []";
    }
}
