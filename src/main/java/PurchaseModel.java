//package edu.auburn;

public class PurchaseModel {
    public int mPurchaseID, mProductID, mCustomerID;
    public double mQuantity, mPrice, mCost, mTax, mTotal;
    public String mDate;

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(mPurchaseID).append(",");
        sb.append(mProductID).append(",");
        sb.append(mCustomerID).append(",");
        sb.append(mQuantity).append(",");
        sb.append(mCost).append(",");
        sb.append(mTax).append(",");
        sb.append(mTotal).append(",");
        sb.append("\"").append(mDate).append("\"").append(")");
        return sb.toString();
    }
}
