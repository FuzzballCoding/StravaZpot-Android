package com.sweetzpot.stravazpot.athlete.model;

import com.google.gson.annotations.SerializedName;
import com.sweetzpot.stravazpot.club.model.Club;
import com.sweetzpot.stravazpot.common.model.Gender;
import com.sweetzpot.stravazpot.common.model.ResourceState;
import com.sweetzpot.stravazpot.gear.model.Gear;

import java.util.Date;
import java.util.List;

public class Athlete {
    @SerializedName("id") private long ID;
    @SerializedName("username") private String username;
    @SerializedName("resource_state") private ResourceState resourceState;
    @SerializedName("firstname") private String firstName;
    @SerializedName("lastname") private String lastName;
    @SerializedName("city") private String city;
    @SerializedName("state") private String state;
    @SerializedName("country") private String country;
    @SerializedName("sex") private Gender sex;
    @SerializedName("premium") private boolean premium;
    @SerializedName("created_at") private Date createdAt;
    @SerializedName("updated_at") private Date updatedAt;
    @SerializedName("badge_type_id") private int badgeTypeId;
    @SerializedName("profile_medium") private String profileMedium;
    @SerializedName("profile") private String profile;
    @SerializedName("friend") private FriendStatus friend;
    @SerializedName("follower") private FriendStatus follower;
    @SerializedName("follower_count") private int followerCount;
    @SerializedName("friend_count") private int friendCount;
    @SerializedName("mutual_friend_count") private int mutualFriendCount;
    @SerializedName("athlete_type") private AthleteType athleteType;
    @SerializedName("date_preference") private String datePreference;
    @SerializedName("measurement_preference") private MeasurementPreference measurementPreference;
    @SerializedName("clubs") private List<Club> clubs;
    @SerializedName("ftp") private int ftp;
    @SerializedName("weight") private float weight;
    @SerializedName("bikes") private List<Gear> bikes;
    @SerializedName("shoes") private List<Gear> shoes;

    public long getID() {
        return ID;
    }

    public String getUsername() {
        return username;
    }

    public ResourceState getResourceState() {
        return resourceState;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public Gender getSex() {
        return sex;
    }

    public boolean isPremium() {
        return premium;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public int getBadgeTypeId() {
        return badgeTypeId;
    }

    public String getProfileMedium() {
        return profileMedium;
    }

    public String getProfile() {
        return profile;
    }

    public FriendStatus getFriend() {
        return friend;
    }

    public FriendStatus getFollower() {
        return follower;
    }

    public int getFollowerCount() {
        return followerCount;
    }

    public int getFriendCount() {
        return friendCount;
    }

    public int getMutualFriendCount() {
        return mutualFriendCount;
    }

    public AthleteType getAthleteType() {
        return athleteType;
    }

    public String getDatePreference() {
        return datePreference;
    }

    public MeasurementPreference getMeasurementPreference() {
        return measurementPreference;
    }

    public List<Club> getClubs() {
        return clubs;
    }

    public int getFtp() {
        return ftp;
    }

    public float getWeight() {
        return weight;
    }

    public List<Gear> getBikes() {
        return bikes;
    }

    public List<Gear> getShoes() {
        return shoes;
    }
}
