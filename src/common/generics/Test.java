package common.generics;

import java.util.List;

public class Test {
    public <T> void compute(List<T> list){
      if (list.get(0) instanceof String){
          for (T element : list) {
              String replace = ((String) element).replace("а", "б");
              System.out.println(replace);
          }
      }
      if (list.get(0) instanceof Integer){
          for (T t : list) {
              int i = ((Integer) t) + 2;
              System.out.println(i);
          }
      }
    }
}
