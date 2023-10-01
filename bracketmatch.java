
public class bracketmatch {
    static char stk[]=new char[100];
    static int top=-1;
    static void push(char s){
        stk[++top]=s;
    }
   static void pop(){
        top--;
    }
    public static boolean isValid(String s) {
        push(s.charAt(0));
        System.out.println(top); 
        for(int i=1;i<s.length();i++){  
           if(stk[top]==s.charAt(i)){
            System.out.println(top); 
            pop();
            }
            else{
                push(s.charAt(i));
                System.out.println(top); 
            }

        }
        System.out.println(top); 
        System.out.println(stk);
       
        if(top==-1)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
    
}
