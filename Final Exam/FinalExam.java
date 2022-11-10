public class FinalExam {
    public static void main(String[] args) throws Exception {

        // Print the words in their given pattern.

        char[][] array = {
                { 'A', 'S', 'R', 'S', 'S', 'U', 'U', 'I', 'O', 'L', 'M', 'A', 'U', 'Z', 'F' },
                { 'Q', 'B', 'N', 'E', 'H', 'U', 'W', 'E', 'B', 'E', 'S', 'K', 'G', 'I', 'T' },
                { 'B', 'A', 'N', 'A', 'N', 'A', 'Q', 'U', 'E', 'N', 'U', 'R', 'N', 'U', 'H' },
                { 'Q', 'U', 'K', 'N', 'Q', 'L', 'S', 'L', 'X', 'O', 'M', 'A', 'J', 'S', 'G' },
                { 'L', 'T', 'W', 'O', 'C', 'E', 'H', 'I', 'R', 'V', 'L', 'W', 'M', 'L', 'I' },
                { 'M', 'I', 'T', 'U', 'V', 'Z', 'S', 'E', 'O', 'E', 'Y', 'B', 'G', 'E', 'L' },
                { 'Q', 'W', 'K', 'L', 'E', 'C', 'U', 'J', 'X', 'M', 'N', 'F', 'W', 'K', 'G' },
                { 'K', 'L', 'G', 'Y', 'N', 'Q', 'P', 'A', 'L', 'B', 'A', 'U', 'X', 'T', 'I' },
                { 'M', 'O', 'U', 'H', 'E', 'B', 'M', 'T', 'M', 'E', 'J', 'I', 'R', 'F', 'M' },
                { 'Y', 'U', 'T', 'B', 'P', 'U', 'M', 'H', 'Z', 'R', 'D', 'T', 'F', 'Y', 'N' },
                { 'S', 'J', 'R', 'K', 'J', 'S', 'B', 'X', 'I', 'S', 'S', 'D', 'P', 'Y', 'A' },
                { 'P', 'A', 'D', 'Y', 'I', 'N', 'U', 'X', 'D', 'R', 'G', 'Q', 'H', 'L', 'S' },
                { 'B', 'R', 'L', 'P', 'Q', 'T', 'I', 'H', 'O', 'F', 'S', 'U', 'M', 'R', 'Y' },
                { 'K', 'S', 'O', 'N', 'I', 'C', 'C', 'U', 'P', 'P', 'A', 'R', 'F', 'M', 'X' },
                { 'D', 'W', 'O', 'T', 'M', 'M', 'Q', 'B', 'O', 'U', 'H', 'J', 'L', 'G', 'C' }
        };

        // =============================================================
        // BANANAQUE - (10 points)
        System.out.println(" ");
        System.out.println("1. BANANAQUE ");

        for (int row = 2; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 9; column++) {
                if (row == 2) {
                    System.out.print(array[row][column]);
            }
        }
       }
        // =============================================================
        // FRAPPUCCINO - (10 points)
        System.out.println(" ");
        System.out.println("2. FRAPPUCCINO ");

        for (int row = 0; row < 15; row++) {
            System.out.println("");
            for (int column = 2; column < 13; column++) {
                if (row == 13) {
                    System.out.print(array[row][column]);
            }
        }
       }
        // =============================================================
        // NOVEMBER - (10 points)
        System.out.println(" ");
        System.out.println("3. NOVEMBER ");

        for (int row = 2; row < 10; row++) {
            System.out.println("");
            for (int column = 9; column < 15; column++) {
                if (column == 9) {
                    System.out.print(array[row][column]);
            }
        }
       }

        // =============================================================
        // TIKTOK - (10 points)
        System.out.println(" ");
        System.out.println("4. TIKTOK ");

        
        for (int row = 7; row < 15; row++) {
        System.out.println("");
        for (int column = 0; column < 15; column++) {
            if (column == 0 && row == 7) {
                 System.out.print(array[row][column]);
            }
                 else if (row == 7 && column == 0) {
                    System.out.print(array[row][column]);   
}
                else if (row == 8 && column == 1) {
                    System.out.print(array[row][column]);   
}
                else if (row == 9 && column == 2) {
                    System.out.print(array[row][column]);   
}
                else if (row == 10 && column == 3) {
                    System.out.print(array[row][column]);   
}
                else if (row == 11 && column == 4) {
                    System.out.print(array[row][column]);   
}
                else if (row == 12 && column == 5) {
                    System.out.print(array[row][column]);   
}
                else {
                    System.out.print(" ");  
                }
}
}

        // =============================================================
        // BARBEQUE - (10 points)
        System.out.println(" ");
        System.out.println("5. BARBEQUE ");

        for (int row = 5; row < 15; row++) {
            System.out.println("");
            for (int column = 0; column < 15; column++) {
                if (column == 0 && row == 12) {
                     System.out.print(array[row][column]);
                }
                    
                     else if (row == 5 && column == 7) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 6 && column == 6) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 7 && column == 5) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 8 && column == 4) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 9 && column == 3) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 10 && column == 2) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 11 && column == 1) {
                        System.out.print(array[row][column]);   
}
                    else if (row == 12 && column == 0) {
                        System.out.print(array[row][column]);   
}
                    else {
                        System.out.print(" ");  
                    }
    }
    }

        // =============================================================
        // HUWEBES - (10 points)
        System.out.println(" ");
        System.out.println("6. HUWEBES ");

        for (int row = 0; row < 15; row++) {
            System.out.println("");
            for (int column = 4; column < 11; column++) {
                if (row == 1) {
                    System.out.print(array[row][column]);
            }
        }
       }

        // =============================================================
        // SANMIGLIGHT - (10 points)
        System.out.println(" ");
        System.out.println("7. SANMIGLIGHT ");

        for (int row = 1; row < 12; row++) {
            System.out.println("");
            for (int column = 14; column < 15; column++) {
                if (column == 14) {
                    System.out.print(array[row][column]);
            }
        }
       }

        // =============================================================
        // FINALEXAM - (10 points)
        System.out.println(" ");
        System.out.println("8. FINALEXAM ");

        for (int row = 0; row < 15; row++) {
            System.out.println("");
            for (int column = 0; column < 15; column++) {
                if (column == 14 && row == 0) {
                     System.out.print(array[row][column]);
                }
                    
                     else if (row == 0 && column == 14) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 1 && column == 13) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 2 && column == 12) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 3 && column == 11) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 4 && column == 10) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 5 && column == 9) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 6 && column == 8) {
                        System.out.print(array[row][column]);   
}
                    else if (row == 7 && column == 7) {
                        System.out.print(array[row][column]);   
}
                    else if (row == 8 && column == 6) {
                        System.out.print(array[row][column]);   
}
                    else {
                        System.out.print(" ");  
                    }
    }
    }

        // =============================================================
        // LUNES - (10 points)
        System.out.println(" ");
        System.out.println("9. LUNES ");

        for (int row = 0; row < 15; row++) {
            System.out.println("");
            for (int column = 0; column < 15; column++) {
                if (column == 4 && row == 0) {
                     System.out.print(array[row][column]);
                }
                    
                     else if (row == 0 && column == 4) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 1 && column == 3) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 2 && column == 2) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 3 && column == 1) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 4 && column == 0) {
                        System.out.print(array[row][column]);   
    }
                    else {
                        System.out.print(" ");  
                    }
    }
    }



        // =============================================================
        // SIOMAI - (10 points)
        System.out.println(" ");
        System.out.println("10. SIOMAI ");

        for (int row = 3; row < 15; row++) {
            System.out.println("");
            for (int column = 6; column < 15; column++) {
                if (column == 6 && row == 3) {
                     System.out.print(array[row][column]);
                }
                    
                     else if (row == 3 && column == 6) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 4 && column == 7) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 5 && column == 8) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 6 && column == 9) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 7 && column == 10) {
                        System.out.print(array[row][column]);   
    }
                    else if (row == 8 && column == 11) {
                        System.out.print(array[row][column]);   
    }
                    else {
                        System.out.print(" ");  
                    }
    }
    }


       
    }
}
