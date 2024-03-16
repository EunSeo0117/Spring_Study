public class compare {
    //로또구매
    register rg = new register();
    lotto lt = new lotto();
    public void comparei() {
        rg.setMylotto(rg.mylotto);
        rg.getmylotto(rg.mylotto);

        lt.setRandom(lt.getRandom());
        lt.printNum(lt.getRandom());
        System.out.println("*******************************");
        System.out.println("일치 번호: ");
        int cnt = 0;
        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                if (rg.mylotto[i]==lt.lottolist[j]) {
                    System.out.println(rg.mylotto[i] + " ");
                    cnt+=1;
                } else {
                    continue;
                }
            }
        }
        System.out.println();
        System.out.println("맞은갯수 : " + cnt);
        if (cnt >=6) System.out.println("\n1등");
        else if (cnt >= 5) System.out.println("\n2등");
        else if (cnt >= 4) System.out.println("\n3등");
        else if (cnt >= 3) System.out.println("\n4등");
        else System.out.println("\n꽝");

    }


}

