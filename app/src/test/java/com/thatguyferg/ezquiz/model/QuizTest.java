package com.thatguyferg.ezquiz.model;

import com.google.gson.Gson;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

/**
 * TODO:
 *  Read the documentation for all the methods and stuff (don't be a dummy)
 *  Learn about + use matchers to match questionList + test generated list -> will need to add package scope (default scope) constructor for question (object) to get list
 *  When launching emulated device ezQuiz is nowhere to be found (not sure why) <- ty studio bot
 *  Look into Flutter/Compose (or whatever the coolest UI framework is)
 */
public class QuizTest {

  @Test
  public void testGetTitle() throws IOException {
    Gson gson = new Gson();
    InputStream in = Files.newInputStream(Paths.get("/home/ferg/Android/Projects/EZQuiz/app/src/main/assets/test.json"));
    Reader reader = new InputStreamReader(in);
    Quiz testQuiz = gson.fromJson(reader, Quiz.class);
    Assert.assertEquals("Nice Test Quiz", testQuiz.getTitle());
  }

  @Test
  public void testGetQuestionList() throws IOException {
    Gson gson = new Gson();
    InputStream in = Files.newInputStream(Paths.get("/home/ferg/Android/Projects/EZQuiz/app/src/main/assets/test.json"));
    Reader reader = new InputStreamReader(in);
    Quiz testQuiz = gson.fromJson(reader, Quiz.class);
    Assert.assertEquals(3, testQuiz.getQuestionList().size());
  }

  @Test
  public void testGetQuestionText() throws IOException {
    Gson gson = new Gson();
    InputStream in = Files.newInputStream(Paths.get("/home/ferg/Android/Projects/EZQuiz/app/src/main/assets/test.json"));
    Reader reader = new InputStreamReader(in);
    Quiz testQuiz = gson.fromJson(reader, Quiz.class);
    Assert.assertEquals("how is this working?", testQuiz.getQuestionList().get(1).getPrompt());
  }

  @Test
  public void testGetOptions() throws IOException {
    Gson gson = new Gson();
    InputStream in = Files.newInputStream(Paths.get("/home/ferg/Android/Projects/EZQuiz/app/src/main/assets/test.json"));
    Reader reader = new InputStreamReader(in);
    Quiz testQuiz = gson.fromJson(reader, Quiz.class);
    Assert.assertEquals(Map.of(Question.Options.A, "nope", Question.Options.B, "always", Question.Options.C, "one day"), testQuiz.getQuestionList().get(0).getOptions());
  }
}