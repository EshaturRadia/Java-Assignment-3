package Hospital;

import javax.swing.JOptionPane;

import General.Date;
import General.Time;

public class Main {

	public static void main(String[] args) {
		Demo demo = new Demo();
		String option = "";
		Object[] menu = { 
						   "Add an indoor patient", 
						   "Add an outdoor patient", 
						   "See the list of all Doctors",
						   "Search a doctor by name or department",
						   "See the list of all indoor patients",
						   "See the list of all appointments on a certain day",
						   "See the list of appointments of a certain doctor",
						   "Change the date or time of appointment of a certain patient.",
						   "Exit"
					    };
		do {
			
			option = JOptionPane.showInputDialog(null, "Select Option", "Hospital Management System", 
											     JOptionPane.INFORMATION_MESSAGE, null, menu, menu[0]).toString();

			if (option.equals("Add an indoor patient"))
			{
				String details = demo.addIndoorPatient();
				JOptionPane.showMessageDialog(null, details, "Add Indoor Patient", JOptionPane.INFORMATION_MESSAGE);
			}
			else if (option.equals("Add an outdoor patient"))
			{
				String details = demo.addOutdoorPatient();
				JOptionPane.showMessageDialog(null, details, "Add Outdoor Patient", JOptionPane.INFORMATION_MESSAGE);				
			}
			else if (option.equals("See the list of all Doctors"))
			{
				String details = demo.seeAllDoctors();
				JOptionPane.showMessageDialog(null, details, "See All Doctors", JOptionPane.INFORMATION_MESSAGE);								
			}
			else if (option.equals("Search a doctor by name or department"))
			{
				Boolean searchByName = true;
				Object[] seacrhOption = { "Search By Name", "Search By Department"};
				String selectedOption = JOptionPane.showInputDialog(null, "Choose one", "Search Doctor", 
																	JOptionPane.INFORMATION_MESSAGE, null,
																	seacrhOption, seacrhOption[0]).toString();
				
				String text = "";
				if(selectedOption.equals("Search By Name"))
				{
					text = JOptionPane.showInputDialog("Enter Doctor Name");
				}
				else if(selectedOption.equals("Search By Department"))
				{					
					text = JOptionPane.showInputDialog("Enter Doctor Department");
					searchByName = false;
				}

				String details = demo.searchDoctorByNameOrDepartment(text, searchByName);
				JOptionPane.showMessageDialog(null, details, "Search Doctor By Name/Department", JOptionPane.INFORMATION_MESSAGE);												
			}
			else if (option.equals("See the list of all indoor patients"))
			{
				String details = demo.seeAllIndoorPatients();
				JOptionPane.showMessageDialog(null, details, "See Indoor Patients", JOptionPane.INFORMATION_MESSAGE);																
			}
			else if (option.equals("See the list of all appointments on a certain day"))
			{
				String day = JOptionPane.showInputDialog( "Enter Day" );
			    int Day = Integer.parseInt( day ); 
				String month = JOptionPane.showInputDialog( "Enter Month" );
			    int Month = Integer.parseInt( month ); 
				String year = JOptionPane.showInputDialog( "Enter Year" );
			    int Year = Integer.parseInt( year ); 

				String details = demo.seeAppointmentsList(Day, Month, Year);
				JOptionPane.showMessageDialog(null, details, "Appointments List", JOptionPane.INFORMATION_MESSAGE);												

			}
			else if (option.equals("See the list of appointments of a certain doctor"))
			{
				String cnic = JOptionPane.showInputDialog( "Enter Doctor CNIC" );
				String details = demo.seeDoctorAppointments(cnic);
				JOptionPane.showMessageDialog(null, details, "Doctor Appointments", JOptionPane.INFORMATION_MESSAGE);																
			}
			else if (option.equals("Change the date or time of appointment of a certain patient."))
			{
				Object[] updateOption = { "Update Appointment Date", "Update Appointment Time"};
				String selectedOption = JOptionPane.showInputDialog(null, "Choose one", "Update Appointment Date/Time", 
																	JOptionPane.INFORMATION_MESSAGE, null,
																	updateOption, updateOption[0]).toString();
				
				String text = "";
				String cnic = JOptionPane.showInputDialog( "Enter Patient CNIC" );
				if(selectedOption.equals("Update Appointment Date"))
				{
					String day = JOptionPane.showInputDialog( "Enter new Appointment Day" );
				    int Day = Integer.parseInt( day ); 
					String month = JOptionPane.showInputDialog( "Enter new Appointment Month" );
				    int Month = Integer.parseInt( month ); 
					String year = JOptionPane.showInputDialog( "Enter new Appointment Year" );
				    int Year = Integer.parseInt( year ); 

				    Date newDate = new Date(Day, Month, Year);
					String details = demo.changeAppointmentDateOrTime(cnic, newDate, null);
					JOptionPane.showMessageDialog(null, details, "Update Appointment Date", JOptionPane.INFORMATION_MESSAGE);												
				}
				else if(selectedOption.equals("Update Appointment Time"))
				{					
					String hours = JOptionPane.showInputDialog( "Enter hours of appointment" );
				    int Hours = Integer.parseInt( hours );
					String mins = JOptionPane.showInputDialog( "Enter minutes of appointment" );
				    int Mins = Integer.parseInt( mins );
				    String time = JOptionPane.showInputDialog( "Enter time(am/pm) of appointment" );

				    Time newTime = new Time(Hours, Mins, time);
					String details = demo.changeAppointmentDateOrTime(cnic, null, newTime);
					JOptionPane.showMessageDialog(null, details, "Update Appointment Time", JOptionPane.INFORMATION_MESSAGE);												
				}				
			}			
		}while(!option.equals("Exit"));
	}

}

