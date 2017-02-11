package org.usfirst.frc.team2590.routine;

import org.usfirst.frc.team2590.Commands.DriveAtAngle;

public class TenPointBalls extends AutoRoutine {

  private DriveAtAngle wallToPt1;
  private DriveAtAngle pt1Toboiler;
  
  public TenPointBalls(boolean side) {
    wallToPt1 = new DriveAtAngle(5.92,0);
    pt1Toboiler = new DriveAtAngle(8.75, 58);
  }

  @Override
  public void run() {
    runCommand(wallToPt1);
    runCommand(pt1Toboiler);

    //start shots
  }

  @Override
  public void end() {

  }



}
