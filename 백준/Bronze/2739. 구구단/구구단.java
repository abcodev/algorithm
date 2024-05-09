import java.io.IOException;
public class Main{
    public static void main(String[] arg)throws IOException{
        int num = System.in.read() - '0';
        StringBuilder dan = new StringBuilder();

        for(int i= 1;i<=9;i++){
            dan.append(num).append(" * ").append(i).append(" = ").append(num*i).append("\n");
        }
        System.out.println(dan);
    }
}