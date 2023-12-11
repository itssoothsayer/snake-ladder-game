package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Board {
    private int size;
    private List<Snake> snakes;
    private List<Ladder> ladders;
    private List<Player> players;
    private HashMap<String, Integer> playerpieces;

    
    public Board(int size) {
        this.snakes = new ArrayList<Snake>();
        this.ladders = new ArrayList<Ladder>();
        this.players = new ArrayList<Player>();
        this.playerpieces = new HashMap<String, Integer>();
        this.setSize(size);
    }


    public int getSize() {
        return size;
    }


    public void setSize(int size) {
        this.size = size;
    }


    public HashMap<String, Integer> getPlayerpieces() {
        return playerpieces;
    }


    public void setPlayerpieces(HashMap<String, Integer> playerpieces) {
        this.playerpieces = playerpieces;
    }


    public List<Player> getPlayers() {
        return players;
    }


    public void setPlayers(List<Player> players) {
        this.players = players;
    }


    public List<Ladder> getLadders() {
        return ladders;
    }


    public void setLadders(List<Ladder> ladders) {
        this.ladders = ladders;
    }


    public List<Snake> getSnakes() {
        return snakes;
    }


    public void setSnakes(List<Snake> snakes) {
        this.snakes = snakes;
    }

}
