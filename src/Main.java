// mendeklarasikan class
public class Main {
    public static void main(String[] args) {
        Person n = new Person("Ni Wayan" , "Block Plan");
        // mencetak nilai dari variabel 'n ' ke output standar
        System.out.println(n);

        // membuat objek baru dari class student dengan menggunakan konstruktor
        // yang telah di definisikan pada kelas tersebut, yang di deklarasikan dengan
        // variabel 'n1'
        Student n1 = new Student ("Made" , "Gorontalo");
        n1.addCourseGrade("Kimia", 80);
        n1.addCourseGrade("PMS", 95);
        n1.setAddress("KM 15");
        // mencetak nilai dari variabel 'n1' ke output standar
        System.out.println(n1);

        // membuat objek baru dari class Teacher dengan menggunakan konstruktor
        // yang telah di definisikan pada kelas tersebut, yang di deklarasikan dengan
        // variabel 'n2'
        Teacher n2 = new Teacher("Komang" , "Bangli");
        // mencetak nilai dari variabel 'n2' ke output standar
        System.out.println(n2);
    }
}