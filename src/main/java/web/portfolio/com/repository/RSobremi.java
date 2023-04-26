
package web.portfolio.com.repository;

import web.portfolio.com.entity.Sobremi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSobremi extends JpaRepository <Sobremi, Integer> {
    
     //se pueden declarar métodos extras
}
