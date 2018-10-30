/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talkalot;

/**
 *
 * @author tn0786647
 */
public abstract class PhoneCall 
{
    String pNumber;
    double priceOfCall;
    
    public PhoneCall(String pNumber, double price)
    {
        this.pNumber = pNumber;
        this.priceOfCall = 0.0;
    }

    public abstract String getpNumber();


    public abstract double getPriceOfCall(); 
   
    public abstract String getInformation();
    
    public void setPriceOfCall(double priceOfCall) 
    {
        this.priceOfCall = priceOfCall;
    }
    

}
