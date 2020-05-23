package com.example.instrumentationtestdemo;


import androidx.test.rule.ActivityTestRule;

import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExampleInstrumentedTest {

    @ClassRule
    public static ActivityTestRule<MainActivity> mRule = new ActivityTestRule<>(MainActivity.class);
    private static MainActivity mMainActivity;

    @BeforeClass
    public static void setUp() {
        mMainActivity = mRule.getActivity();
    }

    @Test
    public void test1() {
        assertEquals(47, mMainActivity.add(2, 45));
    }

    @Test
    public void test2() {
        assertEquals(-43, mMainActivity.sub(2, 45));
    }

    @Test
    public void test3() {
        assertEquals(90, mMainActivity.multiply(2, 45));
    }

    @Test
    public void test4() {
        assertEquals(90, mMainActivity.multiply(2, 45));
    }
}
