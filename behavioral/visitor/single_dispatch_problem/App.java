public class App {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.makeSound();
        dog.makeSound();
     //   cat.makeSound(dog);
     //   dog.makeSound(cat);
      //  cat.makeSound(cat);
      //  dog.makeSound(dog);

        cat.makeSound(cat);  // possible because of makeSound(Animal) , as double dispatch not supported
    }
}
