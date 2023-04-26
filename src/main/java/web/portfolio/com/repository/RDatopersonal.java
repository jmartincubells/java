
package web.portfolio.com.repository;

import web.portfolio.com.entity.Datopersonal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RDatopersonal extends JpaRepository<Datopersonal, Integer>{
    
}
