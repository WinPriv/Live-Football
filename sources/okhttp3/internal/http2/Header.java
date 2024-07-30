package okhttp3.internal.http2;

import com.huawei.openalliance.ad.constant.w;
import com.ironsource.mediationsdk.logger.IronSourceError;
import okhttp3.internal.Util;
import okio.e;

/* loaded from: classes2.dex */
public final class Header {
    final int hpackSize;
    public final e name;
    public final e value;
    public static final e PSEUDO_PREFIX = e.p(w.bE);
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final e RESPONSE_STATUS = e.p(RESPONSE_STATUS_UTF8);
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final e TARGET_METHOD = e.p(TARGET_METHOD_UTF8);
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final e TARGET_PATH = e.p(TARGET_PATH_UTF8);
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public static final e TARGET_SCHEME = e.p(TARGET_SCHEME_UTF8);
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final e TARGET_AUTHORITY = e.p(TARGET_AUTHORITY_UTF8);

    public Header(String str, String str2) {
        this(e.p(str), e.p(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        if (!this.name.equals(header.name) || !this.value.equals(header.value)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.value.hashCode() + ((this.name.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public String toString() {
        return Util.format("%s: %s", this.name.G(), this.value.G());
    }

    public Header(e eVar, String str) {
        this(eVar, e.p(str));
    }

    public Header(e eVar, e eVar2) {
        this.name = eVar;
        this.value = eVar2;
        this.hpackSize = eVar2.A() + eVar.A() + 32;
    }
}
