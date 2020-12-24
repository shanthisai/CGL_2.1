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
	
	public Cell(boolean status) {
		this.status = status;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
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
