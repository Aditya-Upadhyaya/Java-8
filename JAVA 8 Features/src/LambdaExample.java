
import java.util.Comparator;


public class LambdaExample {
    public static void main(String[] args) {
        /*
         * Before lamda
         */
        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                System.out.println("Ruuning throught old way");
            }
        };

        Thread task = new Thread(runnable);
        task.start();

        /*
         * New way Lamda
         */

        Runnable runnableLamda = ()-> System.out.println("Run through runnable lamda");
        new Thread(runnableLamda).start();

        new Thread(()-> System.out.println("run throught thread lamda")).start();


        /*
         * Comparator example
         */

         Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
            
        };

        System.out.println("Comparator : "+ comparator.compare(8, 9));

        Comparator<Integer> comparatorLamda = (o1,o2)->  o1.compareTo(o2);

        System.out.println("Comparator Lamda : "+ comparatorLamda.compare(5, 2));
    }
}