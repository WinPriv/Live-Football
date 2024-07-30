package com.huawei.openalliance.ad.ppskit.utils;

/* loaded from: classes2.dex */
public final class b2 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public Runnable f22812s;

    public b2(Runnable runnable) {
        this.f22812s = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f22812s;
        if (runnable != null) {
            try {
                runnable.run();
            } finally {
                try {
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
    }
}
