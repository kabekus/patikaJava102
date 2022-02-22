package Model;

public class Room {
    String roomProperties, roomType;
    int bedNum;

    public Room(String roomProperties, String roomType, int bedNum) {
        this.roomProperties = roomProperties;
        this.roomType = roomType;
        this.bedNum = bedNum;
    }

    public String getRoomProperties() {
        return roomProperties;
    }

    public void setRoomProperties(String roomProperties) {
        this.roomProperties = roomProperties;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getBedNum() {
        return bedNum;
    }

    public void setBedNum(int bedNum) {
        this.bedNum = bedNum;
    }
}
