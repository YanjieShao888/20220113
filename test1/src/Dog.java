public class Dog{
    String breed;
    String name;
    int age;
    String color;

    public Dog(String breed, String name, int age, String color){
        System.out.println("狗名：" + name);
        System.out.println("种类：" + breed);
        System.out.println("年龄：" + age + "岁");
        System.out.println("颜色：" + color);
    }

    public void setbreed(String breed){
        this.breed = breed;
    }

    public void setname(String name){
        this.name = name;
    }

    public void setage(int age){
        this.age = age;
    }

    public void setcolor(String color){
        this.color = color;
    }
    void eat(String food){
        System.out.println( name + "在吃" + food);
    }

}
