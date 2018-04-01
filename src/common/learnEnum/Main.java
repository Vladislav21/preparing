package common.learnEnum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Person person = new Person();
        Person person1 = new Person();
        String name = "Tall";
        try{
            System.out.println(Growth.valueOf(name));
            System.out.println("Данный элемент перечисления существует");
        } catch (Exception e){
            System.err.println("Такого элемента перечисления Growth нет");
        }
        Thread.sleep(500);
        System.out.println(Arrays.toString(Growth.values()));
        Growth growth;
        growth = Growth.Low;
        System.out.println(growth.name() + " " + growth.ordinal() + " " + growth.toString());
        person.setName("Влад");
        person1.setName("Саша");
        person.setGrowth(Growth.Low);
        person1.setGrowth(Growth.Average);
        if (person.getGrowth().ordinal() > person1.getGrowth().ordinal()) {
            System.out.println(person.getName() + " выше " + person1.getName());
        } else {
            System.out.println(person1.getName() + " выше " + person.getName());
        }
    }
}
