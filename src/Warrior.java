public class Warrior extends Character{
    private int strength; //Unique field

    public Warrior(String name) {
        super(name, 150); //Warrior has higher base health
        this.strength = 20;
        calculateStats(); //Calls the unique implementation
    }

    //Concrete implementation of an abstract method
    //@Override
    public void attack(Character target) {
        int damage = strength * 2;
        System.out.println(getName() + " lunges with a sword!");
        target.takeDamage(damage);
    }

    //Concrete implementation of another abstract method
    //@Override 
    public void useAbility() {
        System.out.println(getName() + " shouts, entering a Rage State!");
        // Logic to increase damage for a few turns
    }

    //Concrete implementation of a unique calculation
    //@Override 
    protected void calculateStats() {
        //Warriors might get bonus health based on external factors
        this.maxHealth += 50;
        this.health = this.maxHealth;
    }
}
