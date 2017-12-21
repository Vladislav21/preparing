package chapterThree.exercise1;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(4);
        Vector vector2 = new Vector(4);

        vector1.setElements(0, 2);
        vector1.setElements(1, 2.45);
        vector1.setElements(2, 4);
        vector1.setElements(3, 5.5);

        vector2.setElements(0, 1);
        vector2.setElements(1, 2);
        vector2.setElements(2, 3);
        vector2.setElements(3, 7);


        System.out.println("Первый вектор: " + vector1.toString() +" Его размерность: "+vector1.getSize());
        System.out.println("Второй вектор: " + vector2.toString()+ " Его размерность: "+vector2.getSize());
        System.out.println("Сложение: " + Vector.summVectors(vector1, vector2));
        System.out.println("Вычитание: " + Vector.differenceVectors(vector1,vector2));
        System.out.println("Инкремент первого вектора: "+Vector.increamentVector(vector1));
        System.out.println("Инкремент второго вектора: "+Vector.increamentVector(vector2));
        System.out.println("Декремент первого вектора: "+Vector.deacreamentVector(vector1));
        System.out.println("Декремент второго вектора: "+Vector.deacreamentVector(vector2));
        System.out.println("Угол между ветокрами: "+Vector.findCosBetweenVectors(vector1,vector2));
    }
}
