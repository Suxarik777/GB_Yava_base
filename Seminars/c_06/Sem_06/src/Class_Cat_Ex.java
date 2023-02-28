import java.time.LocalDateTime;

public class Class_Cat_Ex {
    String name;
    String color;
    LocalDateTime date;
    String breed;

    void Print(){
        System.out.println(name + " " + color + " " + date + " " + breed);
    }
    
    // конструктор
    
    Class_Cat_Ex(String n, String c, LocalDateTime d, String b){
        name = n;
        color = c;
        date = d;
        breed = b;
    }

    Class_Cat_Ex(){
        name = "Gray";
        color = "Black";
        date = LocalDateTime.now(); // текущее время
        breed = "scotland";
    }

    Class_Cat_Ex(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj){
        if (obj.getClass() != obj.getClass()) return false;

        Class_Cat_Ex compareCat = (Class_Cat_Ex) obj; // приводим авбстарктный обджект к типу кэт
        if (this.name.equals(compareCat.name) && this.color.equals(obj)) { // == equals
            return true;
        }
        return  super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        int res = this.name.hashCode();
        return res;
    }
}
