package br.java.intermediario.enums.threads;

public class ThreadOne extends Thread{
    private final String name;
    private final int time;

    public ThreadOne(String name, int time){
        this.name = name;
        this.time = time;
        start();
    }

    public void run(){

        String[] himym = {"Ted", "Marshall", "Barney", "Tracy", "Lily", "Robin"};
            try {
                for (String person : himym ) {
                    System.out.println("Person " + person + " of " + name);
                    Thread.sleep(time);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("Thread over!");
        }
    }

