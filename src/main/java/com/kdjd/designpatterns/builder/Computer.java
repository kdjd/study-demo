package com.kdjd.designpatterns.builder;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Computer {
    private String cpu;
    private String screen;
    private String memory;
    private String motherboard;

    private Computer(Builder builder) {
        cpu = builder.cpu;
        screen = builder.screen;
        memory = builder.memory;
        motherboard = builder.motherboard;
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String motherboard;

        public Builder() {
        }

        public Builder cpu(String val) {
            cpu = val;
            return this;
        }

        public Builder screen(String val) {
            screen = val;
            return this;
        }

        public Builder memory(String val) {
            memory = val;
            return this;
        }

        public Builder motherboard(String val) {
            motherboard = val;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("cpu", cpu)
                .append("screen", screen)
                .append("memory", memory)
                .append("motherboard", motherboard)
                .toString();
    }
} 
