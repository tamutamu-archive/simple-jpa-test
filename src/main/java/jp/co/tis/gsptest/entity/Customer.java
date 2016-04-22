package jp.co.tis.gsptest.entity;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 顧客マスタ
 *
 */
@Generated("GSP")
@Entity
@Table(schema = "PUBLIC", name = "CUSTOMER")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    /** CUSTOMER_ID */
    private Long customerId;

    /** CUSTOMER_NAME */
    private String customerName;

    /** AGE */
    private Integer age;

    /** testOrderList関連プロパティ */
    private List<TestOrder> testOrderList;
    /**
     * CUSTOMER_IDを返します。
     *
     * @return CUSTOMER_ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID", precision = 19, nullable = false, unique = true)
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * CUSTOMER_IDを設定します。
     *
     * @param customerId CUSTOMER_ID
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    /**
     * CUSTOMER_NAMEを返します。
     *
     * @return CUSTOMER_NAME
     */
    @Column(name = "CUSTOMER_NAME", length = 30, nullable = true, unique = false)
    public String getCustomerName() {
        return customerName;
    }

    /**
     * CUSTOMER_NAMEを設定します。
     *
     * @param customerName CUSTOMER_NAME
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    /**
     * AGEを返します。
     *
     * @return AGE
     */
    @Column(name = "AGE", precision = 10, nullable = true, unique = false)
    public Integer getAge() {
        return age;
    }

    /**
     * AGEを設定します。
     *
     * @param age AGE
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * testOrderListを返します。
     *
     * @return testOrderList
     */
    @OneToMany(mappedBy = "customer")
    public List<TestOrder> getTestOrderList() {
        return testOrderList;
    }

    /**
     * testOrderListを設定します。
     *
     * @param testOrderList testOrderList
     */
    public void setTestOrderList(List<TestOrder> testOrderList) {
        this.testOrderList = testOrderList;
    }
}
