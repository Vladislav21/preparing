package TestingOfMultithreading;

import common.InputData.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Computing {

    private static final ExecutorService executor = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        List<PointXY> listPoints = Arrays.asList(new PointXY(2, 4), new PointXY(6, 3), new PointXY(1, 9));
        List<Devider> listDevider = new ArrayList<>();
        List<Future<PointXY>> listFuture;
        for (PointXY Point : listPoints) {
            listDevider.add(new Devider(Point));
        }
        try {
            listFuture = executor.invokeAll(listDevider);
            if (!listFuture.isEmpty()) {
                for (Future<PointXY> pointXYFuture : listFuture) {
                    if (pointXYFuture.isDone()) {
                        System.out.println(pointXYFuture.get().toString());
                    }
                }
            } else {
                throw new NullPointerException();
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }

}
