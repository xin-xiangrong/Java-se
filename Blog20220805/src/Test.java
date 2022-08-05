class WashMachine{
    //属性(字段)-》成员变量
    public String brand; // 洗衣机的品牌
    public String type; // 型号
    public double weight; // 重量
    public double lenght; // 长
    public double weidth; // 宽
    public double height; // 高
    public String color; // 颜色

    //行为(方法)-》成员方法
    public void WashClothes(){ // 洗衣服
        System.out.println("洗衣功能");
    }
    public void dryClothes(){ // 脱水
        System.out.println("脱水功能");
    }
    public void SetTime(){ // 定时
        System.out.println("定时功能");
    }
}

class Dog {
    //属性(字段)-》成员变量
    public String name;//狗的姓名
    public String color;//狗的颜色

    //行为(方法)-》成员方法
    public void barks() {
        System.out.println(name+"汪汪叫");
    }
    public void wag() {
        System.out.println(name+"摇尾巴");
    }
}
public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog();//实例化(创建对象)
        dog1.name = "小金";
        dog1.color = "金色";
        dog1.barks();
        dog1.wag();

        Dog dog2 = new Dog();
        dog2.name = "小哈";
        dog2.color = "灰白";
        dog2.barks();
        dog2.wag();
    }
}
