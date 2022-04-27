package dk.dtu.compute.se.pisd.roborally.model;

import dk.dtu.compute.se.pisd.roborally.controller.FieldAction;
import dk.dtu.compute.se.pisd.roborally.controller.GameController;

public class Checkpoint implements FieldAction {

   public final int number;

   public Checkpoint(int number){
       this.number=number;
   }
    public boolean doAction(GameController gameController, Space space) {
        Player player = space.getPlayer();
        if (player != null) {


            player.setLastCheckpoint(this.number);

        }

        return true;


    }

}

