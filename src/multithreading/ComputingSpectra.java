package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ComputingSpectra {
    public static void main(String[] args) {
        List<Spectra> listSpectra = new ArrayList<>();

        Spectra spectra1 = new Spectra();
        Spectra spectra2 = new Spectra();
        Spectra spectra3 = new Spectra();

        spectra1.points.add(new Point(1, 1));
        spectra1.points.add(new Point(2, 2));
        spectra1.points.add(new Point(3, 3));
        spectra1.points.add(new Point(4, 5));
        spectra1.points.add(new Point(6, 8));
        spectra1.points.add(new Point(9, 11));

        spectra2.points.add(new Point(1, 1));
        spectra2.points.add(new Point(1, 4));
        spectra2.points.add(new Point(3, 3));
        spectra2.points.add(new Point(5, 2));
        spectra2.points.add(new Point(6, 8));
        spectra2.points.add(new Point(9, 11));

        spectra3.points.add(new Point(1, 1));
        spectra3.points.add(new Point(2, 2));
        spectra3.points.add(new Point(3, 3));
        spectra3.points.add(new Point(4, 5));
        spectra3.points.add(new Point(7, 15));
        spectra3.points.add(new Point(23, 15));

        listSpectra.add(spectra1);
        listSpectra.add(spectra2);
        listSpectra.add(spectra3);

        System.out.println("Primary list of spectra:" + "\n");
        System.out.println(listSpectra);

        MyCallableVlad calleble1 = new MyCallableVlad(spectra1);
        MyCallableVlad calleble2 = new MyCallableVlad(spectra2);
        MyCallableVlad calleble3 = new MyCallableVlad(spectra3);

        FutureTask<Spectra> futureTaskVlad1 = new FutureTask<Spectra>(calleble1);
        FutureTask<Spectra> futureTaskVlad2 = new FutureTask<Spectra>(calleble2);
        FutureTask<Spectra> futureTaskVlad3 = new FutureTask<Spectra>(calleble3);

        ExecutorService executorVlad = Executors.newFixedThreadPool(3);
        executorVlad.execute(futureTaskVlad1);
        executorVlad.execute(futureTaskVlad2);
        executorVlad.execute(futureTaskVlad3);

        try {
            System.out.println(futureTaskVlad1.get());
            System.out.println(futureTaskVlad2.get());
            System.out.println(futureTaskVlad3.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println(futureTaskVlad1.isDone());
        System.out.println(futureTaskVlad2.isDone());
        System.out.println(futureTaskVlad3.isDone());
        executorVlad.shutdown();

    }
}

class Summ {
    public Spectra incrementsPointsOn2(Spectra spectra) {
        Spectra newSpectra = new Spectra();
        int length = spectra.getPoints().size();
        int newX;
        int newY;
        Point newPoint;
        for (int i = 0; i < length; i++) {
            newX = spectra.getPoints().get(i).getX();
            newY = spectra.getPoints().get(i).getY();
            newPoint = new Point(newX + 2, newY + 2);
            newSpectra.getPoints().add(newPoint);
        }
        return newSpectra;
    }
}

class Spectra {
    List<Point> points;


    public Spectra() {
        points = new ArrayList<>();
    }

    public Spectra(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Spectra{" +
                "points=" + points +
                '}' + "\n";
    }


}

class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class MyCallableVlad implements Callable<Spectra> {


    Spectra spectra = new Spectra();
    Summ summ = new Summ();

    public MyCallableVlad(Spectra spectra) {
        this.spectra = spectra;
    }

    @Override
    public Spectra call() throws Exception {
        return summ.incrementsPointsOn2(spectra);
    }
}
