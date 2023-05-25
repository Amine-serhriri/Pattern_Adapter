package Adapter;

import Computer.Hdmi;
import Computer.TV;
import Computer.Vga;

public class HdmiVgaAdapter implements Vga {
        private Hdmi hdmi;

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void print(String message) {
        System.out.println("======Adapter======");
        byte[] data =message.getBytes();
        hdmi.view(data);
        System.out.println("======/ Adapter======");
    }



}
