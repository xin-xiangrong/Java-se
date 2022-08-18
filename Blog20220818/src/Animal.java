/*
class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
}
*/
/*
interface IFlying {
    void fly();
}
interface IRunning {
    void run();
}
interface ISwimming {
    void swim();
}

class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用四条腿跑");
    }
}

class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在用尾巴游泳");
    }
}

class Frog extends Animal implements IRunning, ISwimming {
    public Frog(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在往前跳");
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在蹬腿游泳");
    }
}

class Duck extends Animal implements IRunning, ISwimming, IFlying {
    public Duck(String name) {
        super(name);
    }
    @Override
    public void fly() {
        System.out.println(this.name + "正在用翅膀飞");
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用两条腿跑");
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在漂在水上");
    }
}

class Robot implements IRunning {
    private String name;
    public Robot(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用轮子跑");
    }
}

class Test1 {
    public static void funRun(IRunning running) {
        running.run();
    }

    public static void main(String[] args) {
        //Cat cat = new Cat("小猫");
        //funRun(cat);

        //Frog frog = new Frog("小青蛙");
        //funRun(frog);

        Robot robot = new Robot("机器人");
        funRun(robot);
    }
}
*/

interface IFLying {
    void flying();
}

interface ISwimming {
    void swimming();
}

interface IRunning {
    void running();
}
interface IThreehabitat extends IFLying,IRunning,ISwimming{

}
class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

}

class Duck extends Animal implements IThreehabitat {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void flying() {
        System.out.println(name + "正在飞！");
    }

    @Override
    public void swimming() {
        System.out.println(name + "正在游泳！");
    }

    @Override
    public void running() {
        System.out.println(name + "正在跑！");
    }
}



class Test1 {
    public static void func(IThreehabitat iThreehabitat) {
        iThreehabitat.flying();
        iThreehabitat.running();
        iThreehabitat.swimming();
    }

    public static void main(String[] args) {
        func(new Duck("小黄"));
    }
}