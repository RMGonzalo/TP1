package pvz.logic;

import java.util.Random;
import pvz.control.Level;

public class Game {

	public static final int NUM_ROWS = 4;
	public static final int NUM_COLS = 8;
	public static final int INITIAL_COINS = 50;

	private int cycles;
	private int coins;
	private Level level;
	private Random rand;
	private long seed;
	private boolean playerQuits;
	private ZombiesManager zombiesManager;
	// private SunflowerList sunflowerList;
	// private PeashooterList peashooterList;

	public Game(long seed, Level level) {
		this.seed = seed;
		this.level = level;
		this.cycles = 0;
		this.coins = INITIAL_COINS;
		this.playerQuits = false;
		this.rand = new Random(seed);
		this.zombiesManager = new ZombiesManager(this, level, this.rand);
	}

	public int getCycles() {
		return this.cycles;
	}

	public int getCoins() {
		return this.coins;
	}

	public int getRemainingZombies() {
		return this.zombiesManager.getRemainingZombies();
	}

	public void quit() {
		this.playerQuits = true;
	}

	public boolean playerQuits() {
		return this.playerQuits;
	}

	public boolean playerWins() {
		return false;
	}

	public boolean hasGameFinished() {
		return playerQuits() || playerWins();
	}

	public void update() {
		this.cycles++;
	}

	public boolean isPositionEmpty(int col, int row) {
		return true;
	}

	public String positionToString(int col, int row) {
		return "";
	}

}