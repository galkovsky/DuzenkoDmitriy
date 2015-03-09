/**
 * Created by Дмитрий on 04.03.2015.
 */
public class Car {
    int position;
    int n2o;
    int speed;
    String name;

    public Car(int position, int n2o, int speed, String name) {
        this.position = position;
        this.n2o = n2o;
        this.speed = speed;
        this.name = name;
    }
    public void move() {
        position += speed;
        if ((Math.random() * 100) > 60) {
            position += speed + n2o;
        } else {
            position += speed;
        }
    }
    public String toString() {
        return "Car " + name + " with speed : " + speed + " n2o " + n2o;
    }






}
