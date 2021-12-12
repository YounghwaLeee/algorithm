
public class BeforeTest <T>{
	
	private T object;

	public void setObj(T obj) {
		this.object =obj;
	}
	
	public T getObj() {
		return object;
	}
	
	public static void main(String[] args) {
		BeforeTest<Integer> bt= new BeforeTest<Integer>();
		
		int temp=100;
		bt.setObj(temp);
		
		int sum=(int)bt.getObj()+1000;
		System.out.println("합은:"+sum);
		
	}
}
