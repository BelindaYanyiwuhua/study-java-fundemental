package DemoGraphQL.respository;


import DemoGraphQL.model.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRespository extends CrudRepository<Company,Long> {
}
