package org.firstinspires.ftc.teamcode.teleop;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.subsystems.DriveTrain;


@TeleOp(name = "Nebula Teleop", group = "TeleOp")
public class NebulaTeleop extends LinearOpMode{
    private DriveTrain driveTrain = new DriveTrain();

    @Override
    public void runOpMode() throws InterruptedException{
        driveTrain.HardwareMapSubsystem(hardwareMap);

        waitForStart();
        while (opModeIsActive()){
            double drive = gamepad1.left_stick_x;
            double strafe = -gamepad1.left_stick_y;
            double rotation = gamepad1.right_stick_x;

            driveTrain.MecanumDrive(drive,strafe,rotation, gamepad1.left_stick_button ? 0.15 : 1);
            driveTrain.Telemetry();
        }
    }
}
