package com.cat.ev101;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@Config(sdk = 18, constants = BuildConfig.class)
@RunWith(RobolectricTestRunner.class)

public class UserTest {

    @Test
    public void UserNameTest() {
        User u = new User();

        u.setName("foo");

        Assert.assertEquals("foo", u.getName());
    }

//    @Test
//    public void failingTest() {
//        Assert.assertFalse(true);
//    }

}
