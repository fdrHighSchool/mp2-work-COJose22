class Main {
  public static void main(String[] args) {
  for (int i = 50; i < 101; i++) {
      System.out.println(i + " Letter grade is " + gradeLetter(i));  
    }
  }
  public static String gradeLetter(int num) {
    String grade = "";
    int lastNum = num % 10;
    if (num >= 100){
      grade += "A+";
    }
    else {
      if (num < 60){
        grade += "F";
      }
      else {
        if (num >= 70){
          if (num >= 80){
            if (num >= 90){
              if (num >= 90){
                grade += "A";
              }
            }
            else {
              grade += "B";
            }
          }
          else {
            grade += "C";
          }
        }
        else {
          grade += "D";
        }
        if (lastNum <= 3){
          grade += "-";
        }
        else if (lastNum >= 7){
          grade += "+";
        }
        else {
          grade += "";
        }
      }
    }
    return grade;
  }
}
