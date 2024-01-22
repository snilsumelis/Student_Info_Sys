public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;
    Student (String name, String stuNo, String classes, Course c1, Course c2,Course c3){
        this.name =name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage =0;
        this.isPass = false;
    }
    void AddBulkExamNote(int note1,int note2, int note3, int sozelnote1, int sozelnote2, int sozelnote3){
        if (note1 >=0 && note1 <=100){
            this.c1.note = note1;
        }
        if (note2 >=0 && note2 <=100){
            this.c2.note = note2;
        }
        if (note3 >=0 && note3 <=100){
            this.c3.note = note3;
        }
        if (sozelnote1 >=0 && sozelnote1 <=100){
            this.c1.sozelnote = sozelnote1;
        }
        if (sozelnote2 >=0 && sozelnote2 <=100){
            this.c1.sozelnote = sozelnote2;
        }
        if (sozelnote3 >=0 && sozelnote3 <=100){
            this.c1.sozelnote = sozelnote3;
        }
    }
    void isPass(){
        this.avarage= ((this.c1.note*0.8) + (this.c2.note*0.8) +(this.c3.note*0.8) + (this.c1.sozelnote *0.2) + (this.c2.sozelnote *0.2) +(this.c3.sozelnote *0.2))/3;
        if (this.avarage>55){
            System.out.println("Sınıfı başarıyla geçti");
        }else {
            System.out.println("Sınıfta Kaldı");
        }

        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name + "yazılı notu\t" + this.c1.note );
        System.out.println(this.c2.name + "yazılı notu\t" + this.c2.note );
        System.out.println(this.c3.name + "yazılı notu\t" + this.c3.note );
        System.out.println(this.c1.name + "sözlü notu\t" + this.c1.sozelnote );
        System.out.println(this.c2.name + "sözlü notu\t" + this.c2.sozelnote );
        System.out.println(this.c3.name + "sözlü notu\t" + this.c3.sozelnote );
        System.out.println("ortalamanız \t" + this.avarage);
    }
}
