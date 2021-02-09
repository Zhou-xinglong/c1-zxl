import com.sun.org.apache.xpath.internal.compiler.Keywords;
import sun.plugin.javascript.navig.Link;

public class task11 {
    public static void main(String[] args) {
        PetShop shop = new PetShop();
        shop.add(new Cat("波斯猫",1));
        shop.add(new Cat("小猫",2));
        shop.add(new Cat("大猫",1));
        shop.add(new Dog("松狮",1));
        shop.add(new Dog("波尔多",2));
        shop.delete(new Cat("波米拉猫",9));
        Link all = shop.search("波");
        Object obj [] = all.toArray();
        for(int i=0;i<obj.length;i++) {
            System.out.println(obj[i]);
        }
    }
}
interface Pet{
    public String getName();
    public int getAge();
}
class PetShop{
    private Link pets = new Link();
    public void add(Pet pet){
        this.pets.add(pet);
    }
    public void delete(Pet pet){
        this.pets.remove(pet);
    }
    public Link search(String keyWord){
        Link result = new Link();
        Object obj[] = this.pets.toArray();
        for(int i=0;i<obj.length;i++) {
            Pet p = (Pet) obj[i];
            if(p.getName().contains(Keyword)){
                result.add(p);
            }
        }
        return result;
    }
}
class Cat implements Pet{
    private String name;
    private int age;
    public Cat(String name,int age){
        this.name=name;
        this.age=age;
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(!(obj instanceof Cat)){
            return flase;
        }
        Cat c = (Cat) obj;
        if(this.name.equals(c.name)&&this.age == c.age){
            return turn;
        }
        return false;
    }
    public String getName() {
        return  this.name;
    }
    public int gatAge(){
        return this.age;
    }
    public String toString() {
        return "猫的名字"+this.name+",年龄:"+this.age;
    }
}
class Dog implements Pet{
    private String name;
    private int age;
    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(!(obj instanceof Cat)){
            return flase;
        }
        Dog c = (Dog) obj;
        if(this.name.equals(c.name)&&this.age == c.age){
            return turn;
        }
        return false;
    }
    public String getName() {
        return  this.name;
    }
    public int gatAge(){
        return this.age;
    }
    public String toString() {
        return "狗的名字"+this.name+",年龄:"+this.age;
    }
}
