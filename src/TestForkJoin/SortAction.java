package TestForkJoin;

import java.util.concurrent.RecursiveAction;

public class SortAction extends RecursiveAction {
    private int[] elements;
    private int begin;
    private int end;
    private static int threashold = 16;

    public SortAction(int[] elements, int begin, int end) {
        this.elements = elements;
        this.begin = begin;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (end - begin < threashold) {
            computeDirectly();
            return;
        }
        int midpoint = (end - begin) / 2;
        invokeAll(new SortAction(elements, begin, begin + midpoint),
                new SortAction(elements, begin + midpoint + 1, end));
    }

    private void computeDirectly() {
        for (int i = end - 1; i > begin; i--) {
            for (int j = begin; j < i; j++) {
                if (elements[j] > elements[j + 1]) {
                    int tmp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = tmp;
                }
            }

        }
    }
}
