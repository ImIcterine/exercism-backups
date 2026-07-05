import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

        LocalDateTime date = LocalDateTime.parse(appointmentDateDescription, parser);

        return date;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime now = LocalDateTime.now();

        return appointmentDate.isBefore(now);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int h = appointmentDate.getHour();
        
        return 12 <= h && h < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter printer1 = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy", Locale.US);
        DateTimeFormatter printer2 = DateTimeFormatter.ofPattern("h:mm a", Locale.US);

        String date = printer1.format(appointmentDate);
        String time = printer2.format(appointmentDate);

        return "You have an appointment on " + date + ", at " + time + ".";
    }

    public LocalDate getAnniversaryDate() {
        int y = LocalDate.now().getYear();
        
        return LocalDate.of(y, 9, 15);
    }
}
