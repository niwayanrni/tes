// membuat class yang di gunakan untuk menunjukkan bahwa sebuah class 
// dapet diakses dan digunakan oleh semua class 
public class Person {
    //  membuat atribute String name dan String Address
    private String name;
    private String address;

    // membuat konstruktor person dengan diberikan method dalam hal ini 
    // String name dan String Address
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    } 

    // membuat method getName yang berfungsi untuk mengambil nilai dar variabel 
    // "nama" tersebut
    public String getName(){
        return name ;
    }

    // membuat method getAddress yang berfungsi untuk mengembalikan alamat dari suatu variabel
    public String getAddress(){
        return address;
    }

    // membuat method void setAddress yang berfungsi untuk mengubah nilai atribut Address
    // dari objek "person"
    public void setAddress (String address){
        this.address = address; 
    }

    // membuat method to string
    public String toString(){
        return "name orang = " + name + " | " + "alamat orang = " + address;
    }
}