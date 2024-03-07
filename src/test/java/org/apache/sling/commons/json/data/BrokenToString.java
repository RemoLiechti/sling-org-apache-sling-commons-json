package org.apache.sling.commons.json.data;

/**
 * test class for verifying write errors.
 * 
 * @author John Aylward
 *
 */
public class BrokenToString {
    @Override
    public String toString() {
        throw new IllegalStateException("Something went horribly wrong!");
    }
}