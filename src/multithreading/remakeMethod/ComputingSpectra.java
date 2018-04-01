package multithreading.remakeMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

/**
 * @author Mikhel Alexander on 17.01.2018 email mikhelas@altarix.ru .
 */
public class ComputingSpectra {
    public static void main(String[] args) throws Exception {


        List<Spectra> resultListSpectra = new ArrayList<>();
        AddingAndActions addingAndActions = new AddingAndActions();

        List<Point> sp1 = Arrays.asList(new Point(1,2),new Point(2,4));
        List<Point> sp2 = Arrays.asList(new Point(4,2),new Point(5,4));
        List<Point> sp3 = Arrays.asList(new Point(2,2),new Point(6,4));
        List<Point> sp4 = Arrays.asList(new Point(1,1),new Point(1,4));

        List<Spectra> listSpectra = Arrays.asList(new Spectra(sp1),new Spectra(sp2),new Spectra(sp3),new Spectra(sp4));

        System.out.println("Primary list of spectra:" + "\n");
        for (int i = 0; i < listSpectra.size(); i++) {
            System.out.println(listSpectra.get(i));
        }
        resultListSpectra.addAll(addingAndActions.actionsForListSpectra(listSpectra))  ;
        System.out.println("Result list of spectra:" + "\n");
        for (int i = 0; i < resultListSpectra.size(); i++) {
            System.out.println(resultListSpectra.get(i));
        }
    }

    static class AddingAndActions {
        private final ExecutorService executorService = Executors.newFixedThreadPool(3);

/*        List<Spectra> addingPointsListSpectra(int numberOfSpectra, int numberOfPoint) {
            Spectra spectra;
            List<Spectra> listSpectra = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            int x;
            int y;
            Point point;
            for (int i = 0; i < numberOfSpectra; i++) {
                System.out.println("Creating of spectra number " + (i + 1));
                spectra = new Spectra();
                for (int j = 0; j < numberOfPoint; j++) {
                    System.out.println("Write values of point:");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    point = new Point(x, y);
                    spectra.points.add(point);
                }
                listSpectra.add(spectra);
            }
            scanner.close();
            return listSpectra;
        }*/

        List<Spectra> actionsForListSpectra(List<Spectra> listSpectra) {
            List<Spectra> resultList = new ArrayList<>();
            List<CallableSpectra> callableSpectras = new ArrayList<>();
            List<Future<Spectra>> futureList;
            for (Spectra spectra : listSpectra) {
                callableSpectras.add(new CallableSpectra(spectra));
            }
            try {
                futureList = executorService.invokeAll(callableSpectras);
                for (Future<Spectra> fur : futureList){
                    if(fur.isDone())
                        resultList.add(fur.get());
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            executorService.shutdown();
            return resultList;
        }
    }

    static class IncrementSpectra {
        Spectra incrementsPointsOn2(Spectra spectra) {
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

    static class Spectra {
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

    static class Point {
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

    static class CallableSpectra implements Callable<Spectra> {

        Spectra spectra;
        IncrementSpectra incrementSpectra = new IncrementSpectra();

        public CallableSpectra(Spectra spectra) {
            this.spectra = spectra;
        }

        @Override
        public Spectra call() throws Exception {
            return incrementSpectra.incrementsPointsOn2(spectra);
        }
    }
}

