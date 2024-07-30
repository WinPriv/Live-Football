package com.ironsource.mediationsdk.logger;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class IronSourceLoggerManager extends IronSourceLogger implements LogListener {

    /* renamed from: e, reason: collision with root package name */
    public static IronSourceLoggerManager f25584e;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<IronSourceLogger> f25585d;

    public IronSourceLoggerManager() {
        super("IronSourceLoggerManager");
        ArrayList<IronSourceLogger> arrayList = new ArrayList<>();
        this.f25585d = arrayList;
        arrayList.add(new a(0));
    }

    public static synchronized IronSourceLoggerManager getLogger() {
        IronSourceLoggerManager ironSourceLoggerManager;
        synchronized (IronSourceLoggerManager.class) {
            if (f25584e == null) {
                f25584e = new IronSourceLoggerManager();
            }
            ironSourceLoggerManager = f25584e;
        }
        return ironSourceLoggerManager;
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.f25585d.add(ironSourceLogger);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public synchronized void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        if (i10 < this.f25581a) {
            return;
        }
        Iterator<IronSourceLogger> it = this.f25585d.iterator();
        while (it.hasNext()) {
            IronSourceLogger next = it.next();
            if (next.f25581a <= i10) {
                next.log(ironSourceTag, str, i10);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public synchronized void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th == null) {
            Iterator<IronSourceLogger> it = this.f25585d.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
        } else {
            Iterator<IronSourceLogger> it2 = this.f25585d.iterator();
            while (it2.hasNext()) {
                it2.next().logException(ironSourceTag, str, th);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.logger.LogListener
    public synchronized void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        log(ironSourceTag, str, i10);
    }

    public void setLoggerDebugLevel(String str, int i10) {
        IronSourceLogger ironSourceLogger;
        if (str == null) {
            return;
        }
        ArrayList<IronSourceLogger> arrayList = this.f25585d;
        Iterator<IronSourceLogger> it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                ironSourceLogger = it.next();
                if (ironSourceLogger.f25582b.equals(str)) {
                    break;
                }
            } else {
                ironSourceLogger = null;
                break;
            }
        }
        if (ironSourceLogger != null) {
            if (i10 >= 0 && i10 <= 3) {
                log(IronSourceLogger.IronSourceTag.NATIVE, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + ")", 0);
                ironSourceLogger.setDebugLevel(i10);
                return;
            }
            arrayList.remove(ironSourceLogger);
            return;
        }
        log(IronSourceLogger.IronSourceTag.NATIVE, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + ")", 0);
    }

    public static synchronized IronSourceLoggerManager getLogger(int i10) {
        IronSourceLoggerManager ironSourceLoggerManager;
        synchronized (IronSourceLoggerManager.class) {
            IronSourceLoggerManager ironSourceLoggerManager2 = f25584e;
            if (ironSourceLoggerManager2 == null) {
                f25584e = new IronSourceLoggerManager();
            } else {
                ironSourceLoggerManager2.f25581a = i10;
            }
            ironSourceLoggerManager = f25584e;
        }
        return ironSourceLoggerManager;
    }
}
