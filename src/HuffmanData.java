//ToDo: Implement HashCode
/**
 * Data for Huffman code tree nodes. 
 * 
 * @author (Jesse Nelson) 
 * @version (November 18, 2012 Widows 8 Java 1.7 U9)
 */
public class HuffmanData {
    /**
     * The Huffman code for this node; null if none.
     */
    private String code;
    
    /**
     * Maximum difference to accept two double values as equal.
     */
    private static final double EPSILON = 0.0000005;
    
    /**
     * The frequency stored at this node.
     */
    private double frq;
    
    /**
     * The symbol stored at this node; null if none.
     */
    private Character sym;
    
    /**
     * Simple constructor - set all fields to null or 0.
     */
    public HuffmanData() {
        this.code = null;
        this.frq = 0;
        this.sym = 0;
    }
    
    /**
     * Constructor that sets the symbol only.
     * 
     * @param symbol the symbol
     */
    public HuffmanData(Character symbol) {
        this.code = null;
        this.frq = 0;
        this.sym = symbol;
    } 
    
    /**
     * Constructor that sets the symbol and frequency.
     * 
     * @param symbol the symbol
     * @param frequency the frequency of occurence for the symbol
     */
    public HuffmanData(Character symbol, double frequency) {
        this.code = null; // use previous constuructor to set up
        this.frq = frequency;
        this.sym = symbol;
    } 
    
    /**
     * Constructor that sets symbol, frequency, and code.
     * 
     * @param symbol the symbol
     * @param frequency the frequency of occurence for the symbol
     * @param code the code for the symbol
     */
    public HuffmanData(Character symbol, double frequency, String code) {
        this.code = code;
        this.frq = frequency;
        this.sym = symbol;
    }
    
    /**
     * Comparison method considers frequency only. 
     * 
     * @param object to be compared with this 
     * 
     * @return a negative integer, zero, or a positive integer as this object is less than, 
     *         equal to, or greater than the specified object.
     */
    public int compareTo(HuffmanData n) {
        if(this.frq < n.frq) {
            return -1;
        }
        
        if(this.frq > n.frq) {
            return 1;
        }
        
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
        if(this == o) {
            return true;
        }
        
        if(o == null) {
            return false;
        }
        
        if(getClass() != o.getClass()) {
            return false; 
        }
        
        // Object is a non-null HuffmanData
        HuffmanData that = (HuffmanData)o;
        
        //Verify symbol and frequency are equal
        return this.frq == that.frq &&
               this.sym == that.sym; 
    }
    
    /**
     * Access the code.
     * 
     * @return the code associated with the symbol
     */
    public String getCode() {
        return this.code;
    }
    
    /**
     * Access the frequency 
     * 
     * @return the frequency of occurrence
     */
    public double getFrequency() {
        return this.frq;
    }
    
    /**
     * Access the symbol. 
     * 
     * @return the symbol. 
     */
    public Character getSymbol() {
        return this.sym;
    }
    
    /**
     * Define hashcode for HuffmanData
     * 
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
     * Modify the code. 
     * 
     * @param code the new code 
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * Modify the frequency. 
     * 
     * @param frequency the new frequency
     */
    public void setFrequency(double frequency) {
        this.frq = frequency;
    }
    
    /**
     * Modify the symbol
     * 
     * @param symbol the new symbol
     */
    public void setSymbol(Character symbol) {
        this.sym = symbol;        
    }
    
    /**
     * String representation of this object.
     * <p>Format: <HD: char, frequency, code>
     * 
     * @return string representation
     */
    public String toString() {
        return "<HD: " + this.sym + ", " + this.frq + ", " + this.code + ">";
    }
}
