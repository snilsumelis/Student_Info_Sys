public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "BIO");

        Course tarih = new Course("Tarih", "101", "MAT");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(t3);


        Student s1 = new Student("ali","123", "4",tarih,fizik,biyo);
        s1.AddBulkExamNote(100,78,50,57,88,55);
        s1.isPass();

    }
}