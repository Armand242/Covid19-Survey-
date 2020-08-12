package com.covid_19survey;

public class Survey {

    public String done[] = {
            "Enter age",
            "Where are you staying?",
            "Enter your healthy code color",


    };

    private String satisfaction[][] = {
            {"very dissatisfied, not satisfied,neutral,satisfied,very satisfied"},
    };

    private String getSurvey(int a){
        String survey = done[a];
        return survey;
    }

    public String getResult1(int a){
        String Result = satisfaction[a][0];
        return Result;
    }
    public String getResult2(int a){
        String Result = satisfaction[a][1];
        return Result;
    }
    public String getResult3(int a){
        String Result = satisfaction[a][2];
        return Result;
    }
    public String getResult4(int a){
        String Result = satisfaction[a][3];
        return Result;
    }
    public String getResult5(int a){
        String Result = satisfaction[a][4];
        return Result;
    }


}
