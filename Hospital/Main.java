import java.util.Scanner;

/**
 * Created by Дмитрий on 11.03.2015.7
 */
public class Main {
    public static void main (String [] args){
        Hospital hospital = new Hospital();

        boolean endCycle = false;

        while (!endCycle) {

            System.out.println(" Press 1 – to add doctor");
            System.out.println(" Press 2 – to add patient");
            System.out.println(" Press 3 – yo heal patient");
            System.out.println(" Press 0 – End cycle");

            Scanner scanner = new Scanner (System.in);
            int userChoice = scanner.nextInt();

            switch (userChoice) {


                case 1:

                    Doctor doctor = new Doctor(40, new String[]{"Болит горло", "Болят глаза"}, 15);
                    hospital.receiveDoctor(doctor);
                    break;


                case 2:

                    Patient patient1 = new Patient(60, 30, false, "Болит горло", " Patient1 ");
                    Patient patient2 = new Patient(50, 25, false, "Болят глаза", " Patient2 ");

                    hospital.receivePatient(patient1);
                    hospital.receivePatient(patient2);

                    break;



                case 3:
                    hospital.heal();
                    hospital.releasePatient();
                    break;

                case 0:
                    endCycle = true;
                    System.out.println("Хуууух, закончилось...");
            }
        }
    }
}
