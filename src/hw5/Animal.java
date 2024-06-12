package hw5;

public class Animal {
    protected String food;
    protected String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("This animal is making noise");
    }

    public void eat() {
        System.out.println("This animal is eating");
    }

    public void sleep() {
        System.out.println("This animal is sleeping");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
