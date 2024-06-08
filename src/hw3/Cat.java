package hw3;

public class Cat {
    private char name;
    private int age;

    public Cat(char name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(char name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
