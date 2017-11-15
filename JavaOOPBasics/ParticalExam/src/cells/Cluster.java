package cells;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cluster {
    private String id;
    private int rows;
    private int cols;
    private List<Cell> cells;


    public Cluster(String id, int rows, int cols){
        setId(id);
        setRows(rows);
        setCols(cols);
        this.cells = new ArrayList<>();
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setRows(int rows) {
        if (rows <= 0){
            throw new IllegalArgumentException("");
        }
        this.rows = rows;
    }

    private void setCols(int cols) {
        if (cols <= 0){
            throw new IllegalArgumentException("");
        }
        this.cols = cols;
    }

    public void addCell(Cell cell){
        int n = 0;
        boolean b1 = false;
        boolean b2 = false;
        boolean c = false;
        for (Cell cell1 : cells) {
            if (cell1.getPositionRow() > cell.getPositionRow()) {
                cells.add(n, cell);
                c = true;
                break;
            }
            if (cell1.getPositionRow() == cell.getPositionRow()) {
                if (cell1.getPositionCol() > cell.getPositionCol()) {
                    cells.add(n, cell);
                    c = true;
                    break;
                }
            }
            n++;
        }
        if (c){
            return;
         }else{
             cells.add(cell);
          }

    }

    protected String getId() {
        return id;
    }

    protected int getRows() {
        return rows;
    }

    protected int getCols() {
        return cols;
    }

    protected List<Cell> getCells() {
        return this.cells;
    }



    @Override
    public String toString() {

        String toReturn = "\n----Cluster "+ getId();
        for (Cell cell : cells) {
            toReturn+=cell;
        }

        return toReturn;
    }

}
