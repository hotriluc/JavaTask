import java.util.Arrays;

public class Erato {

private boolean[] arr;

    public Erato (int n){
        arr =new boolean[n+1];
    }

    public void fillArray(){
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;

        for (int i=2;i<arr.length;i++){
            if(arr[i]==true){
                for (int j=2; i*j<arr.length;j++){
                    arr[i*j]=false;
                }
            }
        }
    }

    public void fillArrayOptimized(){
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i<arr.length;i++){

            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    arr[i]=false;
                    break;
                }
            }
        }

    }

    public void printPrime(){
        for (int i=2;i<arr.length;i++){
            if (arr[i]==true){
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]){
        Erato e = new Erato(128);
        double startTime = System.currentTimeMillis();
        e.fillArrayOptimized();
        double timeSpent = System.currentTimeMillis() - startTime;

        e.printPrime();
        System.out.printf("%5.5fms",timeSpent);
    }
}
