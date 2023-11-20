import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DecimalFormatSymbols;

/**
 * @author Tri Nguyen, Leonard Winter
 **/
public class Person implements Comparable<Person>, Cloneable,SimpleTreeNode{
    int Year= new GregorianCalendar().get(Calendar.YEAR);
    SimpleTreeNode node = new DefaultTreeNode("");
    public String firstname,name,profession,birthplace;
    public int birthyear;
    public float height;
    public Person(String firstname, String name, String profession,int birthyear,String birthplace ,float height) {
        this.firstname = firstname;
        this.name = name;
        this.profession = profession;
        this.birthyear = birthyear;
        this.birthplace = birthplace;
        this.height=height;
    }
    public Person()
    {
        this.firstname = MyIO.promptAndRead("Bitte geben Sie den firstnamen ein: ");
        this.name = MyIO.promptAndRead("Bitte geben Sie den namen ein: ");
        this.profession = MyIO.promptAndRead("Bitte geben Sie den profession ein: ");
        this.birthplace = MyIO.promptAndRead("Bitte geben Sie den birthplace ein: ");
        this.birthyear = MyIO.readInt("Bitte geben Sie das birthyear ein: ");
        this.height = MyIO.readFloat("Bitte geben Sie die hoehe ein: ");
    }
    
    public String toString(){
        if(height<1.53){
            return  " "+firstname+" " + name +" " + profession+" "  + birthyear+" " + birthplace+" " + height + " " + "Alter der Person ist : "+ (Year-birthyear) + " und die Person ist "+ "klein" ;
        }
        if(height<1.79){
        return  " "+firstname+" " + name +" " + profession+" "  + birthyear+" " + birthplace+" " + height + " " + "Alter der Person ist : "+ (Year-birthyear) + " und die Person ist "+  "mittel";
        }
        else{
        return  " "+firstname+" " + name +" " + profession+" "  + birthyear+" " + birthplace+" " + height + " " + "Alter der Person ist : "+"groß";
        }
    }

    public void compareWith(Person p) {
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("0.00",dfs);

    DecimalFormat af = new DecimalFormat("0");

    if ((Year - this.birthyear) > (Year - p.birthyear)) {
        MyIO.write(this.firstname + " " + this.name + " ist " + af.format((p.birthyear - this.birthyear) * 1.0) + " Jahre älter als " + p.firstname + " " + p.name + "\n");
    } else if ((Year - this.birthyear) < (Year - p.birthyear)) {
        MyIO.write(p.firstname + " " + p.name + " ist " +af.format((this.birthyear - p.birthyear) * 1.0) + " Jahre älter als " + this.firstname + " " + this.name + "\n");
    } else {
        MyIO.write(this.firstname + " " + this.name + " ist gleich alt wie " + p.firstname + " " + p.name + "\n");
    }
    
    if (this.height > p.height) {
        MyIO.write(this.firstname + " " + this.name + " ist " + df.format((this.height - p.height) * 1.0) + " Meter größer als " + p.firstname + " " + p.name + "\n");
    } else if (this.height < p.height) {
        MyIO.write(p.firstname + " " + p.name + " ist " + df.format((p.height - this.height) * 1.0) + " Meter größer als " + this.firstname + " " + this.name + "\n");
    } else {
        MyIO.write(this.firstname + " " + this.name + " ist gleich groß wie " + p.firstname + " " + p.name + "\n");
    }
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
    public void setbirthplace(String birthplace){
        this.birthplace = birthplace;
    }
    public void setheight(float height){
        this.height = height;
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
    public String getbirthplace(){
        return birthplace;
    }
    public float getheight(){
        return height;
    }

    public int compareTo(Person p){
        String p1=this.name+this.firstname;
        String p2=p.name+p.firstname;
        return p1.compareTo(p2) < 0 ? -1 : p1.compareTo(p2) > 0 ? 1 : 0;
    }
    public void addChild(SimpleTreeNode child){
        node.addChild(child);
    }
    public int getChildCnt(){
        return node.getChildCnt();
    }

    public SimpleTreeNode getChild(int pos) {
        return node.getChild(pos);
    }
    
    public void printTree(int indent) {
        System.out.println("-"+this.firstname+" "+this.name);
        for(int i = 0; i < node.getChildCnt();i++) {
            for(int j = 0;j<indent;j++)System.out.print("-");
            ((Person)this.getChild(i)).printTree(indent+1)/*+" "+((Person)this.getChild(i)).name*/;
        }
    }

    public Person clone() {
        Person copy = new Person(firstname, name, profession, birthyear, birthplace, height);
        copy.node = new DefaultTreeNode("");
        for(int i =0 ; i<node.getChildCnt();i++){
            copy.node.addChild(((Person)getChild(i)).clone());
        }
        return copy;
    }


    public static void main(String[] args){
        Person p1 = new Person("Max","Mustermann","Student",1999,"Berlin",1.55f);
        Person p2 = new Person("Lennard","Winter","Student",2005,"Bärlin",1.80f);
        Person p3 = new Person("Vannessa","Flaucher","Student",2004,"Berlin",1.70f);
        Person p4= new Person("Nougat", "Bits", "Essen", 2023,"Berlin", 1.80f);
        System.out.println(p1.compareTo(p2));
        System.out.println(p1.compareTo(p3));
        p1.addChild(p3);
        p1.addChild(p2);
        Person p5 = p1.clone();
        p3.addChild(p4);
        p5.printTree(1);
        p1.printTree(1);

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

