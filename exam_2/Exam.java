import java.util.Scanner;

public class Exam {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        oddeven();
        primecomposite();
        length();
        number();
        digits();
    }

        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)
        static void oddeven(){
        System.out.println("1. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();

            if(lastTwoDigits % 2 == 0){
                System.out.println("The student number is EVEN");
            }
            else{
                System.out.println("The student number is ODD");
            }
        }
        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // (10 pts)
        static void primecomposite(){

            System.out.println("2. PRIME or COMPOSITE number");

            System.out.print("Enter the last digit of your student number: ");
    
            int lastDigit = scan.nextInt();
    
    
    
            int i, m = 0, flag = 0;
    
            m = lastDigit/2;
    
    
    
            if (lastDigit==0||lastDigit==1){
    
                System.out.println("NEITHER");
    
            }   else{
    
    
    
                for(i = 2;i <= m; i++){
    
                    if (lastDigit % i ==0){
    
                        System.out.println("COMPOSITE");
    
                        flag = 1;
    
                        break;
    
                    }
    
                }
    
                if (flag==0){
    
                    System.out.println("PRIME");
    
                }
    
            }
    
        }
        // ==============================================================================

        // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)
        static void length(){
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        firstName.length();
        System.out.print("Enter your surname: ");
        String surName = scan.next();
        surName.length();
        int totalLength = firstName.length() + surName.length();
        System.out.println("The sum of the character length is = " + totalLength);
        }
        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest
        // number.
        static void number() {
        System.out.println("4. Largest Number");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scan.nextInt();
        if( firstNumber >= secondNumber && firstNumber >= thirdNumber)
        System.out.println(firstNumber+" is the largest Number");

      else if (secondNumber >= firstNumber && secondNumber >= thirdNumber)
        System.out.println(secondNumber+" is the largest Number");

      else
        System.out.println(thirdNumber+" is the largest Number"); 

        }
        // ==============================================================================

        // 5. Create a method and think of a formula to get the last 6 digits of your
        // student number. (10 pts)
        static void digits(){
        System.out.println("5. Last six digits");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();
        int x = 2022102736;
        int lastSix = x % 202200000;
        System.out.println("The last six digits are = " + lastSix);



        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        studentNumber = scan.nextInt();
        if (studentNumber == 2022102736) {
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        String firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        String surName = scan.next();
        if (firstName == firstName.toUpperCase() && surName == surName.toLowerCase()) {
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
        

        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

        System.out.println("8. Nested conditions"); 

       System.out.print("Enter your enrolled course (BSIT or BSCS): "); 
        
         String course = scan.next(); 

        
        switch (course) {
            case "BSIT":
            System.out.println("Valid");
            System.out.print("Enter your specialization (MWAA or MAA): "); 
            String specialization2 = scan.next(); 
        switch (specialization2) {
            case "MWAA":
            System.out.println("Valid");
            break;
            case "MAA":
            System.out.println("Valid");
            break;
            default:
            System.out.println("Invalid");
        }
            case "BSCS":
            System.out.println("Valid");
            System.out.print("Enter your specialization (DF or ML): "); 
            String specialization1 = scan.next(); 
         switch (specialization1) {
                case "DF":
                System.out.println("Valid");
                break;
                case "ML":
                System.out.println("Valid");
                break;
                default:
                System.out.println("Invalid");
         }
        
        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

        System.out.println("9. Selection");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");

        String strand = scan.next();

        switch (strand){
            case "STEM":
                System.out.println("Valid");
                break;
            case "ICT":
                System.out.println("Valid");
                break;
            case "HUMSS":
                System.out.println("Valid");
                break;
            case "HOME ECONOMICS":
                System.out.println("Valid");
                break;
                case "ARTS AND DESIGN":
                System.out.println("Valid");
                break;
            case "TVL MARITIME":
                System.out.println("Valid");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

        // ==============================================================================

        // 10. Create a condition to check if your student email address contains the
        // following pattern:
        // - Your surname
        // - The string "@students.national-u.edu.ph"
        // (10 pts)
        System.out.println("10. Validate student email address ");
        System.out.print("Enter your student email address: ");
    
        String studentEmailAddress = scan.next();
        studentEmailAddress = "hernandezjr@students.national-u.edu.ph";

            if (studentEmailAddress.contains("hernandez")){
                System.out.println("Valid");
            }
            else if (studentEmailAddress.contains("@students.national-u.edu.ph")){
                System.out.println("Valid");
            }
            else {
                System.out.println("Invalid");
            }

        // ==============================================================================
        // Programming competition/Job interview level question (20 points)

        // 11. Mystery method :-)

        // Find the formula of method f(n) that accepts any positive integer n.

        // If n = 4, result is 2
        // f(4) = - 1 + 2 - 3 + 4 = 2

        // If n = 5, result is -3
        // f(5) = - 1 + 2 - 3 + 4 - 5 = - 3

        System.out.println("11. Mystery method! :-)");
        System.out.print("Enter value of n: ");
        int n = scan.nextInt();
        // Close scanner
        scan.close();
    }
   
}
    }

