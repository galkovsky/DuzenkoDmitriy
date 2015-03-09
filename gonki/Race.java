/**
 * Created by Дмитрий on 04.03.2015.
 */
public class Race {
    Car[] arr;
    int length;

    public Race(int length, Car[] cars) {
        this.length = length;
        this.arr = cars;
    }

    public int recstart(int []  position) {
        int i = 0;
        System.out.print("  "  + position);

        if (position[i] < length) {
            recstart(arr[i].speed + arr[i].move());
        }
    }
}
