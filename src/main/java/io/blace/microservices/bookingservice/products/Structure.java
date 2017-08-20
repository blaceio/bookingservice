package io.blace.microservices.bookingservice.products;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Structure {

    @Id
    public String id;

    private String structureId;
    private String plclient;
    private String plclienttrader;
    private String plbroker;

    List<Vanilla> legs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStructureId() {
        return structureId;
    }

    public void setStructureId(String structureId) {
        this.structureId = structureId;
    }

    public String getPlclient() {
        return plclient;
    }

    public void setPlclient(String plclient) {
        this.plclient = plclient;
    }

    public String getPlclienttrader() {
        return plclienttrader;
    }

    public void setPlclienttrader(String plclienttrader) {
        this.plclienttrader = plclienttrader;
    }

    public String getPlbroker() {
        return plbroker;
    }

    public void setPlbroker(String plbroker) {
        this.plbroker = plbroker;
    }

    public List<Vanilla> getLegs() {
        return legs;
    }

    public void setLegs(List<Vanilla> legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Structure{" +
                "id='" + id + '\'' +
                ", structureId='" + structureId + '\'' +
                ", plclient='" + plclient + '\'' +
                ", plclienttrader='" + plclienttrader + '\'' +
                ", plbroker='" + plbroker + '\'' +
                ", legs=" + legs +
                '}';
    }
}
