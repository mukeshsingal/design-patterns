package Behavioral.ChainOfResponsibiltyPattern;

interface Handler {
    void process(Number request);

    void setNext(Handler handler);
}
