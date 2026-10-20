import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        String escolha = "z";

        Bilheteria bilheteria = new Bilheteria();

        while (escolha != "g") {

            System.out.println("(a) Cadastrar ingresso\r\n" + //
                    "(b) Remover ingresso\r\n" + //
                    "(c) Buscar ingresso por c´odigo\r\n" + //
                    "(d) Listar todos os ingressos\r\n" + //
                    "(e) Calcular arrecada¸c˜ao total\r\n" + //
                    "(f) Listar benef´ıcios dos ingressos\r\n" + //
                    "(g) Finalizar");

            System.out.println("Digite sua escolha");

            escolha = entrada.nextLine();

            if (escolha.equals("a")) {

                System.out.println("1 - Ingresso comum");
                System.out.println("2 - Ingresso Estudante");
                System.out.println("3 - ingresso VIP");
                System.out.println("Digite o tipo de ingresso");

                int tipo = entrada.nextInt();
                entrada.nextLine();

                System.out.println("Digite o codigo");
                int codigo = entrada.nextInt();
                entrada.nextLine();

                System.out.println("Digite o nome do evento");
                String nomeEvento = entrada.nextLine();
                entrada.nextLine();

                System.out.println("Digite o setor");
                String setor = entrada.nextLine();
                entrada.nextLine();

                System.out.println("Digite o valor");
                double valor = entrada.nextDouble();
                entrada.nextLine();

                if (tipo == 1) {

                    Ingresso ingresso = new IngressoComum(codigo, nomeEvento, setor, valor);

                    bilheteria.adicionarIngresso(ingresso);

                } else if (tipo == 2) {

                    System.out.println("Digite a instituicao de ensino");
                    String instituicao = entrada.nextLine();
                    entrada.nextLine();

                    IngressoEstudante ingresso = new IngressoEstudante(codigo, nomeEvento, setor, valor,
                            instituicao);

                    bilheteria.adicionarIngresso(ingresso);

                } else if (tipo == 3) {

                    System.out.println("Digite o numero do lounge");
                    int numeroLounge = entrada.nextInt();
                    entrada.nextLine();

                    System.out.println("Tem acesso ao backstage? (true/false)");
                    boolean acessoBackstage = entrada.nextBoolean();
                    entrada.nextLine();

                    IngressoVIP ingresso = new IngressoVIP(codigo, nomeEvento, setor, valor, acessoBackstage,
                            numeroLounge);

                    bilheteria.adicionarIngresso(ingresso);
                }

            }

            else if (escolha.equals("b")) {

                System.out.println("Digite o codigo do ingresso a ser removido");
                int codigo = entrada.nextInt();
                entrada.nextLine();

                bilheteria.removerIngresso(codigo);

            } else if (escolha.equals("c")) {

                System.out.println("Digite o codigo do ingresso a ser buscado");
                int codigo = entrada.nextInt();
                entrada.nextLine();

                Ingresso ingresso = bilheteria.buscarIngresso(codigo);

                if (ingresso != null) {

                    ingresso.exibir();

                } else {

                    System.out.println("Ingresso não encontrado");
                }

            } else if (escolha.equals("d")) {

                bilheteria.listarIngressos();

            }

            else if (escolha.equals("e")) {

                double arrecadacao = bilheteria.calcularArrecadacaoTotal();

                System.out.println("Arrecadação total: " + arrecadacao);

            } else if (escolha.equals("f")) {

                bilheteria.listarBeneficios();

            } else if (escolha.equals("g")) {

                System.out.println("Finalizando o programa...");

            } else {

                System.out.println("Opção inválida. Tente novamente.");

            }

        }

        entrada.close();
    }
}
