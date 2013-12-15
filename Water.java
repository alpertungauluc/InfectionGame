/**
 * Created by Onur TAN
 
*/
public class Water extends Transmission{

    int[] waterArray; 
    protected int waterIndex; 
    private int waterPrice;
    private int powerOfWater;

    public Water(){
        waterArray = new int[5];
        waterIndex = 0;
        waterPrice = 0;
        powerOfWater = 0;
    }

    @Override
    protected void fillArray(){
        int i = 0;
        while ( i < 5 ){
          waterArray[i] = (i+1)*3;
          i++;
        }
        
        waterPrice = waterArray[0];
        powerOfWater = waterArray[0];
    }

    public void buyWaterTransmission(){
        waterIndex++;
        waterPrice = SheepArray[waterIndex];
        powerOfWater = SheepArray[waterIndex];
    }

    public int getWaterPrice(){
        return this.waterPrice;
    }
    public int getPowerOfWater(){
        return this.powerOfWater;
    }


}
