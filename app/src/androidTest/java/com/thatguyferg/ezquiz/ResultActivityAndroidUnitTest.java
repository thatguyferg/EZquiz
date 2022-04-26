package com.thatguyferg.ezquiz;

import android.content.Intent;

import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import android.os.Bundle;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.espresso.Espresso;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ResultActivityAndroidUnitTest {



    @Rule
    public final ActivityTestRule<ResultActivity> resultActivityTestRule
            = new ActivityTestRule<>(ResultActivity.class, true, false);

    @Test
    public void isResultPageDisplayed(){
        Intent intent = new Intent();
        Bundle b = new Bundle();
        b.putInt("score", 2);
        b.putInt("numberQuestions", 2);
        intent.putExtras(b);

        resultActivityTestRule.launchActivity(intent);



        Espresso.onView(ViewMatchers.withId(R.id.resultHeader))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        Espresso.onView(ViewMatchers.withId(R.id.scoreText))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }

}
