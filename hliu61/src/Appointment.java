public class Appointment {
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional doctor;

    public Appointment() {}

    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    public void printAppointmentDetails() {
        System.out.println("Patient: " + patientName + " (" + patientMobile + ")");
        System.out.println("Time: " + timeSlot + ", Doctor: " + doctor.getName());
        System.out.println("----------------------------------------");
    }

    public String getPatientMobile() { return patientMobile; }
}