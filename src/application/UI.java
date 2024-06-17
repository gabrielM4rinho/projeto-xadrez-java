package application;

import chess.ChessPiece;

public class UI {


    public static void printBoard(ChessPiece[][] pieces){
        for (int i=0; i< pieces.length;i++){
            System.out.print((8 - i) + " ");
            for (int j=0; j< pieces.length;j++){
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    // Esse metodo auxiliar foi criado para imprimir 1 peça
    //
    private static void printPiece(ChessPiece piece){
        // Isso vai checar caso tenha peça na posicao, caso n tenha ela irá imprimir o - e caso tenha vai imprimir a peça
        if (piece == null){
            System.out.print("-");
        }else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }

}
