package design;

public class HumanPlayer extends Player {
	
	
	   HumanPlayer() {
	        
	    }
	
	public void signup() {}
	public void login() {}
	public void startNewGame() {}
	public void exitGame() {}
	
	public void arrangeShips() throws Exception{
        Ship ship1 = new Submarine();        
        Ship ship2 = new Frigate();        
        Ship ship3 = new Destroyer();
        Ship ship4 = new Cruiser();
        Ship ship5 = new AircraftCarrier();
        Ship ship6 = new PatrolBoat();

        this.addShip(ship1);      
        this.addShip(ship2);
        this.addShip(ship3);
        this.addShip(ship4);
        this.addShip(ship5);
        this.addShip(ship6);
    }
	
	}
	  
    


