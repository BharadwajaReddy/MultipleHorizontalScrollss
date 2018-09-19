package filters.com.multiplehorizontalscrolls;

public class Hotels {

    private int Hotel_Id;
    private String Hotel_Image_url;
    private String Hotel_Name;
    private int Hotel_Rating;
    private int Hotel_Distance;
    private boolean isChecked;

    public int getDownloadStatus() {
        return downloadStatus;
    }

    public void setDownloadStatus(int downloadStatus) {
        this.downloadStatus = downloadStatus;
    }

    private int downloadStatus;


    public Hotels(int hotel_Id, String hotel_Image_url, String hotel_Name, int hotel_Rating, int hotel_Distance, boolean isChecked, int downloadStatus) {
        Hotel_Id = hotel_Id;
        Hotel_Image_url = hotel_Image_url;
        Hotel_Name = hotel_Name;
        Hotel_Rating = hotel_Rating;
        Hotel_Distance = hotel_Distance;
        this.isChecked = isChecked;
        this.downloadStatus = downloadStatus;

    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public int getHotel_Id() {
        return Hotel_Id;
    }

    public void setHotel_Id(int hotel_Id) {
        Hotel_Id = hotel_Id;
    }

    public String getHotel_Image_url() {
        return Hotel_Image_url;
    }

    public void setHotel_Image_url(String hotel_Image_url) {
        Hotel_Image_url = hotel_Image_url;
    }

    public String getHotel_Name() {
        return Hotel_Name;
    }

    public void setHotel_Name(String hotel_Name) {
        Hotel_Name = hotel_Name;
    }

    public int getHotel_Rating() {
        return Hotel_Rating;
    }

    public void setHotel_Rating(int hotel_Rating) {
        Hotel_Rating = hotel_Rating;
    }

    public int getHotel_Distance() {
        return Hotel_Distance;
    }

    public void setHotel_Distance(int hotel_Distance) {
        Hotel_Distance = hotel_Distance;
    }


}
