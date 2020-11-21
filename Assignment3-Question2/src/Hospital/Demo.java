package Hospital;
import javax.swing.JOptionPane;

import General.Date;
import General.Time;

public class Demo {
	private Doctor doctors[] = new Doctor[10];
	private Patient patients[] = new Patient[10];
	private int currentDoctorIndex=0;
	private int currentPatientIndex=0;
	
	public String addIndoorPatient()
	{
		if(currentPatientIndex<patients.length)
			
		{
			String day = JOptionPane.showInputDialog( "Enter day of indoor patient " );
		    int Day = Integer.parseInt( day ); 
			String month = JOptionPane.showInputDialog( "Enter month of indoor patient " );
		    int Month = Integer.parseInt( month ); 
			String year = JOptionPane.showInputDialog( "Enter year of indoor patient " );
		    int Year = Integer.parseInt( year ); 
       		String name = JOptionPane.showInputDialog( "Enter name of doctor " );
       		String cnic = JOptionPane.showInputDialog( "Enter cnic of doctor " );
       		String phoneno = JOptionPane.showInputDialog( "Enter phone number of doctor " ); 
		 	String gender = JOptionPane.showInputDialog( "Enter gender of doctor " );
		 	String department = JOptionPane.showInputDialog( "Enter dempartment of doctor " );
		 	String specialization = JOptionPane.showInputDialog( "Enter specialization of doctor " );
       		String patientname = JOptionPane.showInputDialog( "Enter name of indoor patient " );
     		String patientcnic = JOptionPane.showInputDialog( "Enter cnic of indoor patient " );
       		String patientphoneno = JOptionPane.showInputDialog( "Enter phone number of indoor patient " ); 
		 	String Pgender = JOptionPane.showInputDialog( "Enter gender of indoor patient " );
		 	String address = JOptionPane.showInputDialog( "Enter address of indoor patient " );
		 	String age = JOptionPane.showInputDialog( "Enter age of indoor patient " );
		    int Age = Integer.parseInt( age );
			String wardno = JOptionPane.showInputDialog( "Enter wardno of indoor patient " );
	        int Wardno = Integer.parseInt( wardno );
		    String bedno = JOptionPane.showInputDialog( "Enter bed number of indoor patient " );
		    int Bedno = Integer.parseInt( bedno );
			String fee = JOptionPane.showInputDialog( "Enter fee of indoor patient " );
 	        int Fee = Integer.parseInt( fee );
  	        String roomno = JOptionPane.showInputDialog( "Enter room number of indoor patient " );
	        int Roomno = Integer.parseInt( roomno );	
							       
			Date admissionDate = new Date(Day, Month, Year);
			Doctor doctor = new Doctor(name, cnic,phoneno, gender, department,specialization);
			Patient indoorPatient = new IndoorPatient(patientname, patientcnic,address, patientphoneno, Pgender, Age, 
					                                   Wardno, Roomno, Bedno, Fee, admissionDate, doctor);
			doctors[currentDoctorIndex] = doctor;
			patients[currentPatientIndex] = indoorPatient;
			currentDoctorIndex++;
			currentPatientIndex++;
			return "Indoor Patient Added Successfully";
		}
		else
		{
			return "Max limit has been Reached";
		}
	}
	public String addOutdoorPatient()
	{
		if(currentPatientIndex<patients.length)
		{
			String day = JOptionPane.showInputDialog( "Enter day of outdoor patient " );
		    int Day = Integer.parseInt( day ); 
			String month = JOptionPane.showInputDialog( "Enter month of outdoor patient " );
		    int Month = Integer.parseInt( month ); 
			String year = JOptionPane.showInputDialog( "Enter year of outdoor patient " );
		    int Year = Integer.parseInt( year );
			String hours = JOptionPane.showInputDialog( "Enter hours of appointmnet of outdoor patient " );
		    int Hours = Integer.parseInt( hours );
			String mins = JOptionPane.showInputDialog( "Enter minutes of appointmnet of outdoor patient " );
		    int Mins = Integer.parseInt( mins );
		    String time = JOptionPane.showInputDialog( "Enter time(am/pm) of appointmnet of outdoor patient " );
		    String name = JOptionPane.showInputDialog( "Enter name of doctor " );
       		String cnic = JOptionPane.showInputDialog( "Enter cnic of doctor " );
       		String phoneno = JOptionPane.showInputDialog( "Enter phone number of doctor " ); 
		 	String gender = JOptionPane.showInputDialog( "Enter gender of doctor " );
		 	String department = JOptionPane.showInputDialog( "Enter dempartment of doctor " );
		 	String specialization = JOptionPane.showInputDialog( "Enter specialization of doctor " );
       		String patientname = JOptionPane.showInputDialog( "Enter name of outdoor patient " );
     		String patientcnic = JOptionPane.showInputDialog( "Enter cnic of outdoor patient " );
     		String Pgender = JOptionPane.showInputDialog( "Enter gender of outdoor patient " );
		 	String address = JOptionPane.showInputDialog( "Enter address of outdoor patient " );
		 	String phone_no = JOptionPane.showInputDialog( "Enter phone number of outdoor patient " );
			String fee = JOptionPane.showInputDialog( "Enter fee of outdoor patient " );
 	        int Fee = Integer.parseInt( fee );
			String age = JOptionPane.showInputDialog( "Enter fee of outdoor patient " );
 	        int Age = Integer.parseInt( age );
			Date appointmentDate = new Date(Day, Month, Year );
			Time appointmentTime = new Time(Hours, Mins, time);
			Doctor doctor = new Doctor(name, cnic, phoneno, gender, department, specialization);
			Patient outdoorPatient = new OutdoorPatient(patientname, patientcnic, address, phone_no, Pgender, Age, 
														Fee, appointmentDate, appointmentTime, doctor);
			doctors[currentDoctorIndex] = doctor;
			patients[currentPatientIndex] = outdoorPatient;
			currentDoctorIndex++;
			currentPatientIndex++;
			return "Outdoor Patient Added Successfully";
		}
		else
		{
			return "Max limit has been Reached";
		}
	}
	public String seeAllDoctors()
	{
		String details = "";
		for(int i=0;i<currentDoctorIndex;i++)
		{
			details += "Name:   " + doctors[i].getName() + "    CNIC:    " + doctors[i].getCnic() + "     Specialization:   " + doctors[i].getSpecialization();
		}
		if(details.equals(""))
		{
			details = "No Doctor Found";
		}
		return details;
	}
	public String searchDoctorByNameOrDepartment(String text, Boolean searchByName)
	{
		String details = "";
		for(int i=0;i<currentDoctorIndex;i++)
		{
			if(searchByName && doctors[i].getName().equals(text))
			{
				details += "Name:   " + doctors[i].getName() + "    CNIC:    " + doctors[i].getCnic() + "     Specialization:   " + doctors[i].getSpecialization();
			}
			if(!searchByName && doctors[i].getDepartment().equals(text))
			{
				details += "Name:   " + doctors[i].getName() + "    CNIC:    " + doctors[i].getCnic() + "     Specialization:   " + doctors[i].getSpecialization();
			}			
		}
		if(details.equals(""))
		{
			details = "No Doctor Found";
		}
		return details;
	}
	public String seeAllIndoorPatients()
	{
		String details = "";
		for(int i=0;i<currentPatientIndex;i++)
		{
			if(patients[i].getType().equals("indoor"))
			{
				details += "Name:   " + patients[i].getName() + "    CNIC:    " + patients[i].getCnic() + "     Gender:   " + patients[i].getGender();
			}
		}
		if(details.equals(""))
		{
			details = "No Indoor Patients Found";
		}
		return details;
	}
	public String seeAppointmentsList(int day, int month, int year)
	{
		String details = "";
		for(int i=0;i<currentPatientIndex;i++)
		{
			if(patients[i].getType().equals("outdoor"))
			{
				OutdoorPatient outdoorPatient = (OutdoorPatient)patients[i];
				Date apppointmentDate = outdoorPatient.getDateOfAppointment();
				if(apppointmentDate.getDay() == day && apppointmentDate.getMonth()== month && apppointmentDate.getYear() == year)
				{
					details += "Name:   " + patients[i].getName() + "    CNIC:    " + patients[i].getCnic() + "     Doctor Name   " + patients[i].getDoctor().getName();
				}
			}
		}
		if(details.equals(""))
		{
			details = "No Appointment Found";
		}
		return details;
	}
	public String seeDoctorAppointments(String cnic)
	{
		String details = "";
		Doctor doctor = null;
		for(int i=0; i<currentDoctorIndex; i++)
		{
			if(doctors[i].getCnic().equals(cnic))
			{
				doctor = doctors[i];
				break;
			}
		}
		if(doctor == null)
		{
			details  = "No such Doctor Found";
		}
		else
		{
			for(int i=0;i<currentPatientIndex;i++)
			{
				if(patients[i].getType().equals("outdoor") && patients[i].getDoctor() == doctor)
				{
					details += "Name:   " + patients[i].getName() + "    CNIC:    " + patients[i].getCnic() + "     Doctor Name   " + patients[i].getDoctor().getName();
				}
			}			
			if(details.equals(""))
			{
				details = "No Appointment Found";
			}
		}
		return details;
	}
	public String changeAppointmentDateOrTime(String patientCNIC, Date newDate, Time newTime) {
		String details= "";
		for(int i=0; i<currentPatientIndex; i++)
		{
			if(patients[i].getCnic().equals(patientCNIC) && patients[i].getType().equals("outdoor"))
			{
				if(newDate!=null)
				{
					OutdoorPatient outdoorPatient = (OutdoorPatient)patients[i];
					outdoorPatient.setDateOfAppointment(newDate);
					patients[i] = outdoorPatient;
					details = "Appointment Date Changed Successfully";

				}
				if(newTime!=null)
				{
					OutdoorPatient outdoorPatient = (OutdoorPatient)patients[i];
					outdoorPatient.setTimeOfAppointment(newTime);;
					patients[i] = outdoorPatient;
					details = "Appointment Time Changed Successfully";
				}
			}
			break;
		}
		if(details.equals(""))
		{
			details = "No Patient Found";
		}
		return details;
	}
}
