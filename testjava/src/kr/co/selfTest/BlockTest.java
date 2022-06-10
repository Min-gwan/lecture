package kr.co.selfTest;

public class BlockTest {
	static {
		System.out.println("static { }");
	}
	{
		System.out.println("{ }");
	}
	
	public BlockTest() {
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		System.out.println("BlockTest");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest");
		BlockTest bt2 = new BlockTest();
	}
}
