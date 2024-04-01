package Strings;

public class LastWordLength {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int len = 0;
        while(i >= 0){
            if(s.charAt(i) == ' '){
                if(len == 0){
                    i--;
                }
                else{
                    break;
                }
            }else{
                len++;
                i--;
            }

        }
        return len;


    }

}
