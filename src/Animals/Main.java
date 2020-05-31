package Animals;

public class Main {

    public static void main(String[] args) {
        Animals cat = new Cat("кот", 200, 2);
        Animals dog1 = new Dog1("собака Бобик", 400, 0.5, 10);
        Animals dog2 = new Dog1("собака Шарик", 600, 0.5, 10);

        cat.name();
        cat.run();
        cat.jump();
        cat.swim();

        dog1.name();
        dog1.run();
        dog1.jump();
        dog1.swim();

        dog2.name();
        dog2.run();
        dog2.jump();
        dog2.swim();
    }
}
