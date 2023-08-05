public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        restoreHealth(healthPercentage);
        this.weapon = weapon;
    }

    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        if (healthPercentage > 100) {
            healthPercentage = 100;
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage <= 0) {
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of the game");
        }
    }
}
