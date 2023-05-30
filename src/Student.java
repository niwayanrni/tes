// mengimpor kelas Arraylist yang dapat digunakan untuk membuat objek dan mengakses semua
// metode dan fitur yang terdapat dalam Arrylist
import java.util.ArrayList;

// membuat class student menjadi subclass atau turunan dari class person
public class Student extends Person{
    // membuat attribute numCourse dengan tipe int
    private int numCourse;

    // membuat attribute courses dengan tipe data String dan grades dengan tipe data integer 
    // dalam bentuk ArrayList yang berfungsi untuk  menyimpan data dalam bentuk list
    private ArrayList<String> courses;
    private ArrayList<Integer> grades;

    // membuat konstruktor pada class student dengan 2 parameter yaitu, "name" dan 
    // address yang digunakan untuk menginilisasi nilai awal dari objek 
    public Student(String name, String addres){
        // menggunakan super dengan fungsi memanggil  konstruktor dari superclass 
        // dengan parameter "name" dan "address"
        super(name,addres);
        numCourse = 0;
        courses = new ArrayList<String>();
        grades = new ArrayList<Integer> ();
    }

    // membuat method pada class student yang berfungsi untuk menambahkan
    // nilai dari sebuah course lalu menyimpannya ke dalam 
    public void addCourseGrade(String course, int grade){
        courses.add(course);
        grades.add(grade);
        numCourse++;
    }

    // membuat method void printGrades
    public void printGrades(){
        for (int n= 0; n <= courses.size(); n++){
            System.out.println(courses.get(n)+ ":" + grades.get(n));
        }
    }

    // membuat method void getAverageGrade
     public double getAverageGrade(){
        double nilai = 0;
        for (int n = 0; n< numCourse; n++){
            nilai += grades.get(n);
        } 
        return nilai/numCourse;
    }

    // annotasion yang digunakan untuk menandai bahwa suatu method di kelas subclass
    // telah menimpa method yang sama pada superclass
    @Override

    // membuat method String toString
    public String toString(){
        // menggunakan return dengan tujuan mengembalikan nilai dari method getName dan getAddress
        return "nama siswa = "+ Student.super.getName() + " | " + " alamat siswa = " + Student.super.getAddress() + "|" + "Rata-Rata : " + getAverageGrade();
    } 
}