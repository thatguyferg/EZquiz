package com.thatguyferg.ezquiz;

import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.intent.Intents;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class WelcomeActivityAndroidUnitTest {

    @Rule
    public ActivityTestRule<WelcomeActivity> welcomeActivityTestRule
            = new ActivityTestRule<>(WelcomeActivity.class);

    @Test
    public void doesTextShowUp(){
        Espresso.onView(ViewMatchers.withId(R.id.welcomeTextView))
                .check(matches(isDisplayed()));
    }

    @Test
    public void pressingStartButtonGoesToQuizActivity(){
        Intents.init();

        onView(withId(R.id.start_button))
                .perform(click());

        intended(hasComponent(QuizActivity.class.getName()));

        Intents.release();
    }
}

/*TODO
1. More tests (use static imports from Espresso for now)
1b. Get .gitignore set up properly to avoid silly incompatibilities
2. Look into fixing import situation
3. Fix app to work with rotations/other variables
4. Add new tests if applicable
 */
