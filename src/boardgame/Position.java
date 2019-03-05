/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/**
 *
 * @author paulo
 */
public class Position {
    private int row, column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int aRow) {
        this.row = aRow;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int aColumn) {
        this.column = aColumn;
    }
    
    @Override
    public String toString()
    {
        return row + ", " + column;
    }
    
    
}
