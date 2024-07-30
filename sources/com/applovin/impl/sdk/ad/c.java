package com.applovin.impl.sdk.ad;

import a3.l;
import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final p f18574a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18575b;

    /* loaded from: classes.dex */
    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* renamed from: d, reason: collision with root package name */
        private final String f18580d;

        a(String str) {
            this.f18580d = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f18580d;
        }
    }

    public c(String str, p pVar) {
        if (!TextUtils.isEmpty(str)) {
            if (pVar != null) {
                this.f18575b = str;
                this.f18574a = pVar;
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("Identifier is empty");
    }

    public String a() {
        return this.f18575b;
    }

    public a b() {
        if (a(com.applovin.impl.sdk.c.b.bn) != null) {
            return a.REGULAR;
        }
        if (a(com.applovin.impl.sdk.c.b.bo) != null) {
            return a.AD_RESPONSE_JSON;
        }
        return a.UNSPECIFIED;
    }

    public String c() {
        String a10 = a(com.applovin.impl.sdk.c.b.bn);
        if (!TextUtils.isEmpty(a10)) {
            return a10;
        }
        String a11 = a(com.applovin.impl.sdk.c.b.bo);
        if (!TextUtils.isEmpty(a11)) {
            return a11;
        }
        return null;
    }

    public JSONObject d() {
        if (b() == a.AD_RESPONSE_JSON) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f18575b.substring(c().length()), 0), "UTF-8"));
                    this.f18574a.L();
                    if (y.a()) {
                        this.f18574a.L().b("AdToken", "Decoded token into ad response: " + jSONObject);
                    }
                    return jSONObject;
                } catch (JSONException e10) {
                    this.f18574a.L();
                    if (y.a()) {
                        this.f18574a.L().b("AdToken", "Unable to decode token '" + this.f18575b + "' into JSON", e10);
                        return null;
                    }
                    return null;
                }
            } catch (UnsupportedEncodingException e11) {
                this.f18574a.L();
                if (y.a()) {
                    this.f18574a.L().b("AdToken", l.p(new StringBuilder("Unable to process ad response from token '"), this.f18575b, "'"), e11);
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        String str = this.f18575b;
        String str2 = ((c) obj).f18575b;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f18575b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder s10 = l.s("AdToken{id=", StringUtils.prefixToIndex(32, this.f18575b), ", type=");
        s10.append(b());
        s10.append('}');
        return s10.toString();
    }

    private String a(com.applovin.impl.sdk.c.b<String> bVar) {
        for (String str : this.f18574a.b(bVar)) {
            if (this.f18575b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
