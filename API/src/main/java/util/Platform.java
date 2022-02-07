package util;

import util.model.OS;

public class Platform {
    private static OS os;

    /**
        Sets the OS enum in memory and returns it. Only sets once so perfectly fine to reuse.
        @return The OS enum type reflecting the OS.
     */
    public OS getOS() {
        if (isSet()) {
            return os;
        }
        final String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("windows")) { os = OS.WINDOWS;
        } else if (osName.contains("mac")) { os = OS.MAC;
        } else if (osName.contains("linux")) { os = OS.LINUX;
        } else { os = OS.UNSUPPORTED; }

        return os;
    }

    public String getOSName() { return os.getName(); }

    public boolean isWindows() { return getOS() == OS.WINDOWS; }
    public boolean isMac() { return getOS() == OS.MAC; }
    public boolean isLinux() { return getOS() == OS.LINUX; }
    public boolean isSupported() { return getOS() != OS.UNSUPPORTED; }
    public boolean isUnsupported() { return getOS() == OS.UNSUPPORTED; }

    /**
     * Used to determine if the OS variable was set.
     * @return True is it is set (no work required) false if null (work required).
     */
    private boolean isSet() {
        return os != null;
    }
}
