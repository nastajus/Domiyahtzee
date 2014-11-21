import java.util.ArrayList;
import java.util.List;

/**
 * Created by IAN on 21/11/14.
 */
public class Domino {

    static int creationDieSideCounter = 1;
    static int creationDieSideMax = 6;

    static ArrayList<Domino> where;

    Piece kind;
    int val1;
    Integer val2;   //nullable.
    int where1;
    Integer where2; //nullable.

    Domino(Piece kind, int val1, Integer val2){
        this.kind = kind;
        this.val1 = val1;
        this.val2 = val2;
    }

    @Override
    public String toString(){
        if (val2 != null) return val1 + ":" + val2;
        else return val1 + "";
    }

    public Domino get(){
        return this;
    }


//    @Override
//    contains()
      //idea canceled, didn't want to clutter my code with so many overrides.


}
