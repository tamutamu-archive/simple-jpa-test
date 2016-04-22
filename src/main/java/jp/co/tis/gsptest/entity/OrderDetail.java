package jp.co.tis.gsptest.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 注文明細
 *
 */
@Generated("GSP")
@Entity
@Table(schema = "PUBLIC", name = "ORDER_DETAIL")
public class OrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /** DETAIL_ID */
    private Long detailId;

    /** ORDER_ID */
    private Long orderId;

    /** PRODUCT_ID */
    private Long productId;

    /** UNIT_PRICE */
    private Integer unitPrice;

    /** QUANTITY */
    private Integer quantity;

    /** product関連プロパティ */
    private Product product;

    /** testOrder関連プロパティ */
    private TestOrder testOrder;
    /**
     * DETAIL_IDを返します。
     *
     * @return DETAIL_ID
     */
    @Id
    @GeneratedValue(generator = "generator", strategy = GenerationType.AUTO)
    @Column(name = "DETAIL_ID", precision = 19, nullable = false, unique = true)
    public Long getDetailId() {
        return detailId;
    }

    /**
     * DETAIL_IDを設定します。
     *
     * @param detailId DETAIL_ID
     */
    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }
    /**
     * ORDER_IDを返します。
     *
     * @return ORDER_ID
     */
    @Column(name = "ORDER_ID", precision = 19, nullable = false, unique = false)
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
     * PRODUCT_IDを返します。
     *
     * @return PRODUCT_ID
     */
    @Column(name = "PRODUCT_ID", precision = 19, nullable = true, unique = false)
    public Long getProductId() {
        return productId;
    }

    /**
     * PRODUCT_IDを設定します。
     *
     * @param productId PRODUCT_ID
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    /**
     * UNIT_PRICEを返します。
     *
     * @return UNIT_PRICE
     */
    @Column(name = "UNIT_PRICE", precision = 10, nullable = true, unique = false)
    public Integer getUnitPrice() {
        return unitPrice;
    }

    /**
     * UNIT_PRICEを設定します。
     *
     * @param unitPrice UNIT_PRICE
     */
    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }
    /**
     * QUANTITYを返します。
     *
     * @return QUANTITY
     */
    @Column(name = "QUANTITY", precision = 10, nullable = true, unique = false)
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * QUANTITYを設定します。
     *
     * @param quantity QUANTITY
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * productを返します。
     *
     * @return product
     */
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }

    /**
     * productを設定します。
     *
     * @param product product
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * testOrderを返します。
     *
     * @return testOrder
     */
    @ManyToOne
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")
    public TestOrder getTestOrder() {
        return testOrder;
    }

    /**
     * testOrderを設定します。
     *
     * @param testOrder testOrder
     */
    public void setTestOrder(TestOrder testOrder) {
        this.testOrder = testOrder;
    }
}
