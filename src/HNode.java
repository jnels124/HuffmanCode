
/**
 * A node of a Huffman Code Tree
 * 
 * @author (Jesse Nelson) 
 * @version (November 18, 2012 Widows 8 Java 1.7 U9)
 */
public class HNode extends BTNode<HuffmanData> implements Comparable{ 
    /**
     * Simple constructor - set all fields to null or 0
     */
    public HNode() {
        
    }
    
    /**
     * Constructor that sets the symbol only. 
     * 
     * @param symbol the symbol
     */
    public HNode(Character symbol) {
    }
    
    /**
     * Constructor that sets the symbol and frequency. 
     * 
     * @param symbol the symbol
     * @param frequency the frequency of occurence for the symbol
     */
    public HNode(Character symbol, double frequency) {
    }
    
    /**
     * Constructor that sets symbol, frequency, and code.  
     * 
     * @param symbol the symbol
     * @param frequency the frequency of occurence for the symbol
     * @param code the code for the symbol
     */
    public HNode(Character symbol, double frequency, String code) {
    }
    
    /**
     * Fully parameterized constructor.  
     * 
     * @param symbol the symbol
     * @param frequency the frequency of occurence for the symbol
     * @param code the code for the symbol
     * @param left link to the left child
     * @param right link to the right child
     */
    public HNode(Character symbol, double frequency, String code, HNode left, HNode right) {
    }
    
    /**
     * Comparison method considers frequency only. 
     * 
     * @param obj object to be compared with this 
     * 
     * @return a negative integer, zero, or a positive integer as this object is less than,
     *         equal to, or greater than the specified object. 
     */
    public int compareTo(Object obj) {
        return 0;
    }
    
    /**
     * Equals predicate considers the symbol and frequency only. 
     * 
     * @param o the object to check for equality 
     * 
     * @return true if both the symbol and the frequency agree; false otherwise
     */
    public boolean equals(Object o) {
        return false;
    }
    
    /**
     * Access the code. 
     * 
     * @return the code associated with the symbol
     */
    public String getCode() {
        return null;
    }
    
    /**
     * Access the frequency. 
     * 
     * @return the frequency of occurrence
     */
    public double getFrequency() {
        return 0.0;
    }
    
    /**
     * Access the left child. 
     * 
     * @return the left child of this node
     */
    public HNode getLeftChild() {
        return null;
    }
    
    /**
     * Access the right child. 
     * 
     * @return the right child of this node
     */
    public HNode getRightChild() {
        return null;
    }
    
    /**
     * Access the symbol
     * 
     * @return the symbol
     */
    public Character getSymbol() {
        return null;
    }
    
    /**
     * Define hashcode for HNode. 
     * <p>If two objects are equal according to the equals(Object) method, 
     * then calling the hashCode method on each of the two objects produces 
     * the same integer result.
     * 
     * @return a hash code value for this object
     */
    public int hashCode() {
        return 0;
    }
    
    /**
     * Modify the code
     * 
     * @param code the new code
     */
    public void setCode(String code) {
    }
    
    /**
     * Modify the frequency
     * 
     * @param code the new frequency
     */
    public void setFrequency(double frequency) {
    }
    
    /**
     * Modify the symbol
     * 
     * @param code the new frequency
     */
    public void setSymbol(Character symbol) {
    }
}
