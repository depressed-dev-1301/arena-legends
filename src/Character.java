public abstract class Character {
    //1. Common Fields (shared by all characters)
    private String name;
    protected int health;
    protected int maxHealth;

    //Constructor
    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }
    
    //2. Common Implemented Method (Used by all characters)
    public void takeDamage(int damage) {
    this.health -= damage;
    if (this.health < 0) {
        this.health = 0;
        }
        System.out.println(this.name + " took " + damage + " damage. Health remaining: " + this.health);
    }

    //3. Abstract Methods (The contract: Subclasses MUST implement these)
    public abstract void attack(Character target);

    public abstract void useAbility();

    //Abstract method to force subclasses to define their unique stats/logic
    protected abstract void calculateStats();

    //Getter for health (Example of a method that is not abstract)
    public int getHealth() {
        return health;
    }

    //Getter for name
    public String getName() {
        return name;
    }
}


