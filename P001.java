// Multiples3or5
class P001 {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 0; i < 1000; i++) {
      if (i % 3 == 0 && i % 5 == 0)
        sum += i;
      else if (i % 3 == 0 || i % 5 == 0)
        sum += i;
      else
        continue;
    }
    System.out.println(sum);
  }
}
