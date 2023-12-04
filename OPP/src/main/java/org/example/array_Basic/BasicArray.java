package org.example.array_Basic;

public class BasicArray {
    public static void main(String[] args) {
        // TODO code application here
        //playWithPrimitiveArrayV3();
       //playWithObjectArray();
        //sortedObjectArray();

        //sortPrimitives();
        //sortPrimitives2();
    }
    public  static void  playWithPrimitiveArray(){
        // array 7 element, 7 var Double who have the values
        double [] v = {0, 5, 10, 15, 20, 25, 30};
          /*  var                     = value
           vì khai báo biến-> Stack   = Heap  */
        v[0] = 6868;
        System.out.println("v[0]= " +v[0] + "| v[1]= " + v[1]);
        System.out.printf("Elelment 0 is :  %.1f%n", v[0]);
        for (int i = 0; i < v.length ; i++) {
            System.out.print(v[i] + " \t");
        }
        System.out.println("\n\nThe array V has value with for each: " );
        for (double x: v )// với mọi x thuộc tập hợp v
             {
            // with every var x type double, do a loop all elements of v
            System.out.print(x + " ");
        }

    }
    public static void playWithPrimitiveArray1(){

    }
    public static void playWithPrimitiveArray2(){
        double arr[] = new double[20]; // [] là mảng xin số biến, new xin vùng Ram lớn của Primitive
                                        // () gọi phễu để đổ , phải có khuôn Contructor
                                        // có new có vùng Ram lớn
        // variable primitive, giá rị đơn xài luôn
        //name of array is a var reference,  var pointer,
        //trỏ vào đầu 1 dãy rất nhiều biến khác
        //phần kg gán là value default = 0
        arr[0] = 68;
        arr[1] = 100;
        System.out.println("The array arr has");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n\nThe array  arr has value with for each: " );
        for (double y: arr
        ) {
            System.out.print(y + " ");
        }
    }
    public static void playWithPrimitiveArrayV3(){
        int arr1[] = {5, 10, 15, 20, 25};
        int arr2[] = new int[]{5,10,15,20,25};
        int arr3[];
        arr3 = new int[5]; // default hết cho tất cả biến int thứ [i]
        int arr[] = new int[5]; //chuẩn nhất
        arr[0] = 0;
        arr[1] = 5;
        arr[2] = 10;
        // [3] [4] default . Nếu là số -> 0, boolean -> false
        System.out.print("The arr with for index has: ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        //Length of Array is non static because every array has a different length( kích thước ăn theo từng mảng)
        //biến mảng trỏ vùng new, bên trong là 1 đống  biến primitive + hàm +length
        // các biến này kg dùng get() set() vì nó đồng nhất data type
        // sờ trực tiep [i]
        System.out.println("\nThe array use toString() is: " + arr);
        System.out.print("The array with for each is : ");
        // với mọi : nó vẫn dùng biến đếm x, biến đếm chẳng qua bằng từng phần tử trong mảng,
        // phần tử trong mảng có value gì thì cứ mang ra mà xài  vì nó là Primitive
        for ( int x : arr ) {
             System.out.print(  x + " ");
        }

    }
    public static void playWithObjectArray(){
        // Save 50 numbers Fibo, pair
        int v[] = new int[50];
        v[0] = 2;
        v[1] = 4;
        v[2] = 6;
        //Save 50 Students of this class
        Student s1, s2, s3, s4, s5, s6, s7, s8;
        Student[] s = new Student[50];
        s[0] = new Student("SE234556", "Lyli lolo", 2001, 5.6);
        s[1] = new Student("SE234557", "Toto titi", 2005, 8.4);
        s[2] = new Student("SE234558", "Mama Momo", 2003, 7.9);
        System.out.println("List od Students: ");
        /*  ---------NullPointerException-----------
        for (int i = 0; i <10 ; i++) {
            s[i].showProfile();
        }*/
        for (int i = 0; i <3 ; i++) {
            s[i].showProfile();
        }
       /* // trỏ đáy ram
        s1 = null;
        // gán tọa độ 0 vào s1
        s1.showProfile();
        */

    }

    public  static void playWithAsStudent(){
        Student x; // x is a var Obj
        //x.showProfile(); wrong code
        x = new Student("SE234556", "Lyli lolo", 2001, 5.6);
        //value
        x.showProfile();
    }
    public static void sortedObjectArray(){
        Student [] arr = new Student[2];
        //có 3 var; 2 var student + 1 var má mì arr
        arr[0] = new Student("SE234556", "Lyli lolo", 2001, 9.0);
        arr[1] = new Student("SE234557", "Toto titi", 2000, 5.4);

        System.out.println("Before sorting: ");
        for (int i = 0; i < arr.length ; i++) {
            // arr[i].showProfile();
            System.out.println(arr[i]); // gọi thầm tên em . Nếu kg có toString() nó sẽ hash code (code Hexa) và trả về adresse mémoire
        }
        // với mọi x thuộc tập hợp arr, x = từng phần tử, x = value từng phần tử
        for (Student x : arr  ) {
            x.showProfile();
        }
        //sorting Array Object Ascending
        System.out.println(" After sorting: ");
        if (arr[0].getGpa()>arr[1].getGpa()) {
            Student tmp = arr[0];
            arr[0] = arr[1];
            arr[1] = tmp;
        }

        for (Student x: arr ) {
            x.showProfile();
        }
        
    }

    public static  void  sortPrimitives(){
        int a = 9 , b = 5;
        System.out.println(" Before sorting: ");
        System.out.println(" a : " + a + " |b : " + b);
        //at a moment a variable has only value (memory instance) => use temporary var
        int temp = a; // save  old value of a first  = backup : giữ lại gt a = 9 trước khi bị  mất & thay đổi
        a = b; // a = 5 , a loose his old value 9 ;
        b = a ; // b = old value of a # 9
        System.out.println(" After sorting: ");
        System.out.println(" a : " + a + " |b : " + b);

    }public static  void  sortPrimitives2(){
        int a = 2 , b = 5;
        System.out.println(" Before sorting: ");
        System.out.println(" a : " + a + " |b : " + b);
        // sorting ascending: value after must be
       if ( a> b ){
           int temp = a;
           a = b;
           b = a ;
       }

        System.out.println(" After sorting: ");
        System.out.println(" a : " + a + " |b : " + b);

    }
}
