package HMRS.hmrs.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.Result;
import HMRS.hmrs.entities.dtos.ResumeAddDto;
import HMRS.hmrs.entities.dtos.ResumeGetDto;

public interface ResumeService {

	Result add(ResumeAddDto resumeDto);
	
	DataResult<List<ResumeGetDto>> getAll();
	
	DataResult<List<ResumeGetDto>> findAllByCandidateId(int id);
	
	Result saveImage(MultipartFile file, int resumeId);
}
