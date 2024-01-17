package javaCourseProject;

import java.util.Scanner;

public class JavaCourse {

	Scanner sc = new Scanner(System.in);
	MCQ_interview mc = new MCQ_interview();

	String topics = """
			+=========================+
			|       JAVA TOPICS       |
			+=========================+
			| Enter:-                 |
			|                         |
			| 1.Introduction of JAVA. |
			| 2.Class in Java.        |
			| 3.Objects in Java.      |
			| 4.Data Types in Java.   |
			| 5.Variables in Java.    |
			| 6.Methods in Java.      |
			|-------------------------|
			| 0.To go back.           |
			+=========================+
					""";
	String intro = """
			            +----------------------+
			------------| Introduction to JAVA |--------------
			            +----------------------+

			=> Java is a popular programming language
			   known for its platform independence, object-oriented nature,
			   and robustness.

			=> It was developed by James Gosling and his team
			   at Sun Microsystems (which is now owned by Oracle Corporation)
			   in the mid-1990s.

			* Features of Java:-
			  ----------------
			    1) Platform Independence.
				2) Object-Oriented Programming (OOP).
				3) High Level.
				4) Multi-Threaded.
				5) Interpreted.
				6) Secured.
				7) Platform Independent.
			----------------------------------------------------------------
			""";

	String classiJ = """
			                    +---------------+
			--------------------| Class in Java |---------------------
			                    +---------------+

			=> In Java, a class is a fundamental building block of
			   object-oriented programming. It serves as a blueprint or
			   template for creating objects, which are instances of the class.
			   A class defines the properties (attributes) and behaviors (methods)
			   that objects of that class will have.

			* Create a Class:-
					- To create a class, use the keyword "class".

			* For example:-
				code:-
			                    +-----------------------------------------+
				       | public class MyClass{                   |
				       |    int x = 5;                           |
				       |                                         |
				       | public static void main(String []args){ |
				       |     System.out.println(x);              |
				       |    }                                    |
				       | }                                       |
				       |-----------------------------------------|
				       | Output:-                                |
				       +-----------------------------------------+
			""";

	String obj = """
			                       +----------------+
			-----------------------| Object in Java |------------------
			                       +----------------+

			=> In Java, an object is created from a class.
			   Object is an instance of a class. When you create an object,
			   you are essentially creating a specific realization of the class,
			   with its own unique set of values for the fields.

			* Create a Object:-
				=>To create an object, you use the "new" keyword followed by the class.

			* For example:-
				Code:-
				         +------------------------------------------+
						 | public class MyClass{                    |
						 |      int x = 5;                          |
						 |                                          |
						 | public static void main(String []args){  |
						 |    MyClass obj = new MyClass();          |
						 |    System.out.println(obj.x);            |
						 |    }                                     |
						 | }                                        |
						 |------------------------------------------|
						 | Output:- 5                               |
						 +------------------------------------------+
			""";

	String dataType = """
			                     +--------------------+
			---------------------| Data Types in JAVA |---------------------
			                     +--------------------+

			 => Data types in Java are of different sizes and values that can be stored
			    in the variable that is made as per convenience and circumstances to
			    cover up all test cases.

			                                         Data Types
			                                             |
			                                             |
			                      +----------------------+------------------------+
			                      |                                               |
			                      |                                               |
			                  Primitive                                     Non-Primitive
			                      |                                               |
			            +---------+----------------------+                +-------+----------+
			            |                                |                |                  |
			            Numeric                        Non-Numeric       user-defined        derived
			               |                                |                |                  |
			     +----+----+---+-----+-----+           +----+-----+      +---+------+           |
			     |    |    |   |     |     |           |          |      |          |           |
			   byte short int long float double     boolean      Char   Class      Enum       Array

			""";

	String variable = """
			                        +-------------------+
			------------------------| Variables in JAVA |------------------------
			                        +-------------------+

			         => Java variable is a name given to a memory location. It is the basic unit of
			            storage in a program.

			         => Variables are the data containers that save the data values during
			            Java program execution. Every Variable in Java is assigned a data type
			            that designates the type and quantity of value it can hold.
			            A variable is a memory location name for the data.

			* Syntax:-
			           data_type variable_Name = value;

			* for example:-
			         +----------------------------------------+
			         | public class MyName{                   |
			         |                                        |
			         | public static void main(String []args{ |
			         |    String name = "John";               |
			         |    System.out.println(name);           |
			         |   }                                    |
			         | }                                      |
			         |----------------------------------------|
			         | Output:- John                          |
			         +----------------------------------------+
			""";

	String method = """
			                    +-----------------+
			--------------------| Methods in JAVA |------------------
			                    +-----------------+

			         => A method is a block of code which only runs when it is called.

			         => You can pass data, known as parameters, into a method.

			         => Methods are used to perform certain actions, and they are also known as functions.

			         => Why use methods? To reuse code: define the code once, and use it many times.

			         * Syntax:-
			                  | public class Main {
			                  |   static void myMethod() {
			                  |       // code to be executed
			                  |   }
			                  | }

			           Explanation:-
			                * "myMethod()" is the name of the method.
			                * "static" means that the method belongs to the Main class and
			                  not an object of the Main class.
			                * "void" means that this method does not have a return value.

			         * for example:-
			                     +------------------------------------------+
			                     | public class Main{                       |
			                     |   static void myMethod(){                |
			                     |    System.out.println("hello my method");|
			                     |   }                                      |
			                     |                                          |
			                     | public static void main(String []args){  |
			                     |       myMethod();                        |
			                     |    }                                     |
			                     | }                                        |
			                     |------------------------------------------|
			                     | Output: hello my method                  |
			                     +------------------------------------------+
			""";

	int key;

	public void javaCourse() {

		do {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Enter 1.Java Topics | 2.MCQ Test | 3.Interview Question | 4.Back");
			System.out.println("-----------------------------------------------------------------");
			int key = sc.nextInt();

			switch (key) {
			case 1:

				int topickey;
				do {
					System.out.println(topics);
					topickey = sc.nextInt();

					switch (topickey) {
					case 1:
						int back;
						do {
							System.out.println(intro);
							System.out.println("---------------------");
							System.out.println("Enter 0 to go back.");
							System.out.println("---------------------");
							back = sc.nextInt();
						} while (back != 0);

						break;

					case 2:
						do {
							System.out.println(classiJ);
							System.out.println("---------------------");
							System.out.println("Enter 0 to go back.");
							System.out.println("---------------------");
							back = sc.nextInt();
						} while (back != 0);

						break;

					case 3:
						do {
							System.out.println(obj);
							System.out.println("---------------------");
							System.out.println("Enter 0 to go back.");
							System.out.println("---------------------");
							back = sc.nextInt();
						} while (back != 0);
						break;

					case 4:
						do {
							System.out.println(dataType);
							System.out.println("---------------------");
							System.out.println("Enter 0 to go back.");
							System.out.println("---------------------");
							back = sc.nextInt();

						} while (back != 0);
						break;

					case 5:
						do {
							System.out.println(variable);
							System.out.println("---------------------");
							System.out.println("Enter 0 to go back.");
							System.out.println("---------------------");
							back = sc.nextInt();
						} while (back != 0);
						break;

					case 6:
						do {
							System.out.println(method);
							System.out.println("---------------------");
							System.out.println("Enter 0 to go back.");
							System.out.println("---------------------");
							back = sc.nextInt();
						} while (back != 0);
						break;

					case 0:
						javaCourse();
						break;

					default:
						System.out.println("Please Enter Valid Choice");
						break;
					}
				} while (topickey != 0);
				break;

			case 2:
				int mcqkey;
				mc.mcqMethod();

				System.out.println("Enter 0 to go back...!");
				mcqkey = sc.nextInt();
				if (mcqkey == 0) {
					javaCourse();
				}

				break;

			case 3:
				int interviewkey;
				mc.interviewQuestion();

				System.out.println();
				System.out.println("-----------------------");
				System.out.println("Enter 0 to go back...!");
				System.out.println("-----------------------");
				interviewkey = sc.nextInt();
				if (interviewkey == 0) {
					javaCourse();
				}
				break;

			case 4:
//				Login_J_T jc = new Login_J_T();
//				jc.login();
				System.out.println();
				System.out.println("                +----------------------+                               ");
				System.out.println("----------------|        LOGOUT        |---------------------");
				System.out.println("                +----------------------+                               ");
				System.out.println();
				break;

			default:
				System.out.println("Please Enter Valid Key...! ");
				break;
			}
			break;
		} while (key >= 0);
	}
}