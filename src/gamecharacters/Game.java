package gamecharacters;

// Define the Character interface with a method useAbility
interface Character {
    String useAbility();
}

// Create the Warrior class that implements the Character interface
class Warrior implements Character {
    @Override
    public String useAbility() {
        return "The Warrior executes a devastating melee attack!";
    }
}

// Create the Mage class that implements the Character interface
class Mage implements Character {
    @Override
    public String useAbility() {
        return "The Mage conjures a storm of ice and frost!";
    }
}

// Create the Archer class that implements the Character interface
class Archer implements Character {
    @Override
    public String useAbility() {
        return "The Archer unleashes a barrage of arrows with unmatched precision!";
    }
}
public class Game {
    public static void main(String[] args) {
        // Create an array of characters with different classes
        Character[] characters = {new Warrior(), new Mage(), new Archer()};
        
        // Loop through the array and display each character's ability
        for (Character character : characters) {
            System.out.println(character.useAbility());
        }
    }
}









