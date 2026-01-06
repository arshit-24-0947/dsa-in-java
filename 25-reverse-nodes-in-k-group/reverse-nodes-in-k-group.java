

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        // 🔥 FIX: prevent runtime error
        if (head == null || k <= 1) return head;

        // Step 1: copy values
        ArrayList<Integer> num = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            num.add(temp.val);
            temp = temp.next;
        }

        // Step 2: reverse in k groups
        for (int i = 0; i + k <= num.size(); i += k) {
            int l = i;
            int r = i + k - 1;

            while (l < r) {
                int swap = num.get(l);
                num.set(l, num.get(r));
                num.set(r, swap);
                l++;
                r--;
            }
        }

        // Step 3: write back
        temp = head;
        int idx = 0;

        while (temp != null) {
            temp.val = num.get(idx++);
            temp = temp.next;
        }

        return head;
    }
}
