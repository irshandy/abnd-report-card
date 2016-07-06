package com.example.android.reportcard;

/**
 * Created by IrvinShandy on 6/29/16.
 */
public class ReportCard {
    private String mStudentName;
    private String mMathGrade;
    private String mChemistryGrade;
    private String mPhysicsGrade;
    private String mBiologyGrade;
    private String mEnglishGrade;
    private String mHistoryGrade;

    public ReportCard(String studentName, String mathGrade, String chemistryGrade, String physicsGrade,
                      String biologyGrade, String englishGrade, String historyGrade) {
        mStudentName = studentName;
        mMathGrade = mathGrade;
        mChemistryGrade = chemistryGrade;
        mPhysicsGrade = physicsGrade;
        mBiologyGrade = biologyGrade;
        mEnglishGrade = englishGrade;
        mHistoryGrade = historyGrade;
    }

    @Override
    public String toString() {
        String reportString = "Name: " + mStudentName;
        reportString += "\nMath Grade: " + getMathGrade();
        reportString += "\nChemistry Grade: " + getChemistryGrade();
        reportString += "\nPhysics Grade: " + getPhysicsGrade();
        reportString += "\nBiology Grade: " + getBiologyGrade();
        reportString += "\nEnglish Grade: " + getEnglishGrade();
        reportString += "\nHistory Grade: " + getHistoryGrade();
        return reportString;
    }

    public String getMathGrade() {
        return mMathGrade;
    }

    public void setMathGrade(String grade) {
        mMathGrade = grade;
    }

    public String getChemistryGrade() {
        return mChemistryGrade;
    }

    public void setChemistryGrade(String grade) {
        mChemistryGrade = grade;
    }

    public String getPhysicsGrade() {
        return mPhysicsGrade;
    }

    public void setPhysicsGrade(String grade) {
        mPhysicsGrade = grade;
    }

    public String getBiologyGrade() {
        return mBiologyGrade;
    }

    public void setBiologyGrade(String grade) {
        mBiologyGrade = grade;
    }

    public String getEnglishGrade() {
        return mEnglishGrade;
    }

    public void setEnglishGrade(String grade) {
        mEnglishGrade = grade;
    }

    public String getHistoryGrade() {
        return mHistoryGrade;
    }

    public void setHistoryGrade(String grade) {
        mHistoryGrade = grade;
    }
}
