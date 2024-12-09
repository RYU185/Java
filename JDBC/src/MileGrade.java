public class MileGrade {
    int gradeName;
    int gradeLower;
    int gradeHigher;

    public MileGrade() {
    }

    public int getGradeName() {
        return gradeName;
    }

    public void setGradeName(int gradeName) {
        this.gradeName = gradeName;
    }

    public int getGradeLower() {
        return gradeLower;
    }

    public void setGradeLower(int gradeLower) {
        this.gradeLower = gradeLower;
    }

    public int getGradeHigher() {
        return gradeHigher;
    }

    public void setGradeHigher(int gradeHigher) {
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
