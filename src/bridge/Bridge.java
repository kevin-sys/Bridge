/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bridge;

/**
 *
 * @author pc
 */
public class Bridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }
      public static void testDevice(Device device) {
        System.out.println("PRUEBA CON CONTROL REMOTO BASICO");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("PRUEBA CON CONTROL REMOTO AVANZADO");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
