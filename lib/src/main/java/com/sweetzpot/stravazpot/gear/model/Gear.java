package com.sweetzpot.stravazpot.gear.model;

import com.google.gson.annotations.SerializedName;
import com.sweetzpot.stravazpot.common.model.Distance;
import com.sweetzpot.stravazpot.common.model.ResourceState;

public class Gear {
    @SerializedName("id") private String ID;
    @SerializedName("primary") private boolean primary;
    @SerializedName("resource_state") private ResourceState resourceState;
    @SerializedName("distance") private Distance distance;
    @SerializedName("brand_name") private String brandName;
    @SerializedName("model_name") private String modelName;
    @SerializedName("frame_type") private FrameType frameType;
    @SerializedName("description") private String description;

    public String getID() {
        return ID;
    }

    public boolean isPrimary() {
        return primary;
    }

    public ResourceState getResourceState() {
        return resourceState;
    }

    public Distance getDistance() {
        return distance;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public FrameType getFrameType() {
        return frameType;
    }

    public String getDescription() {
        return description;
    }
}
