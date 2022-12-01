class Main {
  public static void main(String[] args) {
    System.out.println(leapYear(2022));
    System.out.println(leapYear(2024));
    System.out.println(leapYear(1900));
    System.out.println(leapYear(2000));
  }
  public static String leapYear(int num){
    if (num % 4 == 0){
      if (num % 100 == 0){
        if (num % 400 == 0){
         return "This is a leap year";
        }
        else {
          return "This is not a leap year";
    }
      }
      else{
        return "This is not a leap year";
      }
    }
    else {
      return "This is not a leap year";
    }
  }
}
