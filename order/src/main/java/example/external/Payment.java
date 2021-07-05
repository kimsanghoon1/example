package example.external;

public class Payment {

    private Long id;
    private String orderId;
    private String cardInfo;
    private Long payStatus;
    private String userId;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getCardInfo() {
        return cardInfo;
    }
    public void setCardInfo(String cardInfo) {
        this.cardInfo = cardInfo;
    }
    public Long getPayStatus() {
        return payStatus;
    }
    public void setPayStatus(Long payStatus) {
        this.payStatus = payStatus;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

}
