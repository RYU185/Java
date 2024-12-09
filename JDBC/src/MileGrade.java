public class MileGrade {
    String gradeName;
    String gradeLower;
    String gradeHigher;

    public MileGrade() {
    }

    public MileGrade(String gradeName, String gradeLower, String gradeHigher) {
        this.gradeName = gradeName;
        this.gradeLower = gradeLower;
        this.gradeHigher = gradeHigher;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getGradeLower() {
        return gradeLower;
    }

    public void setGradeLower(String gradeLower) {
        this.gradeLower = gradeLower;
    }

    public String getGradeHigher() {
        return gradeHigher;
    }

    public void setGradeHigher(String gradeHigher) {
        this.gradeHigher = gradeHigher;
    }

    @Override
    public String toString() {
        return "MileGrade{" +
                "gradeName='" + gradeName + '\'' +
                ", gradeLower='" + gradeLower + '\'' +
                ", gradeHigher='" + gradeHigher + '\'' +
                '}';
    }
}
