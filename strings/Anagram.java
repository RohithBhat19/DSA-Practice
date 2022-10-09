class Solution
{
   public static boolean isAnagram(String a,String b)
    {
       char[] ch=a.toCharArray();

        char[] ch1=b.toCharArray();

        Arrays.sort(ch);

        Arrays.sort(ch1);

         if(Arrays.equals(ch,ch1)){

            return true;

        }else

            return false;
    }
}
    
   

 
