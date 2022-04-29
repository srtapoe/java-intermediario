package br.java.intermediario.enums.threads;

public class ThreadTwo implements Runnable{
        private final String pokemon;
        private final int time;

        public ThreadTwo(String pokemon, int time){
            this.pokemon = pokemon;
            this.time = time;
            Thread t  = new Thread(this);
            t.start();
        }

        @Override
        public void run() {

            String[] pokemonStatus = {"Wake up", "Eating", "Sleeping"};

                try {
                    for (String status: pokemonStatus) {
                        System.out.println(pokemon + " is " + status);
                        Thread.sleep(time);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            System.out.println("Thread over!");
            }

        }

