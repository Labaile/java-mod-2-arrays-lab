import java.util.Scanner; //import the scanner class

public class Main {
    public static void main(String[] args) {

            int no; //number of names
            Scanner input = new Scanner(System.in); //create the scanner
            System.out.println("How many names do you have?: "); //print to console
            no = input.nextInt(); //store input from user in variable no
    
            String[] names = new String[no]; //create an array with user input
        
            //for loop for inputting the names into array
            for( int counter = 0; counter < no; counter++){
                System.out.println("Enter the name" + (counter+1));
                names[counter]=input.next();
            }//close loop
            
            input.close(); //close the scanner

            //for loop for printing the names from the array into console
            System.out.println("The names are: ");
            for( int counter = 0; counter < no; counter++){
                System.out.println(names[counter]);
            }//close loop
    
    
        }//close main
    
    
    
    }//close class
    