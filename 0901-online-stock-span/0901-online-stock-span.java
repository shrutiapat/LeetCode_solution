class StockSpanner {
    ArrayList<Integer> arr;
    int index;
    
    public StockSpanner() {
        arr = new ArrayList<Integer>();
        index = -1;
    }
    
    public int next(int price) {
        int nod = 1;
        int temp = index;
         
        while(index != -1 && price >= arr.get(index)){
          nod++;  
          index--;  
        }
        arr.add(price);
        index = temp;      
        index++;
       
        return nod;
    }
}
