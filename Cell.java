/**
 * 
 */

/**
 * @author <K.ShanthiSai 2020501032>
 *
 */

public class Cell {
	
	final String ACTIVE_TOKEN = "*";
	final String IN_ACTIVE_TOKEN = ".";
	
	private boolean status;
	private int row;
	private int col;
	
	public Cell(int row, int col, boolean status) {
		this.row = row;
		this.col = col;
		this.status = status;
		
	}
	public Cell(boolean status) {
		this.status = status;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public int getRow() {
		return row;
	}

//	public void setRow(int row) {
//		this.row = row;
//	}

	public int getCol() {
		return col;
	}

//	public void setCol(int col) {
//		this.col = col;
//	}
	// return String type token value as declared above based on the boolean value when this method is called
	public String getCellValue() {
		if (this.status) {
			//System.out.print(ACTIVE_TOKEN);
			return ACTIVE_TOKEN;
		} else {
			//System.out.print(IN_ACTIVE_TOKEN);
			return IN_ACTIVE_TOKEN;
		}
	}
}
