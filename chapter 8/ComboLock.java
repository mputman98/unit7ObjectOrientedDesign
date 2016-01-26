public class ComboLock
{
    private int Secret1;
    private int Secret2;
    private int Secret3;
    private int mainTick = 0;
    private boolean correct = false;
    public ComboLock( int secret1, int secret2, int secret3 ) 
    {
        if( secret1 >= 0 && secret1 <= 39 && secret2 >= 0 && secret2 <= 39 && secret1 >= 0 && secret1 <= 39){   
            this.Secret1 = secret1;
            this.Secret2 = secret2;
            this.Secret3 = secret3;
        }
    }

    public void reset() 
    {
        mainTick = 0;
        correct = false;
    }

    public void turnLeft( int ticks ) 
    { 
        if(mainTick - ticks >= 0)
        {
            mainTick -= ticks;
        }
        else
        {
            mainTick = 40 -( ticks - mainTick);
        }
    }
    
    public void turnRight( int ticks ) 
    {
        if(mainTick + ticks <= 39)
        {
            mainTick += ticks;
        }
        else
        {
            mainTick = mainTick + ticks - 40;
        }
    }

    public boolean open() 
    { 
        if(correct)
        {
            return true;
        }
        return false;
//         
//         while (L1 == false || L2 == false || L3 == false){
//             if(mainTick == Secret1){
//                 L1 = true;
//             }
//             if(mainTick == Secret2){
//                 L2 = true;
//             }
//             if(mainTick == Secret3){
//                 L3 = true;
//             }
//         }
//         return true;
    }
}