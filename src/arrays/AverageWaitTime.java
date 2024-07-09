package arrays;

public class AverageWaitTime {
    public static double avgWaitTime(int[][] customers){
        int idleTime = 1; //chef will be free or finished time
        long totalWaitTime = 0; //total waiting time per customer
        for(int[] customer : customers){
            if(idleTime <= customer[0]){
                idleTime = customer[0] + customer[1]; //for the first time the idle time becomes arrivalTime + prepTime
            }
            else{
                idleTime += customer[1]; //customer has to wait for the prepTime + idleTime
            }
            totalWaitTime += (idleTime - customer[0]); //finished time - arrival time gives you waiting time
        }
        double avg = totalWaitTime/(double)customers.length;
        return avg;
    }

    public static void main(String[] args) {
        int[][] n = {{1,2}, {2,5}, {4,3}};
        System.out.println(avgWaitTime(n));
    }
}
