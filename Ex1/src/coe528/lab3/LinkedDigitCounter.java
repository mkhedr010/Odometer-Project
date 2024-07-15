/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author Mohamed Khedr
 */
public class LinkedDigitCounter extends AbstractCounter {
    private Counter left;
    public LinkedDigitCounter(Counter l, int v){
    super(v);
        left = l;}
     @Override

  public  void increment () {
if (super.value < 9)
super.value  = super.value  + 1;
else {
super.value  = 0;
left.increment();
}
}
   @Override

 public   void decrement () {
if (super.value  > 0)
super.value  = super.value  - 1;
else {
super.value  = 9;
left.decrement();
}
}
 @Override

 public   String count(){
    
    return "" + left.count() + super.value ;
    }
 @Override
   public void reset(){
    super.value  = 0;
    }

}
