package common.generics;

import java.util.List;

public class Test2 {
    public Double sum(List<? extends Number> numList){
        Double result =  0.0;
        for (Number number : numList) {
            result += number.doubleValue();
        }
        return result;
    }
}
