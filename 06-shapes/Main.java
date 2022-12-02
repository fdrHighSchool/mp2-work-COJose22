class Main {
  public static void main(String[] args) {
    int repeat = 4, i = 0;
    while(i++ < repeat){
      System.out.println("* * * *");
    }
    System.out.println();
    square(6);
    System.out.println();
    rectangle(5, 10);
    System.out.println();
    rightTri(5);
    System.out.println();
    rightTri2(5);
  }
  public static void square(int s){
    for(int row = 0; row < s; row++){
      for(int col = 0; col < s; col++){
        System.out.print("* ");
      }// end of col loop
     System.out.println();
    }// end of row loop
  }
  public static void rectangle(int d, int s){
    for(int row = 0; row < d; row++){
      for(int col = 0; col < s; col++){
        System.out.print("* ");
      }
     System.out.println();
    }
  }
  public static void rightTri(int num){
    int num1 = 0;
    String stars = "* ";
    while (num1++ < num){
      System.out.println(stars);
      stars += "* ";
    }
  }
  public static void rightTri2(int num){
    String stars = "* ";
    for (int num1 = 0; num1 < num; num1++){
      System.out.println(stars);
      stars += "* ";
    }
  }
}
