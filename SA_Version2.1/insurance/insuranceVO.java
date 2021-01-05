package insurance;

import java.util.Date;

public class insuranceVO {

//�����̸�
   private String name;
   // �����̵�
   private int clientID;
   // ������̵�
   private int insuranceID;
   // �����
   private int insuranceMoney;
   // ����Ⱓ
   private String insurancePeriod;
   // ���Ժ�
   private int payIn;
   // ���ҳ�
   private Date paymentDate;
   // ���ҹ��
   private String paymentMethod;
   // ����
   private float rate;

   private boolean statement;
//����Ư��
   private String specialSubscription;
   // ���Դ��
   private String subscriptionTarget;

   private boolean longtermPeriodBoolean;

   private String insuranceCategory;

   private boolean ArraySize;

   public insuranceVO() {
   }

   public float premiumRate(int targetCustomerID) {
      return rate;
   }

   public boolean getArraySize() {
      return ArraySize;
   }

   public void setArraySize(boolean arraySize) {
      ArraySize = arraySize;
   }

   public int getClientID() {
      return clientID;
   }

   public void setClientID(int clientID) {
      this.clientID = clientID;
   }

   public int getInsuranceID() {
      return insuranceID;
   }

   public void setInsuranceID(int insuranceID) {
      this.insuranceID = insuranceID;
   }

   public int getInsuranceMoney() {
      return insuranceMoney;
   }

   public void setInsuranceMoney(int insuranceMoney) {
      this.insuranceMoney = insuranceMoney;
   }

   public String getInsurancePeriod() {
      return insurancePeriod;
   }

   public void setInsurancePeriod(String insurancePeriod) {
      this.insurancePeriod = insurancePeriod;
   }

   public int getPayment() {
      return payIn;
   }

   public void setPayment(int payment) {
      this.payIn = payment;
   }

   public Date getPaymentDate() {
      return paymentDate;
   }

   public void setPaymentDate(Date paymentDate) {
      this.paymentDate = paymentDate;
   }

   public String getPaymentMethod() {
      return paymentMethod;
   }

   public void setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
   }

   public float getRate() {
      return rate;
   }

   public void setRate(float rate) {
      this.rate = rate;
   }

   public String getSpecialSubscription() {
      return specialSubscription;
   }

   public void setSpecialSubscription(String specialSubscription) {
      this.specialSubscription = specialSubscription;
   }

   public String getSubscriptionTarget() {
      return subscriptionTarget;
   }

   public void setSubscriptionTarget(String subscriptionTarget) {
      this.subscriptionTarget = subscriptionTarget;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public boolean isLongtermPeriodBoolean() {
      return longtermPeriodBoolean;
   }

   public void setLongtermPeriodBoolean(boolean longtermPeriodBoolean) {
      this.longtermPeriodBoolean = longtermPeriodBoolean;
   }

   public boolean isStatement() {
      return statement;
   }

   public void setStatement(boolean statement) {
      this.statement = statement;
   }

   public String getInsuranceCategory() {
      return insuranceCategory;
   }

}