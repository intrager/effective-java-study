package bruce.effective.item01;

public class Order {
    private boolean prime;
    private boolean urgent;
    private Product product;

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    /*
     이 클래스의 이름과 동일하게만 만들어야 하고,
     이 클래스 타입만 리턴하게 되어 있다.
     */
//    public Order(Product product, boolean prime) {
//        this.product = product;
//        this.prime = prime;
//    }

//    public Order() { }
    // 같은 타입의 인스턴스를 리턴해주는 생성자의 시그니처가 파라미터의 타입까지 본다.
//    public Order(Product product, boolean urgent) {
//        this.product = product;
//        this.urgent = urgent;

//    }
    /*
      이렇게 하면 생성자는 이름을 표현할 수 없다.
     */
//    public Order(boolean urgent, Product product) {
//        this.product = product;
//        this.urgent = urgent;

//    }
}
