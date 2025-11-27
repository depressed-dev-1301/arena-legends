public class Mage extends Character {
    private int spellPower; //Unique Field

    public Mage (String name) {
        super(name, 100); //Mage has lower base health
        this.spellPower = 35;
        calculateStats(); //Calls the unique implementation
    }

    //Concrete implementation of an abstract method
    //@Override
    public void attack(Character target) {
        int damage = spellPower * 2;
        System.out.println(getName() + " conjures a Fireball!");
        target.takeDamage(damage);
    }
    
    //Concrete implementation of another abstract method
    //@Override 
    public void useAbility() {
        System.out.println(getName() + " casts Heal!");
        //Logic to restore health
    }

    //Concrete implementation of a unique calculation
    //@Override
    protected void calculateStats() {
        //Mages might get bonus spell power based on intelligence
        this.spellPower += 10;
    }
}
