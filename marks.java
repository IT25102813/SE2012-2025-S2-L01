import java.util.Scanner;

public class marks{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int num_of_students = scanner.nextInt();

		int[][] marks_array = new int[num_of_students][3]; //[][1] - Mathematics
				                                           //[][2] - Chemistry
														   //[][3] - Physics

		int choice;

    	do{
    		System.out.print("\nSubject ID\n1. Mathematics\n2. Chemistry \n3.Physics\n");

    		System.out.print("\n------------------Menu---------------------\n");
    		System.out.print("1. Add Marks of Student\n");
    		System.out.print("2. Update Marks of Student\n");
    		System.out.print("3. Get Average of a Subject\n");
    		System.out.print("4. Get Average of Student\n");
    		System.out.print("5. Get total marks of Student\n");
            System.out.print("6. Table of Students and marks\n");
    		System.out.print("7. Exit\n");

    		System.out.print("\nEnter your choice: ");
    		choice = scanner.nextInt();

    		int student_id;
    		int subject_id;

    		switch(choice){
    			case 1:
    			        System.out.print("\nEnter Student ID: ");
    					student_id = scanner.nextInt() - 1;

    			        for (subject_id = 0; subject_id < 3; subject_id++)
    					{
    					    switch(subject_id){
    							case 0:
    							        System.out.print("\nEnter Marks for Mathematics: ");
                                        break;

    							case 1:
    							        System.out.print("\nEnter Marks for Chemistry: ");
                                        break;

    							case 2:
    							        System.out.print("\nEnter Marks for Physics: ");
                                        break;
    						}
    						marks_array[student_id][subject_id] = scanner.nextInt();    //Subject didn't get selected directly by the user, so it is let to start from 0
    					}
    					break;

    			case 2:
                        System.out.print("\nEnter Student ID: ");
                        student_id = scanner.nextInt() - 1;

                        System.out.print("\nEnter Subject ID: ");
                        subject_id = scanner.nextInt() - 1;

                        System.out.print("\nEnter New Marks: ");
                        marks_array[student_id][subject_id] = scanner.nextInt();
                        break;

                case 3:
                        System.out.print("\nEnter the Subject ID, you want to find the average of: ");
                        subject_id = scanner.nextInt() - 1;

                        int total_marks = 0;

                        for (int i = 0; i < num_of_students; i++){
                            total_marks = total_marks + marks_array[i][subject_id];
                        }

                        float average_of_subject = (float) total_marks/num_of_students;

                        switch(subject_id){
    							case 0:
    							        System.out.printf("\nAverage marks of Mathematics is %.2f\n", average_of_subject);
                                        break;

    							case 1:
    							        System.out.printf("\nAverage marks of Chemistry is %.2f\n", average_of_subject);
                                        break;

    							case 2:
    							        System.out.printf("\nAverage marks of Physics is %.2f\n", average_of_subject);
                                        break;
    					}
                        break;

                case 4:
                        System.out.print("\nEnter the Student's ID, you want to find the average of: ");
                        student_id = scanner.nextInt() - 1;

                        total_marks = 0;

                        for (int i = 0; i < 3; i++){
                            total_marks = total_marks + marks_array[student_id][i];
                        }

                        float average_of_student = (float) total_marks/3;

                        System.out.printf("\nAverage of student %d is %.2f\n", student_id + 1, average_of_student);
                        break;

                case 5:
                        System.out.print("\nEnter the Student's ID, you want to find the average of: ");
                        student_id = scanner.nextInt() - 1;

                        total_marks = 0;

                        for (int i = 0; i < 3; i++){
                            total_marks = total_marks + marks_array[student_id][i];
                        }

                        System.out.printf("\nTotal Marks of Student %d is %d \n", student_id + 1, total_marks);
                        break;

                case 6: // Display Grades Summary
                    System.out.println("\n----------------- Grade Summary -----------------");
                    System.out.printf("%-12s %-12s %-12s %-12s\n", "Student ID", "Math", "Chemistry", "Physics");
                    System.out.println("-------------------------------------------------");

                    for (int s = 0; s < num_of_students; s++) {
                        System.out.printf("%-12d ", s + 1);

                        for (int sub = 0; sub < 3; sub++) {
                            int score = marks_array[s][sub];
                            String grade;

                            if (score >= 90) {
                                grade = "Grade A";
                            } else if (score >= 80) {
                                grade = "Grade B";
                            } else if (score >= 70) {
                                grade = "Grade C";
                            } else if (score >= 60) {
                                grade = "Grade D";
                            } else {
                                grade = "Fail";
                            }

                            System.out.printf("%-12s ", grade);
                        }
                        System.out.println(); // Move to next student line
                    }
                    break;

                case 7:
                        break;

    		}
        }while (choice !=7 );

		scanner.close();
	}
}
