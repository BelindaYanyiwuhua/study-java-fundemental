package DemoGraphQL.resolver;


import DemoGraphQL.model.Company;
import DemoGraphQL.model.Product;
import DemoGraphQL.respository.CompanyRespository;
import com.coxautodev.graphql.tools.GraphQLResolver;

public class ProductResolver implements GraphQLResolver<Product> {
    private CompanyRespository companyRespository;

    public ProductResolver(CompanyRespository companyRespository){this.companyRespository=companyRespository;}

    public Company getCompany(Product product){
        return companyRespository.findOne((product.getCompany().getId()));
    }


}
