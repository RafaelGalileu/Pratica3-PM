import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        Agenda agenda = new Agenda();

        int escolha = 0;

        while (escolha != 7) {

            System.out.println("(1) Adicionar contato\r\n" + //
                    "(2) Remover contato - caso o usu´ario n˜ao seja encontrado o usu´ario deve ser informado\r\n" + //
                    "(3) Buscar contato por nome - caso o contato n˜ao seja encontrado o usu´ario deve ser informado\r\n"
                    + //
                    "(4) Buscar contato por email - caso o contato n˜ao seja encontrado o usu´ario deve ser informado\r\n"
                    + //
                    "(5) Buscar contato por telefone - caso o contato n˜ao seja encontrado o usu´ario deve ser informado\r\n"
                    + //
                    "(6) Consultar tamanho da Agenda - caso o contato n˜ao seja encontrado o usu´ario deve ser informado\r\n"
                    + //
                    "(7) Finalizar - o programa s´o deve encerrar quando o usu´ario selecionar esta op¸c˜ao.");

            System.out.println("Digite a opção");
            System.out.println("----------------------");

            escolha = entrada.nextInt();
            entrada.nextLine();

            if (escolha == 1) {

                System.out.println("Qual o tipo de contato?");
                System.out.println("1 - Pessoal");
                System.out.println("2 - Profissional");
                System.out.println("3 - Emergencia");

                int contato = entrada.nextInt();
                entrada.nextLine();

                System.out.println("Digite o nome");
                String nome = entrada.nextLine();

                System.out.println("Digite o Email");
                String email = entrada.nextLine();

                System.out.println("Digite o telefone");
                String telefone = entrada.nextLine();

                if (contato == 1) {

                    System.out.println("Digite a data de aniversario");
                    String dataAniversario = entrada.nextLine();

                    System.out.println("Digite o parentesco");
                    String parentesco = entrada.nextLine();

                    Contato novContato = new ContatoPessoal(nome, email, telefone, dataAniversario, parentesco);

                    agenda.adicionarContato(novContato);

                }

                else if (contato == 2) {

                    System.out.println("Digite a empresa");
                    String empresa = entrada.nextLine();

                    System.out.println("Digite o cargo");
                    String cargo = entrada.nextLine();

                    Contato novContato = new ContatoProfissional(nome, email, telefone, empresa, cargo);
                    agenda.adicionarContato(novContato);
                }

                else if (contato == 3) {

                    int grau;

                    do {
                    System.out.println("Digite o grau de prioridade de 1 a 5");

                    grau = entrada.nextInt();
                    
                    entrada.nextLine();

                    }
                    while (!(1 <= grau && grau <= 5));

                    

                    System.out.println("Digite a observação");
                    String observacao = entrada.nextLine();

                    Contato novContato = new ContatoEmergencia(nome, email, telefone, grau, observacao);
                    agenda.adicionarContato(novContato);
                }
            }

            else if (escolha == 2) {

                System.out.println("Digite o nome do contato que deseja remover");
                String nome = entrada.nextLine();

                boolean retorno = agenda.removerContato(nome);

                if (retorno == true) {

                    System.out.println("Contato removido");
                } else {

                    System.out.println("Contato não encontrado");
                }
            }

            else if (escolha == 3) {

                System.out.println("Digite o nome do contato");
                String nome = entrada.nextLine();

                Contato contato = agenda.buscarContatoNome(nome);

                if (contato != null) {

                   contato.exibirContato();

                }

                else {
                    System.out.println("Contato não encontrado");
                }
            }

            else if (escolha == 4) {

                System.out.println("Digite o email");
                String email = entrada.nextLine();

                Contato contato = agenda.buscarContatoEmail(email);

                if (contato != null) {

                   contato.exibirContato();

                }

                else {
                    System.out.println("Contato não encontrado");
                }
            }

            else if (escolha == 5) {
                System.out.println("Digite o telefone");
                String telefone = entrada.nextLine();

                Contato contato = agenda.buscarContatoTelefone(telefone);

                if (contato != null) {

                   contato.exibirContato();

                }

                else {
                    System.out.println("Contato não encontrado");
                }
            }

            else if (escolha == 6) {
                System.out.println("tamanho da agenda: " + agenda.getQuantidadeContatos());
            }

            else if (escolha == 7) {
                System.out.println("Encerrando o programa");
            }

            else {
                System.out.println("Escolha inválida");
            }

        }

        entrada.close();

    }
}
