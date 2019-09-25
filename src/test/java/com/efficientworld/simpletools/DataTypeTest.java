package com.efficientworld.simpletools;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author bucketli 2019/9/23 5:01 PM
 * @since 1.1.3
 **/
public class DataTypeTest {

    @Test public void intAdd() {
        Integer i = Integer.MAX_VALUE;
        Integer j = 2;
        Object re0 = i + j;
        Object re = (long) i + j;
        long re2 = i + j;
        //        Assert.assertEquals("java.lang.Integer", re.getClass().getTypeName());
        Assert.assertEquals(Integer.MAX_VALUE, re0);
        Assert.assertEquals(Integer.MAX_VALUE, re2);
    }
}
