package tabuleiro;

public class Peca {

    protected Posicao posicao;
    private Board board;


    public Peca(Board board) {
        this.board = board;
        posicao = null;
    }


    protected Board getBoard() {
        return board;
    }
    
    
}
