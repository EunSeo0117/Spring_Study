import java.util.Scanner;

public class register {

    int[] mylotto = new int[6];

    public void setMylotto(int[] arr) {         // 구매할 로또 번호 입력
        for (int i=0; i<6; i++) {
            while(true) {
                Scanner sc = new Scanner(System.in);
                System.out.println((i+1)+".등록할 번호를 입력하세요(1~45): ");
                int n = Integer.parseInt(sc.next());
                if (n>=1 && n <=45) {
                    arr[i] = n;
                    break;
                } else {
                    System.out.println("다시입력하세요.");
                    continue;
                }
            }
        }
        this.mylotto = arr;
    }

    public void getmylotto(int[] arr) {     // 구매 번호 출력
        System.out.println("*******************************");
        System.out.println("내 구매 번호: ");
        for (int i=0; i<6;i++) {
            System.out.print(mylotto[i] + " ");
        }
        System.out.println();
    }
}
