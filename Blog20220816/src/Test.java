class Animal {
    public String name;
    public int  age;

   public Animal(String name, int age) {
        this.name = name;
        this.age = age;
       System.out.println("Animal(String , int )");
    }

}

class Dog extends Animal{
    //傻狗  是狗的属性
    public boolean silly;

   public Dog(String name,int age,boolean silly) {
        //1. 先帮助父类部分初始化 必须放到第一行
        super(name,age);
        this.silly = silly;
        System.out.println("Dog(String ,int ,boolean )");
   }
    public static void main(String[] args) {
        Animal animal2 = new Dog("金毛",6,false);
    }
}



