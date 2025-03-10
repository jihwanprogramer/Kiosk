public class MenuItem {
    private final String name;
    private final Double price;
    private final String content;

    public MenuItem(String name, Double price, String content) {
        this.name = name;
        this.price = price;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getContent() {
        return content;
    }
}
