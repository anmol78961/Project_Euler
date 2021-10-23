class EvenFibonacciNumbers {
  public static void main(String[] args) {
    long a = 1;
    long b = 2;
    long sum = 0;
    while (a <= 4000000) {
      if (a % 2 == 0)
        sum += a;
      a = b;
      b += a;
    }
    System.out.println(sum);
  }
}
