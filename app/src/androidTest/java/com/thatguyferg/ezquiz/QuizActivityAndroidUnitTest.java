package com.thatguyferg.ezquiz;

import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.hamcrest.Matchers;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions.*;
import androidx.test.espresso.matcher.ViewMatchers.*;
import androidx.test.espresso.Espresso.*;
import androidx.test.espresso.intent.Intents;

import static androidx.test.espresso.matcher.ViewMatchers.isChecked;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class QuizActivityAndroidUnitTest {

    @Rule
    public ActivityTestRule<QuizActivity> quizActivityTestRule
            = new ActivityTestRule<>(QuizActivity.class);

    @Test
    public void isQuizDisplayed(){
        Espresso.onView(ViewMatchers.withId(R.id.questionText))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        Espresso.onView(ViewMatchers.withId(R.id.A))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        Espresso.onView(ViewMatchers.withId(R.id.B))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        Espresso.onView(ViewMatchers.withId(R.id.C))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        Espresso.onView(ViewMatchers.withId(R.id.nextButton))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }

    @Test
    public void onlyOneAnswerSelected(){
        Espresso.onView(ViewMatchers.withId(R.id.A))
                .perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.A))
                .check(ViewAssertions.matches(isChecked()));

        Espresso.onView(ViewMatchers.withId(R.id.B))
                .check(ViewAssertions.matches(ViewMatchers.isNotChecked()));

        Espresso.onView(ViewMatchers.withId(R.id.C))
                .check(ViewAssertions.matches(ViewMatchers.isNotChecked()));
    }

   /* @Test
    public void doesNextButtonGoNext(){
        Espresso.onView(ViewMatchers.withId(R.id.nextButton))
                .perform(ViewActions.click())
                .check(ViewMatchers.withId(R.id.questionText).)
    }*/
}
