package DemoGraphQL.model;
import javax.persistence.*;

@Entity
public class Company {
    @Id
    @Column(name = "company_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "company_name",nullable = false)
    private String com_Name;

    @Column(name = "company_address",nullable = false)
    private String com_Address;

    @Column(name = "company_tel",nullable = false)
    private String com_Tel;

    public  Company(){
    }

    public  Company(Long id){
        this.id=id;
    }

    public Company(String com_Name,String com_Address,String com_Tel){
        this.com_Name=com_Name;
        this.com_Address=com_Address;
        this.com_Tel=com_Tel;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCom_Name() {
        return com_Name;
    }

    public void setCom_Name(String com_Name) {
        this.com_Name = com_Name;
    }

    public String getCom_Address() {
        return com_Address;
    }

    public void setCom_Address(String com_Address) {
        this.com_Address = com_Address;
    }

    public String getCom_Tel() {
        return com_Tel;
    }

    public void setCom_Tel(String com_Tel) {
        this.com_Tel = com_Tel;
    }
}

