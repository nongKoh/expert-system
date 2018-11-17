public class node{
  //ตัวแปร
  //ชื่อ
  private String name;
  //เพศ
  private String sex;
  //อายุ
  private int age;
  //น้ำหนัก
  private double weight;
  //ส่วนสู.
  private double height;
  //BMI
  private double bmi=0;
  //constructor
  public node(){
    this.name ="";
    this.sex ="";
    this.age =0;
    this.weight=0;
    this.height=0;
  }
  //ใส่ชื่อ
  public void set_name(String name){
  this.name+=name;
  }
  //ใส่เพศ
  public void set_sex(String sex){
  this.sex=sex;
  }
  //ใส่อายุ
  public void set_age(int age){
  this.age=age;
  }
  //ใส่น้ำหนัก
  public void set_weight(double weight){
  this.weight=weight;
  }
  //ใส่ส่วนสูง
  public void set_height(double height){
  this.height=height;
  }
  //แสดงชื่อ
  public String get_name(){
  return this.name;
  }
  //แสดงเพศ
  public String get_sex(){
  return this.sex;
  }
  //แสดงอายุ
  public int get_age(){
  return this.age;
  }
  //แสดงน้ำหนัก
  public double get_weight(){
  return this.weight;
  }
  //แสดงส่วนสูง
  public double get_height(){
  return this.height;
  }
  //คำนวณBMI
  public double get_bmi()throws ArithmeticException{
  //ดักerror
    if(height==0){
    return this.bmi;
    }
    else{
  double newheight=height/100;
  this.bmi=(weight/(newheight*newheight));
  return this.bmi;
  }
  }
}
