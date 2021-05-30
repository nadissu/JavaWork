package HMRS.hmrs.core.utilities;

public class SuccessDataResult<T> extends DataResult<T> {
	
	public SuccessDataResult() {
		super(true, null);
	}
	
	public SuccessDataResult(T data) {
		super(true, data);
	}
	
	public SuccessDataResult(String infoMessage, T data) {
		super(true, infoMessage, data);
	}
	
	public SuccessDataResult(String infoMessage) {
		super(true, infoMessage, null);
	}
	
}