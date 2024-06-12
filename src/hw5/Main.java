package hw5;

public class Main {
    public static void main(String[] args) {
        Vet vet = new Vet();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Dog food","House yard","Husky");
        animals[1] = new Cat("Cat food","Apartment",18);
        animals[2] = new Horse("Oats","Stable","Black");

        for (Animal animal: animals) {
            vet.treatAnimal(animal);
        }

    }
}
