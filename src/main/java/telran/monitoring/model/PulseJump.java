package telran.monitoring.model;

public class PulseJump {
public long patientId;
public int previousValue;
public int currentValue;
public long timestamp;
public PulseJump(long patientId, int previousValue, int currentValue) {
	super();
	this.patientId = patientId;
	this.previousValue = previousValue;
	this.currentValue = currentValue;
	this.timestamp = System.currentTimeMillis();
}
public PulseJump() {
}
@Override
public String toString() {
	return "PulseJump [patientId=" + patientId + ", previousValue=" + previousValue + ", currentValue=" + currentValue
			+ ", timestamp=" + timestamp + "]";
}

}
