package pk15;

public class Key {

	public int number;
	
	public Key(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
	
		return number;
	}
	//논리적으로 같은지 확인 
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key key = (Key)obj;
			if(number == key.number) {
				return true;
			}else
				return false;
		}
		return false;
	}
	
	
	
}
