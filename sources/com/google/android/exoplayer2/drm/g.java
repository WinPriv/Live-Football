package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.drm.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: DummyExoMediaDrm.java */
/* loaded from: classes2.dex */
public final class g implements i {
    @Override // com.google.android.exoplayer2.drm.i
    public final Map<String, String> a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final i.d b() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final n4.b c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final byte[] d() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void e(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final byte[] h(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void i(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final i.a k(byte[] bArr, List<DrmInitData.SchemeData> list, int i10, HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final int l() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final boolean m(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void g(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void j(b.a aVar) {
    }
}
