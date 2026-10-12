package person;
public class PERSON {
  String Name;
  String Phone;
  
class Address{
   int House_No ;
    String Street;
     String City;
      String State;
      
      void displayAddr() {
            System.out.println("Address:");
            System.out.println("House No: " + House_No);
            System.out.println("Street: " + Street);
            System.out.println("City: " + City);
            System.out.println("State: " + State);
        }
    }
    class DateOfBirth {
        int Day;
        int Month;
        int Year;

        void displayDOB() {
            System.out.println("Date of Birth: " + Day + "/" + Month + "/" + Year);
        }
    }   
void display() {
        System.out.println("Name: " + Name);
        System.out.println("Phone: " + Phone);

       
        Address addr = new Address();
        addr.House_No = 101;
        addr.Street = "MG Road";
        addr.City = "Lucknow";
        addr.State = "Uttar Pradesh";
        addr.displayAddr();

        DateOfBirth dob = new DateOfBirth();
        dob.Day = 15;
        dob.Month = 8;
        dob.Year = 2002;
        dob.displayDOB();
    }

     
    public static void main(String[] args) {
       PERSON p = new PERSON();

        p.Name = "Rahul";
        p.Phone = "9876543210";

        p.display();
    }
    
}
