package com.stagnationlab.c8y.driver.sensors;

import c8y.Hardware;

public class SimulatedLightSensor extends AbstractLightSensor {

    public SimulatedLightSensor(String id) {
        super(id);
    }

    @Override
    Hardware getHardware() {
        return new Hardware(
                "Simulated Light Sensor",
                "098245687332343",
                "1.0.0"
        );
    }

    protected double getIlluminance() {
        // simulate gradual illuminance change
        double step = 2.0;
        double randomChange = Math.random() * step - step / 2.0;
        illuminance = Math.min(Math.max(illuminance + randomChange, 0.0), 10.0);

        return illuminance;
    }
}
