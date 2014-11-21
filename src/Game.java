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
        //find specific domino.
        Domino d;

        //success test
        d = getDomino(reserve, 3,3);
        System.out.println(d.toString());

        //fail test
        d = getDomino(reserve, 66,55);
        System.out.println(d.toString());

    }

    //area == using on table or in reserve area.
    Domino getDomino(List<Domino> area, int val1, Integer val2){
        for(Domino d : area){
            if ( d.get().val1 == val1 && d.get().val2.equals(val2) ||  d.get().val1 == val2 && d.get().val2.equals(val1) ){
                return d.get();
            }
        }
        return null;
    }



    //optional?
    private void Place(){

    }
}
