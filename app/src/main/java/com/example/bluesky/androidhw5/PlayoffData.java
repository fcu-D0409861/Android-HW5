package com.example.bluesky.androidhw5;

/**
 * Created by bluesky on 2017/5/2.
 */

public class PlayoffData {

        int team1_score;
        int team2_score;
        int team1_id;    //image
        int team2_id;
        String team1;
        String team2;

        PlayoffData(int team1_score,int team2_score,int team1_id,int team2_id,String team1,String team2)
        {
            //分數 圖片id 隊名
            this.team1_score = team1_score ;  this.team2_score = team2_score ;
            this.team1_id = team1_id;         this.team2_id = team2_id;
            this.team1 = team1 ;      this.team2 = team2 ;
        }

        // set method
        void setTeam1_score(int team1_score)
        {
            this.team1_score = team1_score;
        }
        void setTeam2_score(int team2_score)
        {
            this.team2_score = team2_score;
        }
        void setTeam1_id(int team1_id){this.team1_id = team1_id;}
        void setTeam2_id(int team2_id){this.team2_id = team2_id;}
        void setTeam1team(String team1team)
        {
            this.team1 = team1;
        }
        void setTeam2team(String team2)
        {
            this.team2 = team2;
        }

        // get method
        int getTeam1_score()
        {
            return this.team1_score;
        }
        int getTeam2_score()
        {
            return  this.team2_score;
        }
        int getTeam1_id(){return this.team1_id;}
        int getTeam2_id(){return this.team2_id;}
        String getTeam1() {return  this.team1;}
        String getTeam2() {return this.team2;}
}

