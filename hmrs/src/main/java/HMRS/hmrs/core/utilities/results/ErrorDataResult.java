package HMRS.hmrs.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {
	
	public ErrorDataResult() {
		super(false, null);
	}
	
	public ErrorDataResult(T data) {
		super(false, data);
	}
	
	public ErrorDataResult(T data, String message) {
		super(false, data, message);
	}
	
	public ErrorDataResult(String message) {
		super(false, null, message);
	}
	
}
