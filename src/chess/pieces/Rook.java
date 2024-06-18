package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    // O toString será apenas a letra, pois ela irá entrar na posicao do "-" dentro do tabuleiro
    @Override
    public String toString(){
        return  "R";
    }
}
