package day03;

public class FirstClass {
    public String name;
    public int ID;
    FirstClass(String name, int ID){
        this.name = name;
        this.ID = ID;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        FirstClass firstClass = (FirstClass) obj;
        return (firstClass.name == this.name && firstClass.ID == this.ID);
    }
    @Override
    public int hashCode(){
        return this.ID;
    }
}