package javaCourseProject;

import java.util.Scanner;

public class Login_J_T {

	static Scanner sc = new Scanner(System.in);
	static JavaCourse jc = new JavaCourse();
	static Student sarr[] = new Student[10];
	static String name, contact, email, username, password;
	public static String adminName = "myAdmin";
	public static String adminPassword = "Admin@123";
	public int count = 1;

	public void registerUser() {
		System.out.println();
		System.out.println("======= Enter your Name, Contact, Email, Username, Password =========");
		name = sc.next();
		contact = sc.next();
		email = sc.next();
		username = sc.next();
		password = sc.next();
		System.out.println();

		sarr[count] = new Student(name, contact, email, username, password, count);
		System.out.println();
		System.out.println("********************************");
		System.out.println();
		System.out.println("-----------------+[" + name.toUpperCase()
				+ " You Have Successfully Registered +]----------------------");
		System.out.println();
		System.out.println();
		System.out.println("****************************************");
		System.out.println();
		System.out.println("      Your Username: |" + username);
		System.out.println("      Password: |" + password);
		System.out.println("      ID: " + count++);
		System.out.println();
		System.out.println("****************************************");
		System.out.println();
		System.out.println();
		System.out.println("--------------------------[  Use your USERNAME and PASSWORD ]--------------------------");
		System.out
				.println("-----------------------------------==[ To LOGIN  ]==---------------------------------------");
		System.out.println();

	}

	public void getStudentById() {
		int id;
		System.out.println();
		System.out.println("---------------[ Enter ID to Get Student Record ]------------------");
		System.out.println();
		id = sc.nextInt();
		for (Student sr : sarr) {
			if (sr != null && id == sr.getCount()) {
				System.out.println();
				System.out.println("ID: " + sr.getCount() + "\n Name: " + sr.getName() + "\n Contact: "
						+ sr.getContact() + "\n Email ID: " + sr.getEmail());
				System.out.println();
			}
		}
	}

	public void deleteStudent() {
		int id;
		System.out.println();
		System.out.println("---------------[ Enter name ID to Delete Student Record ]----------------");
		id = sc.nextInt();
		for (int i = 0; i < sarr.length; i++) {
			if (sarr[i] != null && sarr[i].getCount() == id) {
				sarr[i] = null;
				System.out.println("--------------[ Student Record Deleted Successfully ]---------------");
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Login_J_T jt = new Login_J_T();

		int key = 0;
		int choice = 0;

		do {
			System.out.println();
			System.out.println("----------------+| Enter 1.Register | 2.Login |+---------------");
			key = sc.nextInt();

			switch (key) {
			case 1:

				jt.registerUser();

				break;

			case 2:

				do {
					System.out.println("---------------+| Enter 1.Student | 2.Admin |+---------------");
					choice = sc.nextInt();
					System.out.println();

					switch (choice) {
					case 1:

						System.out.println("-----------+| Enter Your Username and Password |+-------------");
						String stuName = sc.next();
						String stuPass = sc.next();

						for (Student s : sarr) {
							if (s != null) {
								if (stuName.equals(s.getUsername()) && stuPass.equals(s.getPassword())) {
									System.out.println();
									System.out.println(
											"------------------+[ YOU HAVE SUCCESSFULLLY LOGED IN ]+---------------------");
									System.out.println();
									System.out.println("*********************|> HELLO " + name.toUpperCase()
											+ " <|**********************");
									System.out.println();
									System.out.println(
											"============================================================================");
									System.out.println();
									System.out.println("                       +------------------------+");
									System.out.println(
											"--------------------=> | WELCOME TO JAVA COURSE | <=--------------------------");
									System.out.println("                       +------------------------+");
									System.out.println();

									jc.javaCourse();
									break;
								} else {
									System.out.println();
									System.out.println("######### You Enter Wrong USER_NAME and PASSWORD #########");
									System.out.println();
								}
							}
						}

						break;

					case 2:

						System.out.println("------------+[ Enter Admin_name and Password ]+-------------");
						String adName = sc.next();
						String adpass = sc.next();

						if (adName.equals(adminName) && adpass.equals(adminPassword)) {
							Admin ad = new Admin();
							System.out.println();
							System.out.println(
									"******************* |> Admin is Successfully Login <| **********************");
							System.out.println();
							ad.main();
						} else {
							System.out.println();
							System.out.println("############# You Enter Wrong ADMIN_NAME and PASSWORD ###############");
							System.out.println();
						}
						System.out.println();
						System.out.println("--------------------==> Try Again <==---------------------");
						System.out.println();
						break;

					default:
						System.out.println("############### Please Enter Valid Choice ###############");
						break;
					}
				} while (choice > 0);

				break;

			default:
				System.out.println("########## Please Enter Valid Choice #################");
				break;
			}
		} while (key > 0);

	}

}