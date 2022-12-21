package mx.ipn.soccer;

/**
 *
 * @author Yareli
 * Practice 6-2: Creating a Soccer Game
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player playerA = new Player();
        playerA.playerName = "Antonio Rayas";
        
        Player playerB = new Player();
        playerB.playerName = "Benito Rayas";
        
        Player playerC = new Player();
        playerC.playerName = "Carlos Rayas";
        
        Player[] thePlayersR = { playerA, playerB, playerC };
        
        Team teamX = new Team();
        teamX.teamName = "Los Rayados";
        teamX.playerArray = thePlayersR;        
        
        Team teamY = new Team();
        teamY.teamName = "Los Cuadrados";
        teamY.playerArray = new Player[3];
        
        teamY.playerArray[0] = new Player();
        teamY.playerArray[0].playerName = "David Cuadro";
        teamY.playerArray[1] = new Player();
        teamY.playerArray[1].playerName = "Ernesto Cuadro";
        teamY.playerArray[2] = new Player();
        teamY.playerArray[2].playerName = "Felipe Cuadro";
        
        //CURRENT GAME     
        Game currGame = new Game();
        currGame.homeTeam = teamX;
        currGame.awayTeam = teamY;
        
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;       
        goal1.theTime = 55;
        
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;
        
        System.out.println("Goal scored after " +
        currGame.goals[0].theTime + " mins by " +
        currGame.goals[0].thePlayer.playerName + " of " +
        currGame.goals[0].theTeam.teamName);
                
    }
    
}
