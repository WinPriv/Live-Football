package com.anythink.expressad.exoplayer.b;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f7335a = new a().a();

    /* renamed from: b, reason: collision with root package name */
    public final int f7336b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7337c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7338d;

    /* renamed from: e, reason: collision with root package name */
    private AudioAttributes f7339e;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f7340a = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f7341b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f7342c = 1;

        private a c(int i10) {
            this.f7341b = i10;
            return this;
        }

        public final a a(int i10) {
            this.f7340a = i10;
            return this;
        }

        public final a b(int i10) {
            this.f7342c = i10;
            return this;
        }

        public final b a() {
            return new b(this.f7340a, this.f7341b, this.f7342c, (byte) 0);
        }
    }

    public /* synthetic */ b(int i10, int i11, int i12, byte b10) {
        this(i10, i11, i12);
    }

    @TargetApi(21)
    public final AudioAttributes a() {
        if (this.f7339e == null) {
            this.f7339e = new AudioAttributes.Builder().setContentType(this.f7336b).setFlags(this.f7337c).setUsage(this.f7338d).build();
        }
        return this.f7339e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f7336b == bVar.f7336b && this.f7337c == bVar.f7337c && this.f7338d == bVar.f7338d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7336b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f7337c) * 31) + this.f7338d;
    }

    private b(int i10, int i11, int i12) {
        this.f7336b = i10;
        this.f7337c = i11;
        this.f7338d = i12;
    }
}
