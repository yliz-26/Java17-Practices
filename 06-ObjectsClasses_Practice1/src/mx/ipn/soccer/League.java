package mx.ipn.soccer;

/**
 *
 * @author Yareli
 * Practice 6-1: Creating Classes for the Soccer League
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
        
        //playerA.playerName = "Agustín Rayas";
        for (Player thePlayer: teamX.playerArray) {
            System.out.println(thePlayer.playerName);
        }
        
        Team teamY = new Team();
        teamY.teamName = "Los Cuadrados";
        teamY.playerArray = new Player[3];
        
        teamY.playerArray[0] = new Player();
        teamY.playerArray[0].playerName = "David Cuadro";
        teamY.playerArray[1] = new Player();
        teamY.playerArray[1].playerName = "Ernesto Cuadro";
        teamY.playerArray[2] = new Player();
        teamY.playerArray[2].playerName = "Felipe Cuadro";        
        
        for (Player thePlayer: teamY.playerArray) {
            System.out.println(thePlayer.playerName);
        }
        
    }
    
}
