package  HMRS.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HMRS.hmrs.entities.concretes.Technology;



public interface TechnologyDao extends JpaRepository<Technology, Integer> {

}
