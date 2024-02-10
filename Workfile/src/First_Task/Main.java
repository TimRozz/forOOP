package First_Task;
public class Main{
    public static void main(String[] args) {
        Person me = new Person("Temirlan","Orazaly",18,63,"Male","Kazakhstan");
        Person teacher = new Person("Timur","Yeslamgaliev",33,72,"Male","Kazakhstan");
        System.out.println("Person{name='"+me.getName()+"',surname='"+me.getSurname()+"',age="+me.getAge()+",weight="+me.getWeight()+",gender='"+me.getGender()+"',citizenship='"+me.getCitizenship()+"'}");
        System.out.println("Person{name='"+teacher.getName()+"',surname='"+teacher.getSurname()+"',age="+teacher.getAge()+",weight="+teacher.getWeight()+",gender='"+teacher.getGender()+"',citizenship='"+teacher.getCitizenship()+"'}");
//        me.setName("name",18,63,183);
//        Person person1 = new Person("Tim","Raz",2,32,"M","Kz");
//        System.out.println(person1.getName());
    }
}
//person1.getName()+" is "+person1.getAge()+" years old"