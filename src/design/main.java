package design;

public class main {

	public static void main(String[] args) throws Exception {
		HumanPlayer human = new HumanPlayer();
		AIPlayer AI = new AIPlayer();
		
		human.addShip(new Submarine());
		human.addShip(new Frigate ());
		human.addShip(new Cruiser());
		human.addShip(new Destroyer());
		human.addShip(new AircraftCarrier());
		human.addShip(new PatrolBoat());

		
		System.out.println("Player " + human.getName()  + "'s ships :");
        for (Ship ship : human.getShips()) {
            System.out.println("Type -> " +  ship.getType() + ", Size -> " + ship.getSize());
        }
        
        
        
	}

}
