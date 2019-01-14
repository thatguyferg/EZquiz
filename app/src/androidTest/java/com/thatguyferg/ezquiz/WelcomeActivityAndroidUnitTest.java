package com.thatguyferg.ezquiz;

import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class WelcomeActivityAndroidUnitTest {

    @Rule
    public ActivityTestRule<WelcomeActivity> welcomeActivityActivityTestRule
            = new ActivityTestRule<>(WelcomeActivity.class);


}
