package LabTasks;


import java.util.Comparator;

public class Pc implements Comparable<Pc>, Comparator {
    private  int id;
    private String cpu;
    private String ram;
    private String storage;
    private String lcdMaker;
    private String hasGpu;

    Pc(int id, String cpu, String ram, String storage, String lcdMaker, String hasGpu) {
        this.id = id;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.lcdMaker = lcdMaker;
        this.hasGpu = hasGpu;
    }

    Pc() {
        this.id = id;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.lcdMaker = lcdMaker;
        this.hasGpu = hasGpu;
    }


    // Getters and Setters
    public  int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getLcdMaker() {
        return lcdMaker;
    }

    public void setLcdMaker(String lcdMaker) {
        this.lcdMaker = lcdMaker;
    }

    public String gethasGpu() {
        return hasGpu;
    }

    public void setGpu(String hasGpu) {
        this.hasGpu = hasGpu;
    }

    @Override
    public String toString() {
        return String.format("Id: %d\nCPU: %s\nRAM: %s\nStorage: %s\nLCD Maker: %s\nGPU: %b\n", id, cpu, ram, storage, lcdMaker, hasGpu);
    }


    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    public boolean equals(Object o){
        Pc a = (Pc)o;
        return this.id==a.id && this.cpu.equals(a.cpu) && this.ram.equals(a.ram) && this.storage.equals(a.storage)  && this.lcdMaker.equals(a.lcdMaker) && this.hasGpu==a.hasGpu;
    }



    @Override
    public int compareTo(Pc o) {
        return Integer.compare(this.id, o.id);
    }



//    public Object clone() {
//        return new LabTask.Pc(id, cpu, ram, storage, lcdMaker, hasGpu);
//    }

}