package boardgame;

public class Piece {

    /* Está como protected pois essa posição não é a do xadrez, e sim, um posição simples de matriz, por isso foi colocada protected
       para garantir que ela nao seja vista na camada de xadrez, apenas na camada de tabuleiro */
    protected Position position;
    private Board board;

    // Pelo diagrama, 1 Board tem * peças

    // O construtor n terá a Position, pois inicialmente a posicao se inciará como nula, dizendo que a peça nao foi colodada no tabueliro
    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    // Somente as classes dentro do pacote Board poderao utilizar esse metodo, por isso deixaremos muitas coisas protected
    protected Board getBoard() {
        return board;
    }

}
