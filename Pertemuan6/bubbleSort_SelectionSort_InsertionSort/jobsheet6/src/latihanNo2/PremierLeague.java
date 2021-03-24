/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanNo2;

/**
 *
 * @author HP
 */
public class PremierLeague {
    public String team;
    public int play;
    public int goal;
    public int points;
    
PremierLeague(String t, int p, int g, int pt){
        team = t;
        play = p;
        goal = g;
        points = pt;
    }
 void tampilAll() {
        System.out.println("Team : "+team);
        System.out.println("Play : "+play);
        System.out.println("goal : "+goal);
        System.out.println("points : "+points);

   
    }
}

