public class Game {
    public static void main(String[] args) throws Exception {
        //We create concrete objects
        Warrior conan = new Warrior("Conan");
        Mage merlin = new Mage("Merlin");


        //This is the power of Abstraction and Polymorphism
        //We declare them as the abstract type 'Character'
        Character hero1 = conan;
        Character hero2 = merlin;

        System.out.println("\n--- Arena Legends ---");

        //When we call attack(), the specific implementation
        //(sword for Conan, fireball for Merlin) is executed.
        hero1.attack(hero2); //Conan attacks Merlin
        hero2.attack(hero1); //Merlin attacks Conan

        System.out.println("\n--- Ability Use ---");
        hero1.useAbility(); //Warrior ability (Rage State)
        hero2.useAbility(); //Mage ability (Heal)
    }
}
