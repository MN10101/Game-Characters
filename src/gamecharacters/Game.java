package gamecharacters;

interface Character {
    String useAbility();
}

class Warrior implements Character {
    @Override
    public String useAbility() {
        return "The Warrior executes a devastating melee attack!";
    }
}

class Mage implements Character {
    @Override
    public String useAbility() {
        return "The Mega conjures storm of ice and fros!t";
    }
}

class Archer implements Character {
    @Override
    public String useAbility() {
        return "The Archer unleashes a barrage of arrows with unmatched precision!";
    }
}

public class Game {
    public static void main(String[] args) {
       
        Character[] characters = {new Warrior(), new Mage(), new Archer()};
       
        for (Character chara : characters) {
            System.out.println(chara.useAbility());
        }
    }
}







