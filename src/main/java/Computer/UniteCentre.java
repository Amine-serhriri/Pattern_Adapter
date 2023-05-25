package Computer;

public class UniteCentre {
    private Vga vga;

    public void setVga(Vga vga) {
        this.vga = vga;
    }

    public void print(String message){
        System.out.println("********Unite central*************");
        vga.print(message);
        System.out.println("********Unite central************");
    }
}
