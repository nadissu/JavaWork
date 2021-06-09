package  HMRS.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HMRS.hmrs.entities.concretes.Language;


public interface LanguageDao extends JpaRepository<Language, Integer> {

}
