public class ArrayData {

    private int rows;
    private int columns;
    private int values[][];
    private int rowData[];
    private int colData[];

    public ArrayData() {
        super();
    }

    public ArrayData(int nrows, int ncolumns) {
        super();
    }

    public ArrayData(int nrows, int ncolumns, int startingValue) {
        super();
    }


    public void generate(int newValue, int total, int minRow, int minCol, int maxCol) {}
    public void flip(int num, int val) {}
    public void sum() {}
    public void occurrence(int num) {}
    public void standardDeviation() {}
    public double checkeredOdd() { return 0;}
    public void product(int min, int max) {}
    public void print() {}
    public void print(int rows, int columns) {}
}