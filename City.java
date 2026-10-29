package LAB03;
class City {
    private String name;
    private double celsius;
 
    public City(String name, double celsius) {
        this.name = name;
        this.celsius = celsius;
    }
 
 
    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }
 
    public void display() {
        System.out.println("City       : " + name);
        System.out.printf("Celsius    : %.2f C%n", celsius);
        System.out.printf("Fahrenheit : %.2f F%n", toFahrenheit());
        System.out.println();
    }
}