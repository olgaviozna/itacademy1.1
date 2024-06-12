package hw5;

public class Dog extends Animal {
    protected String breed;

    public Dog(String food, String location) {
        super(food, location);
    }

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("This dog is barking Woof!");
    }

    @Override
    public void eat() {
        System.out.println("This dog is eating bones");
    }

    @Override
    public String toString() {
        return "Dog eats " + food + ", this dog is in " + location +
                ", the breed is " + breed + '\n';
    }
}
