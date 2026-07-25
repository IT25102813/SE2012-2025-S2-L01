import java.util.Scanner;

public class marks{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of students");
		int num_of_students = scanner.nextInt();

		int[][] marks_array = new int[num_of_students][3]; //[][1] - Mathematics
				 //[][2] - Chemistry
				 //[][3] - Physics

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
					student_id = scanner.nextInt();

			        for (subject_id = 0; subject_id < 3; subject_id++)
					{
					    switch(subject_id){
							case 0:
							        System.out.print("Enter Marks for Mathematics: ");

							case 1:
							        System.out.print("Enter Marks for Chemistry: ");

							case 2:
							        System.out.print("Enter Marks for Physics: ");
						}
						marks_array[student_id - 1][subject_id] = scanner.nextInt();    //Subject didn't get selected directly by the user, so it is let to start from 0
					}
					break;

			case 2:
                    System.out.print("Enter Student ID: ");
                    student_id = scanner.nextInt();

                    System.out.print("Enter Subject ID: ");
                    subject_id = scanner.nextInt();

                    System.out.print("Enter New Marks: ");
                    marks_array[student_id - 1][subject_id - 1] = scanner.nextInt();

            case 3:
                    System.out.print("Enter the Subject you want to find the average of: ");
                    for (int i = 0; i

		}
		scanner.close();
	}
}
