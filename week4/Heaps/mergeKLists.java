/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> totalList=new ArrayList<>();//listNum
        ListNode ret=new ListNode(0);
        ListNode temp,temp2;//ans
        boolean cont=true;
        for (int i=0;i<lists.length;i++) {
            while(true){
                if (lists[i]==null)break;
                totalList.add(lists[i].val);
                if (lists[i].next!=null){
                    lists[i]=lists[i].next;
                }else if (lists[i].next==null){
                    break;
                }

            }
        }
        Collections.sort(totalList);
        
        if(totalList.size()==0){
            return null;
        } else if(totalList.size()==1){
            ret.val = totalList.get(0);
            return ret;
        }
        temp=new ListNode(totalList.get(0));
        for(int i=0;i<totalList.size()-1;i++){
            temp.next=new ListNode(totalList.get(i+1));
            if(i==0){
                ret=temp;
            }
            temp2=temp.next;
            temp=temp2;

        }
        return ret;
    }
}