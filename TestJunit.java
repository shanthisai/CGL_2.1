import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * 
 */

/**
 * @author <K.ShanthiSai 2020501032>
 *
 */
public class TestJunitBoard {
	@Test
	public void testBoardOne() {
		String outputOne = "...***...\r\n"
				+ "*..*..*..\r\n"
				+ ".*..*....\r\n"
				+ "..*..**..\r\n"
				+ "**......*\r\n"
				+ "..**.*.*.\r\n"
				+ "***..*...\r\n"
				+ "...*.*.*.\r\n"
				+ "...*.*.*.";
		int s[][] = {{0,3},{0,4},{0,5},{1,0},{1,3},{1,6},{2,1},{2,4},{3,2},{3,5},{3,6},{4,0},{4,1},{4,8},
				{5,2},{5,3},{5,5},{5,7},{6,0},{6,1},{6,2},{6,5},{7,3},{7,5},{7,7},{8,2},{8,3},{8,4},{8,7}};
		Board b1 = new Board();
		System.out.println("======Board Test One Executed=====");
		Assertions.assertEquals(outputOne, b1.createBoard(s).toString());
		}
	
	@Test
	public void testBoardTwo() {
		String outputOne = "...***...\r\n"
				+ "..**.....\r\n"
				+ ".****.*..\r\n"
				+ "*.*..*...\r\n"
				+ ".*.***.*.\r\n"
				+ "...**.*..\r\n"
				+ ".*...*...\r\n"
				+ ".....*...\r\n"
				+ "..***.*..";
		int s[][] = {{0,3},{0,4},{0,5},{1,0},{1,3},{1,6},{2,1},{2,4},{3,2},{3,5},{3,6},{4,0},{4,1},{4,8},
				{5,2},{5,3},{5,5},{5,7},{6,0},{6,1},{6,2},{6,5},{7,3},{7,5},{7,7},{8,2},{8,3},{8,4},{8,7}};
		Board b1 = new Board();
		System.out.println("======Board Test One Executed=====");
		Assertions.assertEquals(outputOne, b1.createBoard(s).toString());
		}
	}

