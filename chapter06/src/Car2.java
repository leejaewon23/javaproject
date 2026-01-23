public class Car2 {
    String company = "현대 자동차";
    String model;
    String color;
    int maxSpeed;

    //생성자 선언
    Car2() {}

    Car2(String model) {
        this.model = model;
    }

    Car2(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car2(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
