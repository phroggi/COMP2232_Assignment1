public class ArrayData {

    private int rows;
    private int columns;
    private int values[][];
    private int rowData[];
    private int colData[];

    public ArrayData() {
        this.rows = 10;
        this.columns = 10;
        this.values = new int[rows][columns];
        this.rowData = new int[rows];
        this.colData = new int[columns];
    }

    public ArrayData(int nrows, int ncolumns) {
        this.rows = nrows;
        this.columns = ncolumns;
        this.values = new int[rows][columns];
        this.rowData = new int[rows];
        this.colData = new int[columns];
    }

    public ArrayData(int nrows, int ncolumns, int startingValue) {
        this.rows = nrows;
        this.columns = ncolumns;
        this.values = new int[rows][columns];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++)
                this.values[i][j] = startingValue;
        }

        this.rowData = new int[rows];
        this.colData = new int[columns];
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