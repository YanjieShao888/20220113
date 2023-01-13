public class Cat{
    String breed;
    String name;
    int age;

    public Cat(String breed,String name,int age){
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public void eat(String food){
        System.out.println(this.name + "eating" + food);
    }

}
