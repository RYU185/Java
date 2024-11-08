import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        Album2 a2 = new Album2();
        a2.setTitle("Spring");
        a2.setReleaseYear(2024);
        a2.addTracks("AAA");
        a2.addTracks("BBB");
        a2.addTracks("CCC");
        List<String> temp = a2.getTracks();
        System.out.println(temp.size());   // List의 length는 size()로 확인
        System.out.println(temp);          // List는 Array로 바로 출력가능


    }
}

// 배열 대신 컬렉션중에ㅔ 하나인 ArrayList를 사용하는 예제
// Example2와 Example3 의 차이를 공부하자
class Album2 {
    private String title;
    private int releaseYear;
    private List<String> tracks;  // 원래 문자열의 배열이었던 것을 List로 변경

    public Album2() {
        // List 클래스의 생성자(초기화)는 ArrayList<>()를 사용함!!!
        // List 의 초기화
        this.tracks = new ArrayList<>();
    }

    public Album2(String title, int releaseYear, List<String> tracks) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "앨범제목: "+ title + ", 발매연도:" + releaseYear;
    }

    public void addTracks (String song){
        tracks.add(song);  // 매개변수 데이터타입이 문자열이어야 함!!! (List 가 문자열, 받는 것도 문자열)
    }
    // 삭제
    public void removeTracks(String song){
        if (tracks.remove(song)) {   // remove 메서드 자체가 삭제할 요소를 갖고 있다면 true 리턴
            System.out.println("곡이 삭제되었습니다: "+song);
        }else {
            // 해당 곡이 존재하지 않으면 그대로 false 리턴
            System.out.println("곡을 찾을 수 없습니다: "+song);
        }
    }

}

