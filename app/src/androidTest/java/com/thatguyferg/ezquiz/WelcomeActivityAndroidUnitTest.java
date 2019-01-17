package com.thatguyferg.ezquiz;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions.*;
import androidx.test.espresso.matcher.ViewMatchers.*;
import androidx.test.espresso.Espresso.*;

import static androidx.test.espresso.Espresso.onView;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class WelcomeActivityAndroidUnitTest {


    @Rule
    public ActivityTestRule<WelcomeActivity> welcomeActivityActivityTestRule
            = new ActivityTestRule<>(WelcomeActivity.class);

   /* @Test
    public void doesTextShowUp(){
        onView(android.R.id.)
    }*/
}

/*TODO
1. More tests (use static imports from Espresso for now)
1b. Get .gitignore set up properly to avoid silly incompatibilities
2. Look into fixing import situation
3. Fix app to work with rotations/other variables
4. Add new tests if applicable
 */
