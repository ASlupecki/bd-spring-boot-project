package com.bloomtechspringbootgp.model;

//This class will hold the data being sent in an HTTP request

//a POJO is normally used in HTTP request
// (a POJO has data, constructors, standard getters and setters,
//      toString(), equals(), and hashCode() overrides)

import java.util.Objects;

public class theDataForRequest {
    String theData; //the data to send the request
                    //the data variable names must match the JSON attributes

    public theDataForRequest(String theData) {
        this.theData = theData;
    }

    public theDataForRequest() {} //Should always have a default constructor for a POJO
                                    // in case JAVA needs it

    public String getTheData() {
        return theData;
    }

    public void setTheData(String theData) {
        this.theData = theData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof theDataForRequest that)) return false;
        return Objects.equals(getTheData(), that.getTheData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTheData());
    }

    @Override
    public String toString() {
        return "theDataForRequest{" +
                "theData='" + theData + '\'' +
                '}';
    }
}
