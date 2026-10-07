import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        Agenda agenda = new Agenda();

        int escolha = 0;

        while (escolha != 8) {
            
            System.out.println("(1) Adicionar contato\r\n" + //
                                "(2) Remover contato - caso o usu´ario n˜ao seja encontrado o usu´ario deve ser informado\r\n" + //
                                "(3) Buscar contato por nome - caso o contato n˜ao seja encontrado o usu´ario deve ser informado\r\n" + //
                                "(4) Buscar contato por email - caso o contato n˜ao seja encontrado o usu´ario deve ser informado\r\n" + //
                                "(5) Buscar contato por telefone - caso o contato n˜ao seja encontrado o usu´ario deve ser informado\r\n" + //
                                "(6) Consultar tamanho da Agenda - caso o contato n˜ao seja encontrado o usu´ario deve ser informado\r\n" + //
                                "(7) Finalizar - o programa s´o deve encerrar quando o usu´ario selecionar esta op¸c˜ao.");
        

            System.out.println("Digite a opção");
            System.out.println("----------------------");

            escolha = entrada.nextInt();

            if (escolha == 1) {
                
                System.out.println("Qual o tipo de contato?");
                System.out.println("1 - Pessoal");
                System.out.println("2 - Profissional");
                System.out.println("3 - Emergencia");

                int contato = entrada.nextInt();

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
                    
                    System.out.println("Digite o grau de prioridade de 1 a 5");
                    int grau = entrada.nextInt();

                    System.out.println("Digite a observação");
                    String observacao = entrada.nextLine();

                    Contato novContato = new ContatoEmergencia(nome, email, telefone, grau, observacao);
                    agenda.adicionarContato(novContato);
                }
            }
        
        
                            }


    }
}
