class Colors {

    /*
    ANSI escape codes :
    `````````````````
     -	RESET = "\u001B[0m";
     -	RED = "\u001B[31m";
     -	GREEN = "\u001B[32m";
     -	YELLOW = "\u001B[33m";
     -	BLUE = "\u001B[34m";
     -	PURPLE = "\u001B[35m";
     -	CYAN = "\u001B[36m";
    */

   public String red(){
	   return "\u001B[31m";
   }
   public String green(){
	   return "\u001B[32m";
   }
   public String blue(){
	   return "\u001B[34m";
   }
   public String yellow(){
	   return "\u001B[33m";
   }
   public String purple(){
	   return "\u001B[35m";
   }
   public String cyan(){
	   return "\u001B[36m";
   }public String reset(){
	   return "\u001B[0m";
   }

   public void info(){
	   System.out.println("---------------");
	   System.out.println("Informasi warna");
	   System.out.println("---------------");
	   System.out.println(" red       ");
	   System.out.println(" yellow    ");
	   System.out.println(" green     ");
	   System.out.println(" blue      ");
	   System.out.println(" purple    ");
	   System.out.println(" cyan      ");
	   System.out.println("---------------");
   }
}
