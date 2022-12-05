public class Main {
    public static void main(String[] args) {
        int age = 10;
        System.out.println("Задача 1");
        if (age >= 18) {
            System.out.println("Поздравляем тебя с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать...");
        }

        System.out.println("Задача 2");
        int age1 = 33;
        if (age1 < 7) {
            System.out.println("Ребенок ходит в детсад скорее всего");
        }
        if ((age1 >= 7) && (age1 < 18)) {
            System.out.println("Ребенок ходит в школу");
        }
        if ((age1 >= 18) && (age1 < 24)) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age1 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        System.out.println("Задача 3");
        int capacityTotal = 102;
        int capacitySit = 60;
        int capacityStand = 42;
        int amountPeople = 78;
        if (amountPeople < capacitySit) {
            System.out.println("В вагоне еще осталось " + (capacitySit - amountPeople) + " сидячих мест и " + capacityStand + " стоячих");
        }
        if ((amountPeople >= capacitySit) && (amountPeople < capacityTotal)) {
            System.out.println("В вагоне не осталось сидячих мест, но есть еще " + (capacityTotal - amountPeople) + " стоячих");
        }
        if (amountPeople >= capacityTotal) {
            System.out.println("В вагоне не осталось больше мест");
        }
    }
    }
