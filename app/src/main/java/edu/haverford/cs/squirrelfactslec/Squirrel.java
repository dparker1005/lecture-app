package edu.haverford.cs.squirrelfactslec;

public class Squirrel {
    private String mName;
    private String mLocation;
    private String mPicture;


    public Squirrel(String name, String location, String picture) {
        mName = name;
        mLocation = location;
        mPicture = picture;
    }

    public String getName() { return mName; }
    public String getLocation() { return mLocation; }
    public String getPicture() { return mPicture; }

    public void setName(String name) { mName = name; }
}
