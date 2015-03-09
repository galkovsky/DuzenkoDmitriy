/**
 * Created by Дмитрий on 04.03.2015.
 */
public class Main {
    public static void main(String[] args){
        Car[]  myCar = {new Car(0,40,20,"Ferrari"),new Car(0,40,20,"McLaren"),new Car(0,40,20,"Williams")};
        Race myRace =new Race(500,myCar);
        System.out.println(myCar);
        myRace.recstart();
    }
}
