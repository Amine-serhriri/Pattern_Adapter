import Adapter.HdmiVgaAdapter;
import Computer.*;

public class Main {
    public static void main(String[] args) {
       UniteCentre uniteCentre=new UniteCentre();
         /*uniteCentre.setVga(new Ecran());
        uniteCentre.print("bonjour");
        System.out.println(":::::::::::::::::::::::::");
        uniteCentre.setVga(new VideoProjecteur());
        uniteCentre.print("salut");*/

        /*HdmiVgaAdapter hdmiVgaAdapter=new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentre.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("bonsoir bachelor genie info");*/

        //Connexion normal
        uniteCentre.setVga(new SuperVP());
        uniteCentre.print("hello");

        //Connexion via Adaptateur
        HdmiVgaAdapter hdmiVgaAdapter1=new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCentre.setVga(hdmiVgaAdapter1);
        uniteCentre.print("hhello2");


    }
}