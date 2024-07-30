package com.anythink.expressad.foundation.g.g;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public static long f10067b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0123a f10068c = EnumC0123a.READY;

    /* renamed from: d, reason: collision with root package name */
    public b f10069d;

    /* renamed from: com.anythink.expressad.foundation.g.g.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0123a {
        READY,
        RUNNING,
        PAUSE,
        CANCEL,
        FINISH
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(EnumC0123a enumC0123a);
    }

    public a() {
        f10067b++;
    }

    private void a(EnumC0123a enumC0123a) {
        this.f10068c = enumC0123a;
        b bVar = this.f10069d;
        if (bVar != null) {
            bVar.a(enumC0123a);
        }
    }

    private EnumC0123a d() {
        return this.f10068c;
    }

    public static long e() {
        return f10067b;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public final void f() {
        EnumC0123a enumC0123a = this.f10068c;
        EnumC0123a enumC0123a2 = EnumC0123a.CANCEL;
        if (enumC0123a != enumC0123a2) {
            a(enumC0123a2);
        }
    }

    public final void g() {
        EnumC0123a enumC0123a = this.f10068c;
        if (enumC0123a != EnumC0123a.PAUSE && enumC0123a != EnumC0123a.CANCEL && enumC0123a != EnumC0123a.FINISH) {
            a(EnumC0123a.RUNNING);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f10068c == EnumC0123a.READY) {
                a(EnumC0123a.RUNNING);
                a();
                a(EnumC0123a.FINISH);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(b bVar) {
        this.f10069d = bVar;
    }
}
