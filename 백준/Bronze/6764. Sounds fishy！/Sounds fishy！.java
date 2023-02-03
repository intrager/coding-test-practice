import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] fish = new int[4];
        for(int i = 0; i < fish.length; i++) {
            fish[i] = Integer.parseInt(br.readLine());
        }
        if(fish[0] == fish[1] && fish[1] == fish[2] && fish[2] == fish[3]) {
            System.out.print("Fish At Constant Depth");
            return;
        }
        if(fish[0] < fish[1]) {
            if(fish[1] < fish[2]) {
                if(fish[2] < fish[3]) {
                    System.out.print("Fish Rising");
                } else {
                    System.out.print("No Fish");
                }
            } else {
                System.out.print("No Fish");
            }
        } else { // fish[0] > fish[1]
            if(fish[1] > fish[2]) {
                if(fish[2] > fish[3]) {
                    System.out.print("Fish Diving");
                } else {
                    System.out.print("No Fish");
                }
            } else {
                System.out.print("No Fish");
            }
        }
    } 
}