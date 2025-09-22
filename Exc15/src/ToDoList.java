public class ToDoList {
    private String name;
    private String status; // เช่น "ทำแล้ว" หรือ "ยังไม่ทำ"

    public ToDoList(String name) {
        this.name = name;
        this.status = "ยังไม่ทำ";
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String s) {
        this.status = s;
    }

    @Override
    public String toString() {
        return name;
    }
}

