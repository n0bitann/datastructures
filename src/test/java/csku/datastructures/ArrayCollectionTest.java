package csku.datastructures;

import csku.datastrucrures.ArrayCollection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayCollectionTest {

    @Test
    public void isSizezero(){
        ArrayCollection arrayCollection = new ArrayCollection();
        assertEquals(0,arrayCollection.size());
    }
}
