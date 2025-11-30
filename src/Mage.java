public class Mage extends Character {
    private int spellPower; //Unique Field

    public Mage (String name) {
        super(name, 100); //Mage has lower base health
        this.spellPower = 35;
        calculateStats(); //Calls the unique implementation
    }

    //Concrete implementation of an abstract method
    //1. Standard Attack (One parameter: target) - Overriding the abstract method
    @Override
    public void attack(Character target) {
        int damage = spellPower * 2;
        System.out.println(getName() + " conjures a standard bolt of magic.");
        target.takeDamage(damage);
    }
    
    //2. Overloaded Attack (Two parameters: target, condition) - New method
    public void attack(Character target, String condition) {
        int damage;
        String normalizedCondition = condition.toLowerCase();

        if (normalizedCondition.equals("burn")) {
            damage = spellPower * 3; //Extra damage for a special "Burn" spell
            System.out.println(getName() + " Unleashes a blazing Burn Spell!");
        } else if (normalizedCondition.equals("wet")) {
            //Mage's fire spells are less effective on wet targets
            damage = spellPower * 1;
            System.out.println(getName() + " Attacks a wet target, magic fizzles a bit.");
        } else {
            //Fallback to standard attack
            damage = spellPower * 2;
            System.out.println(getName() + " casts a spell!"); 
        }

        target.takeDamage(damage);
    }

    //future update
    //Concrete implementation of another abstract method
    //@Override 
    public void useAbility() {
        System.out.println(getName() + " casts Heal!");
        //Logic to restore health
    }

    //more uses in the future
    //Concrete implementation of a unique calculation
    //@Override
    protected void calculateStats() {
        //Mages might get bonus spell power based on intelligence
        this.spellPower += 10;
    }
}
