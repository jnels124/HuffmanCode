import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

 
/**
 * Driver to create Huffman codes and encoded strings. 
 * 
 * @author (Jesse Nelson) 
 * @version (November 18, 2012 Widows 8 Java 1.7 U9)
 */
public class HuffmanCode {
    /**
     * The Huffman code map created from the seed.
     */
    private HashMap<Character, String> codeMap;
    
    /**
     * Root of the Huffman code tree created from the seed. 
     */
    private HNode codeTree;
    
    /**
     * The seed string used to create the Huffman code. 
     */
    private String seed;
    
    /**
     * Establish this Huffman code based on an initial string. 
     * 
     * @param initialString the initial string used to create the code
     */
    public HuffmanCode(String initialString) {
    }
    
    /**
     * Decode a string using this Huffman code. 
     * 
     * @param encoded the string to decode
     * 
     * @return the decoded string
     */
    public String decode(String encoded) {
        return null;
    }
    
    /**
     * Encode a string using this Huffman code. 
     * 
     * @param clearText the string to encode
     * 
     * @return the encoded string
     */
    public String encode(String clearText) {
        return null;
    }
    
    /**
     * Retrieve the internal Huffman Code Map. 
     * 
     * @return the code map for this huffman code
     */
    public Map<Character, String> getCodeMap() {
        return this.codeMap;
    }
    
    /**
     * Retrieve the internal Huffman Code Tree 
     * 
     * @return the root of the code tree for this HuffmanCode
     */
    public HNode getCodeTree() {
        return this.codeTree;
    }
    
    /**
     * Create a map of character -> frequency based on a string. 
     * 
     * @param source the string of characters
     * 
     * @return hash map of characters and their frequency in the source
     */
    private HashMap<Character, Integer> createFrequencyMap(String source) {
        return null;
    }
    
    /**
     * Create a Priority Queue using data from a frequency map. 
     * 
     * @param fm the frequency map
     * 
     * @return a priority queue with values from the frequency map
     */
    private PriorityQueue<HNode> createPriorityQueue(HashMap<Character, Integer> fm) {
        return null;
    }
    
    /**
     * Establish the codeTree using the PriorityQueue provided. 
     * 
     * @param hh the priority queue with data for the Huffman Code
     */
    private void createCodeTree(PriorityQueue<HNode> hh) {
    }
    
    /**
     * Create codeMap from a code tree. 
     * 
     * @param root the root of a Huffman Code subtree
     */
    private void growCodeMap(HNode root) {
    }
    
    /**
     * Fill in the Huffman Codes in a tree.
     * 
     * @param root the root of the Huffman Code subtree
     * @param code the code to set at the root 
     */
    private void setCodes(HNode root, String code) {
    }
}
