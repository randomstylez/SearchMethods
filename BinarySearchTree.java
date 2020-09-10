 /**************************************************************
 Purpose/Description: <Creates a BST, with rules for implimentation, sorting, adding, and removing>
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

public class BinarySearchTree {
    
    public BinarySearchTreeNode root; // sets the root of the BTS
    public void insert(int key) {  }
    public void delete(int key) {  }
    public boolean find(int key) { return true; }

    public int positiveKeySum(){ //Sets up to add the BTS for type int at the root
     int sum=0;

     if (root.key>=0) sum+=root.key;

     BinarySearchTreeNode temp=root;

     return (sum+sum(temp));
    }

    public int sum(BinarySearchTreeNode tree){ //Adds int sum from the left side of the BTS
        int sum=0;

        if (tree.left !=null && tree.right !=null){
            if (tree.right.key >= 0)
                sum+=tree.right.key;

            if (tree.left.key >= 0)
                sum+=tree.left.key;

              sum+=sum(tree.left);
              sum+=sum(tree.right);
        }

        return sum;
    }

    public void deleteMax(){ this.delete(getMax(root,root.key)); }

    public int getMax(BinarySearchTreeNode tree, int max){

        int maximum=0;

        if (tree.left !=null && tree.right !=null){ //Checks to see
            if (tree.right.key >= tree.left.key )   // if right side is larger than left
                maximum=tree.right.key;
            else
                maximum=tree.left.key;

            if (max >maximum) maximum=max;          // Sets max hieght
           maximum= getMax(tree.left, maximum);
           maximum= getMax(tree.right, maximum);

        }else if(tree.left !=null){     // checks if no elements in left
            maximum=tree.left.key;

            if (max >maximum) maximum=max;
            maximum= getMax(tree.left, maximum);

        }else if (tree.right != null){      // checks if no elements in right
            maximum=tree.right.key;

            if (max >maximum)               // sets max on right    
                maximum=max;
            maximum= getMax(tree.right, maximum);
        }


        if (max>maximum)                // sets max
            maximum=max;


        return maximum;
    }

    public void printTree(){ 
        print(root);
        System.out.println(" "+root.key);       // output of the root of the BTS
    }

    private void print(BinarySearchTreeNode tree){  //setting right and left side of the BTS
        int right;
        int left;

        if (tree.left !=null && tree.right !=null){     // ensuring conditions to print
             right = tree.right.key;
             left  = tree.left.key;

            print(tree.left);
            print(tree.right);

            System.out.print(left+" "+right+" ");
        }

    }


}
