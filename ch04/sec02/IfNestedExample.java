package ch04.sec02;

public class IfNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = (int)(Math.random()* 20) + 81;
		System.out.println("점수: " + score);
		
		String grade;
		
		if(score >= 90) {
//			중첩 if문 첫번째
			if(score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
	
			
			
		} else {
//			중첩 if문 두번째 (위if문이 부정일시 -> score의 값이 90미만으로 나왔을시 실행)
			if(score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		System.out.println("학점: " + grade);
		
//		중첩 if문 해석: (int)(Math.random()* 20) + 81에서 랜덤한 숫자를 뽑아오는데,
//		이 숫자가 만약 90점보다 크거나 같다면, if문 첫번째를 돌리는데, 여기서 만약 score의 값이 95 이상일시엔 grade를 A+로 출력, 아닐시엔 A로 출력
//		만약 socre에서 점수가 90점 미만이라면, 첫if문이 부정이라 바깥쪽 else문 실행해서, 85보다 클시엔 grade를 B+로출력, 아닐시엔B로 출력 
	}
}
