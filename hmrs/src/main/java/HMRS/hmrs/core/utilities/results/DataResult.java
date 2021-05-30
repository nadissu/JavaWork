package HMRS.hmrs.core.utilities.results;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class DataResult<T> extends Result {
	
	private T data;
	
	public DataResult(boolean success, T data) {
		super(success);
		this.data = data;
	}
	
	public DataResult(boolean success, T data, String message) {
		super(success, message);
		this.data = data;
	}
}