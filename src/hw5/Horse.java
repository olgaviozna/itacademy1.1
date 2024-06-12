package hw5;

public class Horse extends Animal {
    protected String color;

    public Horse(String food, String location) {
        super(food, location);
    }

    public Horse(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("This horse is neighing and snorting");
    }

    @Override
    public void eat() {
        System.out.println("This horse is eating oats");
    }

    @Override
    public String toString() {
        return "Horse eats " + food + ", this horse is in " + location +
                ", this horse's color is " + color + '\n';
    }
}
