/**
 * 
 */

/**
 * /**
 * ****************Conways Game Of Life***********************************
 * Initially, there is a board with some cells which may be alive or dead. 
 * Task is to generate the next generation of cells based on the following rules: 
 *     
 * Rule 1: Any live cell with fewer than two live neighbors dies, as if caused by under
 * population. 
 * Rule 2:Any live cell with two or three live neighbors lives on
 * to the next generation. 
 * Rule 3: Any live cell with more than three live  neighbors dies, as if by over population. 
 * Rule 4: Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * 
 * Step 1 => find the no Of Neighbours that are alive; 
 * Step 2 => apply rules of game to get next generation by use the if conditions
 * to check all neighbors excluding it self as given video lecture
 * 
 * *************Rules of Life********************* 
 * Lonely cell will die ==> aliveNeighbours < 2 ;
 * Cell will die due to over population ==> aliveNeighbours > 3 
 * A new cell will born ==> if currently dead cell have aliveNeighbours == 3
 * 
 * @author <K.ShanthiSai 2020501032>
 *
 ** @param n  size of the board n X n
 * @param l[][]  array of live cells
 */     
	
public class Board {
	public Cell[][] createBoard(int n, int l[][]) {
		Cell[][] boardCell = new Cell[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				boardCell[i][j] = new Cell(false);
			}
		}

		for (int i = 0; i < l.length; i++) {
			int makeLiveRowPos = l[i][0];
			int makeLiveColPos = l[i][1];
			boardCell[makeLiveRowPos][makeLiveColPos].setStatus(true);
		}

		return boardCell;
	}
	/*
    * @param boardCell[][]
    * @return
    */
	
	public String printBoard(Cell[][] boardCell) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < boardCell.length; i++){
			for (int j = 0; j < boardCell[0].length; j++) {
				if (j == boardCell[0].length - 1) {
					sb.append(boardCell[i][j].getCellValue());
					//System.out.print(boardCell[i][j].getCellValue());
					
					/*if(boardCell[i][j].getStatus()) {
						sb.append("*");
						System.out.print("*");
					} else {
						sb.append(".");
						System.out.print(".");
					}  */  
				} else {
					sb.append(boardCell[i][j].getCellValue());
					//System.out.print(boardCell[i][j].getCellValue());
					/*if(boardCell[i][j].getStatus()) {
						sb.append("*");
						System.out.print("*");
					} else {
						sb.append(".");
						System.out.print(".");
					}*/
				}
			}
			sb.append("\n");
			
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
    /**
     * Method to generate a next generation. Call the printBoard
     * to print the next generation.
     * return new_board
     * @param Cell[][] boardCell,boolean
     */
	
	public Cell[][] generateNextGeneration(Cell[][] boardCell, boolean printCurrentGen) {
    	
	      if (printCurrentGen) {
	    	  System.out.println("CurrentGenration");
	    	  printBoard(boardCell);
	      }
	        
	      int rows = boardCell.length;
	      int cols = boardCell[0].length;
	      Cell[][]  new_board = new Cell[rows][cols];
	        for (int i=0;i<boardCell.length;i++){
	            for (int j=0;j<boardCell[0].length;j++) {

	                    if(!boardCell[i][j].getStatus()) {
	                        int count_livecellsof_death =0;
	                        for (int k=i-1;k<i+2;k++){
	                            for (int s=j-1;s<j+2;s++){
	                                if ( k == i && s==j){
	                                    continue;
	                                }
	                                else{
	                                    if (k>=0 && k<rows && s>=0 && s<cols){
	                                        if (boardCell[k][s].getStatus()){
	                                            count_livecellsof_death +=1;
	                                        }
	                                    }
	                                }
	                                
	                            }
	                            
	                        }
	                        if (count_livecellsof_death == 3){
	                        	Cell curCell = new Cell(true);
	                            new_board[i][j] = curCell;
	                        }
	                        else{
	                        	Cell curCell = new Cell(false);
	                            new_board[i][j] = curCell;
	                        }
	                    }
	                    else{
	                        int count_livecellsof_live =0;
	                        for (int k=i-1;k<i+2;k++){
	                            for (int s=j-1;s<j+2;s++){
	                                if ( k == i && s==j){
	                                    continue;
	                                }
	                                else{
	                                    if (k>=0 && k<rows && s>=0 && s<cols){
	                                        if (boardCell[k][s].getStatus()){
	                                            count_livecellsof_live +=1;
	                                        }
	                                    }
	                                }
	                            }
	                        }
	                        if (count_livecellsof_live == 2 || count_livecellsof_live == 3){
	                        	Cell curCell = new Cell(true);
	                            new_board[i][j] = curCell; 
	                        }
	                        else{
	                        	Cell curCell = new Cell(false);
	                            new_board[i][j] = curCell;
	                        }
	                    }
	            }
	        
	        }
	        System.out.println("NextGenration");
	        printBoard(new_board);
	        
	        return new_board;
	    } 
}
