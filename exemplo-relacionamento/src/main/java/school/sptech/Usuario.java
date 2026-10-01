package school.sptech;

public class Usuario {

    private String nome;
    private String email;
    private String generoFavorito;

    public Usuario(String nome, String email, String generoFavorito) {
        this.nome = nome;
        this.email = email;
        this.generoFavorito = generoFavorito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGeneroFavorito() {
        return generoFavorito;
    }

    public void setGeneroFavorito(String generoFavorito) {
        this.generoFavorito = generoFavorito;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", generoFavorito='" + generoFavorito + '\'' +
                '}';
    }


}
