public class MenuItem {
    private final String name;
    private final Double price;
    private final String content;

    //MenuItem 생성자
    public MenuItem(String name, Double price, String content) {
        this.name = name;
        this.price = price;
        this.content = content;
    }

    //name 값 추출
    public String getName() {
        return name;
    }

    //price 값 추출
    public Double getPrice() {
        return price;
    }

    //content 값 추출
    public String getContent() {
        return content;
    }
}
