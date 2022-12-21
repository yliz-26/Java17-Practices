package mx.ipn.utility;

import mx.ipn.soccer.Game;
import mx.ipn.soccer.Goal;
import mx.ipn.soccer.Player;
import mx.ipn.soccer.Team;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yareli
 */
public class GameUtils {
    
    public static void addGameGoals(Game currentGame){
        var lastGoal = 0;
        for (int i = 0; i < currentGame.goals.length; i++) {
            currentGame.goals[i] = new Goal ();             
            currentGame.goals[i].thePlayer = new Player();
            currentGame.goals[i].theTeam = new Team();
            var team = (int)(Math.random() * 2);            
            if (team == 0) {
                currentGame.goals[i].theTeam.teamName = currentGame.awayTeam.teamName;
                currentGame.goals[i].thePlayer.playerName = currentGame.awayTeam.playerArray[(int)(Math.random() * 3)].playerName;                
            }
            else {
                currentGame.goals[i].theTeam.teamName = currentGame.homeTeam.teamName;
                currentGame.goals[i].thePlayer.playerName = currentGame.homeTeam.playerArray[(int)(Math.random() * 3)].playerName;
            }
            //currentGame.goals[i].theTime = (int)(Math.random() * 91);
            //lastGoal = (int) (Math.floor(Math.random()*(91-lastGoal)) + lastGoal);
            lastGoal = (int)(Math.random()*(91-lastGoal)) + lastGoal;

            currentGame.goals[i].theTime = lastGoal;
        }
        
    }
    
}
