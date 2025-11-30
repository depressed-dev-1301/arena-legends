public class Warrior extends Character{
    private int strength; //Unique field

    public Warrior(String name) {
        super(name, 150); //Warrior has higher base health
        this.strength = 20;
        calculateStats(); //Calls the unique implementation
    }

    //1. Standard Attack (One parameter: target) - Overriding the abstract  method
    //Concrete implementation of an abstract method
    @Override
    public void attack(Character target) {
        int damage = strength * 2;
        System.out.println(getName() + " lunges with a standard swing.");
        target.takeDamage(damage);
    }

    //2. Overloaded Attack (Two parameters: target, condition) - New Method
    public void attack(Character target, String condition) {
        int damage;
        String normalizedCondition = condition.toLowerCase();

        switch (normalizedCondition) {
            case "critical":
                damage = (strength * 2) * 2; //Double the damage
                System.out.println(getName() + " delivers a CRITICAL STRIKE!");
                break;
            case "shielded":
                damage = (strength * 2) / 2; //Half damage against a shielded foe
                System.out.println(getName() + "cautiously attacks a shielded foe.");
                break;
            default:
                //Fallback to standard attack damage
                damage = strength * 2;
                System.out.println(getName() + " performs a heavy strike!");
                break;
        }

        target.takeDamage(damage);
    }

    //future update
    //Concrete implementation of another abstract method
    //@Override 
    public void useAbility() {
        System.out.println(getName() + " shouts, entering a Rage State!");
        // Logic to increase damage for a few turns
    }
    
    //more uses in the future
    //Concrete implementation of a unique calculation
    //@Override 
    protected void calculateStats() {
        //Warriors might get bonus health based on external factors
        this.maxHealth += 50;
        this.health = this.maxHealth;
    }
}
