package pk16;

import java.util.EmptyStackException;


public class InStack {

	private int max;//스택 용량
	private int ptr;//스택 포인트
	private int stx[]; //스택본체
	
	//실행 시 예외 : 스택이 비어있음
	public class EmptyIntStackExcation extends RuntimeException{
		public EmptyIntStackExcation() {System.out.println("언더플로 에러");}
	}
	//실행 시 예외 : 스택이 가득 참
		public class OverflowStackExcation extends RuntimeException{
			public OverflowStackExcation() {System.out.println("오버플로 에러");}
		}
		
		//생성자 
		public InStack(int capacity) {
			ptr=0;
			max=capacity;
			try {
				stx =new int[max];//스택 본체용 배열 생성
			} catch (OutOfMemoryError e) {//생성할수 없음 에러 발생
				max = 0;//에러 처리부
			}
		}
		//스택에 x를 푸시
		public int push(int x)throws OverflowStackExcation{
			if(ptr>=max) {
				throw new OverflowStackExcation();
			}
			return stx[ptr++]=x;
			}
		//스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
		public int pop()throws EmptyIntStackExcation{
			if(ptr<0) {
				throw new EmptyIntStackExcation();
			}
			return stx[--ptr];
		}
		//스택에서 데이터를 피크 (정상에 있는 데이터를 들여다봄==모니터링)
		public int peek() throws EmptyIntStackExcation{
			if(ptr<=0)
				throw new EmptyIntStackExcation();
			return stx[ptr-1];
		}
		//스택에서 x를 찾아 인덱스(없으면 -1)를 반환
		public int indexOf(int x) {
			for(int i=ptr-1;i>=0;i--) {//정상쪽에서 선형 검색
				if(stx[i]==x) {
					return i;//검색 성공
				}
			}
			return -1;//검색 실패
		}
		public void clear() {
			ptr=0;
		}
		
		//스택을 용량확인
		public int  capacity() {
			return max;
		}
		
		//스택에 쌓여있는 데이터 수
		public int size() {
			return ptr;
		}
		//스택이 비어 있는가?
		public boolean isEmpty() {
			return ptr<=0;//if(ptr<=0)
		}
		//스택이 가득 찼는가?
		public boolean isFull() {
			return ptr>=max;
		}

}

