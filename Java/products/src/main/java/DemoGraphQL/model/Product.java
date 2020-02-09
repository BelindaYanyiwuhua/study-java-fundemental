package DemoGraphQL.model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @Column(name="goods_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "goods_name",nullable = false)
    private  String goodsName;

    @Column(name = "goods_type",nullable = false)
    private String goodsType;

    @Column(name="production_date",nullable = false)
    private String pro_Date;


    @ManyToOne
    @JoinColumn(name = "company_id",nullable = false,updatable = false)
    private  Company company;
    public Product(){
    }

    public Product(String goodsName, String goodsType, String pro_Date,Company company) {
        this.goodsName = goodsName;
        this.goodsType = goodsType;
        this.pro_Date = pro_Date;
        this.company = company;
    }

    public  Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getPro_Date() {
        return String.valueOf(pro_Date);
    }

    public void setPro_Date(String pro_Date) {
        this.pro_Date = pro_Date;
    }

    public Company getCompany(){return company;}

    public void setCompany(Company company){this.company = company;}

    @Override
    public boolean equals(Object o){
        if(this==o)return true;
        if (o==null||getClass()!=o.getClass())return false;

        Product product=(Product)o;
        return id.equals(product.id);
    }

    @Override
    public int hashCode(){
        return id.hashCode();
    }

}
