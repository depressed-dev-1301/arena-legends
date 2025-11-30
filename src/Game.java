public class Game {
    public static void main(String[] args) throws Exception {
        //We create concrete objects
        Warrior conan = new Warrior("Conan");
        Mage merlin = new Mage("Merlin");

        //This is the power of Abstraction and Polymorphism
        //We declare them as the abstract type 'Character'
        // Character hero1 = conan;
        // Character hero2 = merlin;
        // Previous declaractions doesn't work for this update

        System.out.println("\n--- Arena Legends ---");

        //When we call attack(), the specific implementation
        //(sword for Conan, fireball for Merlin) is executed.
        System.out.println("\n--- Standard Attack ---");
        conan.attack(merlin); //Conan attacks Merlin
        merlin.attack(conan); //Merlin attacks Conan

        System.out.println("\n--- Overloaded Attack ---");
        conan.attack(merlin, "critical");
        merlin.attack(conan, "Burn");

        System.out.println("\n--- Ability Use ---");
        conan.useAbility(); //Warrior ability (Rage State)
        merlin.useAbility(); //Mage ability (Heal)
    }
}
