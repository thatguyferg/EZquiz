package com.thatguyferg.ezquiz.model;

import com.google.gson.Gson;

import junit.framework.TestCase;

import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * TODO: Fix stinky kotlin error (it is ugly)
 *  Read the documentation for all the methods and stuff (don't be a dummy)
 *  Upgrade to most recent JUnit??? (maybe)
 *  Add assertThat for all assertions w/ static import
 *  Use hamcrest matchers (is, equals, etc)
 *  Learn about + use matchers to match questionList + test generated list -> will need to add package scope (default scope) constructor for question (object) to get list
 */
public class QuizTest extends TestCase {

  //TODO: Move json/fix path issues (how to load a file from the res using classpath file reader)
  public void testGetTitle() throws FileNotFoundException {
    Gson gson = new Gson();
    InputStream in = new FileInputStream("/home/ferg/Android/Projects/EZQuiz/app/src/main/assets/test.json");
    Reader reader = new InputStreamReader(in);
    Quiz testQuiz = gson.fromJson(reader, Quiz.class);
    Assert.assertEquals("Nice Test Quiz", testQuiz.getTitle());
  }

  public void testGetQuestionList() throws FileNotFoundException {
    Gson gson = new Gson();
    InputStream in = new FileInputStream("/home/ferg/Android/Projects/EZQuiz/app/src/main/assets/test.json");
    Reader reader = new InputStreamReader(in);
    Quiz testQuiz = gson.fromJson(reader, Quiz.class);
    Assert.assertEquals(3, testQuiz.getQuestionList().size());
  }
}