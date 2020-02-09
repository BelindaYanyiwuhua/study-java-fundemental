package DemoGraphQL.resolver;

import DemoGraphQL.model.Company;
import DemoGraphQL.model.Product;
import DemoGraphQL.respository.CompanyRespository;
import DemoGraphQL.respository.ProductRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

public class Query implements GraphQLQueryResolver {
    private ProductRepository productRepository;
    private CompanyRespository companyRespository;


    public Query(CompanyRespository companyRespository, ProductRepository productRepository){
        this.companyRespository=companyRespository;
        this.productRepository=productRepository;
    }

    public Iterable<Product> findAllProducts(){
        return productRepository.findAll();
    }

    public Iterable<Company> findAllCompanys(){
        return companyRespository.findAll();
    }

    public  long countProducts(){return productRepository.count();}
    public  long countCompanys(){return companyRespository.count();}

}
