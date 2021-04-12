package com.ravneet;



public class Sales extends SalesPerson{

    public static void main(String[] args) {
        Sales sales = new Sales();
        sales.setSales(12000.00);
        sales.setAdvance(100.00);
        sales.display();
    }

    @Override
    void display() {
        System.out.println(" Total Sale of the Person " + this.sales);
        System.out.println(" Total Advance of the Person " + this.advance);
        double payment=0.00;
        double totalPayment = 0.00;
        if(this.sales < 10000)
            payment = this.sales*0.5;
        else if(this.sales>=10000 && this.sales<15000)
            payment=this.sales*0.10;
        else if(this.sales>=15000 && this.sales<18000)
            payment=this.sales*0.12;
        else if(this.sales>=18000 && this.sales<22000)
            payment=this.sales*0.15;
        else if(this.sales >=22000)
            payment = this.sales*0.16;
        totalPayment =payment-this.advance;
        System.out.println(" Total Commission  " + totalPayment);
    }
}
