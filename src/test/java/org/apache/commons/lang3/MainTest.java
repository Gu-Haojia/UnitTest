package org.apache.commons.lang3;
import org.apache.commons.lang3.ArrayUtils;
public class MainTest {
    public static void main(String[] args){
        MainTest mymaintest=new MainTest();
        mymaintest.test();
    }

    public void test(){
        ArrayUtils arraytest=new ArrayUtils();
        final String[] array = arraytest.toArray("Hello", "World");
        if(array!=null&&2==array.length&&array[0]=="Hello"&&array[1]=="World"){
            System.out.println("OK");
        }else{
            System.out.println("Error");
        }
    }

    /*
    public void test(){
        ArrayUtils arraytest=new ArrayUtils();
        final int[] original = new int[]{5, 8};
        final int[] cloned = arraytest.clone(original);
        final int[] nullarray=null;
        if(nullarray==null&&cloned[0]==original[0]&&cloned[1]==original[1]&&cloned!=original){
            System.out.println("OK");
        }else{
            System.out.println("Error");
        }
    }
     */
    /*
    public void test(){
        ArrayUtils arraytest=new ArrayUtils();
        final Object[] array = new Object[]{"0", "1", "2", "3", null, "0"};
        int flag=0;
        if(arraytest.contains(null, "1")){
            flag=1;
        }
        if(!arraytest.contains(array, "1")){
            flag=1;
        }
        if(!arraytest.contains(array, null)){
            flag=1;
        }
        if(arraytest.contains(array, "Array")){
            flag=1;
        }
        if(flag==0){
            System.out.println("OK");
        }else{
            System.out.println("Error");
        }
    }
    */
    /*
    public void test(){
        ArrayUtils arraytest=new ArrayUtils();
        int[] array = new int[]{1, 2, 3};
        boolean flag=false;
        arraytest.reverse(array, 0, 3);
        if(array[0]!=3||array[1]!=2||array[2]!=1){
            flag=true;
        }

        array = new int[]{1, 2, 3};
        arraytest.reverse(array, 0, 2);
        if(array[0]!=2||array[1]!=1||array[2]!=3){
            flag=true;
        }

        array = new int[]{1, 2, 3};
        arraytest.reverse(array, -1, 100);
        if(array[0]!=3||array[1]!=2||array[2]!=1){
            flag=true;
        }

        if(flag){
            System.out.println("Error");
        }else{
            System.out.println("OK");
        }
    }
    */
    /*
    public void test(){
        ArrayUtils arraytest=new ArrayUtils();
        final int[] nullArray = null;
        final int[] emptyArray = new int[0];
        final int[] oneArray = new int[]{1};
        final int[] twoArray = new int[]{3, 7};
        boolean flag=false;
        if(!arraytest.isSameLength(nullArray, nullArray)){
            flag=true;
        }

        if(!arraytest.isSameLength(emptyArray, emptyArray)){
            flag=true;
        }

        if(!arraytest.isSameLength(oneArray, oneArray)){
            flag=true;
        }

        if(!arraytest.isSameLength(twoArray, twoArray)){
            flag=true;
        }

        if(!arraytest.isSameLength(nullArray, emptyArray)){
            flag=true;
        }

        if(arraytest.isSameLength(oneArray, twoArray)){
            flag=true;
        }

        if(flag){
            System.out.println("Error");
        }else{
            System.out.println("OK");
        }
    }

     */


}


