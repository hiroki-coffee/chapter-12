
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Exception04 {
	public static void main(String[] args) {
		try {
			Exception04.readFile("exception.txt");
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundExceptionが発生");
		} catch (IOException e) {
			System.out.println("IOExceptionが発生");
		}
		System.out.println("プログラム終了");
	}

	public static void readFile(String fileName) throws FileNotFoundException, IOException {
		System.out.println("ファイルの読み込み開始");
		FileReader fr = new FileReader(fileName);
		System.out.println(fileName + "の読み込み完了");

		// ・・・ファイルを読み込む処理

		fr.close();
	}
}
