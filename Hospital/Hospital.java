/**
 * Created by Дмитрий on 11.03.2015.
 */
public class Hospital {
    private int patientCount;
    private int doctorCount;
    private Patient[] patients = new Patient[5];
    private Doctor[] doctors = new Doctor[3];


    public  boolean receivePatient(Patient newPatient){
        if (newPatient.getMoney() <= 0 && !newPatient.isInsurance()){
            return false;
        }
        if (patientCount == patients.length){
            return false;
        }
        if (newPatient.getHealth() >= 100 ) {
            return false;
        }
        int foundDoctorIndex = -1;
        for(int i = 0; i < doctorCount; i++){
            if (doctors[i].ifCanHeal(newPatient)){
                foundDoctorIndex = i;
            }
        }
        if (foundDoctorIndex == -1){
            return false;
        }
        doctors[foundDoctorIndex].addPatient(newPatient);
        patients[patientCount] = newPatient;
        patientCount++;
        System.out.println("Patient add to hospital");
        return true;
    }
    public boolean receiveDoctor(Doctor doctor){
        if(doctorCount == doctors.length){
            return false;
        }
        doctors[doctorCount] = doctor;
        doctorCount++;
        System.out.println("Doctor went to hospital");
        return true;
    }
    public void heal(){
        for (int i = 0; i <doctorCount ; i++) {
            doctors[i].heal();
        }
    }

    public void releasePatient(){
        for (int i = 0; i <doctorCount; i++) {
            if ((doctors[i].releasePatient()==true)) {
                System.out.println(" Patient " + patients[i].name + " healed and out from hospital ");
            }
        }

        }
    }

