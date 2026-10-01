package school.sptech;

public class Main {
    static void main() {

        Usuario u1 = new Usuario("Kajio", "kajio@gmail.com", "Rock");

        Usuario u2 = new Usuario(
                "Marcus Fofuxo",
                "malu.giane@gmail.com",
                "Pop"
        );

        Usuario u3 =  new Usuario(
                "Cristiano Ronaldo",
                "ronaldocristiane@gmail.com",
                "Trap"
        );

        Musica m1 = new Musica(
                "Yesterday",
                "The Beatles",
                "Abbey Road",
                180
        );

        Musica m2 = new Musica(
                "Cruel Summer",
                "Taylor Swift",
                "Lover",
                200
        );

        Musica m3 = new Musica(
                "Ratos",
                "Yunk Vino",
                "EP",
                240
        );

        Musica m4 = new Musica(
                "Essência de Risco",
                "Niink",
                "Essência de Risco",
                180
        );

        Musica m5 = new Musica(
                "Caso Indefinido",
                "Cristiano Araújo",
                "Caso Indefinido",
                230
        );

//        System.out.println(m1);
//        System.out.println(m2);
//        System.out.println(m3);
//        System.out.println(m4);
//        System.out.println(m5);

        Playlist p1 = new Playlist(
                "Musicas Antigas",
                u1
        );

        p1.adicionarMusica(m1);
        p1.adicionarMusica(m5);

        System.out.println(p1);

        Playlist p2 = new Playlist(
                "Niink Trap",
                u3
        );

        p2.adicionarMusica(m4);
        p2.adicionarMusica(m2);
        p2.adicionarMusica(m1);

        System.out.println(p2);
    }
}