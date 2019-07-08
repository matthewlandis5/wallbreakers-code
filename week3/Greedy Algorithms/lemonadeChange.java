class Solution {
    private HashMap<Integer,Integer> bill;
    public boolean lemonadeChange(int[] bills) {
        bill=new HashMap<>();
        bill.put(5,0);
        bill.put(10,0);
        for(int i:bills){
            if(i==5){
                bill.put(5,bill.get(5)+1); 
            }else if(i==10){
                bill.put(10,bill.get(10)+1);  
            }
            if(!payable(i))return false;
        }
        return true;
    }
    private boolean payable(int customer){
        if(customer==5)return true;
        int v5=bill.get(5);
        int v10=bill.get(10);
        if(customer==10){
            if(v5>0){
                bill.put(5,v5-1);
                return true;
            }else{
                return false;
            }
        }
        if(v10>0&&v5>0){
            bill.put(5,v5-1);
            bill.put(10,v10-1);
            return true;
        }
        if(v5>2){
            bill.put(5,v5-3);
            return true;
        }
        return false;
    }
}