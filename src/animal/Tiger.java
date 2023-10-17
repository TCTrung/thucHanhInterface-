package src.animal;

import src.edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }
    public String howToEat() {
        return "Eat Pigs";
    }
}
