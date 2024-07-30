package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.drm.i;
import d6.g0;
import d6.p;
import java.util.Map;
import java.util.UUID;
import l4.w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FrameworkMediaDrm.java */
/* loaded from: classes2.dex */
public final class j implements i {

    /* renamed from: d, reason: collision with root package name */
    public static final e0.i f19989d = new e0.i();

    /* renamed from: a, reason: collision with root package name */
    public final UUID f19990a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaDrm f19991b;

    /* renamed from: c, reason: collision with root package name */
    public int f19992c;

    /* compiled from: FrameworkMediaDrm.java */
    /* loaded from: classes2.dex */
    public static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            boolean requiresSecureDecoder;
            requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
            return requiresSecureDecoder;
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, w wVar) {
            LogSessionId logSessionId;
            boolean equals;
            MediaDrm.PlaybackComponent playbackComponent;
            w.a aVar = wVar.f32481a;
            aVar.getClass();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            LogSessionId logSessionId2 = aVar.f32483a;
            equals = logSessionId2.equals(logSessionId);
            if (!equals) {
                playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                playbackComponent.getClass();
                playbackComponent.setLogSessionId(logSessionId2);
            }
        }
    }

    public j(UUID uuid) throws UnsupportedSchemeException {
        uuid.getClass();
        UUID uuid2 = k4.g.f30464b;
        d6.a.b(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f19990a = uuid;
        MediaDrm mediaDrm = new MediaDrm((g0.f27302a >= 27 || !k4.g.f30465c.equals(uuid)) ? uuid : uuid2);
        this.f19991b = mediaDrm;
        this.f19992c = 1;
        if (k4.g.f30466d.equals(uuid) && "ASUS_Z00AD".equals(g0.f27305d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final Map<String, String> a(byte[] bArr) {
        return this.f19991b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final i.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f19991b.getProvisionRequest();
        return new i.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final n4.b c(byte[] bArr) throws MediaCryptoException {
        boolean z10;
        int i10 = g0.f27302a;
        UUID uuid = this.f19990a;
        if (i10 < 21 && k4.g.f30466d.equals(uuid) && "L3".equals(this.f19991b.getPropertyString("securityLevel"))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 < 27 && k4.g.f30465c.equals(uuid)) {
            uuid = k4.g.f30464b;
        }
        return new o4.g(uuid, bArr, z10);
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final byte[] d() throws MediaDrmException {
        return this.f19991b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void e(byte[] bArr, byte[] bArr2) {
        this.f19991b.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void f(byte[] bArr, w wVar) {
        if (g0.f27302a >= 31) {
            try {
                a.b(this.f19991b, bArr, wVar);
            } catch (UnsupportedOperationException unused) {
                p.f("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void g(byte[] bArr) {
        this.f19991b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final byte[] h(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (k4.g.f30465c.equals(this.f19990a) && g0.f27302a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(g0.m(bArr2));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (i10 != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = g0.C(sb2.toString());
            } catch (JSONException e10) {
                p.d("ClearKeyUtil", "Failed to adjust response data: ".concat(g0.m(bArr2)), e10);
            }
        }
        return this.f19991b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void i(byte[] bArr) throws DeniedByServerException {
        this.f19991b.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void j(final b.a aVar) {
        this.f19991b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: o4.h
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                com.google.android.exoplayer2.drm.j jVar = com.google.android.exoplayer2.drm.j.this;
                i.b bVar = aVar;
                jVar.getClass();
                b.HandlerC0230b handlerC0230b = com.google.android.exoplayer2.drm.b.this.y;
                handlerC0230b.getClass();
                handlerC0230b.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01a9, code lost:
    
        if (r5 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a3, code lost:
    
        if ("AFTT".equals(r5) == false) goto L86;
     */
    @Override // com.google.android.exoplayer2.drm.i
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.drm.i.a k(byte[] r17, java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r18, int r19, java.util.HashMap<java.lang.String, java.lang.String> r20) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.j.k(byte[], java.util.List, int, java.util.HashMap):com.google.android.exoplayer2.drm.i$a");
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final int l() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final boolean m(String str, byte[] bArr) {
        if (g0.f27302a >= 31) {
            return a.a(this.f19991b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f19990a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final synchronized void release() {
        int i10 = this.f19992c - 1;
        this.f19992c = i10;
        if (i10 == 0) {
            this.f19991b.release();
        }
    }
}
