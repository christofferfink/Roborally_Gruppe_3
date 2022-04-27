package dk.dtu.compute.se.pisd.roborally.controller;

import dk.dtu.compute.se.pisd.roborally.model.Space;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.ArrayList;

/**
 * @author Christoffer Fink s205449
 */
public interface FieldAction {

 /**
  * Executes the action for a given field.
  *
  * @param gameController
  * @param space
  */
 boolean doAction(GameController gameController, Space space);

}

