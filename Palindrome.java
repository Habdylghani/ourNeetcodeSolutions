class Palindrome {
    
    public static boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while (i<j){
            while (i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            while (i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static boolean isAlphaNum(char c){
            return (c<'z' && c>'a')|| (c<'Z' && c>'A')||(c<'9' && c>'0');
        }
        /*
        StringBuffer sb=new StringBuffer(); 
        for (char c : s.toCharArray()){
            if (Character.isDigit(c)||  Character.isLetter(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String bs=sb.reverse().toString();
        sb.toString();
        System.out.println(bs);

        if (sb.equals(bs)){
            return true;
        }
        return false;
         */
        
    //racaecar
    //racaecar
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        String t= "race a car";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(t));
    }
}