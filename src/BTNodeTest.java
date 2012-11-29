

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
    public BTNodeTest() {
    }
    
    /**
     * Test constructor and accessor methods.
     * 
     * 
     */
    @Test
    public void testConstructorAndAccessors() {
        BTNode<Integer> testNoParam = new BTNode<Integer>();
        assertNull("testConstructorAndAccessors:testNoParam: value should be null",
                    testNoParam.getValue());
        assertNull("testConstructorAndAccessors:testNoParam: left should be null",
                    testNoParam.getLeftChild());
        assertNull("testConstructorAndAccessors:testNoParam: right should be null",
                    testNoParam.getRightChild());
        
        BTNode<Integer> testAllParamNull = new BTNode<Integer>(null, null, null);
        assertNull("testConstructorAndAccessors:testAllParamNull: value should be null",
                    testAllParamNull.getValue());
        assertNull("testConstructorAndAccessors:testAllParamNull: left should be null",
                    testAllParamNull.getLeftChild());
        assertNull("testConstructorAndAccessors:testAllParamNull: right should be null",
                    testAllParamNull.getRightChild());
        
        BTNode<Integer> test001 = new BTNode<Integer>(null, null, new BTNode<Integer>(155));
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
                    
        BTNode<Integer> intTest2 = new BTNode<Integer>(5);
        assertNotNull("testConstructorAndAccessors:intTest2: value shouldn't be null", 
                       intTest2.getValue());
        assertEquals( "testConstructorAndAccessors:intTest2: value should be 5", 
                       new Integer(5), intTest2.getValue());   
        assertNull("testConstructorAndAccessors:intTest2: left should be null",
                    intTest2.getLeftChild());
        assertNull("testConstructorAndAccessors:intTest2: right should be null",
                    intTest2.getRightChild());     
                    
           
                    
        
    }
    
    @Test
    public void testEquals() {
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
