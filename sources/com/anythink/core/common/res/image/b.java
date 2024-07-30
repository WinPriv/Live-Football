package com.anythink.core.common.res.image;

import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.constant.ErrorCode;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f6494a = getClass().getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    protected String f6495c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f6496d;

    /* renamed from: e, reason: collision with root package name */
    protected long f6497e;
    protected long f;

    /* renamed from: g, reason: collision with root package name */
    protected long f6498g;

    /* renamed from: h, reason: collision with root package name */
    protected long f6499h;

    /* renamed from: i, reason: collision with root package name */
    protected long f6500i;

    /* renamed from: com.anythink.core.common.res.image.b$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends com.anythink.core.common.k.b.b {
        public AnonymousClass1() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:102:0x01dd  */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v9, types: [java.net.HttpURLConnection] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void b(java.lang.String r7) {
            /*
                Method dump skipped, instructions count: 481
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.res.image.b.AnonymousClass1.b(java.lang.String):void");
        }

        @Override // com.anythink.core.common.k.b.b
        public final void a() {
            try {
                b(b.this.f6495c);
            } catch (Exception e10) {
                String unused = b.this.f6494a;
                e10.getMessage();
                b.this.a(c.f6502a, e10.getMessage());
            } catch (OutOfMemoryError e11) {
                e = e11;
                System.gc();
                b.this.a(c.f6502a, e.getMessage());
            } catch (StackOverflowError e12) {
                e = e12;
                System.gc();
                b.this.a(c.f6502a, e.getMessage());
            }
        }
    }

    public b(String str) {
        this.f6495c = str;
    }

    private void e() {
        this.f6496d = true;
    }

    private void f() {
        a(new AnonymousClass1());
    }

    private static int g() {
        return w.f22171t;
    }

    private static int h() {
        return ErrorCode.ERROR_PPS_SERVER_FAILED;
    }

    public abstract Map<String, String> a();

    public abstract void a(com.anythink.core.common.k.b.b bVar);

    public abstract void a(String str, String str2);

    public abstract boolean a(InputStream inputStream);

    public abstract void b();

    public abstract void c();

    public final void d() {
        this.f6496d = false;
        a(new AnonymousClass1());
    }
}
