/**
 * Created by Дмитрий on 11.03.2015.
 */
public class Doctor extends Human {
    private int skill;
    private String[] diagnosis;
    private int cost;
    private int patientCount;
    private Patient[] patients = new Patient[5];


    public Doctor(int skill, String[] diagnosis, int cost) {
        this.skill = skill;
        this.diagnosis = diagnosis;
        this.cost = cost;
    }

    public void heal(){
        for (int i = 0; i < patientCount; i++) {
            int min = Math.min(skill, patients[i].getMoney());
            patients[i].increase(min);
            System.out.println(" patient become healthier to a value " + min);
            patients[i].payMoney(cost);
            System.out.println(" Patient paid " + cost + " money ");
        }
    }

    public boolean releasePatient(){
        for (int i = 0; i < patientCount; i++) {
            if(patients[i].getHealth() >=100){
                System.out.println(" Patient" + patients[i].name +"healed ");
            }
        }
        return true;
    }

    public boolean ifCanHeal(Patient patient){
        if (patientCount == patients.length) {
            System.out.println("I can`t heal patient");
            return false;
        }
        for(int i = 0; i < diagnosis.length; i++){
            if (diagnosis[i].equalsIgnoreCase(patient.getDiagnosis())){
                System.out.println("I can heal patient" + patients[i]);
                return true;
            }
        }
        System.out.println("I can`t heal patient");
        return false;
    }
    public void addPatient(Patient patient){
        patients[patientCount] = patient;
        patientCount++;
        System.out.println("Patient added to doctor");
    }


}
