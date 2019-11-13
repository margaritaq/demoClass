public class MainClass {

    public static void main(String[] args) {

        Animal firstAnimal = new Animal();
        firstAnimal.setAge(2);
        firstAnimal.setName("Flaffy");
        System.out.println("Animal Name: " + firstAnimal.getName() + "   Age: " + firstAnimal.getAge());
        Animal secondAnimal = new Animal("Bob", 5);
        System.out.println("Pet name: " + secondAnimal.getName() + "  Age: " + secondAnimal.getAge());
    }
}