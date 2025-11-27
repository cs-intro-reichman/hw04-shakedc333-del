public class Primes {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        // create boolean array
        boolean[] isPrime = new boolean[n + 1];

        // assume all numbers bigger then 2 are prime
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // algorithm
        int p = 2;
        while (p * p <= n) { // all the multiples of p -> gone
            if (isPrime[p]) {
                // eliminate multiples of p
                int multiple = p * p; 
                while (multiple <= n) { 
                    isPrime[multiple] = false;
                    multiple += p;
                }
            }
            p++;
        }

        // print primes 
        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) { //if it is prime - 'true' so print it
                System.out.println(i);
                count++; // count how many primes we have
            }
        }

        //  print a message with percentage 
        int percent = (int) (100.0 * count / n);// calaulate percentage
        System.out.println("There are " + count + " primes between 2 and " + n +
                " (" + percent + "% are primes)");
    }
}