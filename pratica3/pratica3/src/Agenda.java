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

    public boolean removerContato(String nome) {

        Contato remover = this.buscarContatoNome(nome);

        if (remover != null) {
            contatos.remove(remover);

            this.quantidadeContatos --;
            
            return true;
        }

        else {

            return false;
        }

    }

    public Contato buscarContatoNome(String nome) {

        for (int i = 0; i < contatos.size(); i++) {

            if (contatos.get(i).getNome().equals(nome)) {

                return contatos.get(i);

            }

        }

        return null;
    }

    public Contato buscarContatoEmail(String email) {

        for (int i = 0; i < contatos.size(); i++) {

            if (contatos.get(i).getEmail().equals(email)) {

                return contatos.get(i);

            }
        }

        return null;
    }

    public Contato buscarContatoTelefone(String telefone) {

        for (int i = 0; i < contatos.size(); i++) {

            if (contatos.get(i).getTelefone().equals(telefone)) {

                return contatos.get(i);

            }
        }

        return null;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public int getQuantidadeContatos() {
        return quantidadeContatos;
    }

    public void setQuantidadeContatos(int quantidadeContatos) {
        this.quantidadeContatos = quantidadeContatos;
    }
}
