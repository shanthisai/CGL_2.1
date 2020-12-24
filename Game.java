import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author <K.ShanthiSai 2020501032>
 *
 */
public class Game {
	public static void main(String[] args) throws FileNotFoundException {
		File myObj = new File("D:\\Shanthisai\\PSC\\Module 12\\CGL 2.1\\CGL 2.1\\src\\input001.txt");
	    Scanner sc = new Scanner(myObj);
        // Reading size of the Board
        int n = sc.nextInt();
        
        // Reading no. of initial live cells
        int m = sc.nextInt();
        int[][] l = new int[m][2];
        int i = 0;
        
        // Reading Live cells
        while (sc.hasNextInt()) {
            l[i][0] = sc.nextInt();
            l[i++][1] = sc.nextInt();
        }
        
        // creating instance to CGLVersion2
        Board c = new Board();
        
        // creating next generation by calling next generation method
        Cell[][] nextBoard = c.generateNextGeneration(c.createBoard(n, l), true);
        sc.close();
        
        Scanner scanner = new Scanner(System.in);
        String input = "";
        
        while (!"n".equalsIgnoreCase(input)) {
            System.out.print("Enter y to get next generation or n to quite: ");
            input = scanner.nextLine();
            nextBoard = c.generateNextGeneration(nextBoard, false);
        }
        scanner.close();
	}
}
