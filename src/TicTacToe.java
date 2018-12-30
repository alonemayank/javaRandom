/**
 * Created by apurvatripathi on 10/12/18.
 */
public class TicTacToe {
    int[] rowC;
    int[] columnC;
    int diagR;
    int diagL;
    int counter;

    public void TicTacToe(int size){
        rowC = new int[size];
        columnC = new int[size];
        diagL = 0;
        diagR = 0;
        counter = size;
    }

    public void move(int i, int j, int player){
        int moveC = player==1 ? 1 : -1;

        rowC[i] += moveC;
        columnC[j] += moveC;

        if(rowC == columnC) diagR += moveC;

        if(j == counter - i  -1) diagL += moveC;

        if(rowC[i] == counter || columnC[j] == counter || diagL == counter || diagR == counter) System.out.println("Player 1 Wins");
        if(rowC[i] == -counter || columnC[j] == -counter || diagL == -counter || diagR == -counter) System.out.println("Player 2 Wins");
    }
}
