import java.util.Scanner;

public class marks{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of students");
		int num_of_students = scanner.nextInt();

		int[][] marks_array = new int[num_of_students][3]; //[][1] - Mathematics
				 //[][2] - Chemistry
				 //[][3] - Physics

    	do{
    		System.out.print("Subject ID\n1. Mathematics\n2. Chemistry 3.Physics\n");

    		System.out.print("------------------Menu---------------------");
    		System.out.print("1. Add Marks of Student");
    		System.out.print("2. Update Marks of Student");
    		System.out.print("3. Get Average of a Subject");
    		System.out.print("4. Get Average of Student");
    		System.out.print("5. Get total marks of Student");
    		System.out.print("6. Exit");

    		System.out.print("\nEnter your choice: ");
    		int choice = scanner.nextInt();

    		int student_id;
    		int subject_id;

    		switch(choice){
    			case 1:
    			        System.out.print("Enter Student ID: ");
    					student_id = scanner.nextInt() - 1;

    			        for (subject_id = 0; subject_id < 3; subject_id++)
    					{
    					    switch(subject_id){
    							case 0:
    							        System.out.print("Enter Marks for Mathematics: ");
                                        break;

    							case 1:
    							        System.out.print("Enter Marks for Chemistry: ");
                                        break;

    							case 2:
    							        System.out.print("Enter Marks for Physics: ");
                                        break;
    						}
    						marks_array[student_id][subject_id] = scanner.nextInt();    //Subject didn't get selected directly by the user, so it is let to start from 0
    					}
    					break;

    			case 2:
                        System.out.print("Enter Student ID: ");
                        student_id = scanner.nextInt() - 1;

                        System.out.print("Enter Subject ID: ");
                        subject_id = scanner.nextInt() - 1;

                        System.out.print("Enter New Marks: ");
                        marks_array[student_id][subject_id] = scanner.nextInt();
                        break;

                case 3:
                        System.out.print("Enter the Subject ID, you want to find the average of: ");
                        subject_id = scanner.nextInt() - 1;

                        int total_marks = 0;

                        for (int i = 0; i < num_of_students; i++){
                            total_marks = total_marks + marks_array[i][subject_id]
                        }

                        float average_of_subject = (float) total_marks/num_of_students;

                        switch(subject_id){
    							case 0:
    							        System.out.printf("Average marks of Mathematics is %.2f\n", average_of_subject);
                                        break;

    							case 1:
    							        System.out.printf("Enter Marks for Chemistry is %.2f\n", average_of_subject);
                                        break;

    							case 2:
    							        System.out.printf("Enter Marks for Physics is %.2f\n", average_of_subject);
                                        break;
    					}
                        break;

                case 4:
                        System.out.print("Enter the Student's ID, you want to find the average of: ");
                        student_id = scanner.nextInt() - 1;

                        total_marks = 0;

                        for (int i = 0; i < 3; i++){
                            total_marks = total_marks + marks_array[student_id][i];
                        }

                        float average_of_student = (float) total_marks/3;

                        System.out.printdf("Average of student ")


    		}
        }while (choice !=6 );

		scanner.close();
	}
}
