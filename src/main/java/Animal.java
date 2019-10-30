public class Animal {
    int age;
    String name;
    String color;
    double height;
    double weight;

    public Animal() {
    }

    public Animal(String name,int age ) {
        this.age = age;
        this.name = name;
    }
    public void run(){
        System.out.println("Animal can run!");
    }
    public void say(){
        System.out.println("Animal say ...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
