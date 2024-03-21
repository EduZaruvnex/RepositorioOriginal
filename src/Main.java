// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Album1 {
    public class Album {
        private String nome;
        private int ano_lancamento;

        private String[] musicas_album;

        public Album(String nome, int ano_lancamento,String[] musicas_album){
            this.ano_lancamento = ano_lancamento;
            this.nome = nome;
            this.musicas_album = musicas_album;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getAno_lancamento() {
            return ano_lancamento;
        }

        public void setAno_lancamento(int ano_lancamento) {
            this.ano_lancamento = ano_lancamento;
        }

        public String[] getMusicas_album() {
            return musicas_album;
        }

        public void setMusicas_album(String[] musicas_album) {
            this.musicas_album = musicas_album;
        }
    }

}