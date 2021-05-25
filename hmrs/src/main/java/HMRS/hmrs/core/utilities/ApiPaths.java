package HMRS.hmrs.core.utilities;

public class ApiPaths {
	
	private static final String BASE_PATH = "/api";
	
	public static final class UserCtrl{
		public static final String CTRL = BASE_PATH + "/users";
	}
	
	public static final class JobTitleCtrl{
		public static final String CTRL = BASE_PATH + "/jobtitles";
	}
	
	public static final class CandidateCtrl{
		public static final String CTRL = BASE_PATH + "/candidates";
	}
	public static final class EmployerCtrl{
		public static final String CTRL = BASE_PATH + "/employers";
	}
	public static final class EmployeeCtrl{
		public static final String CTRL = BASE_PATH + "/employees";
	}
}
