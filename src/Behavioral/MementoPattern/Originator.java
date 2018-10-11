package Behavioral.MementoPattern;

class Originator {
    private String article;

    Originator() {
    }

    String getArticle() {
        return article;
    }

    void setArticle(String article) {
        this.article = article;
    }

    Memento save() {
        return new Memento(article);
    }

    void restore(Memento memento) {
        this.article = memento.getState();
    }
}
