import erros.CampoInvalido;
import erros.CpfInvalido;
import validador.CpfUtils;

public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String numero;

    public Usuario(String nome, String cpf, String email, String numero) {
        try {
            if(!nome.matches("(([A-Z]?[a-z]?){2,}\\s?){2,}")) throw  new CampoInvalido("Favor digitar um nome válido");
            if(!CpfUtils.isValid(cpf)) throw new CpfInvalido("Favor digitar um CPF válido.");
            if(!email.matches("(\\w+(\\d+)?)+@.+\\.com((\\.\\w+)+)?")) throw new CampoInvalido("Favor digitar um " +
                    "email válido");
            if(!numero.matches("(\\(\\d\\d\\)9\\d{8})|\\d\\d9\\d{8}")) throw  new CampoInvalido("Favor digitar um numero" +
                    " válido");
            this.nome = nome;
            this.cpf = cpf;
            this.email = email;
            this.numero = numero;
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
