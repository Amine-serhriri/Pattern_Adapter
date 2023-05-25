package Computer;

public class SuperVP implements Vga ,Hdmi {
    @Override
    public void view(byte[] data) {
        String message =new String(data);
        System.out.println("...............Super VP Hdmi");
        System.out.println(message);
        System.out.println("...............Super VP Hdmi");
    }

    @Override
    public void print(String message) {
        System.out.println("............ Super VP Vga ...........");
        System.out.println(message);
        System.out.println("............ Super VP Vga...........");
        ;
    }
}
