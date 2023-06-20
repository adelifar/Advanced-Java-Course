import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        //conditional
        int cnt=0;
//        while (true){
//            cnt++;
//            System.out.println("Hello Itpro "+cnt);
//
//        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        cnt=scanner.nextInt();
        while (cnt>15){
            System.out.println(cnt+" Hello");
            cnt--;
        }

        do {
            System.out.println(cnt+" Hello");
            cnt--;
        }while (cnt>15);


        for (int i=0;i<=15;i+=5){
            System.out.println("Hello "+i);
        }
        for (int i=0;i<=15;i=(i+1)*2){
            System.out.println("Hello "+i);
        }
        for (int i=15;i>=0;i--){
            System.out.println("Hello "+i);
        }
        for (int i=15;i+i>=0;i--){
            System.out.println("Hello "+i);
        }

        for (int i = 0; i < 20; i++) {
            if (i==5 || i==8 ||i==12)
                continue;
            if (i==14)
                continue;
            System.out.println(i+" "+Math.pow(i,2));
        }

        for (int i = 0; i < 15; i++) {
            System.out.println(i+" "+Math.pow(i,2));
            if (i>10)
                break;
        }

        int s=0;
        while (true){
            s++;
            if (s==22)
                continue;

            System.out.println(s);
            if (s>40)
                break;
        }

        itpro:
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.println(i+" "+j);
                if (j==10)break; //break inner loop
                break itpro; //break all loop
            }
        }

        for (int i = 0; i < 15; i++) {
            System.out.println(i);
        }

        int j=0;
        while (j<15){
            System.out.println(j);
            j++;
        }


        System.out.println("Enter a number");
        cnt=scanner.nextInt();
        while (cnt<15){
            for (int i = 0; i < cnt; i++) {
                System.out.println(cnt);
            }
            System.out.println("Enter a number");
            cnt=scanner.nextInt();
        }


        System.out.println("Enter a number");
        cnt=scanner.nextInt();
        for (;  cnt<15 ; ) {
            for (int i = 0; i < cnt; i++) {
                System.out.println(cnt);
            }
            System.out.println("Enter a number");
            cnt=scanner.nextInt();
        }
    }
}
