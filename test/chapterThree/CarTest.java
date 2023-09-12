package chapterThree;

class CarTest {
    public static void main(String[] args) {
        Car honda = new Car("G100" , "2020" , 300000.00);
        Car mazda = new Car("G200" , "2015" , 250000.00);

        System.out.printf("Honda Price is $%.2f%n" , honda.getPrice());
        System.out.printf("Mazda Price is $%.2f%n" , mazda.getPrice());

        honda.setPrice(honda.getPrice() * 0.05);
        honda.getPrice();

        mazda.setPrice(mazda.getPrice() * 0.09);
        honda.getPrice();

        System.out.println(honda.getPrice());
        System.out.println(mazda.getPrice());







    }

}