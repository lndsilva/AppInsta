package br.com.etecia.appinsta;

public class HomeContents {
    private String titulo;
    private String subtitulo;
    private int imagem;

    public HomeContents(String titulo, String subtitulo, int imagem) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
