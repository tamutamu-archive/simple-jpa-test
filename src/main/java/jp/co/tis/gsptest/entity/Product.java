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
 * 商品マスタ
 *
 */
@Generated("GSP")
@Entity
@Table(schema = "PUBLIC", name = "PRODUCT")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    /** PRODUCT_ID */
    private Long productId;

    /** PRODUCT_NAME */
    private String productName;

    /** orderDetailList関連プロパティ */
    private List<OrderDetail> orderDetailList;
    /**
     * PRODUCT_IDを返します。
     *
     * @return PRODUCT_ID
     */
    @Id
    @GeneratedValue(generator = "generator", strategy = GenerationType.AUTO)
    @Column(name = "PRODUCT_ID", precision = 19, nullable = false, unique = true)
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
     * PRODUCT_NAMEを返します。
     *
     * @return PRODUCT_NAME
     */
    @Column(name = "PRODUCT_NAME", length = 30, nullable = true, unique = false)
    public String getProductName() {
        return productName;
    }

    /**
     * PRODUCT_NAMEを設定します。
     *
     * @param productName PRODUCT_NAME
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * orderDetailListを返します。
     *
     * @return orderDetailList
     */
    @OneToMany(mappedBy = "product")
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
}
