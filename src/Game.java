import java.util.ArrayList;

/**
 * Created by IAN on 21/11/14.
 */
public class Game {
    ArrayList<Domino> using;
    ArrayList<Domino> reserve;

    void Create(){

        for(int i = Domino.creationDieSideCounter; i <= Domino.creationDieSideMax; i++ ){
            for( int j = 1; j <= i; j++){
                Domino d = new Domino(Piece.DOMINO, Domino.creationDieSideCounter, j );
                System.out.print ( d.toString() + ", ");
            }
            Domino.creationDieSideCounter++;
            System.out.println();
        }

        Domino d = new Domino( Piece.SINGLETON, 4, null);
        System.out.println ( d.toString() );
    }
}
