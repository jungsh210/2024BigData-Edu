public class Ex03 {
    public static void main(String[] args){
        byte a = 5;
        a+=1;
        System.out.println("a+=1"+a);
        a-=1;
        System.out.println("a-=1"+a);
        a*=1;
        System.out.println("a*=1"+a);
        a/=1;
        System.out.println("a/=1"+a);
        a%=1;
        System.out.println("a%=1"+a);
        a++;
        System.out.println("a++"+a);
        ++a;
        System.out.println("++a"+a);
        a--;
        System.out.println("a--"+a);
        --a;
        System.out.println("--a"+a);
    }
    
}
/*
 * 3    001  맨 앞은 부호
 * 2    010
 * 1    001
 * 0    000
 * -1   111
 * -2   110
 * -3   101
 * -4   100
 */
