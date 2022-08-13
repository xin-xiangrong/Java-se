import java.util.Scanner;

public class Test {
    //力扣434. 字符串中的单词数
    public int countSegments(String s) {
        //空字符串
        if(s.length() == 0){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                count++;
                while(i < s.length() && s.charAt(i) == ' '){
                    i++;
                }
            }
        }


        if(count == 0 && s.charAt(0) != ' '){
            //没有空格
            return 1;
        }else if(count == 1 && s.charAt(s.length() - 1) == ' '){
            //都是空格
            return 0;
        }else if(s.charAt(0) != ' ' && s.charAt(s.length() - 1) != ' '){
            //字符串首尾没有空格
            return count + 1;
        }else if(s.charAt(0)!=' ' && s.charAt(s.length() - 1) == ' '){
            //字符串首尾都有空格
            return count - 1;
        }else if(s.charAt(0) ==' ' || s.charAt(s.length() - 1) == ' '){
            //字符串首或尾有空格
            return count;
        }
        return 0;
    }

    public static void main(String[] args) {
        Test test = new Test();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(test.countSegments(str));
    }
}

class Solution {
    //力扣709. 转换成小写字母
    public String toLowerCase(String s) {
        //String str = s.toLowerCase();
        //return str;
        char[] str = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                int ch = s.charAt(i) + 32;
                str[i] = (char)ch;
            }else{
                str[i] = s.charAt(i);
            }
        }
        return new String(str);
    }
}