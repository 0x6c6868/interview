package CodingInterviews;

public class _52_FirstCommonNodesInLists {

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) return null;

        int listOneLength = 0;
        ListNode currNode = pHead1;
        while (currNode != null) {
            listOneLength++;
            currNode = currNode.next;
        }

        int listTwoLength = 0;
        currNode = pHead2;
        while (currNode != null) {
            listTwoLength++;
            currNode = currNode.next;
        }

        ListNode currListOne = pHead1;
        ListNode currListTwo = pHead2;

        if (listOneLength > listTwoLength) {
            for (int i = 0; i < listOneLength - listTwoLength; i++) {
                currListOne = currListOne.next;
            }
        } else if (listOneLength < listTwoLength) {
            for (int i = 0; i < listTwoLength - listOneLength; i++) {
                currListTwo = currListTwo.next;
            }
        }

        while (currListOne != null && currListTwo != null) {
            if (currListOne == currListTwo) return currListOne;
            currListOne = currListOne.next;
            currListTwo = currListTwo.next;
        }

        return null;
    }

}
