public enum User {
    국가유공자(20),
    군인(10),
    학생(5),
    일반(0);

    private final int sale;
    static final User[] users = User.values();

    //생성자
    User(int sale) {
        this.sale = sale;
    }

    //enum 안에서 상수별 심볼가져오기
    public int getSale() {
        return sale;
    }

    //신분 리스트
    public static void viewUser() {
        System.out.println("사용자의 신분을 선택해주세요");
        for (int i = 0; i < users.length; i++) {
            System.out.println((i + 1) + ". " + users[i] + ": " + users[i].getSale() + "%");
        }
    }

    //최종 금액 출력
    public static double lastAmount(int i) {
        double amount = Cart.totalPrice;
        for (User user : users) {
            if (users[i - 1] == user) {
                amount *= (100 - (double) users[i - 1].getSale()) / 100;
            }
        }
        return amount;
    }

    //최종 할인률 출력
    public static int kioskViewSale(int i) {
        for (User user : users) {
            if (users[i - 1] == user) {
                return users[i - 1].getSale();
            }
        }
        return 0;
    }
}
