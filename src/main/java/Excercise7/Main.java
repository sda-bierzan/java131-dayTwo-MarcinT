package Excercise7;

import Excercise7.Guns.Gun;

public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun(6);
        checkIfGunLoaded(gun);
        gun.loadWithBullets(8);

        checkIfGunLoaded(gun);
        gun.shotBullets(10);


    }

    private static void checkIfGunLoaded(Gun gun) {
        System.out.println("Broń naładowana:" + gun.isLoaded());
    }



}
