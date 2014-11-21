/**
 * Created by IAN on 20/11/14.
 */
public class Main {
    public static void main(String args[]){

        Game g = new Game();
        g.Create();

        /**
         *
         * Linear representation of 2D array
         *
         *  0  1  2  3  4
         *  5  6  7  8  9
         *  10 11 12 13 14
         *  15 16 17 18 19
         *  20 21 22 23 24
         *
         * Set of all possible combinations == 6 x 6 triangular == 21
         *
         * 1 1
         * 2 1, 2 2
         * 3 1, 3 2, 3 3
         * 4 1, 4 2, 4 3, 4 4
         * 5 1, 5 2, 5 3, 5 4, 5 5
         * 6 1, 6 2, 6 3, 6 4, 6 5, 6 6
         *
         * 4
         *
         *
         *  pseudo code
         *
         *  class Domino {
         *      type enum = { singleton or domino }
         *
         *      int val1;
         *      int val2;   //possible to be null
         *
         *      Array using or reserved //array reference
         *      int ind1;
         *      int ind2;   //possible to be null
         *
         *  }
         *
         *  class Rules {
         *      boolean Rule1()
         *      boolean Rule2()
         *          // 4 dice showing same face
         *
         *      ... etc ...
         *
         *      boolean Evaluate(){
         *          iterate rows
         *          iterate cols
         *          manually check diags
         *
         *          foreach rule in rules?
         *          - #1 ) method pointer equivalent for java.
         *      }
         *  }
         *
         *  class Game
         *      Array dominos using
         *      Array dominos reserve
         *      void buildDominioSet(); 1 1, ... 2 1, 2, 2, ... 6 5, 6 6. == 21 unique combinations.
         *      void setupPlacement(using, reserve);
         *      void calcPoints();
         *  }
         */

    }
}
