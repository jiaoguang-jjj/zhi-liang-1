/* 反面示例：阿里巴巴Java开发手册规范问题 */
public class badcode{
    public static void main(String[] args){
        int a=1;int b=2;int c=3;
        String s="hello";
        try {
            System.out.println(a+b);
        } catch(Exception e){}
    }
}
