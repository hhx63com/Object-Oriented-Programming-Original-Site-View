public class GeneralPractitioner extends HealthProfessional {
    private int patientsPerDay;

    public GeneralPractitioner() {}

    public GeneralPractitioner(int id, String name, String department, int patientsPerDay) {
        super(id, name, department);
        this.patientsPerDay = patientsPerDay;
    }

    public void printProfessionalDetails() {
        System.out.println("Type: General Practitioner");
        super.printDetails();
        System.out.println("Patients per Day: " + patientsPerDay + "\n");
    }
}