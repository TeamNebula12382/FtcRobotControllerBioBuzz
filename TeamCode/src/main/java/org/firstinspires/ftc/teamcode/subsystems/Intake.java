package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Intake {
    private DcMotor intake;
    private Telemetry telemetry;

    public void HardwareMapSubsystem(HardwareMap hardwareMap){
        intake = hardwareMap.get(DcMotor.class,"intake");
    }


}
