package HMRS.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HMRS.hmrs.business.abstracts.JobAdvertisementService;
import HMRS.hmrs.core.utilities.results.DataResult;
import HMRS.hmrs.core.utilities.results.SuccessDataResult;
import HMRS.hmrs.dataAccess.abstracts.JobAdvertisementDao;
import HMRS.hmrs.entities.concretes.JobAdvertisement;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Service
public class JobAdvertisementManager implements JobAdvertisementService{
	@Autowired
	private JobAdvertisementDao jobAdversimentDao;
	
	@Override
	public DataResult<List<JobAdvertisement>> getAll() {		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdversimentDao.findAll(),"Tüm İş İlanları Listelendi");
	}
	
	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrue() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdversimentDao.getByIsActiveTrue(), "Aktif İş İlanları Listelendi" );
	}
	
	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueOrderByPublishDate() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdversimentDao.getByIsActiveTrueOrderByPublishDate(),"Aktif İş İlanları Sıralanarak Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployer_CompanyName(String companyName) {
		return new SuccessDataResult<List<JobAdvertisement>> (this.jobAdversimentDao.getByIsActiveTrueAndEmployer_CompanyName(companyName), "Aktif iş ilanları şirketler için sıralandı.");
	}
}
