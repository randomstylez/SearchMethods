 /**************************************************************
 Purpose/Description: <Creates a linked list that can be modified.>
 Author’s Panther ID: <5901749>
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
**************************************************************/
package cop3530_assignment2;

/**
 *
 * @author Joey
 */
import java.util.LinkedList;

public class MyList <AnyType>  {

    private LinkedList<AnyType> list;
    
        MyList() {
            list=new LinkedList();  //Sets a new list
        }
        void myPush(AnyType x) {
            list.add(0,x);          // adds to the front list
        }
        
        AnyType myPop() { 
            return list.remove(0);  //removes from the list
        }

        void myInject(AnyType x) { 
            list.addLast(x);        //adds to the end of the list
        }


}
