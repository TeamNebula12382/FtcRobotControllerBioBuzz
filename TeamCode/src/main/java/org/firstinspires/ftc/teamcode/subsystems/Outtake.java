package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Outtake {
    //We need two motors for outtake
    private DcMotor outtakePollen,outtakeNectar;
    private Telemetry telemetry;

    public void HardwareMapSubsystem(HardwareMap hardwareMap){
        outtakeNectar = hardwareMap.get(DcMotor.class,"outtakeNectar");
        outtakePollen = hardwareMap.get(DcMotor.class,"outtakePollen");
    }
}
