package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SupersonicAirplane extends Airplane {



    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    public int getFlyMode() {
        return flyMode;
    }

    public void setFlyMode(int flyMode) {
        this.flyMode = flyMode;
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        } else {
            super.fly();
        }
    }


}
