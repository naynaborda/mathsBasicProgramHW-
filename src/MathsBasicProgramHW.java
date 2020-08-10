public class MathsBasicProgramHW {

    //01/07/2020
    //return type with parameter
    public int  hourstoSeconds(int a,int b)
    {
        return (a*60*60+b*60);
    }

    //noreturn types with parameter
    public static void minutestoSeconds(int a,int b){

        System.out.println("Convert Minutes to Seconds\t:\t"+(a*b));
    }

    //return type with parameter
    public int findThePerimeter(int a,int b)
    {
        return ((a*2)+(b*2));
    }
    //noreturn types with parameter
    public static void baseAndHightsOfTriangle(int a,int b)
    {
        System.out.println("Triangle Area\t\t\t\t:\t"+a*b/2);

    }
    //return type with with parameter
    public int remaindermethod(int A,int B){
        return(A%B);

    }
    //no return type with parameter
    public void triainglethirdedge(int a,int b)
    {
        System.out.println("Next Edge\t\t\t\t\t:"+"\t"+(a+b-1));
    }

    // return type with parameter
    public String concatNameMethod(String FirstName,String LastName)
    {
        return LastName+FirstName;

    }
    //no return type with parameter
    public static void incrementMethod(int a)
    {
        System.out.println("Addition\t\t\t\t\t:\t"+(++a));
    }

    //noreturn type with no parameter
    //we can do this both way with parameter or without parameter
    public static void lengthofstringmethod(){
        String s1="apple";
        String s2="make";
        String s3="a";
        String s4="";
        int length=s1.length();
        System.out.println("length of a string is\t\t:\t"+length);
        System.out.println("length of a String is\t\t:\t"+s2.length());
        System.out.println("length of a String is\t\t:\t"+s3.length());
        System.out.println("lenght of a String is\t\t:\t"+s4.length());


    }
    //no return type with parameter
    public static void lengthOfStringMethod(String s1,String s2,String s3,String s4){
        System.out.println("Length of String is\t\t\t:\t"+s1.length());
        System.out.println("Length of String is\t\t\t:\t"+s2.length());
        System.out.println("Length of String is\t\t\t:\t"+s3.length());
        System.out.println("Length of String is\t\t\t:\t"+s4.length());
    }
    //return type with parameter
    public String greeting(String name) {
        return ("\"Hello" + name);

    }
    //noretuen type with no parameter
    public static void passedinCharacterMethod(){
        char a= 'A';
        int b= a;
        int c=(int)a;

        char x='m';
        int y =x;
        int z=(int)x;

        char p='[';
        int  q= p;
        int r=(int)p;

        char d='\\';
        int e=d;
        int f=(int)d;

        System.out.println("The ASCII value is\t\t\t:\t"+c);
        System.out.println("The ASCII value is\t\t\t:\t"+z);
        System.out.println("The ASCII value is\t\t\t:\t"+r);
        System.out.println("The ASCII value is\t\t\t:\t"+f);
    }
    // no return type with  no parameter
    public static void reversesMethod(){
        boolean x =true;
        boolean y=false;
        System.out.println("Reverse\t\t\t\t\t\t:\t"+(x==y));
        System.out.println("Reverse\t\t\t\t\t\t:\t"+(y!=x));
    }

    public static void main(String[]args){
       MathsBasicProgramHW obj=new MathsBasicProgramHW();
        System.out.println("Convert them to Seconds\t\t:\t"+obj.hourstoSeconds(1,3));
        System.out.println("Convert them to Seconds\t\t:\t"+obj.hourstoSeconds(2,0));
        System.out.println("Convert them to Seconds\t\t:\t"+obj.hourstoSeconds(0,0));

        minutestoSeconds(5,60);
        minutestoSeconds(3,60);
        minutestoSeconds(2,60);

        System.out.println("Find the Perimeter\t\t\t:\t"+obj.findThePerimeter(6,7));
        System.out.println("Find the Perimeter\t\t\t:\t"+obj.findThePerimeter(20,10));
        System.out.println("Find the Perimeter\t\t\t:\t"+obj.findThePerimeter(2,9));
        baseAndHightsOfTriangle(3,2);
        baseAndHightsOfTriangle(7,4);
        baseAndHightsOfTriangle(10,10);
        System.out.println("Remainder\t\t\t\t\t:\t"+obj.remaindermethod(1,3));
        System.out.println("Remainder\t\t\t\t\t:\t"+obj.remaindermethod(3,4));
        System.out.println("Remainder\t\t\t\t\t:\t"+obj.remaindermethod(-9,45));
        System.out.println("Remainder\t\t\t\t\t:\t"+obj.remaindermethod(5,5));
        obj.triainglethirdedge(8,10);
        obj.triainglethirdedge(5,7);
        obj.triainglethirdedge(9,2);
        incrementMethod(0);
        incrementMethod(9);
        incrementMethod(-3);
        lengthofstringmethod();
        System.out.println("Concat Name\t\t\t\t\t:\t"+obj.concatNameMethod("First\"","\"Last,"));
        System.out.println("Concat Name\t\t\t\t\t:\t"+obj.concatNameMethod("John\"","\"Doe,"));
        System.out.println("Concat Name\t\t\t\t\t:\t"+obj.concatNameMethod("Mary","\"Jane,"));
        System.out.println("Hello Name\t\t\t\t\t:\t"+obj.greeting(" Gerald!\""));
        System.out.println("Hello Name\t\t\t\t\t:\t"+obj.greeting(" Tiffany!\""));
        System.out.println("Hello Name\t\t\t\t\t:\t"+obj.greeting(" Ed!\""));char ch = 'A';
        passedinCharacterMethod();
        reversesMethod();
        lengthOfStringMethod("apple","make","a","");
    }






}
