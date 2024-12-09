public class Employee {
    String employeeNumber;
    String employeeID;
    String englishName;
    String employeePosition;
    String gender;
    String birthday;
    String joinDate;
    String employeeAddress;
    String city;
    String region;
    String homeCall;
    String superiorNumber;
    String departmentNumber;

    public Employee() {
    }

    public Employee(String employeeNumber, String employeeName, String englishName, String employeePosition, String gender, String birthday, String joinDate, String employeeAddress, String city, String region, String homecall, String superiorNumber, String departmentNumber) {
        this.employeeNumber = employeeNumber;
        this.employeeID = employeeName;
        this.englishName = englishName;
        this.employeePosition = employeePosition;
        this.gender = gender;
        this.birthday = birthday;
        this.joinDate = joinDate;
        this.employeeAddress = employeeAddress;
        this.city = city;
        this.region = region;
        this.homeCall = homecall;
        this.superiorNumber = superiorNumber;
        this.departmentNumber = departmentNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeID = employeeName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getHomeCall() {
        return homeCall;
    }

    public void setHomeCall(String homeCall) {
        this.homeCall = homeCall;
    }

    public String getSuperiorNumber() {
        return superiorNumber;
    }

    public void setSuperiorNumber(String superiorNumber) {
        this.superiorNumber = superiorNumber;
    }

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(String departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", englishName='" + englishName + '\'' +
                ", employeePosition='" + employeePosition + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", homeCall='" + homeCall + '\'' +
                ", superiorNumber='" + superiorNumber + '\'' +
                ", departmentNumber='" + departmentNumber + '\'' +
                '}';
    }
}
