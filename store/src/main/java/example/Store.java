package example;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Store_table")
public class Store {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String storeid;
    private String foodid;
    private String orderid;
    private String orderstatus;

    @PostPersist
    public void onPostPersist(){
        OrderReceived orderReceived = new OrderReceived();
        BeanUtils.copyProperties(this, orderReceived);
        orderReceived.publishAfterCommit();

        OrderCanceled orderCanceled = new OrderCanceled();
        BeanUtils.copyProperties(this, orderCanceled);
        orderCanceled.publishAfterCommit();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getStoreid() {
        return storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid;
    }
    public String getFoodid() {
        return foodid;
    }

    public void setFoodid(String foodid) {
        this.foodid = foodid;
    }
    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }
    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }




}
