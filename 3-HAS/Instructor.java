
public class Instructor {
    private String fristName, lastName, officeNum;

    public void setFirst(String firstName){
        this.fristName = firstName;
    }

    public void setLast(String lastName){
        this.lastName = lastName;
    }

    public void setOffice(String officeNum){
        this.officeNum = officeNum;
    }

    public Instructor(String firstName, String lastName, String officeNum){
        setFirst(firstName);
        setLast(lastName);
        setOffice(officeNum);
    }

    public String getFirst(){
        return fristName;
    }

    public String getLast(){
        return lastName;
    }

    public String getOffice(){
        return officeNum;
    }



    public void print(){
        
        System.out.println("Instructor: " + fristName + " " + lastName + " | Office number: " + officeNum);
    }
    
}
