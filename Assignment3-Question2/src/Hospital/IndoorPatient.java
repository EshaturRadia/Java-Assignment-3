package Hospital;

import General.Date;

public class IndoorPatient extends Patient{
	private int wardno;
	private int Roomno;
	private int bedno;
	private int fee;
	private Date datefAdmission;

	public IndoorPatient() {		
	}
	
	public IndoorPatient(String name, String cnic, String address, String phone_no, String gender, int age,
			int wardno, int roomno, int bedno, int fee, Date datefAdmission, Doctor doctor) {
		super(name, cnic, address, phone_no, gender, age, "indoor", doctor);
		this.wardno = wardno;
		Roomno = roomno;
		this.bedno = bedno;
		this.fee = fee;
		this.datefAdmission = datefAdmission;
	}

	public int getWardno() {
		return wardno;
	}
	public void setWardno(int wardno) {
		this.wardno = wardno;
	}
	public int getRoomno() {
		return Roomno;
	}
	public void setRoomno(int roomno) {
		Roomno = roomno;
	}
	public int getBedno() {
		return bedno;
	}
	public void setBedno(int bedno) {
		this.bedno = bedno;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public Date getDatefAdmission() {
		return datefAdmission;
	}
	public void setDatefAdmission(Date datefAdmission) {
		this.datefAdmission = datefAdmission;
	}

}
