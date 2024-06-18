package boardgame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Piece piece (int row, int column){
        return pieces[row][column];
    }

    public Piece piece (Position position){
        return pieces[position.getRow()][position.getColumn()];
    }

    // Ele irá atribuir a peça que veio como argumento na matriz de peças
    public void placePiece(Piece piece, Position position){
        pieces[position.getRow()][position.getColumn()] = piece;
        // Agora a gente fala que a peça informada, não está mais na posicao nula, e sim na nova posicao
        piece.position = position;
    }
}
