public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bow bow...");
    }

    @Override
    public void makeSound(Dog dog) {
        System.out.println("Dog interacting with a dog...");
    }

    @Override
    public void makeSound(Cat cat) {
        System.out.println("Dog intercating with a cat");
    }

    @Override
    public void makeSound(Animal cat) {
        System.out.println("Dog interacting with an Animal");
    }
}
