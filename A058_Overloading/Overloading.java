#Method Overloading

package A058_Overloading;

public class Overloading {
    public static void main (String[] args) {
        int x=10;
        int y=20;
        int r=5;

        Overloading obj= new Overloading();
        float area_getresult=obj.area(r);
        int area_getresult1=obj.area(x,y);
        System.out.println(area_getresult);
        System.out.println(area_getresult1);
    }
        public static int area (int n1, int n2){
            int result=n1*n2;
            return result;
        }
        public static float area (int n){
            float result=3.14f*n*n;
            return result;
    }
}
