import java.util.ArrayList;

public class AssignmentOne {
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("----------------------------------------");

        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Zhang", "General Practice", 10);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Li", "Family Medicine", 10);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Wang", "Primary Care", 10);

        Cardiologist cardio1 = new Cardiologist(201, "Dr. Zhao", "Cardiology", "Interventional");
        Cardiologist cardio2 = new Cardiologist(202, "Dr. Sun", "Cardiology", "Non-invasive");

        gp1.printProfessionalDetails();
        gp2.printProfessionalDetails();
        gp3.printProfessionalDetails();
        cardio1.printProfessionalDetails();
        cardio2.printProfessionalDetails();

        System.out.println("----------------------------------------");

        createAppointment("Zhang San", "123456789", "09:00", gp1);
        createAppointment("Li Si", "234567891", "10:00", gp2);
        createAppointment("Wang Wu", "345678912", "11:00", cardio1);
        createAppointment("Xiao Ming", "456789123", "12:00", cardio2);

        System.out.println("Initial Appointments:");
        printExistingAppointments();

        cancelBooking("234567891");

        System.out.println("Updated Appointments:");
        printExistingAppointments();
    }

    public static void createAppointment(String patientName, String patientMobile,
                                         String timeSlot, HealthProfessional doctor) {
        if (patientName == null || patientMobile == null || timeSlot == null || doctor == null) {
            System.out.println("Error: Missing appointment details");
            return;
        }

        appointments.add(new Appointment(patientName, patientMobile, timeSlot, doctor));
        System.out.println("Appointment created for " + patientName);
    }

    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments");
            return;
        }

        for (Appointment apt : appointments) {
            apt.printAppointmentDetails();
        }
    }

    public static void cancelBooking(String patientMobile) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientMobile().equals(patientMobile)) {
                appointments.remove(i);
                System.out.println("Appointment cancelled for " + patientMobile);
                return;
            }
        }
        System.out.println("No appointment found for " + patientMobile);
    }
}