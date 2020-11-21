package Hospital;

public class Doctor {
	
	private String name;
	private String cnic;
	private String phone_no;
	private String gender;
	private String department;
	private String specialization;

	public Doctor() {
	}

	public Doctor(String name, String cnic, String phone_no, String gender, String department, String specialization) {
		this.name = name;
		this.cnic = cnic;
		this.phone_no = phone_no;
		this.gender = gender;
		this.department = department;
		this.specialization = specialization;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCnic() {
		return cnic;
	}
	public void setCnic(String cnic) {
		this.cnic = cnic;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

}
