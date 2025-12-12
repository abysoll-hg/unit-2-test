public class KillCilantro {
   public static String killCilantro(String recipe) {
      String returnStr = "";
      String tempStr = "";
      for (int i = 0; i < recipe.length(); i++) {
         if ((recipe.substring(i).contains("cilantro")) && (recipe.indexOf("c") + 7 == recipe.indexOf("o"))) {
               for (int j = 0; j < 8; j++) {
               
               }
         }
      }
      return recipe;
   }
   public static void main(String[] Args) {
      System.out.println(killCilantro("cilantro is very good cilantro cilantro"));
   }
}