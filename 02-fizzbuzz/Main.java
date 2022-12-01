class Main {
  public static void main(String[] args) {
    for (int i = 1; i < 101; i++) {
      System.out.println(i + ": " + fizzBuzz(i));
    }
  }
  public static String fizzBuzz(int num){
    if (num % 3 != 0 || num % 5 != 0){
      if (num % 3 == 0){
        return "Fizz";
      }
      else if (num % 5 == 0){
        return "Buzz";
      }
      else{
        return "No Fizz or Buzz";
      }
    } // end of outer if
    else{
      return "FizzBuzz";
    }
  }
}
