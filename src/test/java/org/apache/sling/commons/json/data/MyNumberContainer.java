package org.apache.sling.commons.json.data;

/**
 * Class that holds our MyNumber override as a property.
 * 
 * @author John Aylward
 */
public class MyNumberContainer {
    private MyNumber myNumber = new MyNumber();

    /**
     * @return a MyNumber.
     */
    public Number getMyNumber() {
        return this.myNumber;
    }
}
