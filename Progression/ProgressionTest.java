import com.sun.security.auth.SolarisNumericUserPrincipal;

/**
 * Created by Дмитрий on 24.02.2015.
 */
public class ProgressionTest {
    public boolean checkArithmeticProression(int arr[]){
        int difference = arr[1] - arr[0];
        for (int a = 0; a < arr.length - 1; a++ ){
            if (!(((arr[a + 1] - arr[a]) == difference))){
                System.out.println(" This array isn`t arithmetic progression ");
                return false;
            }
        }
        System.out.println(" This progression is arithmetic ");

        return true;
    }
    public boolean checkGeometricProgression(int arr[]){
        int denominator = arr [1]/arr[0];
        for (int a = 0; a < arr.length - 1;a++){
            if (!((arr [a + 1] / arr[a] == denominator))){
                System.out.println(" This array isn`t geometric progression ");
                return false;
            }
        }
        System.out.println(" This progression is geometric ");

        return true;

    }
}
