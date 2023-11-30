package org.example.array_Basic;

public class BasicArray {
    public static void main(String[] args) {
        // TODO code application here
        playWithPrimitiveArray2();
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
}
