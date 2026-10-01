package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String nome;
    private Usuario usuario;
    private List<Musica> musicas;

    public Playlist(String nome, Usuario usuario) {
        this.nome = nome;
        this.usuario = usuario;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        this.musicas.add(musica);
    }

    public Integer getDuracaoTotal() {
        Integer soma = 0;
        for (Musica musica : musicas) {
            soma += musica.getDuracaoSegundos();
        }

        return soma;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "nome='" + nome + '\'' +
                ", usuario=" + usuario +
                ", duracao=" + getDuracaoTotal() +
                ", musicas=" + musicas +
                '}';
    }
}
