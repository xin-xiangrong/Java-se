public class Data1 {
    public int year;
    public int month;
    public int day;
    public void setData(Data1 this, int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
    }
    public void printData(Data1 this){
        System.out.println(this.year+"-"+this.month+"-"+this.day);
    }


    public static void main(String[] args) {
        Data1 d = new Data1();
        d.setData( 2022, 8,15);
        d.printData();
    }
}
