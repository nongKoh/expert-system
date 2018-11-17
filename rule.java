import java.util.Scanner;
public class rule{
  public static void main(String[] args){
    //ตัวแปล
    String result ="";
    //สร้างlinklist
    node n1 = new node("q");     node n2 = new node("x");    node n3 = new node("m");
    node n4 = new node("y");     node n5 = new node("w");    node n6 = new node("g");
    node n7 = new node("z");     node n8 = new node("a");    node n9 = new node("b");
    node n10 = new node("c");    node n11 = new node("d");   node n12 = new node("e");
    node n13 = new node("f");    node n14 = new node("s");   node n15 = new node("r");
    //รับค่าBoolean
    Scanner sn = new Scanner(System.in);
    System.out.println("Enter boolean(Y/N) Q , M , W , D");
    String rul = "";
    for(int i=0;i<=3;i++){
    rul += sn.next();
    }
    //ส่งค่าให้ method แปลง String เป็น boolean
    boolean x[] = new boolean[4];
    rul=rul.toUpperCase();
    x=get_boole(rul);
    //โยนค่า Boolean ให้ตัวเริ่มต้น
    n1.add_bool(x[0]);n3.add_bool(x[1]);n5.add_bool(x[2]);n11.add_bool(x[3]);
    //R1
    n1.add_node(n2);n2.add_mom(n1);//Q<>X
    if(n1.get_bool()){
    n2.add_bool(true);
    }
    //R2
    n3.add_node(n4);n4.add_mom(n3);//M<>Y
    if(n3.get_bool()){
    n4.add_bool(true);
    }
    //R3
    n5.add_node(n6);n6.add_mom(n5);//W<>G
    n5.add_node(n7);n7.add_mom(n5);//W<>Z
    n2.add_node(n6);n6.add_mom(n2);//X<>G
    n2.add_node(n7);n7.add_mom(n2);//X<>Z
    if(n2.get_bool()&&n5.get_bool()){
    n6.add_bool(true);
    n7.add_bool(true);
    }
    //R7
    n2.add_node(n8);n8.add_mom(n2);//X<>A
    if(n2.get_bool()){
    n8.add_bool(true);
    }
    //R8
    n4.add_node(n9);n9.add_mom(n4);//Y<>B
    if(n4.get_bool()){
    n9.add_bool(true);
    }
    //R4
    n8.add_node(n10);n10.add_mom(n8);//A<>C
    n9.add_node(n10);n10.add_mom(n8);//B<>C
    if(n8.get_bool()&&n9.get_bool()){
    n10.add_bool(true);
    }
    //R5
    n7.add_node(n12);n12.add_mom(n7);//Z<>E
    n11.add_node(n12);n12.add_mom(n11);//D<>E
    if(n7.get_bool()||n11.get_bool()){
    n12.add_bool(true);
    }
    //R6
    n10.add_node(n13);n13.add_mom(n10);//C<>F
    n12.add_node(n13);n13.add_mom(n12);//E<>F
    if(n10.get_bool()&&n12.get_bool()){
    n13.add_bool(true);
    }

    //R9
    n13.add_node(n14);n14.add_mom(n13);//F<>S
    if(n13.get_bool()){
    n14.add_bool(true);
    result+=n14.get_node()+" ";
    }
    //R10
    n6.add_node(n15);n15.add_mom(n6);;//G<>R
    if(n6.get_bool()){
    n15.add_bool(true);
    result+=n15.get_node()+" ";
    }
    System.out.println("ผลสรุป "+result);
  }
  //แปลง String เป็น Boolean
  public static boolean[] get_boole(String rule){
  boolean x[] = new boolean[4];
    for(int i=0;i<=3;i++){
    x[i] = rule.charAt(i)=='Y';
    }
  return x;
  }
  }
