package HMRS.hmrs.core.utilities;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DataResult<T> extends Result {
	
	private T data;
	
	public DataResult(boolean isSuccess, T data) {
		super(isSuccess);
		this.data = data;
	}
	
	public DataResult(boolean isSuccess, String infoMessage, T data) {
		super(isSuccess, infoMessage);
		this.data = data;
	}

	public T getData() {
		return data;
	}
	
}