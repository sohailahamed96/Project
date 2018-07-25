package login_details;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LoginRepository extends CrudRepository<Login,Long>{

}
