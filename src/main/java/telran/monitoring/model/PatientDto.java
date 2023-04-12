package telran.monitoring.model;

import java.util.Objects;
import jakarta.validation.constraints.*;
public class PatientDto {
public long id;
@NotEmpty
public String name;
public PatientDto(long id, String name) {
	this.id = id;
	this.name = name;
}
public PatientDto() {
}
@Override
public String toString() {
	return "PatientDto [id=" + id + ", name=" + name + "]";
}
@Override
public int hashCode() {
	return Objects.hash(id, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PatientDto other = (PatientDto) obj;
	return id == other.id && Objects.equals(name, other.name);
}
}
