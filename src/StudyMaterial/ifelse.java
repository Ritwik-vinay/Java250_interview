package StudyMaterial;

public class ifelse {
    public static void main(String[] args) {
        //IF ELSE -> Conditional Statement
        //condition -> if i am make some operation on the inputs and performing some actions then it will give some output
        //i and you -> marks>90% -> Yes then -> You will get videogame
        //or No-> You will get nothing
        //If Else
        // Syntax :-> if(condition true or false -> Boolean){// Code } else{} // Datatype
        //Syntax 2-> Extended Version -> if(condtion){code} elseif(){} else{}
        int marks= 101;
        if(marks>=80 &&  marks<=100){
            System.out.println("A Grade");

        } else if (marks>60 &&marks<79) {
            System.out.println("B Grade");
        }
        else{
            System.out.println("Invalid Input");
        }


    }

}
