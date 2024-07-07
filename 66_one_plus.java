class Solution {
    public int[] plusOne(int[] arr) {
        int carry = 1;
        
        for(int i = arr.length - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
            
            if(carry == 0)
                break;
        }
        
        if(carry > 0) {
            int[] result = new int[arr.length + 1];
            result[0] = carry;
            for(int i =1; i <arr.length; i++){
                result[i] = arr[i];
            }
            return result;
        } else {
            return arr;
        }
        
    }
}