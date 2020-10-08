package io.turntabl;

public class test {
    private int age;
    private int num;
    private string name;

        public static void main(String[] args) {
            System.out.println("Hello World");
        }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public test() {
    }

    @Override
    public String toString() {
        return "test{}";
    }

}
