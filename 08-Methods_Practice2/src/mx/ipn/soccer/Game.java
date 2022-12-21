/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.ipn.soccer;

import mx.ipn.utility.GameUtils;

/**
 *
 * @author Yareli
 */
public class Game {
    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;
    
    public void playGame(){        
        int numberOfGoals = (int)(Math.random() * 7);               
        Goal[] theGoals = new Goal[numberOfGoals];
        //System.out.println(theGoals.length);
        System.out.println("Number of goals: " + numberOfGoals); 
        this.goals = theGoals;        
        GameUtils.addGameGoals(this);
    }
    
    public String getDescription(){
        StringBuilder returnString = new StringBuilder();
        for (Goal currGoal: this.goals) {
            returnString.append("Goal scored after " + 
            currGoal.theTime + " mins by " +
            currGoal.thePlayer.playerName +
            " of " + currGoal.theTeam.teamName +
            "\n");
        }
        return returnString.toString();
    }
    
}
