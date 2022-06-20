import java.util.Arrays;

import javax.swing.JOptionPane;

public class showReport {
	

 	
	
	
	
	
	
//	public static String[] status;
//	public static String[] developer;
//	public static String[] name;
//	public static int[] duration;
//	
	
	
static void statusOfDone(String[] status, String[] developer, String[] name, int[] duration) {
	for(int s=0; s<status.length; s++) {
		if(status[s].equalsIgnoreCase("Done")) {
			JOptionPane.showMessageDialog(null, "display of information: " +  developer[s] + " " + name[s] + " " + duration[s] + "\n");
		}
	}
	

	
}
static void longestDuration(int[] duration, String[] developer ) {
	int maximumDuration = duration[0];
	int pos;
	
	for(int l=0; l<duration.length; l++) {
		if(maximumDuration < duration[l]) {
			maximumDuration = duration[l];
			pos = l;
			JOptionPane.showMessageDialog(null, developer[pos] + " " + maximumDuration);
		}
	}
}
static void searchTaskName(String[] name, String[] status, String[] developer, String searchName) { 
	String taskName = (JOptionPane.showInputDialog("Enter task name"));
	for(int d=0; d<name.length; d++) {
		if(taskName.equalsIgnoreCase(name[d])) {
			JOptionPane.showMessageDialog(null, "searchName" + ":" + name[d] + ", " + developer[d] + ", " + status[d] + "\n");
		}
		
	}
	
	

}
static void searchTaskstatus(String[] name, String[] status, String searchstatus, String[] developer) {
	String taskStatus = (JOptionPane.showInputDialog("Enter task Status"));
	for(int d=0; d<status.length; d++) {
		if(taskStatus.equalsIgnoreCase(status[d])) {
			JOptionPane.showMessageDialog(null, "searchstatus" + ":" + name[d] + ", " + developer[d] + ", " + status[d] + "\n");
		}
	
	}
		
}

static void deleteTask(String[] name) {
String[] myArray = name;

JOptionPane.showMessageDialog(null, "Original Array:" + Arrays.toString(myArray));

int index = Integer.parseInt(JOptionPane.showInputDialog("Insert index of task"));

JOptionPane.showMessageDialog(null, "Task to be deleted" +(myArray[index]));

int[] copyArray = new int[myArray.length-1];

System.arraycopy(myArray, 0, copyArray, 0, index);

System.arraycopy(myArray,  index+1, copyArray, index, myArray.length-index-1);

JOptionPane.showMessageDialog(null, "Array after deleting the element" + Arrays.toString(copyArray));

}


static void displayReport(String[] name) { 
	JOptionPane.showMessageDialog(null, "Full Report" + name);
	}


	public static void main(String[] args) {
		
		tasks showtasks = new tasks();
		int[] duration = showtasks.duration;
	    String[] status = showtasks.status;
		String[] developer = showtasks.developer;
		String[] name = showtasks.name;
		String[] emptyArr= showtasks.emptyArr;
		int x = 0;
		
		
		int menuNumber = 1;
		int reportOptions;
		String searchName = "";
		String searchstatus = "";
			while (menuNumber !=6) {
				reportOptions = Integer.parseInt(JOptionPane.showInputDialog("Choose one of the options below \n"
						+ "1) Task status \n"
						+ "2) Longest duration \n"
						+ "3) Searching of task names \n"
						+ "4) Searching of task statuses \n"
						+ "5) Delete tasks \n"
						+ "6) report captured \n"));
						
				if (reportOptions == 1) {
					statusOfDone(status, developer, name, duration);
				}
				else if (reportOptions == 2) {
					longestDuration(duration, developer);	
				}
				else if(reportOptions == 3) {
					searchTaskName(name, status, developer, searchName);
				}
				else if(reportOptions == 4) {
					searchTaskstatus(name, status,searchstatus, developer);
				}
				else if(reportOptions == 5){
					deleteTask(name);
				}
				else if(reportOptions == 6) {
					displayReport(name);
					
				}
			}
	}

}
