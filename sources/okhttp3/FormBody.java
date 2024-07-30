package okhttp3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okio.b;
import okio.c;

/* loaded from: classes2.dex */
public final class FormBody extends RequestBody {
    private static final MediaType CONTENT_TYPE = MediaType.get("application/x-www-form-urlencoded");
    private final List<String> encodedNames;
    private final List<String> encodedValues;

    /* loaded from: classes2.dex */
    public static final class Builder {

        @Nullable
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder() {
            this(null);
        }

        public Builder add(String str, String str2) {
            if (str != null) {
                if (str2 != null) {
                    this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
                    this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
                    return this;
                }
                throw new NullPointerException("value == null");
            }
            throw new NullPointerException("name == null");
        }

        public Builder addEncoded(String str, String str2) {
            if (str != null) {
                if (str2 != null) {
                    this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
                    this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
                    return this;
                }
                throw new NullPointerException("value == null");
            }
            throw new NullPointerException("name == null");
        }

        public FormBody build() {
            return new FormBody(this.names, this.values);
        }

        public Builder(@Nullable Charset charset) {
            this.names = new ArrayList();
            this.values = new ArrayList();
            this.charset = charset;
        }
    }

    public FormBody(List<String> list, List<String> list2) {
        this.encodedNames = Util.immutableList(list);
        this.encodedValues = Util.immutableList(list2);
    }

    private long writeOrCountBytes(@Nullable c cVar, boolean z10) {
        b n10;
        if (z10) {
            n10 = new b();
        } else {
            n10 = cVar.n();
        }
        int size = this.encodedNames.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                n10.Z(38);
            }
            String str = this.encodedNames.get(i10);
            n10.getClass();
            n10.g0(0, str.length(), str);
            n10.Z(61);
            String str2 = this.encodedValues.get(i10);
            n10.g0(0, str2.length(), str2);
        }
        if (z10) {
            long j10 = n10.f33824t;
            n10.b();
            return j10;
        }
        return 0L;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    public String encodedName(int i10) {
        return this.encodedNames.get(i10);
    }

    public String encodedValue(int i10) {
        return this.encodedValues.get(i10);
    }

    public String name(int i10) {
        return HttpUrl.percentDecode(encodedName(i10), true);
    }

    public int size() {
        return this.encodedNames.size();
    }

    public String value(int i10) {
        return HttpUrl.percentDecode(encodedValue(i10), true);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(c cVar) throws IOException {
        writeOrCountBytes(cVar, false);
    }
}
