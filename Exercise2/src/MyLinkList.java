public class MyLinkList {
    Node head;

    public void add(int score){
        Node newNode=new Node(score);
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public void findMinScore(){
        if (head==null){
            System.out.println("ไม่มีข้อมูล");
            return;
        }
        int minScore = head.data;
        int minIndex = 1;
        int index = 1;
        Node temp = head;
        while(temp!=null){
            if (temp.data<minScore){
                minScore= temp.data;
                minIndex= index;
            }
            temp=temp.next;
            index++;
        }
        System.out.println("นักศึกษาคนที่ "+ minIndex + " ได้คะเเนนต่ำสุด = "+minScore);
    }

    public void findMaxScore(){
        if (head==null){
            System.out.println("ไม่มีข้อมูล");
        }
        int maxScore = head.data;
        int maxIndex = 1;
        int index=1;
        Node temp = head;

        while(temp!=null){
            if (temp.data>maxScore){
                maxScore= temp.data;
                maxIndex=index;
            }
            temp=temp.next;
            index++;
        }
        System.out.println("นักศึกษาคนที่ "+ maxIndex + " ได้คะเเนนสูงสุด = "+maxScore);
    }
    public void AverageScre(){
        if (head==null){
            System.out.println("ไม่มีข้อมูล");
        }
        double total = 0;
        int count = 0;
        Node temp = head;

        while (temp!=null){
            total+=temp.data;
            count++;
            temp=temp.next;
        }
        double avg = total/count;
        System.out.println("ผลเฉลี่ยนักศึกษา "+count+" คนได้เท่ากับ = "+avg);

    }

    public void ShowScore() {
        if (head == null) {
            System.out.println("ไม่มีข้อมูล");
            return;
        }

        System.out.println("====================================");
        System.out.println("|        Show StudentScore         |");
        System.out.println("====================================");
        Node temp = head;
        int index = 1;

        while (temp != null) {
            System.out.print("|       Student no. " + index );
            System.out.printf(" %8d  ",temp.data );
            System.out.println("   |");
            temp = temp.next;
            index++;
        }
        System.out.println("====================================");
    }



}