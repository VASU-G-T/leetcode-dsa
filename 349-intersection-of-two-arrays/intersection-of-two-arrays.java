class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
    {
        for(int j=0;j<nums2.length;j++){
           if (nums1[i]==nums2[j] ){
               if(!li.contains(nums1[i])){
                li.add(nums1[i]);
               }
break;
           }
        }
    }
    int[] a= new int[li.size()];
    for(int i=0;i<li.size();i++){
        a[i]=li.get(i);

    }  
    return a;
      }
}