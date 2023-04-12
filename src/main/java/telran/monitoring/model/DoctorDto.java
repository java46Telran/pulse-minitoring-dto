package telran.monitoring.model;

import java.util.Objects;

import jakarta.validation.constraints.*;

public class DoctorDto {
	@Email @NotEmpty
public String email;
	@NotEmpty
public String name;
public DoctorDto(String email, String name) {
	
	this.email = email;
	this.name = name;
}
public DoctorDto() {
}
@Override
public String toString() {
	return "DoctorDto [email=" + email + ", name=" + name + "]";
}
@Override
public int hashCode() {
	return Objects.hash(email, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	DoctorDto other = (DoctorDto) obj;
	return Objects.equals(email, other.email) && Objects.equals(name, other.name);
}


}
