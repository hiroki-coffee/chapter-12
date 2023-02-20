
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exception02 {
	public static void main(String[] args) {
		try {
			String allData = Files.readString(Paths.get("c:\\temp\\memo.txt"));
			System.out.println(allData);
		} catch (IOException e) {
			System.out.println("例外が発生");
		} finally {
			System.out.println("プログラム終了");
		}
	}
}