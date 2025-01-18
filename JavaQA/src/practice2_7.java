import java.util.Scanner;
public class practice2_7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        int h = 0, m = 0, s = 0;
        while(time != 0){
            m++;
            time-=60;
        }
        while(time!= 0){
            h++;
            time-=24;
        }
        s = time;
        String timeS = String.format("%d:%02d:%02d", h, m, s);
        System.out.println(timeS);
    }
}
