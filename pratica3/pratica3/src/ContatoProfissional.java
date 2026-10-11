public class ContatoProfissional extends Contato {

    private String empresa;
    private String cargo;

    public ContatoProfissional(String nome, String email, String telefone, String empresa, String cargo) {
        super(nome, email, telefone);
        this.empresa = empresa;
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "ContatoProfissional [empresa=" + empresa + ", cargo=" + cargo + ", getNome()=" + getNome()
                + ", getEmail()=" + getEmail() + ", getTelefone()=" + getTelefone() + "]";
    }
}
