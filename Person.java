public class Person{

//objects have both atrributes(properties)--AKA variables
//and behaviors--AKA method

//decleare variables 
private String name;
private String email;
private String phoneNumber;

   //construtor
  public Person(String anotherName, String anotherEmail, String anotherNumber){
    name = anotherNmame;
    email = anotherEmail;
    phoneNumber = anotherNumber;
 }

   //print all the data for a Person
   public void print(){
   System.out.println("Name: " + name);
   System.out.println("Email:" + email);
   System.out.println("Phone Number:" + phoneNumber);
}

    // main method
   