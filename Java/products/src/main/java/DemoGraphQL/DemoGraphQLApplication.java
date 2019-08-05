package DemoGraphQL;


import DemoGraphQL.exception.GraphQLErrorAdapter;
import DemoGraphQL.model.Company;
import DemoGraphQL.model.Product;
import DemoGraphQL.resolver.Mutation;
import DemoGraphQL.resolver.ProductResolver;
import DemoGraphQL.resolver.Query;
import DemoGraphQL.respository.CompanyRespository;
import DemoGraphQL.respository.ProductRepository;
import graphql.ExceptionWhileDataFetching;
import graphql.GraphQLError;
import graphql.servlet.GraphQLErrorHandler;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@SpringBootApplication
public class DemoGraphQLApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGraphQLApplication.class, args);
    }


    @Bean
    public GraphQLErrorHandler errorHandler() {
        return new GraphQLErrorHandler() {
            @Override
            public List<GraphQLError> processErrors(List<GraphQLError> errors) {
                List<GraphQLError> clientErrors = errors.stream()
                        .filter(this::isClientError)
                        .collect(Collectors.toList());

                List<GraphQLError> serverErrors = errors.stream()
                        .filter(e -> !isClientError(e))
                        .map(GraphQLErrorAdapter::new)
                        .collect(Collectors.toList());

                List<GraphQLError> e = new ArrayList<>();
                e.addAll(clientErrors);
                e.addAll(serverErrors);
                return e;
            }

            protected boolean isClientError(GraphQLError error) {
                return !(error instanceof ExceptionWhileDataFetching || error instanceof Throwable);
            }
        };
    }

    @Bean
    public ProductResolver productResolver(CompanyRespository companyRespository){
        return new ProductResolver(companyRespository);
    }

    public Query query(CompanyRespository companyRespository, ProductRepository productRepository){
        return new Query(companyRespository,productRepository);
    }
    @Bean
    public Mutation mutation(CompanyRespository companyRespository, ProductRepository productRepository){
        return new Mutation(companyRespository,productRepository);
    }

    @Bean
    public CommandLineRunner demo(CompanyRespository companyRespository, ProductRepository productRepository){
        return (args)->{
            Company company=new Company("数联软件","浙江省宁波市宁波研发园A区","0574-88997352");
            companyRespository.save(company);
            productRepository.save(new Product("老人机","老人通信工具","2019-08-23",company));
        };

    }


}

