import java.util.Scanner;

public class Main{
    //力扣387. 字符串中的第一个唯一字符
    class Solution {
        public int firstUniqChar(String s) {
            int[] count = new int[26];
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                count[ch-'a']++;
            }
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                if(count[ch - 'a'] == 1){
                    return i;
                }
            }
            return -1;
        }
    }
    //牛客HJ1 字符串最后一个单词的长度
    public  static void  main(String [] args) throws Exception{
        //方法一
         /*int index = -1;
         Scanner scan = new Scanner(System.in);
         String str = scan.nextLine();
         for(int i = str.length()-1; i >= 0; i--){
             if(str.charAt(i) == ' '){
                index = i;
                break;
             }
         }
         System.out.println(str.length() - 1 - index);
         */
        //方法二
         /*Scanner scan = new Scanner(System.in);
         String str = scan.nextLine();
         int index = str.lastIndexOf(' ');
         System.out.println(str.length() - 1 - index);
         */
        //方法三
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] s = str.split(" ");
        System.out.println(s[s.length-1].length());

    }
}
//力扣125. 验证回文串
class Solution {
    //判断是否为有效字符
    public boolean isEffectiveChar(char ch){
        if((ch>='a' && ch<='z') ||(ch>='0' && ch <= '9')){
            return true;
        }
        return false;
        //return Character.isDigit(ch) || Character.isLetter(ch);
        //return Character.isLetterOrDigit(ch);
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            while(left < right && !isEffectiveChar(s.charAt(left))){
                left++;
            }
            while(left < right && !isEffectiveChar(s.charAt(right))){
                right--;
            }
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }


        return true;
    }
}