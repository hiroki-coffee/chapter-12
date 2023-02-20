
public class Exception03_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			Exception03_1.division(100,0);
		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException例外が発生");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException例外が発生");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("プログラム終了");
	}
		public static void division(int a, int b) {
			System.out.println(a + " ÷ " + b + " は？");
			if (b == 0) {
				throw new IllegalArgumentException("引数が不正です");
			}
			int result  = a / b;
			System.out.println("計算結果" + result);
			
	}

}