package Hospital;

public class Patient {

	private String name;
	private String cnic;
	private String address;
	private String phone_no;
	private String gender;
	private int age;
	private String type;
	private Doctor doctor;
	
	public Patient() {
		
	}
	public Patient(String name, String cnic, String address, String phone_no, String gender, int age, String type,
			Doctor doctor) {
		this.name = name;
		this.cnic = cnic;
		this.address = address;
		this.phone_no = phone_no;
		this.gender = gender;
		this.age = age;
		this.type = type;
		this.doctor = doctor;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
}
