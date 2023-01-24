public class Main {
    public static void main(String[] args) {
        /*Human vasya = new Human("Вася", 51);
        vasya.walk(10);

        System.out.println("Имя " + vasya.name + " возраст " + vasya.age + " пол " + vasya.gender);

        Human petya = new Human("Петя", "f", 13);
        petya.walk(20);

        System.out.println("Имя " + petya.name + " возраст " + petya.age + " пол " + petya.gender);*/

        Duck krya = new Duck("Кря", 3, "Серая");
        Duck gulya = new Duck("Гуля", 5, "Серебристая");

        krya.fly();
        gulya.fly();
    }
}
