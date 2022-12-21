package mx.ipn.soccer;

/**
 *
 * @author Yareli
 * Practice 8-1: Using Methods
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Team[] teams = createTeams();
        Game[] theGames = createGames(teams);
        
        Game currGame = theGames[0];
        
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
    
    public static Team[] createTeams() {
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
        
        /*for (Player thePlayer: teamX.playerArray) {
            System.out.println(thePlayer.playerName);
        }*/                
        
        Team teamY = new Team();
        teamY.teamName = "Los Cuadrados";
        teamY.playerArray = new Player[3];
        
        teamY.playerArray[0] = new Player();
        teamY.playerArray[0].playerName = "David Cuadro";
        teamY.playerArray[1] = new Player();
        teamY.playerArray[1].playerName = "Ernesto Cuadro";
        teamY.playerArray[2] = new Player();
        teamY.playerArray[2].playerName = "Felipe Cuadro";
        
        Team[] theTeams = {teamX, teamY};
        return theTeams;
    }
    
    public static Game[] createGames(Team[] theTeams) {
        Game theGame = new Game();
        theGame.homeTeam = theTeams[0];
        theGame.awayTeam = theTeams[1];
        Game[] theGames = {theGame};
        return theGames;
    }
            
    
}
