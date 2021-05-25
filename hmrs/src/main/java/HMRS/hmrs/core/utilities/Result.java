package HMRS.hmrs.core.utilities;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Result {
	private boolean isSuccess;
	private String infoMessage;
	
	
	public Result(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	
	public Result(boolean isSuccess, String infoMessage) {
		this(isSuccess);
		this.infoMessage = infoMessage;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public String getInfoMessage() {
		return infoMessage;
	}
	
}