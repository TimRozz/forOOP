package First_Task;
public class Person{
   private String name;
   private int age;
   private String surname;
   private int weight;
   private String gender;
   private String citizenship;
   public Person(String name,String surname,int age,int weight,String gender,String citizenship){
      this.name = name;
      this.age = age;
      this.surname = surname;
      this.weight = weight;
      this.gender = gender;
      this.citizenship = citizenship;
   }

   public void walk(){
      System.out.println(name+" is walking");
   }
   public void walk(int x){
      System.out.println(name+" is walking");
   }
   public void walk(int x,int y){
      System.out.println(name+" is walking");
   }
   public void speak(){
      System.out.println(name+" is speaking");
   }
   public void setWeight(int weight){
      this.weight = weight;
   }
  // public void setName(String name){
    //  this.name = name;
  // }

   public String getCitizenship(){
      return citizenship;
   }
   public String getGender(){
      return gender;
   }
   public int getWeight(){
      return weight;
   }
   public String getSurname(){
      return surname;
   }
   public String getName(){
      return name;
   }
   public int getAge(){
      return age;
   }
   public void look(){
      System.out.println(name+" is looking");
   }
   public void setName(String name,int age,int weight,int height){
      System.out.println("name: "+name+"\nage: "+age+"\nweight: "+weight+"\nheight: "+height);
   }

   @Override
   public String toString() {
      return "Person{" +
              "name='" + name + '\'' +
              ", age=" + age +
              ", surname='" + surname + '\'' +
              ", weight=" + weight +
              ", gender='" + gender + '\'' +
              ", citizenship='" + citizenship + '\'' +
              '}';
   }
}
