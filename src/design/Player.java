package design;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String userId;
	private String password;
	private String playerLevel;
	private int torpedoes;
	private String name; 
	private List<Ship> ships = new ArrayList<>();;
	private  int points;
	
	
	 public void addShip(Ship ship) throws Exception{
	        if(this.ships.size() < 6){
	            this.ships.add(this.ships.size(), ship);
	        }else {
	            throw new Exception("allowed: Only 6 Ships are allowed");
	        }
	    }
	public void removeShip() {
		System.out.println("remove ships");
		
	}
	public void throwTropedo() {
		
	}
	public void calculatePoints() {
		
	}
	public int getPoints() {
		return points;
	}
	public List<Ship> getShips() {
	        return this.ships;
	}
	public String getName() {
		return this.name;
	}
	

}
