package com.applovin.exoplayer2.d;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.applovin.exoplayer2.d.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public interface m {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f14039a;

        /* renamed from: b, reason: collision with root package name */
        private final String f14040b;

        /* renamed from: c, reason: collision with root package name */
        private final int f14041c;

        public a(byte[] bArr, String str, int i10) {
            this.f14039a = bArr;
            this.f14040b = str;
            this.f14041c = i10;
        }

        public byte[] a() {
            return this.f14039a;
        }

        public String b() {
            return this.f14040b;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(m mVar, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* loaded from: classes.dex */
    public interface c {
        m acquireExoMediaDrm(UUID uuid);
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f14042a;

        /* renamed from: b, reason: collision with root package name */
        private final String f14043b;

        public d(byte[] bArr, String str) {
            this.f14042a = bArr;
            this.f14043b = str;
        }

        public byte[] a() {
            return this.f14042a;
        }

        public String b() {
            return this.f14043b;
        }
    }

    a a(byte[] bArr, List<e.a> list, int i10, HashMap<String, String> hashMap) throws NotProvisionedException;

    void a(b bVar);

    void a(byte[] bArr);

    boolean a(byte[] bArr, String str);

    byte[] a() throws MediaDrmException;

    byte[] a(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    d b();

    void b(byte[] bArr) throws DeniedByServerException;

    void b(byte[] bArr, byte[] bArr2);

    Map<String, String> c(byte[] bArr);

    void c();

    int d();

    com.applovin.exoplayer2.c.b d(byte[] bArr) throws MediaCryptoException;
}
