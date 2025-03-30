public class Test {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];
        Cat[] cats = new Cat[5];

        for (int i = 0; i < dogs.length; i++) {
            Dog dog = new Dog();
            dog.setName("dog");
            dog.setColor(new Color("#1C274C"));
            dog.setRace(DogRace.GERMAN_SHEPHERD);
            dog.setSize(5);
            dogs[i] = dog;
        }

        for (int i = 0; i < cats.length; i++) {
            Cat cat = new Cat();
            cat.setName("cat");
            cat.setRace(CatRace.PERSIAN);
            cat.setSize(2);
            cat.setColor(new Color("#1C274C"));
            cats[i] = cat;
        }

        for (Cat cat : cats) {
            System.out.println(cat);
        }

        for (Dog dog : dogs) {
            System.out.println(dog);
        }

    }
}
