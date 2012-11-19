
/**
 * A node to be used for Binary Tree applications. 
 * 
 * @author (Jesse Nelson) 
 * @version (November 18, 2012 Windows 8 (x64) Java 1.7 U9)
 */
public class BTNode<T> implements java.io.Serializable { 
    private BTNode<T> left;
    private BTNode<T> right;
    private T value;
    
    /**
     * Constructor that sets value & links to null.
     */
    public BTNode() {
        
    }
    
    /**
     * Constructor that sets value from parameter and both links to null. 
     * 
     * @param value the value to be stored at this node
     */
    public BTNode(T value) {
        this.value = value;        
    }
    
    /**
     * Fully parameterized constructor. 
     * 
     * @param value the value to be stored at this node
     * @param leftChild the link to the left child
     * @param rightChild the link to the right child
     */
    public BTNode(T value, BTNode<T> leftChild, BTNode<T> rightChild ) {
        this.left= leftChild; 
        this.right = rightChild;
        this.value = value;
    }
    
    /**
     * Define equality for BTNodes. Indicates whether some other object is "equal to" this one.
     * The equals method implements an equivalence relation on non-null object references: 
     * 
     * <LI>It is reflexive: for any non-null reference value x, x.equals(x) should return true.
     * <LI>It is symmetric: for any non-null reference values x and y, x.equals(y) should return
     *    true if and only if y.equals(x) returns true.
     * <LI>It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns
     *    true and y.equals(z) returns true, then x.equals(z) should return true.
     * <LI>It is consistent: for any non-null reference values x and y, multiple invocations of 
     *    x.equals(y) consistently return true or consistently return false, provided no information 
     *    used in equals comparisons on the objects is modified.
     * <LI>For any non-null reference value x, x.equals(null) should return false.
     * 
     * @param obj the reference object with which to compare
     * 
     * @return
     */
    public boolean equals(Object obj) {
        return false;
    }
    
    /**
     * Define hashcode for BTNodes. 
     * <p> If two objects are equal according to the equals(Object) method, then calling the hashCode
     *     method on each of the two objects produces the same integer result.
     *     
     * @return a hash code value for this object
     */
    public int hashCode() {
        return 0;
    }
    
    /**
     * Sets the left child
     * 
     * @param left the new left child
     */
    public void setLeftChild(BTNode<T> leftChild) {
        this.left = leftChild;
    }
    
    /**
     * Sets the right child
     * 
     * @param rightChild the new right child
     */
    public void setRightChild(BTNode<T> rightChild) {
        this.right = rightChild;
    }
    
    /**
     * Sets the value
     * 
     * @param value the new value to be stored
     */
    public void setValue(T value) {
        this.value = value;        
    }
    
    /**
     * Gets the node's left child
     * 
     * @return the left child
     */
    public BTNode<T> getLeftChild() {
        return this.left;
    }
    
    /**
     * Gets the node's right child
     * 
     * @return the right child 
     */
    public BTNode<T> getRightChild() {
        return this.right;
    }
    
    /**
     * Retrieve the value stored at this node. 
     * 
     * @return the value stored at this node
     */
    public T getValue() {
        return this.value;
    }
    
    /**
     * Returns a string representation of the object
     * 
     * @return object as a string
     */
    public String toString() {
        return null;
    }
}
