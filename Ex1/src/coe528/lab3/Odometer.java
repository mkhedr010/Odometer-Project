/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author Mohamed Khedr
 */
public class Odometer {
    private int n;
  Counter [] a;
    public Odometer(int n){
        if(n==0)
        { throw new IllegalArgumentException("Error: n Cannot be zero") ;}
    this.n = n;   
  a = new Counter[n];
        a[0] = new DigitCounter(0);
for (int i =1 ; i<n  ; i++)
    {
    a[i] = new LinkedDigitCounter(a[i-1],0);
    }}
    
    public void increment () {a[n-1].increment() ;
}
       public void decrement () {a[n-1].decrement() ;
} 
 public   String count(){
      
    return "" + a[n-1].count() ;
    }
   public void reset(){
     for (int i =0 ; i<n  ; i++)
    {
    a[i].reset();
    }
}}
