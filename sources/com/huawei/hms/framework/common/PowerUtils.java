package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.PowerManager;

/* loaded from: classes2.dex */
public class PowerUtils {
    private static final String TAG = "PowerUtils";

    /* loaded from: classes2.dex */
    public static final class PowerMode {
        static int POWER_MODE_DEFAULT_RETURN_VALUE = 0;
        static int POWER_SAVER_MODE = 4;
        static String SMART_MODE_STATUS = "SmartModeStatus";
    }

    public static boolean isAppIdleMode(Context context) {
        if (context != null) {
            String packageName = context.getPackageName();
            Object systemService = context.getSystemService("usagestats");
            if (systemService instanceof UsageStatsManager) {
                UsageStatsManager usageStatsManager = (UsageStatsManager) systemService;
                if (usageStatsManager != null) {
                    return usageStatsManager.isAppInactive(packageName);
                }
                Logger.i(TAG, "isAppIdleMode statsManager is null!");
            }
            return false;
        }
        Logger.i(TAG, "isAppIdleMode Context is null!");
        return false;
    }

    public static boolean isDozeIdleMode(Context context) {
        PowerManager powerManager;
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            if (systemService instanceof PowerManager) {
                powerManager = (PowerManager) systemService;
            } else {
                powerManager = null;
            }
            if (powerManager != null) {
                try {
                    return powerManager.isDeviceIdleMode();
                } catch (RuntimeException e10) {
                    Logger.e(TAG, "dealType rethrowFromSystemServer:", e10);
                    return false;
                }
            }
            Logger.i(TAG, "isDozeIdleMode powerManager is null!");
            return false;
        }
        Logger.i(TAG, "isDozeIdleMode Context is null!");
        return false;
    }

    public static boolean isInteractive(Context context) {
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            if (systemService instanceof PowerManager) {
                try {
                    return ((PowerManager) systemService).isInteractive();
                } catch (RuntimeException e10) {
                    Logger.i(TAG, "getActiveNetworkInfo failed, exception:" + e10.getClass().getSimpleName() + e10.getMessage());
                }
            }
        }
        return false;
    }

    public static boolean isWhilteList(Context context) {
        PowerManager powerManager;
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            if (systemService instanceof PowerManager) {
                powerManager = (PowerManager) systemService;
            } else {
                powerManager = null;
            }
            String packageName = context.getPackageName();
            if (powerManager != null) {
                try {
                    return powerManager.isIgnoringBatteryOptimizations(packageName);
                } catch (RuntimeException e10) {
                    Logger.e(TAG, "dealType rethrowFromSystemServer:", e10);
                }
            }
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static int readDataSaverMode(Context context) {
        ConnectivityManager connectivityManager;
        if (context != null) {
            Object systemService = context.getSystemService("connectivity");
            if (systemService instanceof ConnectivityManager) {
                connectivityManager = (ConnectivityManager) systemService;
            } else {
                connectivityManager = null;
            }
            if (connectivityManager != null) {
                if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    return 0;
                }
                if (connectivityManager.isActiveNetworkMetered()) {
                    return connectivityManager.getRestrictBackgroundStatus();
                }
                Logger.v(TAG, "ConnectType is not Mobile Network!");
                return 0;
            }
            Logger.i(TAG, "readDataSaverMode Context is null!");
            return 0;
        }
        Logger.i(TAG, "readDataSaverMode manager is null!");
        return 0;
    }

    public static int readPowerSaverMode(Context context) {
        PowerManager powerManager;
        int i10;
        if (context != null) {
            int systemInt = SettingUtil.getSystemInt(context.getContentResolver(), PowerMode.SMART_MODE_STATUS, PowerMode.POWER_MODE_DEFAULT_RETURN_VALUE);
            if (systemInt == PowerMode.POWER_MODE_DEFAULT_RETURN_VALUE) {
                Object systemService = ContextCompat.getSystemService(context, "power");
                if (systemService instanceof PowerManager) {
                    powerManager = (PowerManager) systemService;
                } else {
                    powerManager = null;
                }
                if (powerManager != null) {
                    try {
                        if (powerManager.isPowerSaveMode()) {
                            i10 = PowerMode.POWER_SAVER_MODE;
                        } else {
                            i10 = PowerMode.POWER_MODE_DEFAULT_RETURN_VALUE;
                        }
                        return i10;
                    } catch (RuntimeException e10) {
                        Logger.e(TAG, "dealType rethrowFromSystemServer:", e10);
                        return systemInt;
                    }
                }
                return systemInt;
            }
            return systemInt;
        }
        Logger.i(TAG, "readPowerSaverMode Context is null!");
        return 0;
    }
}
