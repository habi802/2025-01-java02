package ch07.sec07.poly;

public class AnimalExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Cow cow = new Cow();
        Dog dog = new Dog();
        BullDog bulldog = new BullDog();

        animalCrying(cat);
        animalCrying(tiger);
        animalCrying(cow);
        animalCrying(dog);
        animalCrying(bulldog);
        // 불독은 월~ 월~
        // 불독은 쩜프! 쩜프!
    }

    public static void animalCrying(Animal animal) {
        animal.crying();
        // Dog 객체 넘어오면 jump 메소드 호출해주세요.
        if (animal instanceof Dog) {
            ((Dog) animal).jump();
        }
    }
}
