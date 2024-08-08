package atif.designPattern.builder.car;

public class Car {
    private String type;
    private String mileage;

    //mandatory fields
    private boolean brakeWorks;

    public Car(Builder builder) {
        this.type = builder.type;
        this.mileage = builder.mileage;
        this.brakeWorks = builder.brakeWorks;
    }

    static class Builder {
        private String type;
        private String mileage;
        //mandatory fields
        private boolean brakeWorks;

        Builder(boolean brakeWorks) {
            this.brakeWorks = brakeWorks;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder mileage(String mileage) {
            this.mileage = mileage;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", mileage='" + mileage + '\'' +
                ", brakeWorks=" + brakeWorks +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder(true)
                .type("Manual")
                .mileage("160")
                .build();
        System.out.println(car.toString());
    }
}