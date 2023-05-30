// mengimpor kelas Arraylist yang dapat digunakan untuk membuat objek dan mengakses semua
// metode dan fitur yang terdapat dalam Arrylist
import java.util.ArrayList;

// membuat class Teacher menjadi subclass atau turunan dari class person
public class Teacher extends Person {
    // membuat attribute numCourse dengan tipe integer
    private int numCourses;

    // membuat attribute courses dengan tipe data String dalam bentuk ArrayList 
    // yang berfungsi untuk  menyimpan data dalam bentuk list
    private ArrayList <String> courses;

    // membuat konstruktor Teacher dengan diberikan method dalam hal ini 
    // String name dan String Address
    public Teacher(String name,String address){
        // menggunakan super dengan fungsi memanggil  konstruktor dari superclass 
        // dengan parameter "name" dan "address"
        super(name,address);
        numCourses = 0;
        courses = new ArrayList<String>();
    }

    // membuat method yang berfungsi untuk menambahkan sebuah elemen baru dengan nilai
    // "course ke dalam objek "ArrayList"
    public boolean addCourse(String course){
        for(int n= 0; n < numCourses; n++){
            if(courses.get(n).equals(course)){
                return false;
            }
        }
        courses.add(course);
        numCourses++;
        return true;
    }

    // membuat method yang berfungsi untuk menghapus sebuah elemen cengan nilai
    // "course" dari objek "ArrayList"
    public boolean removeCourse(String course){
        for(int n= 0; n<numCourses; n++){
            if (courses.get(n).equals(course)){
                courses.remove(n);
                numCourses--;
                return true;
            }
        }
        return false;
    }

    // annotasion yang digunakan untuk menandai bahwa suatu method di kelas subclass
    // telah menimpa method yang sama pada superclass
    @Override

    // membuat method string toString
    public String toString(){
        // menggunakan return untuk mengembalikan nilai String yang berisi 
        // informasi tentang objek guru
        return "nama guru = " + Teacher.super.getName() + " | " + "alamat guru =" + Teacher.super.getAddress();  
    }
}