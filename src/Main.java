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

        System.out.println("Задача 4");
        age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем тебя с совершеннолетием!");
        }
        else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать...");
        }

        System.out.println("Задача 5");
        age1 = 16;
        if (age1 < 7) {
            System.out.println("Ребенок ходит в детсад скорее всего");
        }
        else if ((age1 >= 7) && (age1 < 18)) {
            System.out.println("Ребенок ходит в школу");
        }
        else if ((age1 >= 18) && (age1 < 24)) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        else if (age1 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        System.out.println("Задача 6");
        amountPeople = 32;
        if (amountPeople < capacitySit) {
            System.out.println("В вагоне еще осталось " + (capacitySit - amountPeople) + " сидячих мест и " + capacityStand + " стоячих");
        }
        else if ((amountPeople >= capacitySit) && (amountPeople < capacityTotal)) {
            System.out.println("В вагоне не осталось сидячих мест, но есть еще " + (capacityTotal - amountPeople) + " стоячих");
        }
        else if (amountPeople >= capacityTotal) {
            System.out.println("В вагоне не осталось больше мест");
        }

        System.out.println("Задача 7");
        age = 14;
        boolean goToGarden = age <= 2 && age < 7;
        boolean goToSchool = age >= 7 && age < 18;
        boolean goToUniversity = age >= 18 && age < 24;
        boolean goToWork = age >= 24;
        if (goToGarden) {
            System.out.println("Ребенок ходит в детсад");
        }
        else if (goToSchool) {
            System.out.println("Ребенок ходит в школу");
        }
        else if (goToUniversity) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        else if (goToWork) {
            System.out.println("Человек окончил университет и ему пора ходить на работу");
        }

        System.out.println("Задача 8");
        age = 14;
        boolean canNotRide = age < 5;
        boolean canRideWithAdult = age >= 5 && age < 14;
        boolean canRideAlone = age >= 14;
        if (canNotRide) {
            System.out.println("Ребенок не может кататься на аттракционе");
        }
        else if (canRideWithAdult) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        else if (canRideAlone) {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }
    }
    }
