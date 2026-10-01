package school.sptech;

public class Musica {

    private String nome;
    private String artista;
    private String album;
    private Integer duracaoSegundos;

    public Musica(String nome, String artista, String album, Integer duracaoSegundos) {
        this.nome = nome;
        this.artista = artista;
        this.album = album;
        this.duracaoSegundos = duracaoSegundos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Integer getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(Integer duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", album='" + album + '\'' +
                ", duracaoSegundos=" + duracaoSegundos +
                '}';
    }
}
