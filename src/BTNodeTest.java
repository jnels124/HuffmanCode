

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for BTNode.
 *
 * @author (Jesse Nelson) 
 * @version (November 18, 2012 Windows 8 (x64) Java 1.7 U9)
 */
public class BTNodeTest {
    BTNode<Integer> testNoParam;
    BTNode<Double> test0; // need to implement
    BTNode<Integer> test1;
    BTNode<Integer> test000;
    BTNode<Integer> test001;
    BTNode<String> test010;
    BTNode<String> test011;
    BTNode<String> test100;
    BTNode<Character> test101;
    BTNode<Character> test110;
    BTNode<Double> test111; // need to implement
    public BTNodeTest() {
    }
    
    @Before
    public void setUp() {
        testNoParam = new BTNode<Integer>();
        test0 = new BTNode<Double>(null);
        test1 = new BTNode<Integer>(5);
        test000 = new BTNode<Integer>(null, null, null);
        test001 = new BTNode<Integer>(null, null, new BTNode<Integer>(155));
        test010 = new BTNode<String>(null, new BTNode<String>("Jesse Nelson"), null);
        test011 = new BTNode<String>(null, new BTNode<String>("Left Child"),
                                     new BTNode<String>("Right Child"));
        test100 = new BTNode<String>("Test", null, null);
        test101 = new BTNode<Character>('c', null, new BTNode<Character>('a')); 
        test110 = new BTNode<Character>('1', new BTNode<Character>('!'), null);
        // Need to implement
        test111 = new BTNode<Double>(5.876333158, new BTNode<Double>(-5.4446544),
                                     new BTNode<Double>(65565.33356669455));
    }
    /**
     * Test constructor and accessor methods.
     */
    @Test
    public void testConstructorAndAccessors() {
        
        assertNull("testConstructorAndAccessors:testNoParam: value should be null",
                    testNoParam.getValue());
        assertNull("testConstructorAndAccessors:testNoParam: left should be null",
                    testNoParam.getLeftChild());
        assertNull("testConstructorAndAccessors:testNoParam: right should be null",
                    testNoParam.getRightChild());
                    
        assertNotNull("testConstructorAndAccessors:test1: value shouldn't be null", 
                       test1.getValue());
        assertEquals("testConstructorAndAccessors:test1: value should be 5", 
                       new Integer(5), test1.getValue());   
        assertNull("testConstructorAndAccessors:test1: left should be null",
                    test1.getLeftChild());
        assertNull("testConstructorAndAccessors:test1: right should be null",
                    test1.getRightChild());  
        
        assertNull("testConstructorAndAccessors:test000: value should be null",
                    test000.getValue());
        assertNull("testConstructorAndAccessors:test000: left should be null",
                    test000.getLeftChild());
        assertNull("testConstructorAndAccessors:test000: right should be null",
                    test000.getRightChild());
        
        assertNotNull("testConstructorAndAccessors:test001: right shouldn't be null", 
                       test001.getRightChild());
        assertNotNull("testConstructorAndAccessors:test001: right's value shouldn't be null", 
                       test001.getRightChild().getValue());
        assertEquals( "testConstructorAndAccessors:test001: right's value should be 155", 
                       new Integer(155), test001.getRightChild().getValue());           
        assertNull("testConstructorAndAccessors:test001: value should be null", 
                       test001.getValue());        
        assertNull("testConstructorAndAccessors:test001: left should be null",
                    test001.getLeftChild());  
        
        assertNotNull("testConstructorAndAccessors:test010: left shouldn't be null", 
                       test010.getLeftChild());
        assertNotNull("testConstructorAndAccessors:test010: left's value shouldn't be null", 
                       test010.getLeftChild().getValue());
        assertEquals( "testConstructorAndAccessors:test010: left's value should be Jesse Nelson", 
                       "Jesse Nelson", test010.getLeftChild().getValue());           
        assertNull("testConstructorAndAccessors:test010: value should be null", 
                       test010.getValue());        
        assertNull("testConstructorAndAccessors:test010: right should be null",
                    test010.getRightChild()); 
                    
        assertNotNull("testConstructorAndAccessors:test011: right shouldn't be null", 
                       test011.getRightChild());
        assertNotNull("testConstructorAndAccessors:test011: right's value shouldn't be null", 
                       test011.getRightChild().getValue());
        assertNotNull("testConstructorAndAccessors:test011: left shouldn't be null",
                       test011.getLeftChild());
        assertNotNull("testConstructorAndAccessors:test011: left's value shouldn't be null",
                       test011.getLeftChild().getValue());
        assertEquals("testConstructorAndAccessors:test011: right's value should be Right Child",
                      "Right Child", test011.getRightChild().getValue());
        assertEquals("testConstructorAndAccessors:test011: lefts's value should be Left Child",
                      "Left Child", test011.getLeftChild().getValue());
        assertNull("testConstructorAndAccessors:test001: value should be null", 
                     test011.getValue());  
         
        assertNotNull("testConstructorAndAccessors:test100: value shouldn't be null", 
                       test100.getValue());
        assertEquals("testConstructorAndAccessors:test100: value should be Test", 
                     "Test", test100.getValue());   
        assertNull("testConstructorAndAccessors:test100: left should be null",
                    test100.getLeftChild());
        assertNull("testConstructorAndAccessors:test100: right should be null",
                    test100.getRightChild());    
                 
        assertNotNull("testConstructorAndAccessors:test101: value shouldn't be null", 
                       test101.getValue());
        assertNotNull("testConstructorAndAccessors:test101: right shouldn't be null", 
                       test101.getRightChild());
        assertNotNull("testConstructorAndAccessors:test101: right's value shouldn't be null", 
                       test101.getRightChild().getValue());
        assertNull("testConstructorAndAccessors:test101: left should be null",
                    test101.getLeftChild());
        assertEquals("testConstructorAndAccessors:test101: value should be 'c'", 
                     new Character('c'), test101.getValue()); 
        assertEquals("testConstructorAndAccessors:test101: right's value should be 'a'", 
                     new Character('a'), test101.getRightChild().getValue());  
         
        assertNotNull("testConstructorAndAccessors:test110: value shouldn't be null", 
                       test110.getValue());
        assertEquals("testConstructorAndAccessors:test110: value should be '1'", 
                       new Character('1'), test110.getValue());
        assertNotNull("testConstructorAndAccessors:test110: left shouldn't be null",
                       test110.getLeftChild());
        assertNotNull("testConstructorAndAccessors:test110: left's value shouldn't be null",
                       test110.getLeftChild().getValue());
        assertEquals("testConstructorAndAccessors:test110: lefts's value should be '!'",
                      new Character('!'), test110.getLeftChild().getValue());
        assertNull("testConstructorAndAccessors:test110: right should be null",
                    test110.getRightChild());
    }
    
    @Test
    public void testEquals() {
        assertTrue(testNoParam.equals(testNoParam));     
        assertFalse(testNoParam.equals(null));
        assertFalse(testNoParam.equals(new BTNode<Character>('a')));
        assertFalse(new BTNode<String>(" ").equals(testNoParam));
        assertTrue(testNoParam.equals(new BTNode<Integer>(null))); // Caused additonal if statements
        assertFalse(testNoParam.equals(test1));
        assertTrue(new BTNode<String>(null).equals(testNoParam));
        
        assertFalse(test1.equals(testNoParam)); 
        
             
        
        
        
        
                
    }
    
    @Test
    public void testGetLeftChild() {
    }
    
    @Test
    public void testGetRightChild() {
        
    }
    
    @Test
    public void testGetValue() {
        
    }
    
    @Test
    public void testHashCode() {
        
    }
    
    /**
     * Test mutator methods.
     */
    @Test
    public void testMutators() {
        
    }
    
    @Test
    public void testSetLeftChild() {
        
    }
    
    @Test
    public void testSetRightChild() {
        
    }
    
    @Test
    public void testSetValue() {
        
    }
    
    /**
     * This test of toString() verifies that the value appears somewhere in the rendering.
     */
    @Test
    public void testToString() {
        
    }
    
}
