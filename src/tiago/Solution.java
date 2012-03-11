package tiago;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	private List<Long> primes;
	
	public Solution() {
		this.primes = new ArrayList<Long>(10000001);
		this.primes.add(2L);
	}
	
	public long findPrimeOrder(int order) {
		long currentNumber = 3;
		while(order != this.primes.size()-1) {
			boolean isPrime = true;
			for(long number : this.primes) {
				if(number > Math.sqrt(currentNumber))break;
				if(currentNumber % number == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				this.primes.add(currentNumber);
			}
			currentNumber+=2;
		}
		return this.primes.get(order-1);
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().findPrimeOrder(10001));
	}
	
}
