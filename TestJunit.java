import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * 
 */

/**
 * @author <K.ShanthiSai 2020501032>
 *
 */
public class TestJunit {
	@Test
	public void testBoardOne() {
		StringBuilder sb = new StringBuilder();
		sb.append("...***...\n")
		.append("*..*..*..\n")
		.append(".*..*....\n")
		.append("..*..**..\n")
		.append("**......*\n")
		.append("..**.*.*.\n")
		.append("***..*...\n")
		.append("...*.*.*.\n")
		.append("..***..*.\n");
		
		int s[][] = {{0,3},{0,4},{0,5},{1,0},{1,3},{1,6},{2,1},{2,4},{3,2},{3,5},{3,6},{4,0},{4,1},{4,8},
				{5,2},{5,3},{5,5},{5,7},{6,0},{6,1},{6,2},{6,5},{7,3},{7,5},{7,7},{8,2},{8,3},{8,4},{8,7}};
		Board b1 = new Board();
		int sizeOfBoard = 9;
		Assertions.assertEquals(sb.toString(), b1.printBoard(b1.createBoard(sizeOfBoard, s)));
		System.out.println("======Board Test One Executed=====");
		}
	
	@Test
	public void testBoardTwo() {
		String outputTwo = "...***...\n"
				+ "..**.....\n"
				+ ".****.*..\n"
				+ "*.*..*...\n"
				+ ".*.***.*.\n"
				+ "...**.*..\n"
				+ "**...*...\n"
				+ ".....*...\n"
				+ "..***.*..\n";
		int s[][] = {{0,3},{0,4},{0,5},{1,2},{1,3},{2,1},{2,2},{2,3},{2,4},{2,6},{3,0},{3,2},{3,5},{4,1},{4,3},{4,4},
				{4,5},{4,7},{5,3},{5,4},{5,6},{6,0},{6,1},{6,5},{7,5},{8,2},{8,3},{8,4},{8,6}};
		Board b2 = new Board();
		int sizeOfBoard = 9;
		Assertions.assertEquals(outputTwo, b2.printBoard(b2.createBoard(sizeOfBoard, s)));
		System.out.println("======Board Test Two Executed=====");
		}
	
	@Test
	public void testBoardThree() {
		String outputThree = "..***....\n"
				+ ".*.......\n"
				+ "....**...\n"
				+ "*........\n"
				+ ".*.......\n"
				+ "...*..*..\n"
				+ ".....**..\n"
				+ "..**.**..\n"
				+ "....**...\n";
		int s[][] = {{0,2},{0,3},{0,4},{1,1},{2,4},{2,5},{3,0},{4,1},{5,3},{5,6},{6,5},{6,6},{7,2},{7,3},{7,5},{7,6},{8,4},{8,5}};
		Board b3 = new Board();
		int sizeOfBoard = 9;
		Assertions.assertEquals(outputThree, b3.printBoard(b3.createBoard(sizeOfBoard, s)));
		System.out.println("======Board Test Three Executed=====");
		}
	}

