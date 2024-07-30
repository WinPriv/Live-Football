package com.anythink.expressad.exoplayer.d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCrypto;
import android.media.MediaDrm;
import android.os.Handler;
import com.anythink.expressad.exoplayer.d.j;
import com.anythink.expressad.exoplayer.k.af;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@TargetApi(23)
/* loaded from: classes.dex */
public final class l implements j<k> {

    /* renamed from: g, reason: collision with root package name */
    private static final String f7715g = "cenc";

    /* renamed from: h, reason: collision with root package name */
    private final UUID f7716h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaDrm f7717i;

    @SuppressLint({"WrongConstant"})
    private l(UUID uuid) {
        com.anythink.expressad.exoplayer.k.a.a(uuid);
        UUID uuid2 = com.anythink.expressad.exoplayer.b.bi;
        com.anythink.expressad.exoplayer.k.a.a(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        if (af.f8993a < 27 && com.anythink.expressad.exoplayer.b.bj.equals(uuid)) {
            uuid = uuid2;
        }
        this.f7716h = uuid;
        MediaDrm mediaDrm = new MediaDrm(uuid);
        this.f7717i = mediaDrm;
        if (com.anythink.expressad.exoplayer.b.bk.equals(uuid) && "ASUS_Z00AD".equals(af.f8996d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public static l a(UUID uuid) {
        try {
            return new l(uuid);
        } catch (Exception e10) {
            throw new o(e10);
        }
    }

    private static boolean d() {
        return "ASUS_Z00AD".equals(af.f8996d);
    }

    private k e(byte[] bArr) {
        boolean z10;
        if (af.f8993a < 21 && com.anythink.expressad.exoplayer.b.bk.equals(this.f7716h) && "L3".equals(a("securityLevel"))) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new k(new MediaCrypto(this.f7716h, bArr), z10);
    }

    @Override // com.anythink.expressad.exoplayer.d.j
    public final j.h b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f7717i.getProvisionRequest();
        return new j.c(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.anythink.expressad.exoplayer.d.j
    public final Map<String, String> c(byte[] bArr) {
        return this.f7717i.queryKeyStatus(bArr);
    }

    @Override // com.anythink.expressad.exoplayer.d.j
    public final void c() {
        this.f7717i.release();
    }

    @Override // com.anythink.expressad.exoplayer.d.j
    public final /* synthetic */ k d(byte[] bArr) {
        return new k(new MediaCrypto(this.f7716h, bArr), af.f8993a < 21 && com.anythink.expressad.exoplayer.b.bk.equals(this.f7716h) && "L3".equals(a("securityLevel")));
    }

    @Override // com.anythink.expressad.exoplayer.d.j
    public final void a(final j.f<? super k> fVar) {
        this.f7717i.setOnEventListener(new MediaDrm.OnEventListener() { // from class: com.anythink.expressad.exoplayer.d.l.1
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                fVar.a(bArr, i10);
            }
        });
    }

    @Override // com.anythink.expressad.exoplayer.d.j
    public final void b(byte[] bArr) {
        this.f7717i.provideProvisionResponse(bArr);
    }

    @Override // com.anythink.expressad.exoplayer.d.j
    public final void a(final j.g<? super k> gVar) {
        if (af.f8993a >= 23) {
            this.f7717i.setOnKeyStatusChangeListener(gVar == null ? null : new MediaDrm.OnKeyStatusChangeListener() { // from class: com.anythink.expressad.exoplayer.d.l.2
                @Override // android.media.MediaDrm.OnKeyStatusChangeListener
                public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List<MediaDrm.KeyStatus> list, boolean z10) {
                    ArrayList arrayList = new ArrayList();
                    for (MediaDrm.KeyStatus keyStatus : list) {
                        arrayList.add(new j.b(keyStatus.getStatusCode(), keyStatus.getKeyId()));
                    }
                }
            }, (Handler) null);
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // com.anythink.expressad.exoplayer.d.j
    public final void b(byte[] bArr, byte[] bArr2) {
        this.f7717i.restoreKeys(bArr, bArr2);
    }

    @Override // com.anythink.expressad.exoplayer.d.j
    public final byte[] b(String str) {
        return this.f7717i.getPropertyByteArray(str);
    }

    @Override // com.anythink.expressad.exoplayer.d.j
    public final byte[] a() {
        return this.f7717i.openSession();
    }

    @Override // com.anythink.expressad.exoplayer.d.j
    public final void a(byte[] bArr) {
        this.f7717i.closeSession(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x003c, code lost:
    
        if ("AFTM".equals(r1) == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    @Override // com.anythink.expressad.exoplayer.d.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.anythink.expressad.exoplayer.d.j.d a(byte[] r9, byte[] r10, java.lang.String r11, int r12, java.util.HashMap<java.lang.String, java.lang.String> r13) {
        /*
            r8 = this;
            int r0 = com.anythink.expressad.exoplayer.k.af.f8993a
            r1 = 21
            if (r0 >= r1) goto L10
            java.util.UUID r1 = com.anythink.expressad.exoplayer.b.bk
            java.util.UUID r2 = r8.f7716h
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3e
        L10:
            java.util.UUID r1 = com.anythink.expressad.exoplayer.b.bl
            java.util.UUID r2 = r8.f7716h
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L48
            java.lang.String r1 = "Amazon"
            java.lang.String r2 = com.anythink.expressad.exoplayer.k.af.f8995c
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L48
            java.lang.String r1 = com.anythink.expressad.exoplayer.k.af.f8996d
            java.lang.String r2 = "AFTB"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L3e
            java.lang.String r2 = "AFTS"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L3e
            java.lang.String r2 = "AFTM"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L48
        L3e:
            java.util.UUID r1 = r8.f7716h
            byte[] r1 = com.anythink.expressad.exoplayer.e.a.h.a(r10, r1)
            if (r1 == 0) goto L48
            r4 = r1
            goto L49
        L48:
            r4 = r10
        L49:
            r10 = 26
            if (r0 >= r10) goto L69
            java.util.UUID r10 = com.anythink.expressad.exoplayer.b.bj
            java.util.UUID r1 = r8.f7716h
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L69
            java.lang.String r10 = "video/mp4"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L67
            java.lang.String r10 = "audio/mp4"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L69
        L67:
            java.lang.String r11 = "cenc"
        L69:
            r5 = r11
            android.media.MediaDrm r2 = r8.f7717i
            r3 = r9
            r6 = r12
            r7 = r13
            android.media.MediaDrm$KeyRequest r9 = r2.getKeyRequest(r3, r4, r5, r6, r7)
            byte[] r10 = r9.getData()
            java.util.UUID r11 = com.anythink.expressad.exoplayer.b.bj
            java.util.UUID r12 = r8.f7716h
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L9e
            r11 = 27
            if (r0 < r11) goto L86
            goto L9e
        L86:
            java.lang.String r10 = com.anythink.expressad.exoplayer.k.af.a(r10)
            r11 = 43
            r12 = 45
            java.lang.String r10 = r10.replace(r11, r12)
            r11 = 47
            r12 = 95
            java.lang.String r10 = r10.replace(r11, r12)
            byte[] r10 = com.anythink.expressad.exoplayer.k.af.c(r10)
        L9e:
            com.anythink.expressad.exoplayer.d.j$a r11 = new com.anythink.expressad.exoplayer.d.j$a
            java.lang.String r9 = r9.getDefaultUrl()
            r11.<init>(r10, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.d.l.a(byte[], byte[], java.lang.String, int, java.util.HashMap):com.anythink.expressad.exoplayer.d.j$d");
    }

    @Override // com.anythink.expressad.exoplayer.d.j
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (com.anythink.expressad.exoplayer.b.bj.equals(this.f7716h)) {
            bArr2 = a.a(bArr2);
        }
        return this.f7717i.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.anythink.expressad.exoplayer.d.j
    public final String a(String str) {
        return this.f7717i.getPropertyString(str);
    }

    @Override // com.anythink.expressad.exoplayer.d.j
    public final void a(String str, String str2) {
        this.f7717i.setPropertyString(str, str2);
    }

    @Override // com.anythink.expressad.exoplayer.d.j
    public final void a(String str, byte[] bArr) {
        this.f7717i.setPropertyByteArray(str, bArr);
    }
}
