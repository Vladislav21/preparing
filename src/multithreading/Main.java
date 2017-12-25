package multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Namelist namelist = new Namelist();
        namelist.add("first");
        class MyThread extends Thread{
            @Override
            public void run() {
                System.out.println(namelist.removeFirst());
            }
        }
        MyThread myThread = new MyThread();
        myThread.setName("one");
        myThread.start();
        new MyThread().start();
    }

    static class Namelist {
        List list = Collections.synchronizedList(new ArrayList<>());

        public synchronized void add(String name){

            list.add(name);
        }

        public synchronized String removeFirst(){
            if(list.size()>0){
                if(Thread.currentThread().getName().equals("one")){
                    Thread.yield();
                }
                return (String) list.remove(0);
            }
            return null;
        }
    }
}