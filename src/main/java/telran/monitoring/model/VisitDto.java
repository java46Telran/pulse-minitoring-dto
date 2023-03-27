package telran.monitoring.model;

public class VisitDto {
	
public long patientId;
public String doctorEmail;
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
