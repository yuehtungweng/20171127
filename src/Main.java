public class Main {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("請輸入月份");
        int i;
        i = sc.nextInt();

        if (i >= 13) {
            System.out.println("錯誤");
        } else {
            if (i == 12) {
                System.out.println("冬");
            } else {
                if (i >= 9) {
                    System.out.println("秋");
                } else {
                    if (i >= 6) {
                        System.out.println("夏");
                    } else {
                        if (i >= 3) {
                            System.out.println("春");
                        } else {
                            System.out.println("冬");
                        }
                    }
                }
            }
        }
    }
}
