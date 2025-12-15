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
   public static void main(String[] Args) {
      System.out.println(killCilantro("cilantro is very good cilantro cilantro"));
   }
}