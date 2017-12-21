package chapterThree.exercise1;

import java.util.Arrays;

public class Vector {

    private double[] elements;

    public Vector(int n) {
        elements = new double[n];
    }

    public void setElements(int index, double value) {
        elements[index] = value;
    }

    public double getElements(int index) {
        return elements[index];
    }

    public int getSize() {
        return elements.length;
    }

    public static Vector summVectors(Vector v1, Vector v2) {
        if (v1.elements.length != v2.elements.length) {
            return null;
        }
        Vector v3 = new Vector(v1.elements.length);
        for (int i = 0; i < v1.elements.length; i++) {
            v3.elements[i] = v1.elements[i] + v2.elements[i];
        }

        return v3;
    }

    public static Vector differenceVectors(Vector v1, Vector v2) {
        if (v1.elements.length != v2.elements.length) {
            return null;
        }
        Vector v3 = new Vector(v1.elements.length);
        for (int i = 0; i < v1.elements.length; i++) {
            v3.elements[i] = Math.abs(v1.elements[i] - v2.elements[i]);
        }
        return v3;
    }

    public static Vector multVectors(Vector v1, Vector v2) {
        if (v1.elements.length != v2.elements.length) {
            return null;
        }
        Vector v3 = new Vector(v1.elements.length);
        for (int i = 0; i < v1.elements.length; i++) {
            v3.elements[i] = v1.elements[i] * v2.elements[i];
        }
        return v3;
    }

    public static Vector increamentVector(Vector v1) {
        Vector v2 = new Vector(v1.elements.length);
        for (int i = 0; i < v1.elements.length; i++) {
            v2.elements[i] = v1.elements[i] + 1;
        }
        return v2;
    }

    public static Vector deacreamentVector(Vector v1) {
        Vector v2 = new Vector(v1.elements.length);
        for (int i = 0; i < v1.elements.length; i++) {
            v2.elements[i] = v1.elements[i] - 1;
        }
        return v2;
    }

    public static double findModuleVector(Vector v1) {
        double result = 0;
        for (int i = 0; i < v1.elements.length; i++) {
            result += v1.elements[i] * v1.elements[i];
        }
        return Math.sqrt(result);
    }

    public static double findCosBetweenVectors(Vector v1, Vector v2) {
        if (v1.elements.length != v2.elements.length) {
            return -1;
        }
        return findScalarMultVectors(v1, v2) / (findModuleVector(v1) * findModuleVector(v2));
    }

    public static double findScalarMultVectors(Vector v1, Vector v2) {
        if (v1.elements.length != v2.elements.length) {
            return -1;
        }
        double result = 0;
        for (int i = 0; i < v1.elements.length; i++) {
            result += v1.elements[i] * v2.elements[i];
        }
        return result;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
