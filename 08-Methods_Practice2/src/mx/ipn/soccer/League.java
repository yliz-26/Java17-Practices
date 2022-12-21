package mx.ipn.soccer;
//import mx.ipn.utility.GameUtils;

/**
 *
 * @author Yareli
 * Practice 8-2: Creating Game Data Randomly
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Team[] teams = createTeams();
        Game[] theGames = createGames(teams);
        
        Game currGame = theGames[0];
        currGame.playGame();
        System.out.println(currGame.getDescription());   
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
