package iphone.co.jp;

public class SmartPhone extends Mp3Player {
	//演習２
	public void call() {
		System.out.println("電話");
	}
	public void mail() {
		System.out.println("メール");
	}
	public void photo() {
		System.out.println("写真");
	}
	public void internet() {
		System.out.println("インターネット");
	}
	
	//演習４　オーバーライド(上書き)
	public void play() {
		System.out.println("再生(ハイレゾ機能)");
	}
	public void stop() {
		System.out.println("停止(ハイレゾ機能)");
	}
	public void next() {
		System.out.println("次へ(ハイレゾ機能)");
	}
	public void back() {
		System.out.println("戻る(ハイレゾ機能)");
	}
}
