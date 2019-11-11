/*This is a function problem.You only need to complete the function given below*/
class DynamicProgramming{
    
    // function to find number of ways 
    Long countWays(int m){
        if(m <= 0)
            return 0L;
        return (long)(m/2+1);
    }    
    
    
}