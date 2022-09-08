public class App {
    public static void main(String[] args) {
        
        Character student = new Character();

        student.surname = "Hernandez";
        student.firstName = "JillianMarie";
        student.middleInitial = 'R';
        student.dateOfBirth = 9/3/2003;
        student.studentNumber = 2022102736;
        student.studentEmailAddress = "hernandezjr@students.national-u.edu.ph";
        student.iAmAwesome = true;
        student.sayMySurname();
        student.sayMyEmailAddress();
        student.sayMyiAmAwesome();
      
    }
}
