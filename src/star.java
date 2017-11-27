public class star {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int m, d;
        System.out.println("請輸入月份");
        m = sc.nextInt();
        System.out.println("請輸入日期");
        d = sc.nextInt();
        if (m == 1) {
            if (d <= 20) {
                System.out.println("魔羯");
            } else
                System.out.println("水瓶");
        }
        if (m == 2) {
            if (d <= 19) {
                System.out.println("水瓶");
            } else
                System.out.println("雙魚");

        }
        if (m == 3) {
            if (d <= 20) {
                System.out.println("雙魚");
            } else
                System.out.println("白羊");
        }
        if (m == 4) {
            if (d <= 19) {
                System.out.println("白羊");
            } else
                System.out.println("金牛");
        }
        if (m == 5) {
            if (d <= 20) {
                System.out.println("金牛");
            } else
                System.out.println("雙子");
        }
        if (m == 6) {
            if (d <= 21) {
                System.out.println("雙子");
            } else
                System.out.println("巨蟹");
        }
        if (m == 7) {
            if (d <= 22) {
                System.out.println("巨蟹");
            } else
                System.out.println("獅子");
        }
        if (m == 8) {
            if (d <= 22) {
                System.out.println("獅子");
            } else
                System.out.println("處女");
        }
        if (m == 9) {
            if (d <= 22) {
                System.out.println("處女");
            } else
                System.out.println("天秤");
        }
        if (m == 10) {
            if (d <= 23) {
                System.out.println("天秤");
            } else
                System.out.println("天蠍");
        }
        if (m == 11) {
            if (d <= 21) {
                System.out.println("天蠍");
            } else
                System.out.println("射手");
        }
        if (m == 12) {
            if (d <= 20) {
                System.out.println("射手");
            } else
                System.out.println("魔羯");
        }
    }
}