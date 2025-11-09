public class Cardiologist extends HealthProfessional {
    private String specialization;

    public Cardiologist() {}

    public Cardiologist(int id, String name, String department, String specialization) {
        super(id, name, department);
        this.specialization = specialization;
    }

    public void printProfessionalDetails() {
        System.out.println("Type: Cardiologist");
        super.printDetails();
        System.out.println("Specialization: " + specialization + "\n");
    }
}