package net.azurewebsites.mahmudmilton.retrofitjson.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import net.azurewebsites.mahmudmilton.retrofitjson.model.children.Children;

import java.util.ArrayList;

/**
 * Created by milton on 6/15/17.
 */

public class Data {

    @SerializedName("modhash")
    @Expose
    private String modhash;

    @SerializedName("children")
    @Expose
    private ArrayList<Children> children;

    public String getModhash() {
        return modhash;
    }

    public void setModhash(String modhash) {
        this.modhash = modhash;
    }

    public ArrayList<Children> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Children> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Data{" +
                "modhash='" + modhash + '\'' +
                ", children=" + children +
                '}';
    }
}
