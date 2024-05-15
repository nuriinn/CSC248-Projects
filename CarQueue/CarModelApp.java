/* Assume that several CarModel objects have been stored in the myQ, declare two new objects of type
Queue, name them as highCc and lowCc. Move all the objects from myQ that has cubicCapacity
below or equal to 1300 into lowCc. Otherwise, move them into highCc.*/
public class CarModelApp{
    public static void main (String [] args){
        Queue myQ = new Queue();
        
        Queue highCc = new Queue();
        Queue lowCc = new Queue();
        
        while(!myQ.isEmpty()){
          CarModel cc = (CarModel) myQ.dequeue();
          
          if(cc.getCubicCapacity() <= 1300){
              lowCc.enqueue(cc);
          }
          else {
              highCc.enqueue(cc);
          }
        }
    }
}