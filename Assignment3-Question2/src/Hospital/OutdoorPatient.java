package Hospital;

import General.Date;
import General.Time;

public class OutdoorPatient extends Patient {

	private int fee;
	private Date dateOfAppointment;
	private Time timeOfAppointment;

	public OutdoorPatient(String name, String cnic, String address, String phone_no, String gender, int age,
						  int fee, Date dateOfAppointment, Time timeOfAppointment, Doctor doctor) {
		super(name, cnic, address, phone_no, gender, age, "outdoor", doctor);
		this.fee = fee;
		this.dateOfAppointment = dateOfAppointment;
		this.timeOfAppointment = timeOfAppointment;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public Date getDateOfAppointment() {
		return dateOfAppointment;
	}
	public void setDateOfAppointment(Date dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}
	public Time getTimeOfAppointment() {
		return timeOfAppointment;
	}
	public void setTimeOfAppointment(Time timeOfAppointment) {
		this.timeOfAppointment = timeOfAppointment;
	}
}
