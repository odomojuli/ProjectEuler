// O(n) = O(n)
        = 1000
//bruteforce
public static void main(String[] args) {
    int sum = 0;
    for (int i = 3; i < 1000; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i;
        }
    }
    System.out.println(sum);
}

// Set Theoretical, remove Double Counting
// O(n) = O(n/3) + O(n/5) + O(n/(3*5))
//      = 333 + 200 + 66
public static void main(String[] args) {
    int sum = 0;
    for (int i = 3; i < 1000; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i;
        }
    }
    System.out.println(sum);
}

// Arithmetic Series
// O(1) = O(1)
// Proof: (n/2)*(A1 + An) = n(A1 + An)/2

public static void main(String[] args) {
    int nr = 1000;
    nr--;
    int x3 = nr/3;
    int x5 = nr/5;
    int x15 = nr/15;

    long sum1 = 3*x3*(x3+1); 
    long sum2 = 5*x5*(x5+1);
    long sum3 = 15*x15*(x15+1);

    long sum = (sum1+sum2-sum3)/2;
    System.out.println(sum);
}