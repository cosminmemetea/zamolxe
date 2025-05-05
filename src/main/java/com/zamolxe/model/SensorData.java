package com.zamolxe.model;
import org.jetbrains.annotations.NotNull;

import java.time.Instant;

public class SensorData {

    @NotNull
    private String sensorId;

    @NotNull
    private Instant timestamp;

    @NotNull
    private String type;

    @NotNull
    private Double value;

    // Getters and setters
    public String getSensorId() { return sensorId; }
    public void setSensorId(String sensorId) { this.sensorId = sensorId; }

    public Instant getTimestamp() { return timestamp; }
    public void setTimestamp(Instant timestamp) { this.timestamp = timestamp; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Double getValue() { return value; }
    public void setValue(Double value) { this.value = value; }
}