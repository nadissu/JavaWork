package HMRS.hmrs.core.utilities;

public class SuccessResult extends Result {
	
	public SuccessResult() {
		super(true);
	}
	
	public SuccessResult(String infoMessage) {
		super(true, infoMessage);
	}
	
}