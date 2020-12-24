import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author <K.ShanthiSai 2020501032>
 *
 */
public class TestJunitCell {

	@Test
	public void testCellOne() {
		Cell c1  = new Cell(0,3,true);
		Assertions.assertEquals("0",Integer.toString(c1.getRow()));
		Assertions.assertEquals("3",Integer.toString(c1.getCol()));
		Assertions.assertEquals("true",Boolean.toString(c1.getStatus()));
	}
		
}
