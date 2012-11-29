//TODO: Implement HashCode
/**
 * A node of a Huffman Code Tree
 * 
 * @author (Jesse Nelson) 
 * @version (November 18, 2012 Widows 8 Java 1.7 U9)
 */
public class HNode extends BTNode<HuffmanData> implements Comparable { 
    
    /**
     * Simple constructor - set all fields to null or 0
     */
    public HNode() {
        super(new HuffmanData());     
    }
    
    /**
     * Constructor that sets the symbol only. 
     * 
     * @param symbol the symbol
     */
    public HNode(Character symbol) {
        super(new HuffmanData(symbol));
    }
    
    /**
     * Constructor that sets the symbol and frequency. 
     * 
     * @param symbol the symbol
     * @param frequency the frequency of occurence for the symbol
     */
    public HNode(Character symbol, double frequency) {
        super(new HuffmanData(symbol, frequency));
    }
    
    /**
     * Constructor that sets symbol, frequency, and code.  
     * 
     * @param symbol the symbol
     * @param frequency the frequency of occurence for the symbol
     * @param code the code for the symbol
     */
    public HNode(Character symbol, double frequency, String code) {
        super(new HuffmanData(symbol, frequency, code));
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
        super(new HuffmanData(symbol, frequency, code), left, right);
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
        HNode that = (HNode) obj; //Check for null values and throw exception
   
        if (super.getValue().getFrequency() > that.getValue().getFrequency()) {
            return 1;
        }
        
        if(super.getValue().getFrequency() < that.getValue().getFrequency()) {
            return -1;
        }
        
        return 0; // Objects are equal
    }
    
    /**
     * Equals predicate considers the symbol and frequency only. 
     * 
     * @param o the object to check for equality 
     * 
     * @return true if both the symbol and the frequency agree; false otherwise
     */
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        
        if(o == null) {
            return false;
        }
        
        if(getClass() != o.getClass()) { // Does this check the type parameter?
            return false;
        }
        
        HNode that = (HNode) o;
        if(this.getValue().getSymbol() != null) {
            return this.getValue().getFrequency() == that.getValue().getFrequency()
                   && this.getValue().getSymbol().equals(that.getValue().getSymbol());
        }   
        
        return that.getValue().getSymbol() == null &&
               this.getValue().getFrequency() == that.getValue().getFrequency();
    }
    
    /**
     * Access the code. 
     * 
     * @return the code associated with the symbol
     */
    public String getCode() {
        return super.getValue().getCode();
    }
    
    /**
     * Access the frequency. 
     * 
     * @return the frequency of occurrence
     */
    public double getFrequency() {
        return super.getValue().getFrequency();
    }
    
    /**
     * Access the left child. 
     * 
     * @return the left child of this node
     */
    public HNode getLeftChild() {
        return (HNode)super.getLeftChild();
    }
    
    /**
     * Access the right child. 
     * 
     * @return the right child of this node
     */
    public HNode getRightChild() {
        return (HNode)super.getRightChild();
    }
    
    /**
     * Access the symbol
     * 
     * @return the symbol
     */
    public Character getSymbol() {
        return super.getValue().getSymbol();
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
        super.getValue().setCode(code);
    }
    
    /**
     * Modify the frequency
     * 
     * @param code the new frequency
     */
    public void setFrequency(double frequency) {
        super.getValue().setFrequency(frequency);
    }
    
    /**
     * Modify the symbol
     * 
     * @param code the new frequency
     */
    public void setSymbol(Character symbol) {
        super.getValue().setSymbol(symbol);
    }
}
