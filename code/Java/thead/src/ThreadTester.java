
public class ThreadTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("开始进行测试");
		FThread thread = new FThread(10);
		thread.start();
		System.out.println("结束");
		
	}
}
	class FThread extends Thread{
	private int sum;
	public FThread(int sum) {
		this.sum = sum;
	}
	@Override
	public void run() {
		int i= sum;
		int result=1;
		while(i>0) {
			result = result*i;
			i=i-1;
			System.out.println(i);
			
		}
		
	}
	
}

