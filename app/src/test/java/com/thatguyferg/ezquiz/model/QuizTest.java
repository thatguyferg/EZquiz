package com.thatguyferg.ezquiz.model;

import com.google.gson.Gson;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * TODO:
 *  Read the documentation for all the methods and stuff (don't be a dummy)
 *  Learn about + use matchers to match questionList + test generated list -> will need to add package scope (default scope) constructor for question (object) to get list
 *  When launching emulated device ezQuiz is nowhere to be found (not sure why) <- ty studio bot
 *  Look into Flutter/Compose (or whatever the coolest UI framework is)
 */
public class QuizTest {

  @Test
  public void testGetTitle() throws FileNotFoundException {
    Gson gson = new Gson();
    InputStream in = new FileInputStream("/home/ferg/Android/Projects/EZQuiz/app/src/main/assets/test.json");
    Reader reader = new InputStreamReader(in);
    Quiz testQuiz = gson.fromJson(reader, Quiz.class);
    Assert.assertEquals("Nice Test Quiz", testQuiz.getTitle());
  }

  @Test
  public void testGetQuestionList() throws FileNotFoundException {
    Gson gson = new Gson();
    InputStream in = new FileInputStream("/home/ferg/Android/Projects/EZQuiz/app/src/main/assets/test.json");
    Reader reader = new InputStreamReader(in);
    Quiz testQuiz = gson.fromJson(reader, Quiz.class);
    Assert.assertEquals(3, testQuiz.getQuestionList().size());
  }


}