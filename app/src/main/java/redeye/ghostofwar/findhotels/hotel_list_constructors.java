package redeye.ghostofwar.findhotels;
public class hotel_list_constructors {

    private String hotel_desc;
    private String hotel_name;
    public hotel_list_constructors(String hotelname, String hotel_desc ){
        this.hotel_desc = hotel_desc;
        this.hotel_name = hotel_name;
    }

    public String gethotel_desc() {
        return hotel_desc;
    }
    public String gethotel_name() {
        return hotel_name;
    }

}
