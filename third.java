import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class third{
    public static void main(String[] args) {
        List<Passanger> passangers=new ArrayList<>();
        passangers.add(new Passanger("john", 5));
        passangers.add(new Passanger("doe", 55));
        passangers.add(new Passanger("tim", 40));
        passangers.add(new Passanger("max", 19));
        List<Passanger> grp1=passangers.stream().filter(x->x.getAge()>=0 && x.getAge()<10).toList();
        List<Passanger> grp2=passangers.stream().filter(x->x.getAge()>=10 && x.getAge()<20).toList();
        List<Passanger> grp3=passangers.stream().filter(x->x.getAge()>=20 && x.getAge()<30).toList();
        List<Passanger> grp4=passangers.stream().filter(x->x.getAge()>=30 && x.getAge()<40).toList();
        List<Passanger> grp5=passangers.stream().filter(x->x.getAge()>=40 && x.getAge()<50).toList();
        List<Passanger> grp6=passangers.stream().filter(x->x.getAge()>50).toList();
        System.out.println(grp1);
        System.out.println(grp2);
        System.out.println(grp3);
        System.out.println(grp4);
        System.out.println(grp5);
        System.out.println(grp6);
    }
}
class Passanger{
    String name;
    int age;
    Passanger(String name,int age){
        this.name=name;
        this.age=age;
    }
   
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return "{"+name+":"+age +"}";
    }
}