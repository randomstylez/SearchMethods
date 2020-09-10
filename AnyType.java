 /**************************************************************
 Purpose/Description: <Compares the contents of 2 lists and finds the difference>
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
//This is a copied example code for the assignment, it is not meant to compile
// and is used with pesudo coding as the answer

public static <AnyType extends Comparable<? super AnyType>>
 void difference(List<AnyType> L1, List<AnyType> L2, List<AnyType> Difference)
 {
 ListIterator<AnyType> iterL1 = L1.listIterator();
 ListIterator<AnyType> iterL2 = L2.listIterator();
 if ( iterL1.hasNext() && iterL2.hasNext() )
 {
 itemL1 = iterL1.next();
 itemL2 = iterL2.next();
 }
 // YOUR CODE GOES HERE
/*
1.	while iterL1 has next and iterL2 has next    
2.	if itemL1 compared to itemL2 is 1
3.	         add itemL1 to the Diffrence List
4.	         add itemL2 to the Diffrence List
5.	print contents of Difference

*/
 }
