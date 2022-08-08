public class TestDate {
    public int year=1999;//年
    public int month=12;//月
    public int day=10;//日
    public TestDate() {

    }

    public TestDate(int year, int month) {
        this.year = year;
        this.month = month;
    }

    public TestDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //建议 大家都把this写上
    public void setDate(int year,int month,int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void printDate() {
        System.out.println(this.year+"-"+this.month+"-"+this.day);
    }

    public void func() {
        this.printDate();
    }

    public void func2(int a) {
        a = a;
    }


    public static void main(String[] args) {
        TestDate testDate1 = new TestDate();
        TestDate testDate2 = new TestDate();
        TestDate testDate3 = new TestDate();

        testDate1.setDate(2022,8,4);
        testDate2.setDate(2023,8,4);
        testDate3.setDate(2024,8,4);

        testDate1.printDate();
        testDate2.printDate();
        testDate3.printDate();

    }

    public static void main1(String[] args) {
        TestDate testDate = new TestDate();
        testDate.setDate(2022,8,4);
        /*testDate.year = 2022;
        testDate.month = 8;
        testDate.day = 4;*/
        testDate.printDate();
        System.out.println("fda");
    }
}