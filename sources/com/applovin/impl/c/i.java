package com.applovin.impl.c;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private a f17429a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f17430b;

    /* renamed from: c, reason: collision with root package name */
    private String f17431c;

    /* loaded from: classes.dex */
    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private i() {
    }

    public static i a(t tVar, i iVar, p pVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (pVar != null) {
            if (iVar == null) {
                try {
                    iVar = new i();
                } catch (Throwable th) {
                    pVar.L();
                    if (!y.a()) {
                        return null;
                    }
                    pVar.L().b("VastNonVideoResource", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (iVar.f17430b == null && !StringUtils.isValidString(iVar.f17431c)) {
                String a10 = a(tVar, "StaticResource");
                if (URLUtil.isValidUrl(a10)) {
                    iVar.f17430b = Uri.parse(a10);
                    iVar.f17429a = a.STATIC;
                    return iVar;
                }
                String a11 = a(tVar, "IFrameResource");
                if (StringUtils.isValidString(a11)) {
                    iVar.f17429a = a.IFRAME;
                    if (URLUtil.isValidUrl(a11)) {
                        iVar.f17430b = Uri.parse(a11);
                    } else {
                        iVar.f17431c = a11;
                    }
                    return iVar;
                }
                String a12 = a(tVar, "HTMLResource");
                if (StringUtils.isValidString(a12)) {
                    iVar.f17429a = a.HTML;
                    if (URLUtil.isValidUrl(a12)) {
                        iVar.f17430b = Uri.parse(a12);
                    } else {
                        iVar.f17431c = a12;
                    }
                }
            }
            return iVar;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public Uri b() {
        return this.f17430b;
    }

    public String c() {
        return this.f17431c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f17429a != iVar.f17429a) {
            return false;
        }
        Uri uri = this.f17430b;
        if (uri == null ? iVar.f17430b != null : !uri.equals(iVar.f17430b)) {
            return false;
        }
        String str = this.f17431c;
        String str2 = iVar.f17431c;
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
        a aVar = this.f17429a;
        int i12 = 0;
        if (aVar != null) {
            i10 = aVar.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        Uri uri = this.f17430b;
        if (uri != null) {
            i11 = uri.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str = this.f17431c;
        if (str != null) {
            i12 = str.hashCode();
        }
        return i14 + i12;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastNonVideoResource{type=");
        sb2.append(this.f17429a);
        sb2.append(", resourceUri=");
        sb2.append(this.f17430b);
        sb2.append(", resourceContents='");
        return a3.l.p(sb2, this.f17431c, "'}");
    }

    private static String a(t tVar, String str) {
        t b10 = tVar.b(str);
        if (b10 != null) {
            return b10.c();
        }
        return null;
    }

    public a a() {
        return this.f17429a;
    }

    public void a(Uri uri) {
        this.f17430b = uri;
    }

    public void a(String str) {
        this.f17431c = str;
    }
}
