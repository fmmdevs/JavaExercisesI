package devs.fmm.writingyourownclasses.abstractclassesabstractmethods;

import java.util.TimerTask;

public class FreeDiskSpaceTimerTask extends TimerTask {

    @Override
    public void run() {
        long freeDiskSpace = java.io.File.listRoots()[0].getFreeSpace()/(1024*1024);
        System.out.println(freeDiskSpace + " MB");
    }


}
