package baic1;

import java.util.Scanner;

public class control2 {

	public static void main(String[] args) {
		/*우리대학의 학번은 총 10자리로 되어 있습니다.
     01234-56789
맨 앞의 4자리는 입학년도이고 다섯번째 문자는 단과대 번호입니다.

     1 : 공대

     2 : 사회대

그 뒤의 2자리는 각 학과번호입니다.

​

  공과대학인 경우는

     11 : 컴퓨터학과       12 : 소프트웨어학과          13 : 모바일학과

     22 : 자바학과         33 : 서버학과

     

사회대학인 경우는

 11 : 사회학과         12 : 경영학과          13 : 경제학과

​

​

 ex) 2017111001 는 2017년도에 입학한 공대 컴퓨터학과 학생입니다

 ex) 2019211001 는 2019년도에 입학한 사회대 사회학과 학생입니다

 ex) 2018133001 는 2018년도에 입학한 공대 서버학과 학생입니다   
		
		*/
	System.out.println("학번을 입력해 주세요");
	Scanner sc = new Scanner (System.in);
	String id = sc.nextLine();
	String first = null;   // 입학년도
	char second = 0; //단과대
	
	String third = null;  // 학과
	
	String a = null;
	String b = null;
	first = id.substring(0,4);
	second = id.charAt(4);
	third = id.substring(5,7);
	int test = Integer.parseInt(third);
	
	
	if (second == '1') {
		a = "공대";
		switch (test) {
		case 11 : 
			b = "컴퓨터 학과";
			break;
		case 12:	
		   b = "소프트웨어 학과";
		   break;
		case 13 :
			b = "모바일 학과";
		   break;
		case 22 :
			b = "자바 학과";
			break;
		case 33 :
			b = "서버 학과";
		}
		
		}else if (second =='2') {
		a = "사회대";
		switch (test) {
		case 11 :
			b = "사회학과";
			break;
		case 12 :
			b= "경영학과";
			break;
		case 13:
			b= "경제학과";
			
		}
	}
	

	
		
		
		
		System.out.println(id +"는 "+ first+"에 입학한 "+ a + " " + b +"학생입니다.");
		
		
		
		

	}

}
