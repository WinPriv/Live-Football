package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzb {
    private static volatile ClassLoader zza;
    private static volatile Thread zzb;

    public static synchronized ClassLoader zza() {
        ClassLoader classLoader;
        synchronized (zzb.class) {
            if (zza == null) {
                zza = zzb();
            }
            classLoader = zza;
        }
        return classLoader;
    }

    private static synchronized ClassLoader zzb() {
        synchronized (zzb.class) {
            ClassLoader classLoader = null;
            if (zzb == null) {
                zzb = zzc();
                if (zzb == null) {
                    return null;
                }
            }
            synchronized (zzb) {
                try {
                    classLoader = zzb.getContextClassLoader();
                } catch (SecurityException e10) {
                    Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e10.getMessage());
                }
            }
            return classLoader;
        }
    }

    private static synchronized Thread zzc() {
        SecurityException e10;
        Thread thread;
        Thread thread2;
        ThreadGroup threadGroup;
        synchronized (zzb.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < activeGroupCount) {
                            threadGroup = threadGroupArr[i11];
                            if ("dynamiteLoader".equals(threadGroup.getName())) {
                                break;
                            }
                            i11++;
                        } else {
                            threadGroup = null;
                            break;
                        }
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i10 < activeCount) {
                            thread2 = threadArr[i10];
                            if ("GmsDynamite".equals(thread2.getName())) {
                                break;
                            }
                            i10++;
                        } else {
                            thread2 = null;
                            break;
                        }
                    }
                } catch (SecurityException e11) {
                    e10 = e11;
                    thread = null;
                }
                if (thread2 == null) {
                    try {
                        thread = new zza(threadGroup, "GmsDynamite");
                        try {
                            thread.setContextClassLoader(null);
                            thread.start();
                        } catch (SecurityException e12) {
                            e10 = e12;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e10.getMessage());
                            thread2 = thread;
                            return thread2;
                        }
                    } catch (SecurityException e13) {
                        e10 = e13;
                        thread = thread2;
                    }
                    thread2 = thread;
                }
            }
            return thread2;
        }
    }
}
