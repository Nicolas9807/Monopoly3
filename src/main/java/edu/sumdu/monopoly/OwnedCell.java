package edu.sumdu.monopoly;

public abstract class OwnedCell extends Cell{

    protected Player owner;

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }


}

