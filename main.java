public class main{
  public static String Reverse(String word){
         char[] word1 = word.toCharArray();
         char[] word2 = word1.clone();
         for (int i = 0; i < word1.length; i++){
            word2[i] = word1[word1.length-i-1];
         }
         return new String(word2);
      }
}
