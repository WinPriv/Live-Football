package p4;

import android.util.Base64;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import com.huawei.hms.framework.common.ContainerUtils;
import d6.g0;
import java.util.ArrayList;
import java.util.List;
import k4.z0;

/* compiled from: VorbisUtil.java */
/* loaded from: classes2.dex */
public final class z {

    /* compiled from: VorbisUtil.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f34372a;

        public a(String[] strArr) {
            this.f34372a = strArr;
        }
    }

    /* compiled from: VorbisUtil.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f34373a;

        public b(boolean z10) {
            this.f34373a = z10;
        }
    }

    /* compiled from: VorbisUtil.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f34374a;

        /* renamed from: b, reason: collision with root package name */
        public final int f34375b;

        /* renamed from: c, reason: collision with root package name */
        public final int f34376c;

        /* renamed from: d, reason: collision with root package name */
        public final int f34377d;

        /* renamed from: e, reason: collision with root package name */
        public final int f34378e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f34379g;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, byte[] bArr) {
            this.f34374a = i10;
            this.f34375b = i11;
            this.f34376c = i12;
            this.f34377d = i13;
            this.f34378e = i14;
            this.f = i15;
            this.f34379g = bArr;
        }
    }

    public static Metadata a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            int i11 = g0.f27302a;
            String[] split = str.split(ContainerUtils.KEY_VALUE_DELIMITER, 2);
            if (split.length != 2) {
                d6.p.f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.a(new d6.w(Base64.decode(split[1], 0))));
                } catch (RuntimeException e10) {
                    d6.p.g("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new VorbisComment(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static a b(d6.w wVar, boolean z10, boolean z11) throws z0 {
        if (z10) {
            c(3, wVar, false);
        }
        wVar.q((int) wVar.j());
        long j10 = wVar.j();
        String[] strArr = new String[(int) j10];
        for (int i10 = 0; i10 < j10; i10++) {
            strArr[i10] = wVar.q((int) wVar.j());
        }
        if (z11 && (wVar.t() & 1) == 0) {
            throw z0.a("framing bit expected to be set", null);
        }
        return new a(strArr);
    }

    public static boolean c(int i10, d6.w wVar, boolean z10) throws z0 {
        if (wVar.f27386c - wVar.f27385b < 7) {
            if (z10) {
                return false;
            }
            throw z0.a("too short header: " + (wVar.f27386c - wVar.f27385b), null);
        }
        if (wVar.t() != i10) {
            if (z10) {
                return false;
            }
            throw z0.a("expected header type " + Integer.toHexString(i10), null);
        }
        if (wVar.t() == 118 && wVar.t() == 111 && wVar.t() == 114 && wVar.t() == 98 && wVar.t() == 105 && wVar.t() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw z0.a("expected characters 'vorbis'", null);
    }
}
