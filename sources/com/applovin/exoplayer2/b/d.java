package com.applovin.exoplayer2.b;

import android.media.AudioAttributes;
import android.os.Bundle;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class d implements com.applovin.exoplayer2.g {

    /* renamed from: a */
    public static final d f13359a = new a().a();
    public static final g.a<d> f = new com.applovin.exoplayer2.a0(2);

    /* renamed from: b */
    public final int f13360b;

    /* renamed from: c */
    public final int f13361c;

    /* renamed from: d */
    public final int f13362d;

    /* renamed from: e */
    public final int f13363e;

    /* renamed from: g */
    private AudioAttributes f13364g;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private int f13365a = 0;

        /* renamed from: b */
        private int f13366b = 0;

        /* renamed from: c */
        private int f13367c = 1;

        /* renamed from: d */
        private int f13368d = 1;

        public a a(int i10) {
            this.f13365a = i10;
            return this;
        }

        public a b(int i10) {
            this.f13366b = i10;
            return this;
        }

        public a c(int i10) {
            this.f13367c = i10;
            return this;
        }

        public a d(int i10) {
            this.f13368d = i10;
            return this;
        }

        public d a() {
            return new d(this.f13365a, this.f13366b, this.f13367c, this.f13368d);
        }
    }

    public /* synthetic */ d(int i10, int i11, int i12, int i13, AnonymousClass1 anonymousClass1) {
        this(i10, i11, i12, i13);
    }

    public static /* synthetic */ d b(Bundle bundle) {
        return a(bundle);
    }

    public AudioAttributes a() {
        if (this.f13364g == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f13360b).setFlags(this.f13361c).setUsage(this.f13362d);
            if (ai.f16274a >= 29) {
                usage.setAllowedCapturePolicy(this.f13363e);
            }
            this.f13364g = usage.build();
        }
        return this.f13364g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f13360b == dVar.f13360b && this.f13361c == dVar.f13361c && this.f13362d == dVar.f13362d && this.f13363e == dVar.f13363e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f13360b) * 31) + this.f13361c) * 31) + this.f13362d) * 31) + this.f13363e;
    }

    private d(int i10, int i11, int i12, int i13) {
        this.f13360b = i10;
        this.f13361c = i11;
        this.f13362d = i12;
        this.f13363e = i13;
    }

    public static /* synthetic */ d a(Bundle bundle) {
        a aVar = new a();
        if (bundle.containsKey(a(0))) {
            aVar.a(bundle.getInt(a(0)));
        }
        if (bundle.containsKey(a(1))) {
            aVar.b(bundle.getInt(a(1)));
        }
        if (bundle.containsKey(a(2))) {
            aVar.c(bundle.getInt(a(2)));
        }
        if (bundle.containsKey(a(3))) {
            aVar.d(bundle.getInt(a(3)));
        }
        return aVar.a();
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
