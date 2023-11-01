package br.com.etecia.appinsta;

public class ProfileHor {
    private String story;
    private int imagem;

    public ProfileHor(String story, int imagem) {
        this.story = story;
        this.imagem = imagem;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
