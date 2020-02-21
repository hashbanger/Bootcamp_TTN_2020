class Student implements Cloneable{
    int marks;
    String name;

    Student(int marks, String name){
        this.marks = marks;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        try{
        Student s1 = new Student(75, "Prashant");
        Student s2 = (Student)s1.clone();
        System.out.println(s1.marks + " " + s1.name);
        System.out.println(s2.marks + " " + s2.name);
        }
        catch(CloneNotSupportedException c){} 
    }
}


// public public static void main(String[] args) {
    
// }