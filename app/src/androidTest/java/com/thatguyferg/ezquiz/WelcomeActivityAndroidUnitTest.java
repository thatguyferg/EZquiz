package com.thatguyferg.ezquiz;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class WelcomeActivityAndroidUnitTest {

  @Rule
  public ActivityTestRule<WelcomeActivity> welcomeActivityTestRule
      = new ActivityTestRule<>(WelcomeActivity.class);

  @Test
  public void doesTextShowUp() {
    Espresso.onView(ViewMatchers.withId(R.id.welcomeTextView))
        .check(matches(isDisplayed()));
  }

  @Test
  public void pressingStartButtonGoesToQuizActivity() {
    Intents.init();

    onView(withId(R.id.start_button))
        .perform(click());

    intended(hasComponent(QuizActivity.class.getName()));

    Intents.release();
  }
}