package com.example.ferggot.ezquiz;

public class Questions {

    public enum Answer {A, B, C};

    private final int id;
    private final String question;
    private final Answer answer;
    private final String optA;
    private final String optB;
    private final String optC;

    public Questions(int id, String question, String optA, String optB, String optC, Answer answer) {
        this.id = id;
        this.question = question;
        this.optA = optA;
        this.optB = optB;
        this.optC = optC;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getOptA() {
        return optA;
    }

    public String getOptB() {
        return optB;
    }

    public String getOptC() {
        return optC;
    }

    public Answer getAnswer() {
        return answer;
    }
}
