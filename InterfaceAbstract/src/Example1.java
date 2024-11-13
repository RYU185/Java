// 전자장치 클래스
abstract class Device{   // 추상 클래스 : 추상 메서드 1개를 포함, 인스턴스를 만들지못함
    String brand;
    String model;
    public Device(){
    }

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void powerOn(){
        System.out.println(brand+" "+model+" 전원 켜짐");
    }
    public void powerOff(){
        System.out.println(brand+" "+model+" 전원 꺼짐");
    }
    public abstract void doFunction(); // 추상 메서드

    interface Wifi {
        void connectionWifi();
    }
    interface Bluetooth {
        void connectionBluetooth();
    }

}
// 휴대폰
class Phone extends Device implements Device.Wifi, Device.Bluetooth {
    public Phone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void doFunction() {
        System.out.println("휴대폰이 전화를 겁니다");
    }

    @Override
    public void connectionBluetooth() {
        System.out.println("휴대폰을 블루투스에 연결합니다");
    }

    @Override
    public void connectionWifi() {
        System.out.println("휴대폰을 와이파이에 연결합니다");
    }
}
// 노트북
class Labtop extends Device implements Device.Wifi {
    public Labtop(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void doFunction() {
        System.out.println("노트북이 프로그램을 실행합니다");
    }

    @Override
    public void connectionWifi() {
        System.out.println("노트북이 와이파이에 연결됩니다.");
    }
}


public class Example1 {
    public static void main(String[] args) {
        Device phone = new Phone("삼성","갤럭시 s23");
        Device labtop= new Labtop("Apple", "MacBook Pro");
        // 휴대폰
        phone.powerOff();
        phone.doFunction();
        phone.powerOn();
        ((Device.Wifi)phone).connectionWifi();
        ((Device.Bluetooth)phone).connectionBluetooth();
        // 동적바인딩이 부모클래스인 Device로 되어있으므로
        // connectionWifi를 호출하기 위해 타입변환이 필요함

        // 노트북
        labtop.powerOn();
        labtop.powerOff();
        labtop.doFunction();
        ((Device.Wifi)labtop).connectionWifi();
            }
        }

