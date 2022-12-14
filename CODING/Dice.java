//*******************
//파일명: Dice.java
//작성자: 최재훈
//작성일: 2022-04-13
//내용: 주사위를 나타내는 Dice 클래스를 정의하고 이를 이용하는 프로그램 작성
//*******************

package hw8_1;

//Dice 클래스
public class Dice {
	int face = 1; // 면-변수 선언과 동시에 1로 초기화

	public int getFace() { // 면에 대한 getter ! setter가 따로 없는 이유? 주사위 면은 랜덤으로 계속 받는 수이기 때문에
		return face;
	}

	public void rollDice() { // 주사위를 던지는 메소드. 1~6범위의 랜덤 넘버로 지정.
		face = (int) (Math.random() * 6) + 1; // Math.random() 범위 0.0이상 1.0 미만 사이의 값.
	}

}

