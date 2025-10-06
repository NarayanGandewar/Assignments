package language.basics;

public class Assignment2Arrays {

	public static void main(String[] args) 
	{
		//5 sem, 6 Subjects, 2 status & marks
		
		/* Sem 1
		Sub 1: Mathematics I, Pass(78)
		Sub 2: Physics, Pass(85)
		Sub 3: Chemistry, Fail(21)
		Sub 4: Computer Programming, Pass(74)
		Sub 5: Engineering Drawing, Pass(88)
		Sub 6: Basic Electrical Eng., Pass(79)

		Sem 2
		Sub 1: Mathematics II, Pass(82)
		Sub 2: Mechanics, Pass(77)
		Sub 3: Environmental Sci., Pass(93)
		Sub 4: Basic Electronics, Fail(19)
		Sub 5: Engineering Physics, Fail(24)
		Sub 6: Engineering Graphics, Pass(90)

		Sem 3
		Sub 1: Data Structures, Pass(88)
		Sub 2: Discrete Mathematics, Pass(81)
		Sub 3: Digital Electronics, Pass(76)
		Sub 4: Operating Systems, Fail(32)
		Sub 5: Signals and Systems, Pass(85)
		Sub 6: Object-Oriented Prog., Pass(78)

		Sem 4
		 Sub 1: Algorithms, Pass(91)
		 Sub 2: Computer Networks, Pass(73)
		 Sub 3: Database Systems, Fail(19)
		 Sub 4: Microprocessors, Pass(80)
		 Sub 5: Communication Eng., Pass(76)
		 Sub 6: Software Engineering, Pass(87)

		Sem 5
		 Sub 1: Probability & Stats, Pass(86)
		 Sub 2: Machine Learning, Pass(88)
		 Sub 3: Compiler Design, Pass(84)
		 Sub 4: Theory of Computation, Pass(95)
		 Sub 5: Embedded Systems, Pass(73)
		 Sub 6: Computer Graphics, Pass(90)
		 */
		
		/*Create a 3D array to represent the following data:
			o Semesters as the first dimension.
			o Subjects and Status/Marks as the second dimension.
			o Actual values for Subject Names and Marks as the third dimension.*/
		
		String [][][] collegesemdata = new String[5][6][2];
		
		/*From the array:
            o Print Semester 2 Subject 4 and Subject 5 names.
             */
		collegesemdata[1][3][0] ="Mathematics II";
		collegesemdata[1][4][0] ="Engineering Physics";
		
		System.out.println("Semester 2 Subject 4" + collegesemdata[1][3][0]);
		System.out.println("Semester 2 Subject 5" + collegesemdata[1][3][0]);
		
		//o Print the Status/Marks of Semester 4 Subject 3 and Subject 6
		
		collegesemdata[3][2][0] ="Computer Networks";
		
		collegesemdata[3][2][1] = "Fail(19)";
		
		System.out.println("Semester 4 Subject 3" + collegesemdata[3][2][1]);
		
        collegesemdata[3][5][0] ="Software Engineering";
		
		collegesemdata[3][5][1] = "Pass(87)";
		
		System.out.println("Semester 4 Subject 6" + collegesemdata[3][5][1]);
		
		
		

	}

}
