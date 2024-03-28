public class Main {
    public static void main(String[] args) {
        Musica[] musicas = new Musica[5];
        musicas[0] = new Musica("Save that shit");
        musicas[1] = new Musica("Keep coo ");
        musicas[2] = new Musica("My ex");
        musicas[3] = new Musica("Ghost girl ");
        musicas[4] = new Musica("Canada");

        Album album = new Album("Album 1", 2024, musicas);
    }
}