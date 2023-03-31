package primeFactors;

import java.util.*;

public class PrimeFactors {
    public List<Integer> generate(int num) {
        List<Integer> primes = new ArrayList<>();

        for (int candidate = 2; num > 1; candidate++) {
            for (; num % candidate == 0; num /= candidate) {
                primes.add(candidate);
            }
        }
        return primes;
    }
}
