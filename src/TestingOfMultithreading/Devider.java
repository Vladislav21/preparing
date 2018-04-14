package TestingOfMultithreading;

import java.util.concurrent.Callable;

public class Devider implements Callable<PointXY> {
    private PointXY pointXY;

    public Devider(PointXY pointXY) {
        this.pointXY = pointXY;
    }

    @Override
    public PointXY call() throws Exception {
        pointXY.setX(pointXY.getX() + 2);
        pointXY.setY(pointXY.getY() + 5);
        return pointXY;
    }
}
