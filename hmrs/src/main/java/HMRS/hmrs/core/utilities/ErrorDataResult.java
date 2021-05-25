package HMRS.hmrs.core.utilities;

public class ErrorDataResult<T> extends DataResult<T> {
	
	public ErrorDataResult() {
		super(false, null);
	}
	
	public ErrorDataResult(T data) {
		super(false, data);
	}
	
	public ErrorDataResult(String infoMessage, T data) {
		super(false, infoMessage, data);
	}
	
	public ErrorDataResult(String infoMessage) {
		super(false, infoMessage, null);
	}
	
}
