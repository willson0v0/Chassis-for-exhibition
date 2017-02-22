package org.usfirst.frc.team6414.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Created by willson on 2017/2/16.
 *
 * @author willson
 *         published under GNU Protocol
 */
public class MonitoredSystem extends Subsystem {
    private Thread monitor;
    private boolean isRunning = true;

    void threadInit(Runnable me) {
        monitor = new Thread(() -> {
            while (isRunning) {
                me.run();
                try {
                    Thread.sleep(200);
                } catch (Exception a) {
                    a.printStackTrace();
                }
            }
        });
    }

    public void startMonitor() {
        monitor.start();
    }

    public void stopMonitor() {
        isRunning = false;
    }

    @Override
    protected void initDefaultCommand() {
    }
}
