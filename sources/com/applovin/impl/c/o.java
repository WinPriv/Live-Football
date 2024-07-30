package com.applovin.impl.c;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.Locale;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private Uri f17459a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f17460b;

    /* renamed from: c, reason: collision with root package name */
    private a f17461c;

    /* renamed from: d, reason: collision with root package name */
    private String f17462d;

    /* renamed from: e, reason: collision with root package name */
    private int f17463e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f17464g;

    /* loaded from: classes.dex */
    public enum a {
        Progressive,
        Streaming
    }

    private o() {
    }

    public static o a(t tVar, p pVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (pVar != null) {
            try {
                String c10 = tVar.c();
                if (URLUtil.isValidUrl(c10)) {
                    Uri parse = Uri.parse(c10);
                    o oVar = new o();
                    oVar.f17459a = parse;
                    oVar.f17460b = parse;
                    oVar.f17464g = StringUtils.parseInt(tVar.b().get("bitrate"));
                    oVar.f17461c = a(tVar.b().get("delivery"));
                    oVar.f = StringUtils.parseInt(tVar.b().get(ContentRecord.HEIGHT));
                    oVar.f17463e = StringUtils.parseInt(tVar.b().get(ContentRecord.WIDTH));
                    oVar.f17462d = tVar.b().get("type").toLowerCase(Locale.ENGLISH);
                    return oVar;
                }
                pVar.L();
                if (!y.a()) {
                    return null;
                }
                pVar.L().e("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            } catch (Throwable th) {
                pVar.L();
                if (!y.a()) {
                    return null;
                }
                pVar.L().b("VastVideoFile", "Error occurred while initializing", th);
                return null;
            }
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public Uri b() {
        return this.f17460b;
    }

    public String c() {
        return this.f17462d;
    }

    public int d() {
        return this.f17464g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f17463e != oVar.f17463e || this.f != oVar.f || this.f17464g != oVar.f17464g) {
            return false;
        }
        Uri uri = this.f17459a;
        if (uri == null ? oVar.f17459a != null : !uri.equals(oVar.f17459a)) {
            return false;
        }
        Uri uri2 = this.f17460b;
        if (uri2 == null ? oVar.f17460b != null : !uri2.equals(oVar.f17460b)) {
            return false;
        }
        if (this.f17461c != oVar.f17461c) {
            return false;
        }
        String str = this.f17462d;
        String str2 = oVar.f17462d;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        Uri uri = this.f17459a;
        int i13 = 0;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = i10 * 31;
        Uri uri2 = this.f17460b;
        if (uri2 != null) {
            i11 = uri2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        a aVar = this.f17461c;
        if (aVar != null) {
            i12 = aVar.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        String str = this.f17462d;
        if (str != null) {
            i13 = str.hashCode();
        }
        return ((((((i16 + i13) * 31) + this.f17463e) * 31) + this.f) * 31) + this.f17464g;
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f17459a + ", videoUri=" + this.f17460b + ", deliveryType=" + this.f17461c + ", fileType='" + this.f17462d + "', width=" + this.f17463e + ", height=" + this.f + ", bitrate=" + this.f17464g + '}';
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    public Uri a() {
        return this.f17459a;
    }

    public void a(Uri uri) {
        this.f17460b = uri;
    }
}
