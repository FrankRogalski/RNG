package main;

public final class Generator {
	private long x = System.currentTimeMillis();
	
	public final int nextInt(final int maxVal) {
		final long m = 4294967296L;
		final int c = 1013904223, a = 1664525;
		x = (a * x + c) % m;
		return (int) (x % maxVal);
	}
}