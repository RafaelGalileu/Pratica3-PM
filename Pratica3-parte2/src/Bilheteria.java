import java.util.ArrayList;

public class Bilheteria {

    private ArrayList<Ingresso> ingressos;

    public Bilheteria() {

        ingressos = new ArrayList<>();
    }

    public void adicionarIngresso(Ingresso ingresso) {

        ingressos.add(ingresso);
    }

    public void removerIngresso(int codigo) {

        for (int i = 0; i < ingressos.size(); i++) {

            if (ingressos.get(i).getCodigo() == codigo) {

                ingressos.remove(i);

                System.out.println("Ingresso removido");

                return;
            }
        }

        System.out.println("Ingresso não encontrado");
    }

    public Ingresso buscarIngresso(int codigo) {

        for (int i = 0; i < ingressos.size(); i++) {

            if (ingressos.get(i).getCodigo() == codigo) {

                return ingressos.get(i);
            }
        }

        return null;

    }

    public void listarIngressos() {

        for (Ingresso ingresso : ingressos) {

            ingresso.exibir();

        }
    }

    public double calcularArrecadacaoTotal() {

        double total = 0;

        for (Ingresso ingresso : ingressos) {

            total += ingresso.calcularValorFinal();
        }

        return total;
    }

    public void listarBeneficios() {

        for (Ingresso ingresso : ingressos) {

            System.out.println(ingresso.obterBeneficios());
            System.out.println("_____________________");
        }

    }

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(ArrayList<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

}
