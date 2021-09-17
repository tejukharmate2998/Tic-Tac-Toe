import java.util.Scanner;


public class TicTacToeGame {

	public static void main(String[] args) {
		TicTacToeGame ticTacToe = new TicTacToeGame();
		ticTacToe.ticTacToeBoard();
		char userSelect = ticTacToe.selectSymbol();
		char symbolCom;
        if(userSelect =='X') {
        	symbolCom='O';
        }
        else {
        	symbolCom='X';
        }
        System.out.println("computer symbol"+ symbolCom);
    

	}

	

private void ticTacToeBoard() {
		// TODO Auto-generated method stub
		
	}



public static char selectSymbol(){
    System.out.print("select the symbol X or 0");
    Scanner sc = new Scanner(System.in);
    char symbolP= sc.next().charAt(0);
    return symbolP ;
}

}
