package common;

public class Pair<T,K>{
	T key;
	K value;
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}
	public K getValue() {
		return value;
	}
	public void setValue(K value) {
		this.value = value;
	}
	public Pair(T key, K value) {
		super();
		this.key = key;
		this.value = value;
	}
	
}
	