public class ArrayEx2 {
    public static void main(String[] args) {
        String person[][] = {
                {"Rewadee","Khunawut","Khwanchai"},
                {"boy","cat","am"},
                {"kai","kha","kheing"}
        };

        for (int i=0;i<person.length;i++){
            System.out.print("Group"+(i+1)+" : ");
            for (int j = 0; j<person[i].length; j++){
                System.out.printf("%-15s",person[i][j]);
            }

            System.out.println("\n----------------------------------");
        }


    }
}
