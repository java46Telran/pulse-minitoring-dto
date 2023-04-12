package telran.monitoring.model;

import jakarta.validation.constraints.*;

public class VisitDto {
@NotNull	
public long patientId;
@Email
public String doctorEmail;
@Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}")
public String date;
public VisitDto(long patientId, String doctorEmail, String date) {
	this.patientId = patientId;
	this.doctorEmail = doctorEmail;
	this.date = date;
}
public VisitDto() {
}
@Override
public String toString() {
	return "VisitDto [patientId=" + patientId + ", doctorEmail=" + doctorEmail + ", date=" + date + "]";
}

}
