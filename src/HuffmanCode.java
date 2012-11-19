import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Iterator;

 
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
        this.seed = initialString;
        this.codeTree = null;
        this.codeMap = new HashMap<Character, String>();
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
        HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();
        
        for(int i = 0; i < source.length(); i++) {
            
            if(!freqMap.containsKey(source.charAt(i))) {
                freqMap.put(source.charAt(i), new Integer(1));
            }
            
            else {
                int newFreqCount = freqMap.get(source.charAt(i)).intValue();
                freqMap.put(source.charAt(i), new Integer(newFreqCount + 1));
            }
        }
        
        return freqMap;
    }
    
    /**
     * Create a Priority Queue using data from a frequency map. 
     * 
     * @param fm the frequency map
     * 
     * @return a priority queue with values from the frequency map
     * 
     * // TO DO: Determine priortiy, and frequency
     */
    private PriorityQueue<HNode> createPriorityQueue(HashMap<Character, Integer> fm) {
        PriorityQueue<HNode> mapValues = new PriorityQueue<HNode>();
        Set<Character> fmKeys = fm.keySet();
        Iterator<Character> itr = fmKeys.iterator();
        Integer fmNext;
        Character itrNext;
       
        while(itr.hasNext()) {
            itrNext = itr.next();
            fmNext = fm.get(itrNext);
            mapValues.add(new HNode(itrNext, fmNext));
        }
        
        return mapValues;
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
