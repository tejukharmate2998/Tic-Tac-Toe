
public class TicTacToe {

	
	 public static void charBoard()
	 {
		 char[] charBoard = new char[10];
			
			for(int i=1;i<charBoard.length;i++) {
				charBoard[i]='_';
			}
	 }
	 
	public static void main(String[] args) {
		
		System.out.println("Welcome to TicTacToe");
		charBoard();
	}

	}
