class Solution {
    public String reverseWords(String s) {
        char arr[] = s.toCharArray();
        int i = 0;
        int j = 0;
        while(i<arr.length){
            while(j<arr.length && arr[j]!=' '){
                j++;
            }
            reverse(i,j-1,arr);
            i=j+1;
            j=i;
            
        }return new String(arr);

    }
    public void reverse(int i,int j,char arr[]){
            while(i<j){
                char temp = arr[i];
                arr[i++]=arr[j];
                arr[j--]=temp;
            }
        }
}
