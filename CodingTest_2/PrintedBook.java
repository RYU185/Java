package CodingTest_2;

public class PrintedBook extends Book {
    int pageCount;
    static boolean isLent;

    public PrintedBook(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    public PrintedBook() {
        super();
    }


    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isLent() {
        return isLent;
    }

    public void setLent(boolean lent) {
        isLent = lent;
    }
    static void lend(){
        if (isLent) {
            System.out.println("["+title+"] 은 이미 대출중입니다.");
            isLent = false;
        }else{
            System.out.println("["+title+"] 은 성공적으로 대출 처리되었습니다.");
        }
    }
    static void returnBook(){
        if (isLent){
            System.out.println("["+title+"] 은 성공적으로 반납되었습니다.");
            isLent = false;
        }else {
            System.out.println("["+title+"] 은 대출중이 아닙니다.");
        }
    }
    @Override
    void displayDetails() {
        System.out.println("Printed Book - 제목: ["+title+"],"+
                            "저자: ["+author+"],"+
                            "페이지: "+pageCount+"],"+
                            "대출여부: ["+isLent+"]");

    }
}
