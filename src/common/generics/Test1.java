package common.generics;

public class Test1<T> {
    private T param;

    public Test1(T param) {
        this.param = param;
    }

    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }
}
