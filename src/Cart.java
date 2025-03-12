import java.util.ArrayList;
import java.util.List;

public class Cart {
    public List<MenuItem> cartList;
    double totalPrice;

    //Cart 생성자
    public Cart() {
        cartList = new ArrayList<>();
    }

    //장바구니 품목 추가
    public void addCartList(MenuItem menu) {
        cartList.add(menu);
    }

    //총 금액 출력
    public double getTotalPrice() {
        for (MenuItem m : cartList) {
            totalPrice = m.getPrice();
        }
        return totalPrice;
    }

    //장바구니 품목 보기
    public void viewCart() {
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println("[ Orders ]");
        for (MenuItem m : cartList) {
            System.out.println(m.getName() + " | ₩ " + m.getPrice() + " | " + m.getContent());
        }
        System.out.println("1.주문    2.메뉴판");
    }

    //장바구니 리스트 출력
    public List<MenuItem> getCartList() {
        return cartList;
    }

    //장바구니 비우기
    public void clearCart(){
        cartList.clear();
    }

}
