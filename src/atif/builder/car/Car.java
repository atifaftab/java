package atif.builder.car;

public class Car {
    private String type;
    private String mileage;

    public Car(Builder builder) {
        this.type = builder.type;
        this.mileage = builder.mileage;
    }

    static class Builder {
        private String type;
        private String mileage;

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
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .type("Manual")
                .mileage("160")
                .build();
        System.out.println(car.toString());
    }
}