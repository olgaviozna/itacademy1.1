package hw5;

public class Cat extends Animal {
    protected int hoursOfSleep;

    public Cat(String food, String location) {
        super(food, location);
    }

    public Cat(String food, String location, int hoursOfSleep) {
        super(food, location);
        this.hoursOfSleep = hoursOfSleep;
    }

    @Override
    public void makeNoise() {
        System.out.println("This cat is meowing Meow!");
    }

    @Override
    public void eat() {
        System.out.println("This cat is eating meat");
    }

    @Override
    public String toString() {
        return "Cat eats " + food + ", this cat is in " + location +
                ", hours of cat's sleep is " + hoursOfSleep +
                '\n';
    }
}
