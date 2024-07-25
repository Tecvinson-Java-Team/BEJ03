
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Scanner;

public class ConsoleAppMain {

    public static  void main(String[] args) throws IOException {

         // Calling the scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students file do you want to create");
        int noOfStudentsFile = scanner.nextInt();
        scanner.nextLine();

         //Defining the arrays for sorting
        String[] fullNames = new String[noOfStudentsFile];
        double[] theAverages = new double[noOfStudentsFile];

        //Creating the Student file
        try {
            File file = new File("studentFile.txt");
            boolean status = file.createNewFile();
            if (status) {
                System.out.println("File creation successful");
            } else {
                System.out.println("File creation failed");
            }
        } catch (IOException ex) {
            System.out.println("Error in File creation");
        }
        /*Calling the writer outside the loop so it writes to just one file
        Also adding Append so if recognises that fact*/
        FileWriter  myWriter = new FileWriter("studentFile.txt",true);

       //The loop runs as many times as the user would have predetermined
        for (int i = 0; i < noOfStudentsFile; i++) {

            //Calling inputs to automatically Instantiate our constructors
            System.out.println("Enter First Name");
            String firstName = scanner.nextLine();
            System.out.println("Enter Last Name");
            String lastName = scanner.nextLine();
            String fullName = firstName + " " + lastName;

            System.out.println("Date of Birth");
            String dateOfBirth = scanner.nextLine();
            System.out.println("Gender");
            String gender = scanner.nextLine();
            System.out.println("Class");
            String theClass = scanner.nextLine();

            System.out.println("Now Enter Subject Scores");

            System.out.println("Enter Mathematics Score");
            double mathematics = scanner.nextDouble();
            System.out.println("Enter English Score");
            double englishLanguage = scanner.nextDouble();
            System.out.println("Enter Basic Science Score");
            double basicScience = scanner.nextDouble();
            System.out.println("Enter Agriculture Score");
            double agriculture = scanner.nextDouble();
            System.out.println("Enter Social Studies Score");
            double socialStudies = scanner.nextDouble();
            scanner.nextLine();

            //The constructors
            SubjectDetails subject = new SubjectDetails(mathematics, englishLanguage, basicScience, agriculture, socialStudies);
            StudentDetails studentDetails = new StudentDetails(firstName, lastName, dateOfBirth, gender, theClass, subject);

            //Displays studentDetails and SubjectDetails info on the console
            studentDetails.ShowStudentDetails();
            studentDetails.subject.ShowSubjectDetails();

            //Calculating Averages as it helps to arrange students in order of highest performing
            double averageScore = ((mathematics + englishLanguage + basicScience + agriculture + socialStudies) / 5);
            fullNames[i] = fullName;
            theAverages[i] = averageScore;


            //writing the values of each iteration to the file created
            try {
                myWriter.write("First Name: " + firstName + '\n');
                myWriter.write("Last Name: " + lastName + '\n');
                myWriter.write("Date Of Birth: " + dateOfBirth + '\n');
                myWriter.write("Gender: " + gender + '\n');
                myWriter.write("CLASS: " + theClass + '\n');
                myWriter.write("Mathematics Score: " + mathematics + '\n');
                myWriter.write("English Language Score: " + englishLanguage + '\n');
                myWriter.write("Basic Science Score: " + basicScience + '\n');
                myWriter.write("Agriculture Score: " + agriculture + '\n');
                myWriter.write("Social Studies Score: " + socialStudies + '\n');
                myWriter.write("Total Average Score: " + averageScore + '\n');
                myWriter.write('\n');

            } catch (IOException e) {
                System.out.println("There was an issue storing files");
            }

        }

        //Sorting using Interger Array
        Integer[] indices = new Integer[fullNames.length];
        for (int i = 0; i < fullNames.length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, Comparator.comparingDouble(index -> theAverages[(int) index]).reversed());

        String[] sortedFullNames = new String[fullNames.length];
        double[] sortedTheAverages = new double[theAverages.length];
        for (int i = 0; i < fullNames.length; i++) {
            sortedFullNames[i] = fullNames[indices[i]];
            sortedTheAverages[i] = theAverages[indices[i]];
        }

        //Printing Results to the Console
        System.out.println("THE NUMBER OF STUDENT DETAILS YOU INPUTTED WAS : "+ noOfStudentsFile+'\n');
        System.out.println("STUDENT LIST BASED ON OVERALL PERFORMANCE BY AVERAGE SCORES\n");
        for (int i = 0; i < sortedFullNames.length; i++) {
            System.out.println((i+1)+". " + sortedFullNames[i] + ": " + sortedTheAverages[i]);
        }

        scanner.close();
        myWriter.close();
    }

}

