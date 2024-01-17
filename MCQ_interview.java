package javaCourseProject;

import java.util.Scanner;

public class MCQ_interview {

	public void mcqMethod() {

		Scanner sc = new Scanner(System.in);

		String questions[] = { "Who invented Java Programming?", "Which statement is true about Java?",
				"Which one of the following is not a Java feature?", "What is the extension of java code files?"

		};

		String[][] options = {
				{ "a. Guido van Rossom", "b. James Gosling", "c. Dennis Ritchie", "d. Bjarne Stroustrup" },
				{ "a) Java is a sequence-dependent programming languag",
						"b) Java is a code dependent programming language",
						"c) Java is a platform-dependent programming language",
						"d) Java is a platform-independent programming language" },
				{ "a) Object-oriented", "b) Use of pointers", "c) Portable", "d) Dynamic and Extensible" },
				{ "a) .js", "b) .txt", "c) .class", "d) .java" } };

		char ans[] = { 'b', 'd', 'b', 'd' };

		int score = 0;

		System.out.println(">>>>>>>>>>>>>>>>>>| Your MCQ Test is Started. |<<<<<<<<<<<<<");
		System.out.println();
		System.out.println("=======================> BEST OF LUCK <=======================");
		System.out.println("===============");
		System.out.println();

		for (int i = 0; i < questions.length; i++) {
			System.out.println("Q." + (i + 1) + ")" + questions[i]);
			for (String optn : options[i]) {
				System.out.println(optn);
			}
			System.out.println("Your Ans: ");
			char yourAns = sc.next().charAt(0);

			if (yourAns == ans[i]) {
				System.out.println("Correct Answer! :)");
				System.out.println();
				score++;
			} else {
				System.out.println("Sorry Wrong Answer! :(, Correct Answer is " + options[i][ans[i] - 'a']);
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("*****************************");
		System.out.println("MCQ Test Completed! Your Score: " + score + "/" + questions.length);
		System.out.println("*****************************");

	}

	public void interviewQuestion() {

		String interQ = """
				                    *********
				******* INTERVIEW QUESTIONS *********
				                    *********

				 ------ PREPARE FOR INTERVIEW TO GET HIRED IN YOUR DREAM JOB --------
				 --------------------------------------------------------------------

				 Q.1) What is Java?
				 Answer:- Java is a widely used, high-level, object-oriented programming
				          language known for its portability, platform independence, and
				          robustness. It's designed to run on any platform that has a
				          Java Virtual Machine (JVM).


				 Q.2) What is the difference between JDK, JRE, and JVM?
				 Answer: JDK (Java Development Kit): It includes the tools needed to develop,
				                                     compile, and run Java applications.
				         JRE (Java Runtime Environment): It includes the JVM and libraries
				                                         required to run Java applications.
				         JVM (Java Virtual Machine): It executes Java bytecode, providing
				                                     platform independence.


				 Q.3) Explain the concept of method overloading and method overriding.
				 Answer: Method overloading is when multiple methods in the same class have
				         the same name but different parameters. Method overriding occurs when
				         a subclass provides a specific implementation for a method that is
				         already defined in its superclass.


				 Q.4) What is a constructor?
				 Answer: A constructor is a special method that is used to initialize an
				         object when it's created. It has the same name as the class and doesn't
				         have a return type.

				 Q.5) How does garbage collection work in Java?
				 Answer: Garbage collection automatically reclaims memory occupied by objects
				         that are no longer referenced. The Java Virtual Machine periodically
				         identifies and removes unreferenced objects, freeing up memory.

				 Q.6) What is the purpose of the final keyword?
				 Answer: The final keyword can be applied to classes, methods, and variables.
				         It indicates that a class cannot be extended, a method cannot be overridden,
				         and a variable cannot be reassigned once initialized.

				 Q.7) What is a package in Java?
				 Answer: A package is a way to organize related classes and interfaces into a namespace.
				         It helps in avoiding naming conflicts and provides better modularity and code organization.

				""";
		System.out.println(interQ);
	}

}