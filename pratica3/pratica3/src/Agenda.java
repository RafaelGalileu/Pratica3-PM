import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;
    private int quantidadeContatos;

    public Agenda() {
        contatos = new ArrayList<>();
        quantidadeContatos = 0;
    }

    public void adicionarContato(Contato contato) {

        contatos.add(contato);

        this.quantidadeContatos++;

        System.out.println("Contato Adicionado");
    }

    public void removerContato(Contato contato) {

        if (contatos.remove(contato)) {
            System.out.println("Contato removido");

            this.quantidadeContatos--;
        }
        else {
            System.out.println("Contato não encontrado");
        }

        
    }

    public void buscarContatoNome (String nome){

        for (int i = 0; i < contatos.size(); i++) {

            if (contatos.get(i).getNome().equals(nome)) {
                
                System.out.println(this.contatos.get(i).toString());

                break;
            }
            
        }

        System.out.println("Contato não encontrado");
    }

    public void buscarContatoEmail (String email) {

        for (int i = 0; i < contatos.size(); i++) {

            if (contatos.get(i).getEmail().equals(email)) {
                
                System.out.println(contatos.get(i).toString());

                break;
            }
        }

        System.out.println("Contato não encontrado");
    }

    public void buscarContatoTelefone (String telefone) {

        for (int i = 0; i < contatos.size(); i++) {

            if (contatos.get(i).getTelefone().equals(telefone)) {
                
                System.out.println("this.contatos.get(i).toString()");

                break;
            }
        }

        System.out.println("Contato não encontrado");
    }
}
