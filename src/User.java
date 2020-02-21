import java.io.Serializable;
public class User implements Serializable {
    private String name;
    private int id;
    private int age;
    private static int generalIdCount = 0;

    public User(){
        this.id = generalIdCount;
        generalIdCount++;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id++;

    }

    public String toString(){
        String usr = "Имя: " + this.name + ", Возраст: " + this.age + ", id: " +  this.id ;
        return usr;
    }
}
