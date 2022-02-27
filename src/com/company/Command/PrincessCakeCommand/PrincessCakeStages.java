package com.company.Command.PrincessCakeCommand;

import com.company.Models.PrincessCake;

public class PrincessCakeStages {
    private PrincessCake princessCake = new PrincessCake();

    public void StageSix(){
        princessCake.setWhippedCream(true);
        System.out.println("Done : Spread whipped cream on the cake so that it has a dome shape");
    }

    public void StageSeven(){
        princessCake.setGreenMarzipanLid(true);
        System.out.println("Done : Put the marzipan lid on the cake (green)");
    }

    public void StageEight(){
        princessCake.setMarzipanRose(true);
        System.out.println("Done : Garnish with marzipan rose");
    }

    public void StageNine(){
        princessCake.setPowderSugar(true);
        System.out.println("Done : Powder Sugar Over The Cake");
    }

}
