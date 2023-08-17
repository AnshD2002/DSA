/* Use Student class example and create Student Grading System
Student will have to enter his basic details - id, name, semester, year, branch
Student will have to enter his marks of at least 4 subjects
Now find out sum and percentage of student
Now assign grades to the student based on percentage
if percentage > 90, then A Grade
if percentage > 80, and < 90 then B Grade
if percentage > 70, and < 80 then C Grade
else D Grade

____Solution____

*/


class Student{

    int id;
    String name;
    int semester;
    int year;
    String branch;

    Double sub1;
    Double sub2;
    Double sub3;
    Double sub4;
    Double sum;
    Double percentage;

    void takeinput(int id,String name,int semester,int year,String branch){
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.year = year;
        this.branch = branch;
    }
    void takemarks(Double sub1,Double sub2,Double sub3,Double sub4){
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.sum = this.sub1+this.sub2+this.sub3+this.sub4;
        this.percentage = ((sum/400)*100);

    }
    void stud_Details() {
        System.out.print("ID : " + id + "\n");
        System.out.print("Name : " + name + "\n");
        System.out.print("Semester : " + semester + "\n");
        System.out.print("Year : " + year + "\n");
        System.out.print("Branch : " + branch + "\n");
    }
    void  marks(){
        System.out.print("Sum : "+sum+"\n");
        System.out.print("Percentage : "+percentage+"\n");
        if (percentage >90){
            System.out.print("Grade A \n");
            }
        else if (percentage>80 && percentage<90) {
            System.out.print("Grade B \n");
            }
        else if (percentage>70 && percentage<80) {
            System.out.print("Grade C \n");
            }
        else {
            System.out.print("Grade D \n");
            }
        }
    }

class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.takeinput(101,
                "Ansh",
                7,
                2023,
                "CSE");
        obj.stud_Details();

        obj.takemarks(88.4,75.6,96.4,80.0);
        obj.marks();


    }
}
