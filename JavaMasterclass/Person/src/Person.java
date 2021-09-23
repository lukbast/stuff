public class Person {

    private String firstName;
    private String lastName;
    private int age;


    public int getAge() {
        return age;
    } //end of get age

    public String getFirstName() {
        return firstName;
    } //end of get first name

    public String getLastName() {
        return lastName;
    } //end of last name

    public void setAge(int age) {
        if(age <0 || age >100){
            age=0;
        }// ends IF
        this.age = age;
    } //end of set age

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    } // end of set first name

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }  //end of set last name

    public boolean  isTeen(){
        if(age>12 && age<20){
            return true;
        } return false;  //ends If
    }  //end of isTeen

    public String getFullName(){
        if(firstName.isEmpty()){
            return lastName;
        }
        if(lastName.isEmpty()){
            return firstName;
        }
        if (firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }

        return firstName+" "+lastName;


    }// end of getFullName



}   //end of class
