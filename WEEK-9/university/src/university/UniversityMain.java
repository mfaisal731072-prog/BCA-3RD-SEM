package university;

class University {
    String universityName;
    int ranking;

    University(String universityName, int ranking) {
        this.universityName = universityName;
        this.ranking = ranking;
    }
}

class Faculty extends University {
    String facultyName;

    Faculty(String universityName, int ranking, String facultyName) {
        super(universityName, ranking);
        this.facultyName = facultyName;
    }

    void Details() {
        System.out.println("Faculty Name: " + facultyName);
    }
}

class Department extends Faculty {
    String departmentName;
    String chairman;

    Department(String universityName, int ranking,
               String facultyName, String departmentName,
               String chairman) {

        super(universityName, ranking, facultyName);

        this.departmentName = departmentName;
        this.chairman = chairman;
    }

    void Details() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Chairman: " + chairman);
    }

    void Display() {

        
        super.Details();

        
        this.Details();

        
        System.out.println("University Name: " + universityName);
        System.out.println("University Ranking: " + ranking);
    }
}

public class UniversityMain {

    public static void main(String[] args) {

        Department d = new Department(
                "ABC University",
                10,
                "Faculty of Science",
                "Computer Science",
                "Dr. Sharma"
        );

        d.Display();
    }
}
