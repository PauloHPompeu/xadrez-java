package tabuleiro;

public class Board {
    
    private int rows;
    private int column; 
    private Peca pecas[][];

    public Board(int rows, int column) {
        this.rows = rows;
        this.column = column;
        pecas = new Peca[rows][column];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    
}
