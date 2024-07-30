package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import l4.w;

/* compiled from: ExoMediaDrm.java */
/* loaded from: classes2.dex */
public interface i {

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f19985a;

        /* renamed from: b, reason: collision with root package name */
        public final String f19986b;

        public a(byte[] bArr, String str) {
            this.f19985a = bArr;
            this.f19986b = str;
        }
    }

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: classes2.dex */
    public interface c {
        i acquireExoMediaDrm(UUID uuid);
    }

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f19987a;

        /* renamed from: b, reason: collision with root package name */
        public final String f19988b;

        public d(byte[] bArr, String str) {
            this.f19987a = bArr;
            this.f19988b = str;
        }
    }

    Map<String, String> a(byte[] bArr);

    d b();

    n4.b c(byte[] bArr) throws MediaCryptoException;

    byte[] d() throws MediaDrmException;

    void e(byte[] bArr, byte[] bArr2);

    void g(byte[] bArr);

    byte[] h(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    void i(byte[] bArr) throws DeniedByServerException;

    void j(b.a aVar);

    a k(byte[] bArr, List<DrmInitData.SchemeData> list, int i10, HashMap<String, String> hashMap) throws NotProvisionedException;

    int l();

    boolean m(String str, byte[] bArr);

    void release();

    default void f(byte[] bArr, w wVar) {
    }
}
