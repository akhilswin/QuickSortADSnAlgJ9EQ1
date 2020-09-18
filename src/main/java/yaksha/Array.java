package yaksha;

public class Array {
	private int a[];
	private int beg;
	private int end;

	public Array(int[] a, int beg, int end) {
		super();
		this.a = a;
		this.beg = beg;
		this.end = end;
	}

	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}

	public int getBeg() {
		return beg;
	}

	public void setBeg(int beg) {
		this.beg = beg;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
}
