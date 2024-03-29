package thread.exam1.create;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {


/*
	자바에서 쓰레드를 구현하는 방법은 2가지가 있다.

	Thread Class를 상속받는 방법
	Runnable 인터페이스를 구현하는 방법
	Thread Class를 상속받으면 다른 클래스를 상속 받을 수 없기때문에 Runnable 인터페이스를 구현하는게 일반적인 방법이다.
*/


		//비프음 5번 반복해서 소리
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0 ; i< 5; i++) {

			toolkit.beep();
			System.out.println("beep~dd");
			try {

				//2초 간격
				Thread.sleep(2000);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		//팅 문자열 5번 출력 - 2초 간격
		for(int i = 0 ; i< 5; i++) {

			System.out.println("팅~");
			try {

				//2초 간격
				Thread.sleep(2000);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}
}

/*
 
beep~
beep~
beep~
beep~
beep~
팅~
팅~
팅~
팅~
팅~

 
 */

