package school.sptech;

import oshi.hardware.CentralProcessor;
import oshi.spi.SystemInfoFactory;
import oshi.spi.SystemInfoProvider;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    static void main() {
        SystemInfoProvider si = SystemInfoFactory.create();

        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                IO.println(si.getHardware().getMemory().getPhysicalMemory());
                IO.println(si.getOperatingSystem().getFamily());

                CentralProcessor cpu = si.getHardware().getProcessor();


                long[] prevTicks = cpu.getSystemCpuLoadTicks();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                double load = cpu.getSystemCpuLoadBetweenTicks(prevTicks);

                System.out.println(load);
            }
        };

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(tarefa, 0, 1);
    }
}
