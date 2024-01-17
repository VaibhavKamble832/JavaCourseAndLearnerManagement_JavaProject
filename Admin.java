package javaCourseProject;

import java.util.Scanner;

class Admin {
	private int id;
	private String name;
	private String contact;
	private String email;

	Scanner sc = new Scanner(System.in);
	Student[] sArr = new Student[10];
	Admin[] aArr = new Admin[10];
	Login_J_T jt = new Login_J_T();

	public String toString() {
		return id + " " + name + " " + contact + " " + email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getContact() {
		return contact;
	}

	public String getEmail() {
		return email;
	}

	int count = 0;

	public void main() {

		Admin a = new Admin();
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println();
			System.out.println("Enter ( 1.Select | 2.Delete | 3.Return to Home Page ) Student");
			System.out.println();
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				jt.getStudentById();
				break;

			case 2:
				jt.deleteStudent();
				break;

			case 3:
				System.out.println();
				System.out.println("---------------------- EXIT -----------------");
				System.out.println();
				break;
			default:
				System.out.println("Please Enter Valid choice");
				break;
			}
		} while (choice != 3);
	}
}