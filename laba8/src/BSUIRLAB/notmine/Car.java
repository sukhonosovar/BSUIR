package BSUIRLAB.notmine;

public class Car implements Comparable<Car>{
    private String model;
    private int data;
    private String brand;
    private String color;
    private String number;

    public Car(String model, int data, String brand, String color, String number) {
        this.model = model;
        this.data = data;
        this.brand = brand;
        this.color = color;
        this.number = number;
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Автомобиль{" +
                "модель='" + model + '\'' +
                ", VIN=" + data +
                ", марка='" + brand + '\'' +
                ", цвет='" + color + '\'' +
                ", номер='" + number + '\'' +
                '}' + "\n";
    }

    @Override
    public int compareTo(Car o) {
        if(this.data == o.data) return 0;
        return this.data < o.data ? 1 : 0;
    }
}
