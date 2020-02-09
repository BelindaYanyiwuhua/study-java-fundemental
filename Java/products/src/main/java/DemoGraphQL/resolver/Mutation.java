package DemoGraphQL.resolver;


import DemoGraphQL.model.Company;
import DemoGraphQL.model.Product;
import DemoGraphQL.respository.CompanyRespository;
import DemoGraphQL.respository.ProductRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;


public class Mutation implements GraphQLMutationResolver {
    private ProductRepository productRepository;
    private CompanyRespository companyRespository;

    public Mutation(CompanyRespository companyRespository, ProductRepository productRepository){
        this.companyRespository=companyRespository;
        this.productRepository=productRepository;
    }
    public Company newCompany(String com_Name,String com_Address,String com_Tel){
        Company company=new Company();
        company.setCom_Name(com_Name);
        company.setCom_Address(com_Address);
        company.setCom_Tel(com_Tel);

        companyRespository.save(company);
        return company;
    }
    public Product newProduct(String goodsName, String goodsType, String pro_Date, Long companyId){
        Product product=new Product();
        product.setGoodsName(goodsName);
        product.setGoodsType(goodsType);
        product.setPro_Date(pro_Date);
        product.setCompany(new Company(companyId));

        productRepository.save(product);
        return product;
    }

}
