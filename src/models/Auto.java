package models;

/**
 * Created by student on 26.06.2018.
 */
public class Auto extends AutoAbs {

    @Override
    public void driveForward(int transmissionNumber) {
        System.out.println("Number of transmission is:");
        System.out.println(transmissionNumber);
    }
}
