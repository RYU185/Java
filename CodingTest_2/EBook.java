package CodingTest_2;

public class EBook extends Book {
    double fileSize;
    int accessCount;

    public EBook() {}

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }



    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public int getAccessCount() {
        return accessCount;
    }

    public void setAccessCount(int accessCount) {
        this.accessCount = accessCount;
    }

    void access(){
        accessCount = 0;
        accessCount = accessCount+1;
        System.out.println("["+title+"] 조회 횟수: ["+accessCount+"]");
    }

    @Override
    void displayDetails() {
        System.out.println("EBook - 제목: ["+title+"],"+
                "저자: ["+author+"], "+ "파일 사이즈: ["+fileSize+"]MB, "+"조회 횟수: ["+accessCount+"]");

    }
}
