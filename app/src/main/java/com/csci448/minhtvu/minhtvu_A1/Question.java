package com.csci448.minhtvu.minhtvu_A1;

public class Question {

    public enum Q_TYPE {TRUE_FALSE, MULTI, FREE};
    private int mTextResId;
    private boolean mTrueFalse;
    private int mAnswerTextResId;
    private int mAnswer;
    private Q_TYPE questionType;


    public Question(int textResId, boolean trueFalse, Q_TYPE type) {
        mTextResId = textResId;
        mTrueFalse = trueFalse;
        questionType = type;
    }
    public Question(int textResId, int answer, Q_TYPE type){
        mTextResId = textResId;
        mAnswerTextResId = answer;
        questionType = type;
    }
    public Question(int textResId, int answer, int ans, Q_TYPE type){
        mTextResId = textResId;
        mAnswerTextResId = answer;
        mAnswer = ans;
        questionType = type;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public Q_TYPE getQuestionType() {
        return questionType;
    }

    public boolean isTrueFalse(){
        return mTrueFalse;
    }
    public int getAnswerTextResId(){
        return mAnswerTextResId;
    }
    public int getAnswer(){
        return mAnswer;
    }

}
