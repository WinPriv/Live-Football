package com.applovin.exoplayer2.d;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.d.m;
import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class o implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final m.c f14048a = new m.c() { // from class: com.applovin.exoplayer2.d.e0
        @Override // com.applovin.exoplayer2.d.m.c
        public final m acquireExoMediaDrm(UUID uuid) {
            m c10;
            c10 = o.c(uuid);
            return c10;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final UUID f14049b;

    /* renamed from: c, reason: collision with root package name */
    private final MediaDrm f14050c;

    /* renamed from: d, reason: collision with root package name */
    private int f14051d;

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            boolean requiresSecureDecoder;
            requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
            return requiresSecureDecoder;
        }
    }

    private o(UUID uuid) throws UnsupportedSchemeException {
        com.applovin.exoplayer2.l.a.b(uuid);
        com.applovin.exoplayer2.l.a.a(!com.applovin.exoplayer2.h.f15240b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f14049b = uuid;
        MediaDrm mediaDrm = new MediaDrm(b(uuid));
        this.f14050c = mediaDrm;
        this.f14051d = 1;
        if (com.applovin.exoplayer2.h.f15242d.equals(uuid) && e()) {
            a(mediaDrm);
        }
    }

    public static o a(UUID uuid) throws t {
        try {
            return new o(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new t(1, e10);
        } catch (Exception e11) {
            throw new t(2, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m c(UUID uuid) {
        try {
            return a(uuid);
        } catch (t unused) {
            com.applovin.exoplayer2.l.q.d("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new k();
        }
    }

    private static byte[] f(byte[] bArr) {
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(bArr);
        int r10 = yVar.r();
        short l10 = yVar.l();
        short l11 = yVar.l();
        if (l10 == 1 && l11 == 1) {
            short l12 = yVar.l();
            Charset charset = Charsets.UTF_16LE;
            String a10 = yVar.a(l12, charset);
            if (a10.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = a10.indexOf("</DATA>");
            if (indexOf == -1) {
                com.applovin.exoplayer2.l.q.c("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = a10.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + a10.substring(indexOf);
            int i10 = r10 + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i10);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i10);
            allocate.putShort(l10);
            allocate.putShort(l11);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(charset));
            return allocate.array();
        }
        com.applovin.exoplayer2.l.q.b("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    @Override // com.applovin.exoplayer2.d.m
    public m.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f14050c.getProvisionRequest();
        return new m.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.applovin.exoplayer2.d.m
    public int d() {
        return 2;
    }

    @Override // com.applovin.exoplayer2.d.m
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public n d(byte[] bArr) throws MediaCryptoException {
        return new n(b(this.f14049b), bArr, ai.f16274a < 21 && com.applovin.exoplayer2.h.f15242d.equals(this.f14049b) && "L3".equals(a("securityLevel")));
    }

    @Override // com.applovin.exoplayer2.d.m
    public void b(byte[] bArr) throws DeniedByServerException {
        this.f14050c.provideProvisionResponse(bArr);
    }

    @Override // com.applovin.exoplayer2.d.m
    public void a(final m.b bVar) {
        this.f14050c.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: com.applovin.exoplayer2.d.d0
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                o.this.a(bVar, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // com.applovin.exoplayer2.d.m
    public void b(byte[] bArr, byte[] bArr2) {
        this.f14050c.restoreKeys(bArr, bArr2);
    }

    @Override // com.applovin.exoplayer2.d.m
    public Map<String, String> c(byte[] bArr) {
        return this.f14050c.queryKeyStatus(bArr);
    }

    private static UUID b(UUID uuid) {
        return (ai.f16274a >= 27 || !com.applovin.exoplayer2.h.f15241c.equals(uuid)) ? uuid : com.applovin.exoplayer2.h.f15240b;
    }

    @Override // com.applovin.exoplayer2.d.m
    public synchronized void c() {
        int i10 = this.f14051d - 1;
        this.f14051d = i10;
        if (i10 == 0) {
            this.f14050c.release();
        }
    }

    private static byte[] b(UUID uuid, byte[] bArr) {
        return com.applovin.exoplayer2.h.f15241c.equals(uuid) ? com.applovin.exoplayer2.d.a.a(bArr) : bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(m.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bVar.a(this, bArr, i10, i11, bArr2);
    }

    private static boolean e() {
        return "ASUS_Z00AD".equals(ai.f16277d);
    }

    @Override // com.applovin.exoplayer2.d.m
    public byte[] a() throws MediaDrmException {
        return this.f14050c.openSession();
    }

    @Override // com.applovin.exoplayer2.d.m
    public void a(byte[] bArr) {
        this.f14050c.closeSession(bArr);
    }

    @Override // com.applovin.exoplayer2.d.m
    public m.a a(byte[] bArr, List<e.a> list, int i10, HashMap<String, String> hashMap) throws NotProvisionedException {
        e.a aVar;
        byte[] bArr2;
        String str;
        if (list != null) {
            aVar = a(this.f14049b, list);
            bArr2 = a(this.f14049b, (byte[]) com.applovin.exoplayer2.l.a.b(aVar.f14027d));
            str = a(this.f14049b, aVar.f14026c);
        } else {
            aVar = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f14050c.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] b10 = b(this.f14049b, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && aVar != null && !TextUtils.isEmpty(aVar.f14025b)) {
            defaultUrl = aVar.f14025b;
        }
        return new m.a(b10, defaultUrl, ai.f16274a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // com.applovin.exoplayer2.d.m
    public byte[] a(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (com.applovin.exoplayer2.h.f15241c.equals(this.f14049b)) {
            bArr2 = com.applovin.exoplayer2.d.a.b(bArr2);
        }
        return this.f14050c.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.applovin.exoplayer2.d.m
    public boolean a(byte[] bArr, String str) {
        if (ai.f16274a >= 31) {
            return a.a(this.f14050c, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f14049b, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    public String a(String str) {
        return this.f14050c.getPropertyString(str);
    }

    private static e.a a(UUID uuid, List<e.a> list) {
        boolean z10;
        if (!com.applovin.exoplayer2.h.f15242d.equals(uuid)) {
            return list.get(0);
        }
        if (ai.f16274a >= 28 && list.size() > 1) {
            e.a aVar = list.get(0);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                e.a aVar2 = list.get(i11);
                byte[] bArr = (byte[]) com.applovin.exoplayer2.l.a.b(aVar2.f14027d);
                if (!ai.a((Object) aVar2.f14026c, (Object) aVar.f14026c) || !ai.a((Object) aVar2.f14025b, (Object) aVar.f14025b) || !com.applovin.exoplayer2.e.g.h.a(bArr)) {
                    z10 = false;
                    break;
                }
                i10 += bArr.length;
            }
            z10 = true;
            if (z10) {
                byte[] bArr2 = new byte[i10];
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    byte[] bArr3 = (byte[]) com.applovin.exoplayer2.l.a.b(list.get(i13).f14027d);
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i12, length);
                    i12 += length;
                }
                return aVar.a(bArr2);
            }
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            e.a aVar3 = list.get(i14);
            int c10 = com.applovin.exoplayer2.e.g.h.c((byte[]) com.applovin.exoplayer2.l.a.b(aVar3.f14027d));
            int i15 = ai.f16274a;
            if (i15 < 23 && c10 == 0) {
                return aVar3;
            }
            if (i15 >= 23 && c10 == 1) {
                return aVar3;
            }
        }
        return list.get(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if ("AFTT".equals(r0) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] a(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = com.applovin.exoplayer2.h.f15243e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = com.applovin.exoplayer2.e.g.h.a(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = f(r4)
            byte[] r4 = com.applovin.exoplayer2.e.g.h.a(r0, r4)
        L18:
            int r1 = com.applovin.exoplayer2.l.ai.f16274a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = com.applovin.exoplayer2.h.f15242d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = com.applovin.exoplayer2.l.ai.f16276c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5f
            java.lang.String r0 = com.applovin.exoplayer2.l.ai.f16277d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = com.applovin.exoplayer2.e.g.h.a(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.d.o.a(java.util.UUID, byte[]):byte[]");
    }

    private static String a(UUID uuid, String str) {
        return (ai.f16274a < 26 && com.applovin.exoplayer2.h.f15241c.equals(uuid) && ("video/mp4".equals(str) || com.anythink.expressad.exoplayer.k.o.f9082q.equals(str))) ? com.anythink.expressad.exoplayer.b.f7295bd : str;
    }

    @SuppressLint({"WrongConstant"})
    private static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }
}
