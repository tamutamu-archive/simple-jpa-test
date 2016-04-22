package jp.co.tis.gsptest.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * テスト注文
 *
 */
@Generated("GSP")
@Entity
@Table(schema = "PUBLIC", name = "TEST_ORDER")
public class TestOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ORDER_ID */
    private Long orderId;

    /** CUSTOMER_ID */
    private Long customerId;

    /** ORDER_DATE */
    private Date orderDate;

    /** orderDetailList関連プロパティ */
    private List<OrderDetail> orderDetailList;

    /** customer関連プロパティ */
    private Customer customer;
    /**
     * ORDER_IDを返します。
     *
     * @return ORDER_ID
     */
    @Id
    @GeneratedValue(generator = "generator", strategy = GenerationType.AUTO)
    @Column(name = "ORDER_ID", precision = 19, nullable = false, unique = true)
    public Long getOrderId() {
        return orderId;
    }

    /**
     * ORDER_IDを設定します。
     *
     * @param orderId ORDER_ID
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    /**
     * CUSTOMER_IDを返します。
     *
     * @return CUSTOMER_ID
     */
    @Column(name = "CUSTOMER_ID", precision = 19, nullable = true, unique = false)
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
     * ORDER_DATEを返します。
     *
     * @return ORDER_DATE
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "ORDER_DATE", nullable = true, unique = false)
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * ORDER_DATEを設定します。
     *
     * @param orderDate ORDER_DATE
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * orderDetailListを返します。
     *
     * @return orderDetailList
     */
    @OneToMany(mappedBy = "testOrder")
    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    /**
     * orderDetailListを設定します。
     *
     * @param orderDetailList orderDetailList
     */
    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    /**
     * customerを返します。
     *
     * @return customer
     */
    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID")
    public Customer getCustomer() {
        return customer;
    }

    /**
     * customerを設定します。
     *
     * @param customer customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
