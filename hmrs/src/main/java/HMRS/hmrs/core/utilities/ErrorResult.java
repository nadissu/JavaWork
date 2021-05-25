package HMRS.hmrs.core.utilities;

public class ErrorResult extends Result {
	
	public ErrorResult() {
		super(false);
	}
	
	public ErrorResult(String infoMessage) {
		super(false, infoMessage);
	}
	
}