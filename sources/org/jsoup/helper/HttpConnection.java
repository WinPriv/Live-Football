package org.jsoup.helper;

import com.anythink.expressad.foundation.g.f.g.c;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.hms.ads.ep;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.openalliance.ad.constant.ag;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.beans.metadata.LocalChannelInfo;
import com.vungle.warren.model.Cookie;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocketFactory;
import org.jsoup.Connection;
import org.jsoup.UncheckedIOException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;

/* loaded from: classes2.dex */
public class HttpConnection implements Connection {
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String DEFAULT_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36";
    public static final String FORM_URL_ENCODED = "application/x-www-form-urlencoded";
    public static final String MULTIPART_FORM_DATA = "multipart/form-data";

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f33897c = Charset.forName("UTF-8");

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f33898d = Charset.forName("ISO-8859-1");

    /* renamed from: a, reason: collision with root package name */
    public Request f33899a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public Connection.Response f33900b;

    /* loaded from: classes2.dex */
    public static class KeyVal implements Connection.KeyVal {

        /* renamed from: a, reason: collision with root package name */
        public String f33901a;

        /* renamed from: b, reason: collision with root package name */
        public String f33902b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        public InputStream f33903c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        public String f33904d;

        public KeyVal(String str, String str2) {
            Validate.notEmptyParam(str, "key");
            Validate.notNullParam(str2, "value");
            this.f33901a = str;
            this.f33902b = str2;
        }

        public static KeyVal create(String str, String str2) {
            return new KeyVal(str, str2);
        }

        @Override // org.jsoup.Connection.KeyVal
        public Connection.KeyVal contentType(String str) {
            Validate.notEmpty(str);
            this.f33904d = str;
            return this;
        }

        @Override // org.jsoup.Connection.KeyVal
        public boolean hasInputStream() {
            if (this.f33903c != null) {
                return true;
            }
            return false;
        }

        public String toString() {
            return this.f33901a + ContainerUtils.KEY_VALUE_DELIMITER + this.f33902b;
        }

        public static KeyVal create(String str, String str2, InputStream inputStream) {
            return new KeyVal(str, str2).inputStream(inputStream);
        }

        @Override // org.jsoup.Connection.KeyVal
        public KeyVal inputStream(InputStream inputStream) {
            Validate.notNullParam(this.f33902b, "inputStream");
            this.f33903c = inputStream;
            return this;
        }

        @Override // org.jsoup.Connection.KeyVal
        public KeyVal key(String str) {
            Validate.notEmptyParam(str, "key");
            this.f33901a = str;
            return this;
        }

        @Override // org.jsoup.Connection.KeyVal
        public KeyVal value(String str) {
            Validate.notNullParam(str, "value");
            this.f33902b = str;
            return this;
        }

        @Override // org.jsoup.Connection.KeyVal
        public String contentType() {
            return this.f33904d;
        }

        @Override // org.jsoup.Connection.KeyVal
        public InputStream inputStream() {
            return this.f33903c;
        }

        @Override // org.jsoup.Connection.KeyVal
        public String key() {
            return this.f33901a;
        }

        @Override // org.jsoup.Connection.KeyVal
        public String value() {
            return this.f33902b;
        }
    }

    /* loaded from: classes2.dex */
    public static class Request extends a<Connection.Request> implements Connection.Request {

        @Nullable
        public Proxy f;

        /* renamed from: g, reason: collision with root package name */
        public int f33905g;

        /* renamed from: h, reason: collision with root package name */
        public int f33906h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f33907i;

        /* renamed from: j, reason: collision with root package name */
        public final ArrayList f33908j;

        /* renamed from: k, reason: collision with root package name */
        @Nullable
        public String f33909k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f33910l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f33911m;

        /* renamed from: n, reason: collision with root package name */
        public Parser f33912n;
        public boolean o;

        /* renamed from: p, reason: collision with root package name */
        public String f33913p;

        /* renamed from: q, reason: collision with root package name */
        @Nullable
        public SSLSocketFactory f33914q;

        /* renamed from: r, reason: collision with root package name */
        public CookieManager f33915r;

        /* renamed from: s, reason: collision with root package name */
        public volatile boolean f33916s;

        static {
            System.setProperty("sun.net.http.allowRestrictedHeaders", ep.Code);
        }

        public Request() {
            super(0);
            this.f33909k = null;
            this.f33910l = false;
            this.f33911m = false;
            this.o = false;
            this.f33913p = DataUtil.f33893b;
            this.f33916s = false;
            this.f33905g = 30000;
            this.f33906h = 2097152;
            this.f33907i = true;
            this.f33908j = new ArrayList();
            this.f33929b = Connection.Method.GET;
            addHeader("Accept-Encoding", c.f10012d);
            addHeader("User-Agent", HttpConnection.DEFAULT_UA);
            this.f33912n = Parser.htmlParser();
            this.f33915r = new CookieManager();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Base, org.jsoup.Connection$Request] */
        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Request addHeader(String str, String str2) {
            return super.addHeader(str, str2);
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ String cookie(String str) {
            return super.cookie(str);
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map cookies() {
            return super.cookies();
        }

        @Override // org.jsoup.Connection.Request
        public boolean followRedirects() {
            return this.f33907i;
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean hasCookie(String str) {
            return super.hasCookie(str);
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean hasHeader(String str) {
            return super.hasHeader(str);
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean hasHeaderWithValue(String str, String str2) {
            return super.hasHeaderWithValue(str, str2);
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ String header(String str) {
            return super.header(str);
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ List headers(String str) {
            return super.headers(str);
        }

        @Override // org.jsoup.Connection.Request
        public boolean ignoreContentType() {
            return this.f33911m;
        }

        @Override // org.jsoup.Connection.Request
        public boolean ignoreHttpErrors() {
            return this.f33910l;
        }

        @Override // org.jsoup.Connection.Request
        public int maxBodySize() {
            return this.f33906h;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Base, org.jsoup.Connection$Request] */
        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Request method(Connection.Method method) {
            return super.method(method);
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map multiHeaders() {
            return super.multiHeaders();
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request postDataCharset(String str) {
            Validate.notNullParam(str, "charset");
            if (Charset.isSupported(str)) {
                this.f33913p = str;
                return this;
            }
            throw new IllegalCharsetNameException(str);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Base, org.jsoup.Connection$Request] */
        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Request removeCookie(String str) {
            return super.removeCookie(str);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Base, org.jsoup.Connection$Request] */
        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Request removeHeader(String str) {
            return super.removeHeader(str);
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request requestBody(@Nullable String str) {
            this.f33909k = str;
            return this;
        }

        @Override // org.jsoup.Connection.Request
        public SSLSocketFactory sslSocketFactory() {
            return this.f33914q;
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ URL url() {
            return super.url();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Base, org.jsoup.Connection$Request] */
        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Request cookie(String str, String str2) {
            return super.cookie(str, str2);
        }

        @Override // org.jsoup.Connection.Request
        public Request data(Connection.KeyVal keyVal) {
            Validate.notNullParam(keyVal, "keyval");
            this.f33908j.add(keyVal);
            return this;
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request followRedirects(boolean z10) {
            this.f33907i = z10;
            return this;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Base, org.jsoup.Connection$Request] */
        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Request header(String str, String str2) {
            return super.header(str, str2);
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map headers() {
            return super.headers();
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request ignoreContentType(boolean z10) {
            this.f33911m = z10;
            return this;
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request ignoreHttpErrors(boolean z10) {
            this.f33910l = z10;
            return this;
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request maxBodySize(int i10) {
            Validate.isTrue(i10 >= 0, "maxSize must be 0 (unlimited) or larger");
            this.f33906h = i10;
            return this;
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Method method() {
            return super.method();
        }

        @Override // org.jsoup.Connection.Request
        public Request parser(Parser parser) {
            this.f33912n = parser;
            this.o = true;
            return this;
        }

        @Override // org.jsoup.Connection.Request
        public String requestBody() {
            return this.f33909k;
        }

        @Override // org.jsoup.Connection.Request
        public void sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f33914q = sSLSocketFactory;
        }

        @Override // org.jsoup.Connection.Request
        public int timeout() {
            return this.f33905g;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Base, org.jsoup.Connection$Request] */
        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Request url(URL url) {
            return super.url(url);
        }

        @Override // org.jsoup.Connection.Request
        public Proxy proxy() {
            return this.f;
        }

        @Override // org.jsoup.Connection.Request
        public Request timeout(int i10) {
            Validate.isTrue(i10 >= 0, "Timeout milliseconds must be 0 (infinite) or greater");
            this.f33905g = i10;
            return this;
        }

        @Override // org.jsoup.Connection.Request
        public Collection<Connection.KeyVal> data() {
            return this.f33908j;
        }

        @Override // org.jsoup.Connection.Request
        public Parser parser() {
            return this.f33912n;
        }

        @Override // org.jsoup.Connection.Request
        public Request proxy(@Nullable Proxy proxy) {
            this.f = proxy;
            return this;
        }

        @Override // org.jsoup.Connection.Request
        public String postDataCharset() {
            return this.f33913p;
        }

        @Override // org.jsoup.Connection.Request
        public Request proxy(String str, int i10) {
            this.f = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(str, i10));
            return this;
        }

        public Request(Request request) {
            super(request);
            this.f33909k = null;
            this.f33910l = false;
            this.f33911m = false;
            this.o = false;
            this.f33913p = DataUtil.f33893b;
            this.f33916s = false;
            this.f = request.f;
            this.f33913p = request.f33913p;
            this.f33905g = request.f33905g;
            this.f33906h = request.f33906h;
            this.f33907i = request.f33907i;
            ArrayList arrayList = new ArrayList();
            this.f33908j = arrayList;
            arrayList.addAll(request.data());
            this.f33909k = request.f33909k;
            this.f33910l = request.f33910l;
            this.f33911m = request.f33911m;
            this.f33912n = request.f33912n.newInstance();
            this.o = request.o;
            this.f33914q = request.f33914q;
            this.f33915r = request.f33915r;
            this.f33916s = false;
        }
    }

    /* loaded from: classes2.dex */
    public static class Response extends a<Connection.Response> implements Connection.Response {

        /* renamed from: q, reason: collision with root package name */
        public static final Pattern f33917q = Pattern.compile("(application|text)/\\w*\\+?xml.*");
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final String f33918g;

        /* renamed from: h, reason: collision with root package name */
        @Nullable
        public ByteBuffer f33919h;

        /* renamed from: i, reason: collision with root package name */
        @Nullable
        public InputStream f33920i;

        /* renamed from: j, reason: collision with root package name */
        @Nullable
        public HttpURLConnection f33921j;

        /* renamed from: k, reason: collision with root package name */
        @Nullable
        public String f33922k;

        /* renamed from: l, reason: collision with root package name */
        @Nullable
        public final String f33923l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f33924m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f33925n;
        public final int o;

        /* renamed from: p, reason: collision with root package name */
        public final Request f33926p;

        public Response() {
            super(0);
            this.f33924m = false;
            this.f33925n = false;
            this.o = 0;
            this.f = ag.f21998i;
            this.f33918g = "Request not made";
            this.f33926p = new Request();
            this.f33923l = null;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(30:13|(1:15)(1:208)|(1:17)|18|(9:(1:(2:188|(2:190|(28:194|38|(1:40)(1:185)|41|(1:45)|46|(1:48)|49|(2:52|50)|53|54|55|56|57|(4:60|(5:65|66|(2:76|77)(2:68|(2:70|71)(1:75))|72|73)|74|58)|80|81|(1:83)|(1:87)|88|(5:92|(2:95|93)|96|89|90)|97|98|(4:100|101|102|103)|112|113|114|(2:129|(2:170|171)(6:133|(2:142|143)|150|(1:167)(5:154|(1:156)(1:166)|157|(1:159)(2:163|(1:165))|160)|161|162))(7:118|(1:120)|121|(1:125)|126|127|128)))(3:195|(2:196|(2:198|(2:200|201)(1:205))(2:206|207))|(33:203|38|(0)(0)|41|(2:43|45)|46|(0)|49|(1:50)|53|54|55|56|57|(1:58)|80|81|(0)|(2:85|87)|88|(2:89|90)|97|98|(0)|112|113|114|(1:116)|129|(1:131)|168|170|171)(1:204))))(6:22|(1:24)(1:186)|25|(4:28|(2:30|31)(2:33|34)|32|26)|35|36)|113|114|(0)|129|(0)|168|170|171)|37|38|(0)(0)|41|(0)|46|(0)|49|(1:50)|53|54|55|56|57|(1:58)|80|81|(0)|(0)|88|(2:89|90)|97|98|(0)|112) */
        /* JADX WARN: Code restructure failed: missing block: B:146:0x0399, code lost:
        
            if (org.jsoup.helper.HttpConnection.Response.f33917q.matcher(r3).matches() == false) goto L155;
         */
        /* JADX WARN: Code restructure failed: missing block: B:148:0x039d, code lost:
        
            if (r16.o != false) goto L155;
         */
        /* JADX WARN: Code restructure failed: missing block: B:149:0x039f, code lost:
        
            r16.parser(org.jsoup.parser.Parser.xmlParser());
         */
        /* JADX WARN: Code restructure failed: missing block: B:177:0x0435, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x02d0 A[Catch: all -> 0x0433, IOException -> 0x0435, TRY_LEAVE, TryCatch #1 {all -> 0x0433, blocks: (B:98:0x02c7, B:100:0x02d0, B:103:0x02d7, B:106:0x02e3, B:107:0x02e6, B:112:0x02e7, B:114:0x02f2, B:116:0x02fa, B:120:0x0304, B:121:0x0318, B:123:0x0329, B:125:0x0332, B:126:0x0336, B:133:0x035c, B:135:0x0362, B:137:0x0368, B:139:0x0370, B:142:0x037d, B:143:0x038c, B:145:0x038f, B:147:0x039b, B:149:0x039f, B:150:0x03a6, B:152:0x03b4, B:154:0x03bc, B:156:0x03c2, B:157:0x03cb, B:159:0x03da, B:160:0x03fc, B:163:0x03e4, B:165:0x03ee, B:166:0x03c7, B:167:0x0415, B:168:0x0356, B:170:0x0420, B:171:0x042f, B:175:0x0438, B:176:0x043b), top: B:90:0x029f }] */
        /* JADX WARN: Removed duplicated region for block: B:116:0x02fa A[Catch: IOException -> 0x0430, all -> 0x0433, TryCatch #1 {all -> 0x0433, blocks: (B:98:0x02c7, B:100:0x02d0, B:103:0x02d7, B:106:0x02e3, B:107:0x02e6, B:112:0x02e7, B:114:0x02f2, B:116:0x02fa, B:120:0x0304, B:121:0x0318, B:123:0x0329, B:125:0x0332, B:126:0x0336, B:133:0x035c, B:135:0x0362, B:137:0x0368, B:139:0x0370, B:142:0x037d, B:143:0x038c, B:145:0x038f, B:147:0x039b, B:149:0x039f, B:150:0x03a6, B:152:0x03b4, B:154:0x03bc, B:156:0x03c2, B:157:0x03cb, B:159:0x03da, B:160:0x03fc, B:163:0x03e4, B:165:0x03ee, B:166:0x03c7, B:167:0x0415, B:168:0x0356, B:170:0x0420, B:171:0x042f, B:175:0x0438, B:176:0x043b), top: B:90:0x029f }] */
        /* JADX WARN: Removed duplicated region for block: B:131:0x0352  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x018f  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0186  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01d5  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01f1 A[LOOP:1: B:50:0x01eb->B:52:0x01f1, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x023c  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0279  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0282  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x02a1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static org.jsoup.helper.HttpConnection.Response b(org.jsoup.helper.HttpConnection.Request r16, @javax.annotation.Nullable org.jsoup.helper.HttpConnection.Response r17) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 1105
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.HttpConnection.Response.b(org.jsoup.helper.HttpConnection$Request, org.jsoup.helper.HttpConnection$Response):org.jsoup.helper.HttpConnection$Response");
        }

        public static void e(Connection.Request request, OutputStream outputStream, @Nullable String str) throws IOException {
            Collection<Connection.KeyVal> data = request.data();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, Charset.forName(request.postDataCharset())));
            if (str != null) {
                for (Connection.KeyVal keyVal : data) {
                    bufferedWriter.write("--");
                    bufferedWriter.write(str);
                    bufferedWriter.write("\r\n");
                    bufferedWriter.write("Content-Disposition: form-data; name=\"");
                    String key = keyVal.key();
                    String str2 = HttpConnection.CONTENT_ENCODING;
                    bufferedWriter.write(key.replace("\"", "%22"));
                    bufferedWriter.write("\"");
                    InputStream inputStream = keyVal.inputStream();
                    if (inputStream != null) {
                        bufferedWriter.write("; filename=\"");
                        bufferedWriter.write(keyVal.value().replace("\"", "%22"));
                        bufferedWriter.write("\"\r\nContent-Type: ");
                        String contentType = keyVal.contentType();
                        if (contentType == null) {
                            contentType = "application/octet-stream";
                        }
                        bufferedWriter.write(contentType);
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.flush();
                        Pattern pattern = DataUtil.f33892a;
                        byte[] bArr = new byte[32768];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                outputStream.write(bArr, 0, read);
                            }
                        }
                        outputStream.flush();
                    } else {
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.write(keyVal.value());
                    }
                    bufferedWriter.write("\r\n");
                }
                bufferedWriter.write("--");
                bufferedWriter.write(str);
                bufferedWriter.write("--");
            } else {
                String requestBody = request.requestBody();
                if (requestBody != null) {
                    bufferedWriter.write(requestBody);
                } else {
                    boolean z10 = true;
                    for (Connection.KeyVal keyVal2 : data) {
                        if (!z10) {
                            bufferedWriter.append('&');
                        } else {
                            z10 = false;
                        }
                        bufferedWriter.write(URLEncoder.encode(keyVal2.key(), request.postDataCharset()));
                        bufferedWriter.write(61);
                        bufferedWriter.write(URLEncoder.encode(keyVal2.value(), request.postDataCharset()));
                    }
                }
            }
            bufferedWriter.close();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Response, org.jsoup.Connection$Base] */
        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Response addHeader(String str, String str2) {
            return super.addHeader(str, str2);
        }

        @Override // org.jsoup.Connection.Response
        public String body() {
            Charset forName;
            c();
            Validate.notNull(this.f33919h);
            String str = this.f33922k;
            if (str == null) {
                forName = DataUtil.UTF_8;
            } else {
                forName = Charset.forName(str);
            }
            String charBuffer = forName.decode(this.f33919h).toString();
            this.f33919h.rewind();
            return charBuffer;
        }

        @Override // org.jsoup.Connection.Response
        public byte[] bodyAsBytes() {
            c();
            Validate.notNull(this.f33919h);
            return this.f33919h.array();
        }

        @Override // org.jsoup.Connection.Response
        public BufferedInputStream bodyStream() {
            Validate.isTrue(this.f33924m, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            Validate.isFalse(this.f33925n, "Request has already been read");
            this.f33925n = true;
            return ConstrainableInputStream.wrap(this.f33920i, 32768, this.f33926p.maxBodySize());
        }

        @Override // org.jsoup.Connection.Response
        public Connection.Response bufferUp() {
            c();
            return this;
        }

        public final void c() {
            Validate.isTrue(this.f33924m, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            if (this.f33920i != null && this.f33919h == null) {
                Validate.isFalse(this.f33925n, "Request has already been read (with .parse())");
                try {
                    try {
                        this.f33919h = DataUtil.readToByteBuffer(this.f33920i, this.f33926p.maxBodySize());
                    } catch (IOException e10) {
                        throw new UncheckedIOException(e10);
                    }
                } finally {
                    this.f33925n = true;
                    d();
                }
            }
        }

        @Override // org.jsoup.Connection.Response
        public String contentType() {
            return this.f33923l;
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ String cookie(String str) {
            return super.cookie(str);
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map cookies() {
            return super.cookies();
        }

        public final void d() {
            InputStream inputStream = this.f33920i;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.f33920i = null;
                    throw th;
                }
                this.f33920i = null;
            }
            HttpURLConnection httpURLConnection = this.f33921j;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                this.f33921j = null;
            }
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean hasCookie(String str) {
            return super.hasCookie(str);
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean hasHeader(String str) {
            return super.hasHeader(str);
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean hasHeaderWithValue(String str, String str2) {
            return super.hasHeaderWithValue(str, str2);
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ String header(String str) {
            return super.header(str);
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ List headers(String str) {
            return super.headers(str);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Response, org.jsoup.Connection$Base] */
        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Response method(Connection.Method method) {
            return super.method(method);
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map multiHeaders() {
            return super.multiHeaders();
        }

        @Override // org.jsoup.Connection.Response
        public Document parse() throws IOException {
            Validate.isTrue(this.f33924m, "Request must be executed (with .execute(), .get(), or .post() before parsing response");
            if (this.f33919h != null) {
                this.f33920i = new ByteArrayInputStream(this.f33919h.array());
                this.f33925n = false;
            }
            Validate.isFalse(this.f33925n, "Input stream already read and parsed, cannot re-read.");
            InputStream inputStream = this.f33920i;
            String str = this.f33922k;
            String externalForm = this.f33928a.toExternalForm();
            Request request = this.f33926p;
            Document d10 = DataUtil.d(inputStream, str, externalForm, request.parser());
            d10.connection(new HttpConnection(request, this));
            this.f33922k = d10.outputSettings().charset().name();
            this.f33925n = true;
            d();
            return d10;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Response, org.jsoup.Connection$Base] */
        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Response removeCookie(String str) {
            return super.removeCookie(str);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Response, org.jsoup.Connection$Base] */
        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Response removeHeader(String str) {
            return super.removeHeader(str);
        }

        @Override // org.jsoup.Connection.Response
        public int statusCode() {
            return this.f;
        }

        @Override // org.jsoup.Connection.Response
        public String statusMessage() {
            return this.f33918g;
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ URL url() {
            return super.url();
        }

        @Override // org.jsoup.Connection.Response
        public String charset() {
            return this.f33922k;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Response, org.jsoup.Connection$Base] */
        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Response cookie(String str, String str2) {
            return super.cookie(str, str2);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Response, org.jsoup.Connection$Base] */
        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Response header(String str, String str2) {
            return super.header(str, str2);
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map headers() {
            return super.headers();
        }

        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Method method() {
            return super.method();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.jsoup.Connection$Response, org.jsoup.Connection$Base] */
        @Override // org.jsoup.helper.HttpConnection.a, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Response url(URL url) {
            return super.url(url);
        }

        @Override // org.jsoup.Connection.Response
        public Response charset(String str) {
            this.f33922k = str;
            return this;
        }

        public Response(HttpURLConnection httpURLConnection, Request request, @Nullable Response response) throws IOException {
            super(0);
            this.f33924m = false;
            this.f33925n = false;
            this.o = 0;
            this.f33921j = httpURLConnection;
            this.f33926p = request;
            this.f33929b = Connection.Method.valueOf(httpURLConnection.getRequestMethod());
            this.f33928a = httpURLConnection.getURL();
            this.f = httpURLConnection.getResponseCode();
            this.f33918g = httpURLConnection.getResponseMessage();
            this.f33923l = httpURLConnection.getContentType();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i10 = 0;
            while (true) {
                String headerFieldKey = httpURLConnection.getHeaderFieldKey(i10);
                String headerField = httpURLConnection.getHeaderField(i10);
                if (headerFieldKey == null && headerField == null) {
                    break;
                }
                i10++;
                if (headerFieldKey != null && headerField != null) {
                    if (linkedHashMap.containsKey(headerFieldKey)) {
                        ((List) linkedHashMap.get(headerFieldKey)).add(headerField);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(headerField);
                        linkedHashMap.put(headerFieldKey, arrayList);
                    }
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    List<String> list = (List) entry.getValue();
                    if (str.equalsIgnoreCase("Set-Cookie")) {
                        for (String str2 : list) {
                            if (str2 != null) {
                                TokenQueue tokenQueue = new TokenQueue(str2);
                                String trim = tokenQueue.chompTo(ContainerUtils.KEY_VALUE_DELIMITER).trim();
                                String trim2 = tokenQueue.consumeTo(w.aG).trim();
                                if (trim.length() > 0 && !this.f33931d.containsKey(trim)) {
                                    cookie(trim, trim2);
                                }
                            }
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        addHeader(str, (String) it.next());
                    }
                }
            }
            Request request2 = this.f33926p;
            URL url = this.f33928a;
            Map<String, List<String>> map = org.jsoup.helper.a.f33940a;
            try {
                request2.f33915r.put(url.toURI(), linkedHashMap);
                if (response != null) {
                    for (Map.Entry entry2 : response.cookies().entrySet()) {
                        if (!hasCookie((String) entry2.getKey())) {
                            cookie((String) entry2.getKey(), (String) entry2.getValue());
                        }
                    }
                    response.d();
                    int i11 = response.o + 1;
                    this.o = i11;
                    if (i11 >= 20) {
                        throw new IOException(String.format("Too many redirects occurred trying to load URL %s", response.url()));
                    }
                }
            } catch (URISyntaxException e10) {
                MalformedURLException malformedURLException = new MalformedURLException(e10.getMessage());
                malformedURLException.initCause(e10);
                throw malformedURLException;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class a<T extends Connection.Base<T>> implements Connection.Base<T> {

        /* renamed from: e, reason: collision with root package name */
        public static final URL f33927e;

        /* renamed from: a, reason: collision with root package name */
        public URL f33928a;

        /* renamed from: b, reason: collision with root package name */
        public Connection.Method f33929b;

        /* renamed from: c, reason: collision with root package name */
        public final LinkedHashMap f33930c;

        /* renamed from: d, reason: collision with root package name */
        public final LinkedHashMap f33931d;

        static {
            try {
                f33927e = new URL("http://undefined/");
            } catch (MalformedURLException e10) {
                throw new IllegalStateException(e10);
            }
        }

        public a(int i10) {
            this.f33928a = f33927e;
            this.f33929b = Connection.Method.GET;
            this.f33930c = new LinkedHashMap();
            this.f33931d = new LinkedHashMap();
        }

        public final List<String> a(String str) {
            Validate.notNull(str);
            for (Map.Entry entry : this.f33930c.entrySet()) {
                if (str.equalsIgnoreCase((String) entry.getKey())) {
                    return (List) entry.getValue();
                }
            }
            return Collections.emptyList();
        }

        @Override // org.jsoup.Connection.Base
        public T addHeader(String str, String str2) {
            int i10;
            Validate.notEmptyParam(str, "name");
            if (str2 == null) {
                str2 = "";
            }
            List<String> headers = headers(str);
            if (headers.isEmpty()) {
                headers = new ArrayList<>();
                this.f33930c.put(str, headers);
            }
            byte[] bytes = str2.getBytes(HttpConnection.f33898d);
            int i11 = 3;
            boolean z10 = true;
            if (bytes.length < 3 || (bytes[0] & DefaultClassResolver.NAME) != 239 || (bytes[1] & DefaultClassResolver.NAME) != 187 || (bytes[2] & DefaultClassResolver.NAME) != 191) {
                i11 = 0;
            }
            int length = bytes.length;
            loop0: while (i11 < length) {
                byte b10 = bytes[i11];
                if ((b10 & 128) != 0) {
                    if ((b10 & 224) == 192) {
                        i10 = i11 + 1;
                    } else if ((b10 & 240) == 224) {
                        i10 = i11 + 2;
                    } else if ((b10 & 248) == 240) {
                        i10 = i11 + 3;
                    } else {
                        z10 = false;
                        break;
                    }
                    if (i10 >= bytes.length) {
                        z10 = false;
                        break;
                    }
                    while (i11 < i10) {
                        i11++;
                        if ((bytes[i11] & 192) != 128) {
                            z10 = false;
                            break;
                        }
                    }
                }
                i11++;
            }
            if (z10) {
                str2 = new String(bytes, HttpConnection.f33897c);
            }
            headers.add(str2);
            return this;
        }

        @Override // org.jsoup.Connection.Base
        public String cookie(String str) {
            Validate.notEmptyParam(str, "name");
            return (String) this.f33931d.get(str);
        }

        @Override // org.jsoup.Connection.Base
        public Map<String, String> cookies() {
            return this.f33931d;
        }

        @Override // org.jsoup.Connection.Base
        public boolean hasCookie(String str) {
            Validate.notEmptyParam(str, "name");
            return this.f33931d.containsKey(str);
        }

        @Override // org.jsoup.Connection.Base
        public boolean hasHeader(String str) {
            Validate.notEmptyParam(str, "name");
            return !a(str).isEmpty();
        }

        @Override // org.jsoup.Connection.Base
        public boolean hasHeaderWithValue(String str, String str2) {
            Validate.notEmpty(str);
            Validate.notEmpty(str2);
            Iterator<String> it = headers(str).iterator();
            while (it.hasNext()) {
                if (str2.equalsIgnoreCase(it.next())) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.jsoup.Connection.Base
        public String header(String str) {
            Validate.notNullParam(str, "name");
            List<String> a10 = a(str);
            if (a10.size() > 0) {
                return StringUtil.join(a10, ", ");
            }
            return null;
        }

        @Override // org.jsoup.Connection.Base
        public List<String> headers(String str) {
            Validate.notEmptyParam(str, "name");
            return a(str);
        }

        @Override // org.jsoup.Connection.Base
        public Connection.Method method() {
            return this.f33929b;
        }

        @Override // org.jsoup.Connection.Base
        public Map<String, List<String>> multiHeaders() {
            return this.f33930c;
        }

        @Override // org.jsoup.Connection.Base
        public T removeCookie(String str) {
            Validate.notEmptyParam(str, "name");
            this.f33931d.remove(str);
            return this;
        }

        @Override // org.jsoup.Connection.Base
        public T removeHeader(String str) {
            Map.Entry entry;
            Validate.notEmptyParam(str, "name");
            String lowerCase = Normalizer.lowerCase(str);
            LinkedHashMap linkedHashMap = this.f33930c;
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    entry = (Map.Entry) it.next();
                    if (Normalizer.lowerCase((String) entry.getKey()).equals(lowerCase)) {
                        break;
                    }
                } else {
                    entry = null;
                    break;
                }
            }
            if (entry != null) {
                linkedHashMap.remove(entry.getKey());
            }
            return this;
        }

        @Override // org.jsoup.Connection.Base
        public URL url() {
            URL url = this.f33928a;
            if (url != f33927e) {
                return url;
            }
            throw new IllegalArgumentException("URL not set. Make sure to call #url(...) before executing the request.");
        }

        @Override // org.jsoup.Connection.Base
        public T method(Connection.Method method) {
            Validate.notNullParam(method, "method");
            this.f33929b = method;
            return this;
        }

        @Override // org.jsoup.Connection.Base
        public T cookie(String str, String str2) {
            Validate.notEmptyParam(str, "name");
            Validate.notNullParam(str2, "value");
            this.f33931d.put(str, str2);
            return this;
        }

        @Override // org.jsoup.Connection.Base
        public Map<String, String> headers() {
            LinkedHashMap linkedHashMap = this.f33930c;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() > 0) {
                    linkedHashMap2.put(str, (String) list.get(0));
                }
            }
            return linkedHashMap2;
        }

        @Override // org.jsoup.Connection.Base
        public T url(URL url) {
            Validate.notNullParam(url, "url");
            this.f33928a = HttpConnection.b(url);
            return this;
        }

        @Override // org.jsoup.Connection.Base
        public T header(String str, String str2) {
            Validate.notEmptyParam(str, "name");
            removeHeader(str);
            addHeader(str, str2);
            return this;
        }

        public a(a aVar) {
            this.f33928a = f33927e;
            this.f33929b = Connection.Method.GET;
            this.f33928a = aVar.f33928a;
            this.f33929b = aVar.f33929b;
            this.f33930c = new LinkedHashMap();
            for (Map.Entry entry : aVar.f33930c.entrySet()) {
                this.f33930c.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.f33931d = linkedHashMap;
            linkedHashMap.putAll(aVar.f33931d);
        }
    }

    public HttpConnection() {
        this.f33899a = new Request();
    }

    public static URL a(URL url) {
        URL b10 = b(url);
        try {
            return new URL(new URI(b10.toExternalForm().replace(" ", "%20")).toASCIIString());
        } catch (MalformedURLException | URISyntaxException unused) {
            return b10;
        }
    }

    public static URL b(URL url) {
        if (!StringUtil.isAscii(url.getHost())) {
            try {
                return new URL(url.getProtocol(), IDN.toASCII(url.getHost()), url.getPort(), url.getFile());
            } catch (MalformedURLException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        return url;
    }

    public static Connection connect(String str) {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(str);
        return httpConnection;
    }

    @Override // org.jsoup.Connection
    public Connection cookie(String str, String str2) {
        this.f33899a.cookie(str, str2);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection cookieStore(CookieStore cookieStore) {
        this.f33899a.f33915r = new CookieManager(cookieStore, null);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection cookies(Map<String, String> map) {
        Validate.notNullParam(map, "cookies");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f33899a.cookie(entry.getKey(), entry.getValue());
        }
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection data(String str, String str2) {
        this.f33899a.data((Connection.KeyVal) KeyVal.create(str, str2));
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection.Response execute() throws IOException {
        Response b10 = Response.b(this.f33899a, null);
        this.f33900b = b10;
        return b10;
    }

    @Override // org.jsoup.Connection
    public Connection followRedirects(boolean z10) {
        this.f33899a.followRedirects(z10);
        return this;
    }

    @Override // org.jsoup.Connection
    public Document get() throws IOException {
        this.f33899a.method(Connection.Method.GET);
        execute();
        Validate.notNull(this.f33900b);
        return this.f33900b.parse();
    }

    @Override // org.jsoup.Connection
    public Connection header(String str, String str2) {
        this.f33899a.header(str, str2);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection headers(Map<String, String> map) {
        Validate.notNullParam(map, "headers");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f33899a.header(entry.getKey(), entry.getValue());
        }
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection ignoreContentType(boolean z10) {
        this.f33899a.ignoreContentType(z10);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection ignoreHttpErrors(boolean z10) {
        this.f33899a.ignoreHttpErrors(z10);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection maxBodySize(int i10) {
        this.f33899a.maxBodySize(i10);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection method(Connection.Method method) {
        this.f33899a.method(method);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection newRequest() {
        return new HttpConnection(this.f33899a);
    }

    @Override // org.jsoup.Connection
    public Connection parser(Parser parser) {
        this.f33899a.parser(parser);
        return this;
    }

    @Override // org.jsoup.Connection
    public Document post() throws IOException {
        this.f33899a.method(Connection.Method.POST);
        execute();
        Validate.notNull(this.f33900b);
        return this.f33900b.parse();
    }

    @Override // org.jsoup.Connection
    public Connection postDataCharset(String str) {
        this.f33899a.postDataCharset(str);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection proxy(@Nullable Proxy proxy) {
        this.f33899a.proxy(proxy);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection referrer(String str) {
        Validate.notNullParam(str, LocalChannelInfo.KEY_REFERRER);
        this.f33899a.header("Referer", str);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection.Request request() {
        return this.f33899a;
    }

    @Override // org.jsoup.Connection
    public Connection requestBody(String str) {
        this.f33899a.requestBody(str);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection.Response response() {
        Connection.Response response = this.f33900b;
        if (response != null) {
            return response;
        }
        throw new IllegalArgumentException("You must execute the request before getting a response.");
    }

    @Override // org.jsoup.Connection
    public Connection sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f33899a.sslSocketFactory(sSLSocketFactory);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection timeout(int i10) {
        this.f33899a.timeout(i10);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection url(URL url) {
        this.f33899a.url(url);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection userAgent(String str) {
        Validate.notNullParam(str, Cookie.USER_AGENT_ID_COOKIE);
        this.f33899a.header("User-Agent", str);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection data(String str, String str2, InputStream inputStream) {
        this.f33899a.data((Connection.KeyVal) KeyVal.create(str, str2, inputStream));
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection proxy(String str, int i10) {
        this.f33899a.proxy(str, i10);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection request(Connection.Request request) {
        this.f33899a = (Request) request;
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection url(String str) {
        String str2;
        Validate.notEmptyParam(str, "url");
        try {
            Request request = this.f33899a;
            try {
                str2 = a(new URL(str)).toExternalForm();
            } catch (Exception unused) {
                str2 = str;
            }
            request.url(new URL(str2));
            return this;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(String.format("The supplied URL, '%s', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls", str), e10);
        }
    }

    public HttpConnection(Request request) {
        this.f33899a = new Request(request);
    }

    public static Connection connect(URL url) {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(url);
        return httpConnection;
    }

    @Override // org.jsoup.Connection
    public CookieStore cookieStore() {
        return this.f33899a.f33915r.getCookieStore();
    }

    @Override // org.jsoup.Connection
    public Connection data(String str, String str2, InputStream inputStream, String str3) {
        this.f33899a.data(KeyVal.create(str, str2, inputStream).contentType(str3));
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection response(Connection.Response response) {
        this.f33900b = response;
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection data(Map<String, String> map) {
        Validate.notNullParam(map, "data");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f33899a.data((Connection.KeyVal) KeyVal.create(entry.getKey(), entry.getValue()));
        }
        return this;
    }

    public HttpConnection(Request request, Response response) {
        this.f33899a = request;
        this.f33900b = response;
    }

    @Override // org.jsoup.Connection
    public Connection data(String... strArr) {
        Validate.notNullParam(strArr, "keyvals");
        Validate.isTrue(strArr.length % 2 == 0, "Must supply an even number of key value pairs");
        for (int i10 = 0; i10 < strArr.length; i10 += 2) {
            String str = strArr[i10];
            String str2 = strArr[i10 + 1];
            Validate.notEmpty(str, "Data key must not be empty");
            Validate.notNull(str2, "Data value must not be null");
            this.f33899a.data((Connection.KeyVal) KeyVal.create(str, str2));
        }
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection data(Collection<Connection.KeyVal> collection) {
        Validate.notNullParam(collection, "data");
        Iterator<Connection.KeyVal> it = collection.iterator();
        while (it.hasNext()) {
            this.f33899a.data(it.next());
        }
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection.KeyVal data(String str) {
        Validate.notEmptyParam(str, "key");
        for (Connection.KeyVal keyVal : request().data()) {
            if (keyVal.key().equals(str)) {
                return keyVal;
            }
        }
        return null;
    }
}
