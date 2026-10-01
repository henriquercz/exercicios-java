package school.sptech;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Locale;

public class MusicaDao {

    private final JdbcTemplate jdbcTemplate;

    public MusicaDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Escreva os métodos abaixo */

    public List<Musica> findAll() {
        List<Musica> musicas = jdbcTemplate.query("SELECT * FROM musica", new BeanPropertyRowMapper<>(Musica.class));

        System.out.println(musicas);
        return musicas;
    }

    public Musica findById(Integer id) {
        if (id == null || id < 0) {
            return null;
        }

        List<Musica> idMusica = jdbcTemplate.query("select * from musica where id = ?", new BeanPropertyRowMapper<>(Musica.class), id);

        if (idMusica.isEmpty()) {
            return null;
        }

        return idMusica.get(0);
    }

    public List<Musica> findByNomeLike(String nome) {
        String nomeConsulta = "%" + nome.toLowerCase(Locale.ROOT) + "%";

        List<Musica> musicas = jdbcTemplate.query("select * from musica where LOWER(nome) like ?", new BeanPropertyRowMapper<>(Musica.class), nomeConsulta);

        return musicas;
    }

    public List<Musica> findByArtista(String artista) {
        List<Musica> musicas = jdbcTemplate.query("select * from musica where artista = ?", new BeanPropertyRowMapper<>(Musica.class), artista);

        return musicas;
    }

    public List<Musica> findByAlbum(String album) {
        List<Musica> musicas = jdbcTemplate.query("select * from musica where album = ?", new BeanPropertyRowMapper<>(Musica.class), album);

        return musicas;
    }

    public List<Musica> findByDuracaoGreaterThan(Integer duracao) {
        List<Musica> musicas = jdbcTemplate.query("select * from musica where duracao > ?", new BeanPropertyRowMapper<>(Musica.class), duracao);

        return musicas;
    }

    public List<Musica> findByAlbumAndNomeLike(String album, String nome) {
        String nomeConsulta = "%" + nome.toLowerCase(Locale.ROOT) + "%";

        List<Musica> musicas = jdbcTemplate.query("select * from musica where album = ? and LOWER(nome) like ?", new BeanPropertyRowMapper<>(Musica.class), album, nomeConsulta);

        return musicas;
    }

    public Integer save(Musica musica) {
        if (musica.getId() == null) {
            Integer musicas = jdbcTemplate.update("insert into musica (nome, artista, album, duracao) values (?, ?, ?, ?)", musica.getNome(), musica.getArtista(), musica.getAlbum(), musica.getDuracao());
            return musicas;
        } else {
            Integer musicas = jdbcTemplate.update("update musica set nome = ?, artista = ?, album = ?, duracao = ? where id = ?", musica.getNome(), musica.getArtista(), musica.getAlbum(), musica.getDuracao(), musica.getId());

            return musicas;
        }
    }

    public Integer deleteById(Integer id) {
        Integer musicas = jdbcTemplate.update("delete from musica where id = ?", id);
        return musicas;
    }


}
