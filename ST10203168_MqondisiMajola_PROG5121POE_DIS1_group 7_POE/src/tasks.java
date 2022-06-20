import javax.swing.JOptionPane;

public class tasks {
	
	String[] task1 = {"Task name ", "Task number", "Task Discription", "DeveloperDetails", "Task duration", "Task ID", "Task status"};
	String[] developer = {"Mike", "Edwards", "Samantha", "Glenda"};
	String[] name = {"Create login", "Create add features", "Create Report", "Add arrays"};
	int[] duration = {5, 8, 2, 11};
	String[] ID = {"1", "2", "3", "4"};
	String[] status = {"To Do", "Doing", "Done", "To Do"};
	String[] emptyArr= {};
	
static void checkTaskDescription(String taskDescription ) {
	if(taskDescription.length() >50) {
		JOptionPane.showMessageDialog(null, "No more than 50 characters can be entered");
	}
}
static void printTaskDetails(String taskName, int taskNumber, String taskDescription, String developerDetails, int taskDuration, int taskID, String taskStatus) {
		
		JOptionPane.showMessageDialog(null,"Task name: " + taskName
				+ "\n"
				+ "Task number: " + taskNumber
				+ "\n"
				+ "Task description: " + taskDescription
				+ "\n"
				+ "Developemnt: " + developerDetails
				+ "\n"
				+ "Task duration: " + taskDuration
				+ "\n"
				+ "Task ID: " + taskID
				+ "\n"
				+ "Task status: " + taskStatus);
		}
static void returnTotalHours(int taskDuration, int totalDuration, int i) {
	totalDuration = taskDuration + i;
}
	
	public static void main(String[] args) {
		
		
		
		
		String taskName;
		int taskNumber=0;
		String taskDescription; 
		String developerDetails;
		int taskID=0;
		int taskDuration;
		String taskStatus;
		
		int numericMenu = 3;
		int option;
		int numberOfTasks;
		
		int totalDuration = 0;
		
		JOptionPane.showMessageDialog(null, "Welcome Mirriam Majola");
		
		while (numericMenu !=3) {
		
			option = Integer.parseInt(JOptionPane.showInputDialog("Choose one of the options below \n"
				+ "1) Add tasks \n"
				+ "2) Show report \n"
				+ "3) Quit \n"));
				
				if(option ==1) {
					numberOfTasks = Integer.parseInt(JOptionPane.showInputDialog("Add the number of tasks"));
						if(numberOfTasks ==0) {
							JOptionPane.showMessageDialog(null, "Add tasks for you to work in!!");
							
						if(numberOfTasks >3) {
							JOptionPane.showMessageDialog(null, "No more than 3 Tasks can be entered");
				}
					}
						
							else if(numberOfTasks ==1) {
								taskName = (JOptionPane.showInputDialog(task1[0]));
								taskNumber = taskNumber + 1;
								taskDescription = (JOptionPane.showInputDialog(task1[2]));
								checkTaskDescription(taskDescription);
								developerDetails = (JOptionPane.showInputDialog(task1[3]));
								taskDuration = Integer.parseInt(JOptionPane.showInputDialog(task1[4]));
								taskID = taskID + 1;
								taskStatus = (JOptionPane.showInputDialog(task1[6]));
						
									printTaskDetails(taskName, taskNumber, taskDescription, developerDetails, taskDuration, taskID, taskStatus);
									
						}
						
							else if (numberOfTasks >1) {
								for(int i = 1; i <=numberOfTasks; i++) {
									taskName = (JOptionPane.showInputDialog(task1[0]));
									taskNumber = taskNumber +  i;
									taskDescription = (JOptionPane.showInputDialog(task1[2]));
									checkTaskDescription(taskDescription);
									developerDetails = (JOptionPane.showInputDialog(task1[3]));
									taskDuration = Integer.parseInt(JOptionPane.showInputDialog(task1[4]));
									returnTotalHours(taskDuration, totalDuration, i);
									taskID = taskID + i;
									taskStatus = (JOptionPane.showInputDialog(task1[6]));
									
									printTaskDetails(taskName, taskNumber, taskDescription, developerDetails, taskDuration, taskID, taskStatus);
						
						}
					}	
			}
				
				else if(option == 2) {
					showReport showReports = new showReport();
					
			}
				
			else {
				System.exit(option);
				
			}	
		}
		}
			
			
		}


