package HMRS.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HMRS.hmrs.entities.concretes.City;



public interface CityDao extends JpaRepository<City, Integer> {

	
	
}
