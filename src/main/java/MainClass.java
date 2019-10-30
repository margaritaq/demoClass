public class MainClass {
    public static void main(String[] args) {
Animal suny = new Animal();
suny.setAge(2);
suny.setName("Flafy");
        System.out.println("Animal Name: " + suny.getName() + " "+" Age: "+ suny.getAge());
        Animal bugi = new Animal("Bob",5);
        System.out.println("Pet name: " + bugi.getName() +" Age: "+ bugi.getAge());
    }
}
