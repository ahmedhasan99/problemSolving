public class ReverseString {

    /// first way by two pointer :->

    public  static void reverseStringByPointer(char [] s ){
        int pointerLeft =0 ;
        int pointerRight= s.length-1;
        while(pointerLeft<pointerRight){
            char temp = s[pointerLeft];
            s[pointerLeft]=s[pointerRight];
            s[pointerRight] = temp;
            pointerLeft++;
            pointerRight--;

        }
        System.out.print("by two pointer : " );
        System.out.println(s);
    }
    //// bu String bulider
    public static void reversCharByStringBulider(char [] s ){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb=sb.reverse();
        String reversed = sb.toString();
        System.out.println("by StringBulider  : "+ reversed);

    }

    public static void main(String[] args) {
        // test first way
        char[] hello={'h','e','l','l','o'};
        char [] stringBuliderTest = {'s' ,'t','r','i','n','g' };
       reverseStringByPointer(hello);
        reversCharByStringBulider(stringBuliderTest);
    }

}
