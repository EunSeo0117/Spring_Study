import java.util.Random;
import java.util.Scanner;

public class lotto {
    Random random = new Random();
    int[] lottolist = new int[6];

    public Random getRandom() {
        return random;
    }
    public void setRandom(Random random) {
        this.random.setSeed(System.currentTimeMillis());
        this.random = random;
    }

    public void printNum(Random random) {
        Scanner sc = new Scanner(System.in);

        while (true) {                                         // 종료 누르기전까지 무한반복
            System.out.println("*******************************");
            System.out.println("번호를 누르세요.");
            System.out.println("1. 로또 추첨\n2. 종료\n");

            int n = Integer.parseInt(sc.next());               // 사용자로부터 입력받음
            if (n==1) {
                System.out.println("*******************************");
                System.out.print("추첨번호: ");
                for (int i = 0; i < 6; i++) {                  // 6개의 랜덤숫자를 출력
                    int a = random.nextInt(44) + 1;     // 0~44이므로 +1해서 1~45로 수정
                    System.out.print(a + " ");
                    lottolist[i] = a;
                }
                System.out.print("\n");
                try {                                           // sleep함수로 속도조절
                    Thread.sleep(1000);                   // 일시 정지 상태에서 주어진 시간이 되기전에
                } catch (InterruptedException e) {              // interrupt() 메소드가 호출되면 InterruptedException이
                    e.printStackTrace();                        // 발생하기 때문에 예외 처리가 필요
                }
                break;
            } else if (n==2) {                                  // 2입력시 프로그램 종료
                System.out.println("프로그램 종료.");
                break;
            } else {                                            //1과 2 이외의 숫자오면 while문 반복
                System.out.println("번호를 다시 입력해주세요.");
                continue;
            }
        }
    }
}
