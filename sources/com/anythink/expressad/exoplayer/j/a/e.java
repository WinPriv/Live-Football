package com.anythink.expressad.exoplayer.j.a;

import java.io.File;

/* loaded from: classes.dex */
public class e implements Comparable<e> {

    /* renamed from: a, reason: collision with root package name */
    public final String f8742a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8743b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8744c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8745d;

    /* renamed from: e, reason: collision with root package name */
    public final File f8746e;
    public final long f;

    private e(String str, long j10, long j11) {
        this(str, j10, j11, com.anythink.expressad.exoplayer.b.f7291b, null);
    }

    public final boolean a() {
        return this.f8744c == -1;
    }

    public final boolean b() {
        if (!this.f8745d) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(e eVar) {
        e eVar2 = eVar;
        if (!this.f8742a.equals(eVar2.f8742a)) {
            return this.f8742a.compareTo(eVar2.f8742a);
        }
        long j10 = this.f8743b - eVar2.f8743b;
        if (j10 == 0) {
            return 0;
        }
        if (j10 < 0) {
            return -1;
        }
        return 1;
    }

    public e(String str, long j10, long j11, long j12, File file) {
        this.f8742a = str;
        this.f8743b = j10;
        this.f8744c = j11;
        this.f8745d = file != null;
        this.f8746e = file;
        this.f = j12;
    }

    private int a(e eVar) {
        if (!this.f8742a.equals(eVar.f8742a)) {
            return this.f8742a.compareTo(eVar.f8742a);
        }
        long j10 = this.f8743b - eVar.f8743b;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }
}
