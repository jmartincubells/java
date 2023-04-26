
package web.portfolio.com.repository;

import web.portfolio.com.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCurso extends JpaRepository<Curso, Integer>{
    
}
