class Solution
{
  public static boolean checkPangram  (String str) {
       
        str = str.toLowerCase();
        if(str.length()<26){
            return false;
        }else{
            for(char ch = 'a';ch<='z';ch++){
                if(str.indexOf(ch)<0){
                    return false;
                }
            }
        }return true;
    }
}
    
    
