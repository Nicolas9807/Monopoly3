package edu.sumdu.monopoly;

public abstract class Cell {
	private boolean available = true;
	private String name;

	public int getPrice() {
		return 0;
	}

	public boolean isAvailable() {
		return available;
	}

	public abstract void playAction();

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String toString() {
		return getName();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	void setOwner(Player aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public Player getOwner() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
