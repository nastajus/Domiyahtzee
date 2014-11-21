import java.util.ArrayList;
import java.util.List;

/**
 * Created by IAN on 21/11/14.
 */
public class Game {

    List<Domino> reserve = new ArrayList<Domino>();
    List<Domino> using = new ArrayList<Domino>();

    void Create(){

        for(int i = Domino.creationDieSideCounter; i <= Domino.creationDieSideMax; i++ ){
            for( int j = 1; j <= i; j++){
                Domino d = new Domino(Piece.DOMINO, Domino.creationDieSideCounter, j );
                System.out.print(d.toString() + ", ");
                reserve.add(d);
            }
            Domino.creationDieSideCounter++;
            System.out.println();
        }

        Domino d = new Domino( Piece.SINGLETON, 4, null);
        System.out.println(d.toString());
        reserve.add(d);
    }

    //later refactor to utilize input.txt.
    void Populate(){
        //For now hard-coding.
        
    }
}
