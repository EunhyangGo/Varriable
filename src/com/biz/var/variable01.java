package com.biz.var;

public class variable01 {

	public static void main (String[] args) {
		
		// 여기 코드는 30이라는 값, 40이라는 값 그리고 결과인 70이라는 값을 
		// java(또는 컴퓨터)가 임의로 지정한 곳에 저장을 하고, 모든 처리를 알아서 한다.
		
		System.out.println("30+40=" + (30+40));
		
		// 우리가 지정한 기억장소에 30, 40을 저장하고 그 결과도 우리가 지정한 기억장소에 저장시켜서
		// 재활용 해 보겠다.
		
		// int(정수)를 저장할 만큼의 크기의 기억장소 3개를 예약하겠다.
		
		int num1 ; // 'num1이라는 이름으로 저장소를 하나 예약하겠다. num1이라는 기억장소를 선언
		int num2 ; // 선언문
		int sum ; //
		
		//check in
		num1 = 30;
		// keyword가 아닌 어떤 것으로 문장이 시작되면 중간에 거의 모든 부분에서 = 이 나타단다.
		// = 이 나타나면 우선적으로 오른쪽을 먼저 분석, 실행한다.
		
		num2 = 40;
	
		
		
		// 변수명 명명 규칙
		// 1. 첫글자는 영문 소문자로 쓴다
		// 2. 2번째 부터는 영문대소문자, 숫자 _를 쓸 수 있다.
		// 3. 변수 이름은 의미 있는 이름으로 하는 것이 좋다.
		
		// 만약 국어점수, 영어점수를 저장할 변수를 만든다면 
		int korGrade; // 카멜 코딩
		int engGrade;
	
		// 4. 변수에 저장할 자료, 데이터의 형을 접두사로 쓰는것도 좋다.
		int intKorGrade;
		int intkor;
		
		int intNum1;
		int intNum2
		;
	    int intSum;
	    
	    // 5. 변수명에는 keyword를 쓸 수 없다.
	    // => 두 단어 이상을 조합하는것이 좋다.
	    // int int ;
	    
	    
	
	}

}

