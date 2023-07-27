import java.util.ArrayList;

public class Column extends Concrete implements IColumn {   // Sub Class

	
	private double columnShortEdge;
	
	private double columnLongEdge;
	
	private double columnHeight;
	
	private int numberOfColumn;

	static ArrayList<Column> columnObject = new ArrayList<Column>();
	

	
    public Column() {
	// TODO Auto-generated constructor stub
    }
	
	
	public Column(double columnShortEdge, double columnLongEdge, double columnHeight, int numberOfColumn) {
		super();
		this.columnShortEdge = columnShortEdge;
		this.columnLongEdge = columnLongEdge;
		this.columnHeight = columnHeight;
		this.numberOfColumn = numberOfColumn;
	}


	public double getColumnShortEdge() {
		return columnShortEdge;
	}


	public void setColumnShortEdge(double columnShortEdge) {
		this.columnShortEdge = columnShortEdge;
	}


	public double getColumnLongEdge() {
		return columnLongEdge;
	}


	public void setColumnLongEdge(double columnLongEdge) {
		this.columnLongEdge = columnLongEdge;
	}


	public double getColumnHeight() {
		return columnHeight;
	}


	public void setColumnHeight(double columnHeight) {
		this.columnHeight = columnHeight;
	}


	public int getNumberOfColumn() {
		return numberOfColumn;
	}


	public void setNumberOfColumn(int numberOfColumn) {
		this.numberOfColumn = numberOfColumn;
	}



	public double  calculation_columnVolume(Column column) {

		double columnVolume=column.getColumnShortEdge()*column.getColumnLongEdge()*column.getColumnHeight()*column.getNumberOfColumn();
		return columnVolume;
	}



	

	
}
