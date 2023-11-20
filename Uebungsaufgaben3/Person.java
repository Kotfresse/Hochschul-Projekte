/**
 * @author Tri Nguyen
 **/
public class Person {
    public String firstname,name,profession;
    public int birthyear;
    public Person(String firstname, String name, String profession, int birthyear) {
        this.firstname = firstname;
        this.name = name;
        this.profession = profession;
        this.birthyear = birthyear;
    }
    public Person()
    {
        this.firstname = MyIO.promptAndRead("Bitte geben Sie den firstnamen ein: ");
        this.name = MyIO.promptAndRead("Bitte geben Sie den namen ein: ");
        this.profession = MyIO.promptAndRead("Bitte geben Sie den profession ein: ");
        this.birthyear = MyIO.readInt("Bitte geben Sie das birthyear ein: ");
    }
    
    public String toString(){
        return  " "+firstname+" " + name +" " + profession+" "  + birthyear+" ";
    }
    public void setfirstname(String firstname){
        this.firstname = firstname;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setprofession(String profession){
        this.profession = profession;
    }
    public void setbirthyear(int birthyear){
        this.birthyear = birthyear;
    }
    public String getfirstname(){
        return firstname;
    }
    public String getname(){
        return name;
    }
    public String getprofession(){
        return profession;
    }
    public int getbirthyear(){
        return birthyear;
    }


    public static void main(String[] args){
        Person p1 = new Person("Max","Mustermann","Student",1999);
        Person p2 = new Person();
        MyIO.write(p1.toString()+"\n");
        MyIO.write(p2.toString());
    }

    //overload the + operator
    public static Person plus(Person p1, Person p2){
    Person p3 = new Person();
    p3.setfirstname(p1.getfirstname()+" "+p2.getfirstname());
    p3.setname(p1.getname()+" "+p2.getname());
    p3.setprofession(p1.getprofession()+" "+p2.getprofession());
    p3.setbirthyear(p1.getbirthyear()+p2.getbirthyear());
    return p3;
    }
}
