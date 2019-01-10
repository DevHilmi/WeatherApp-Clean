package com.rizaldev.data.weather.source.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 10/01/19
 */
public class Main {

    @SerializedName("humidity")
    @Expose
    private Integer humidity;

    @SerializedName("pressure")
    @Expose
    private Integer pressure;

    @SerializedName("temp")
    @Expose
    private Double temp;

    @SerializedName("temp_max")
    @Expose
    private Double tempMax;

    @SerializedName("temp_min")
    @Expose
    private Double tempMin;

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

}

