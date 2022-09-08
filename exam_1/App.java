public class App {
    public static void main(String[] args) {
        
        Student jm = new Student();

        jm.surname = "Hernandez";
        jm.firstName = "JillianMarie";
        jm.middleInitial = 'R';
        jm.dateOfBirth = 9/3/2003;
        jm.studentNumber = 2022102736;
        jm.studentEmailAddress = "hernandezjr@students.national-u.edu.ph";
        jm.iAmAwesome = true;
        jm.sayMyStudentNumber();
        jm.sayMyEmailAddress();
        jm.sayMyiAmAwesome();
      
    }
}
