public class KillCilantro {
   public static String killCilantro(String recipe) {
      String returnStr = recipe;
      int f = returnStr.indexOf("cilantro");
      while (f != -1) {
          returnStr = returnStr.substring(0,f) + "parsley" + returnStr.substring(f+8);
          f = returnStr.indexOf("cilantro");
      }
      return returnStr;
   }
   public static String killWord(String sentence, String word, String replacement) {
      String returnStr = sentence;
      int f = returnStr.indexOf(word);
      while (f != -1) {
          returnStr = returnStr.substring(0,f) + replacement + returnStr.substring(f+(replacement.length()+Math.abs(replacement.length()-word.length())));
          f = returnStr.indexOf(word);
      }
      return returnStr;
   }
   public static void main(String[] Args) {
      System.out.println(killWord("cilantro is very good cilantro cilantro","cilantro","fdsasadf"));
      System.out.println(killCilantro("cilantrois very good cilantro cilantro"));

   }
}