package com.example.instrumentationtestdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowLooper;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(sdk=28)
public class RobolectricTest {

    @Test
    public void testFinishing() {
        MainActivity mainActivity = new MainActivity();
        assertFalse(mainActivity.isFinishing());
        mainActivity.finishGame();
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks();
        assertTrue(mainActivity.isFinishing());
    }
}
