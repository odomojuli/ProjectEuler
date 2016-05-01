// O(n) = O(n)
        = 1000
//bruteforce
public static void main(String[] args) {
    int sum = 0;
    int max = 1000;
    for (int i = 3; i < max; i++) {
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
    int max = 1000;
    for (int i = 3; i < max; i++) {
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
    int max = 1000;
    max--;
    int x3 = max/3;
    int x5 = max/5;
    int x15 = max/15;

    long sum3 = 3*x3*(x3+1); 
    long sum5 = 5*x5*(x5+1);
    long sum15 = 15*x15*(x15+1);

    long sum = (sum3+sum5-sum15)/2;
    System.out.println(sum);
}
