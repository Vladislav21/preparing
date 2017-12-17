package common.CloneObject;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alexey", "Ivanov", 23);
        Person clone = new Person(person);
        System.out.println(person);
        System.out.println("Клон: ");
        System.out.println(clone);
        if (person.equals(clone)) {
            System.out.println("Объекты равны");
        } else {
            System.out.println("Объекты не равны");
        }
        if (person == clone) {
            System.out.println("Ссылки на объекты равны");
        } else {
            System.out.println("Ссылки на объекты не равны");
        }
        try {
            Person clone2 = person.clone();
            System.out.println(clone2);
            if (person.equals(clone2)) {
                System.out.println("Объекты равны");
            } else {
                System.out.println("Объекты не равны");
            }
            if (person == clone2) {
                System.out.println("Ссылки на объекты равны");
            } else {
                System.out.println("Ссылки на объекты не равны");
            }
        } catch (CloneNotSupportedException e) {
            System.err.println("Клонирование не удалось");
        }
    }
}
