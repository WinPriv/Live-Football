package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.b.c;
import com.anythink.expressad.atsignalcommon.mraid.MraidUriUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class m implements Handler.Callback, d {

    /* renamed from: a, reason: collision with root package name */
    protected Pattern f7072a;

    /* renamed from: b, reason: collision with root package name */
    protected String f7073b;

    /* renamed from: d, reason: collision with root package name */
    protected Context f7075d;

    /* renamed from: e, reason: collision with root package name */
    protected WindVaneWebView f7076e;

    /* renamed from: c, reason: collision with root package name */
    protected final int f7074c = 1;
    protected Handler f = new Handler(Looper.getMainLooper(), this);

    public m(Context context) {
        this.f7075d = context;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final WebView a() {
        return this.f7076e;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final a b(String str) {
        if (str == null) {
            return null;
        }
        a mraidMethodContext = MraidUriUtil.getMraidMethodContext(this.f7076e, str);
        if (mraidMethodContext != null) {
            mraidMethodContext.f7045a = this.f7076e;
            return mraidMethodContext;
        }
        Matcher matcher = this.f7072a.matcher(str);
        if (matcher.matches()) {
            a aVar = new a();
            int groupCount = matcher.groupCount();
            if (groupCount >= 5) {
                aVar.f = matcher.group(5);
            }
            if (groupCount >= 3) {
                aVar.f7048d = matcher.group(1);
                aVar.f7050g = matcher.group(2);
                String group = matcher.group(3);
                aVar.f7049e = group;
                HashMap<String, String> hashMap = com.anythink.expressad.atsignalcommon.base.e.f6980k;
                if (hashMap != null && hashMap.containsKey(group)) {
                    aVar.f7049e = com.anythink.expressad.atsignalcommon.base.e.f6980k.get(aVar.f7049e);
                }
                aVar.f7045a = this.f7076e;
                return aVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 2
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L67
            com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView r3 = r7.f7076e
            com.anythink.expressad.atsignalcommon.windvane.a r3 = com.anythink.expressad.atsignalcommon.mraid.MraidUriUtil.getMraidMethodContext(r3, r8)
            if (r3 == 0) goto L19
            com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView r8 = r7.f7076e
            r3.f7045a = r8
            goto L68
        L19:
            java.util.regex.Pattern r3 = r7.f7072a
            java.util.regex.Matcher r8 = r3.matcher(r8)
            boolean r3 = r8.matches()
            if (r3 == 0) goto L67
            com.anythink.expressad.atsignalcommon.windvane.a r3 = new com.anythink.expressad.atsignalcommon.windvane.a
            r3.<init>()
            int r4 = r8.groupCount()
            r5 = 5
            if (r4 < r5) goto L37
            java.lang.String r5 = r8.group(r5)
            r3.f = r5
        L37:
            r5 = 3
            if (r4 < r5) goto L67
            java.lang.String r4 = r8.group(r2)
            r3.f7048d = r4
            java.lang.String r4 = r8.group(r0)
            r3.f7050g = r4
            java.lang.String r8 = r8.group(r5)
            r3.f7049e = r8
            java.util.HashMap<java.lang.String, java.lang.String> r4 = com.anythink.expressad.atsignalcommon.base.e.f6980k
            if (r4 == 0) goto L62
            boolean r8 = r4.containsKey(r8)
            if (r8 == 0) goto L62
            java.util.HashMap<java.lang.String, java.lang.String> r8 = com.anythink.expressad.atsignalcommon.base.e.f6980k
            java.lang.String r4 = r3.f7049e
            java.lang.Object r8 = r8.get(r4)
            java.lang.String r8 = (java.lang.String) r8
            r3.f7049e = r8
        L62:
            com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView r8 = r7.f7076e
            r3.f7045a = r8
            goto L68
        L67:
            r3 = r1
        L68:
            if (r3 != 0) goto L6b
            return
        L6b:
            com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView r8 = r3.f7045a
            if (r8 != 0) goto L70
            goto L76
        L70:
            java.lang.String r1 = r3.f7048d
            java.lang.Object r1 = r8.getJsObject(r1)
        L76:
            if (r1 != 0) goto L79
            return
        L79:
            android.content.Context r8 = r7.f7075d     // Catch: java.lang.Exception -> Lb5 com.anythink.expressad.atsignalcommon.b.c.b.a -> Lba
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch: java.lang.Exception -> Lb5 com.anythink.expressad.atsignalcommon.b.c.b.a -> Lba
            java.lang.Class r4 = r1.getClass()     // Catch: java.lang.Exception -> Lb5 com.anythink.expressad.atsignalcommon.b.c.b.a -> Lba
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Exception -> Lb5 com.anythink.expressad.atsignalcommon.b.c.b.a -> Lba
            com.anythink.expressad.atsignalcommon.b.c$c r8 = com.anythink.expressad.atsignalcommon.b.c.a(r8, r4)     // Catch: java.lang.Exception -> Lb5 com.anythink.expressad.atsignalcommon.b.c.b.a -> Lba
            java.lang.String r4 = r3.f7049e     // Catch: java.lang.Exception -> Lb5 com.anythink.expressad.atsignalcommon.b.c.b.a -> Lba
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> Lb5 com.anythink.expressad.atsignalcommon.b.c.b.a -> Lba
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r6 = 0
            r0[r6] = r5     // Catch: java.lang.Exception -> Lb5 com.anythink.expressad.atsignalcommon.b.c.b.a -> Lba
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r0[r2] = r5     // Catch: java.lang.Exception -> Lb5 com.anythink.expressad.atsignalcommon.b.c.b.a -> Lba
            com.anythink.expressad.atsignalcommon.b.c$f r8 = r8.a(r4, r0)     // Catch: java.lang.Exception -> Lb5 com.anythink.expressad.atsignalcommon.b.c.b.a -> Lba
            r8.a()     // Catch: java.lang.Exception -> Lb5 com.anythink.expressad.atsignalcommon.b.c.b.a -> Lba
            boolean r0 = r1 instanceof com.anythink.expressad.atsignalcommon.windvane.l     // Catch: java.lang.Exception -> Lb5 com.anythink.expressad.atsignalcommon.b.c.b.a -> Lba
            if (r0 == 0) goto Lb4
            r3.f7047c = r8     // Catch: java.lang.Exception -> Lb5 com.anythink.expressad.atsignalcommon.b.c.b.a -> Lba
            r3.f7046b = r1     // Catch: java.lang.Exception -> Lb5 com.anythink.expressad.atsignalcommon.b.c.b.a -> Lba
            android.os.Message r8 = android.os.Message.obtain()     // Catch: java.lang.Exception -> Lb5 com.anythink.expressad.atsignalcommon.b.c.b.a -> Lba
            r8.what = r2     // Catch: java.lang.Exception -> Lb5 com.anythink.expressad.atsignalcommon.b.c.b.a -> Lba
            r8.obj = r3     // Catch: java.lang.Exception -> Lb5 com.anythink.expressad.atsignalcommon.b.c.b.a -> Lba
            android.os.Handler r0 = r7.f     // Catch: java.lang.Exception -> Lb5 com.anythink.expressad.atsignalcommon.b.c.b.a -> Lba
            r0.sendMessage(r8)     // Catch: java.lang.Exception -> Lb5 com.anythink.expressad.atsignalcommon.b.c.b.a -> Lba
        Lb4:
            return
        Lb5:
            r8 = move-exception
            r8.printStackTrace()
            return
        Lba:
            r8 = move-exception
            boolean r0 = com.anythink.expressad.a.f6552a
            if (r0 == 0) goto Lc2
            r8.printStackTrace()
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.atsignalcommon.windvane.m.c(java.lang.String):void");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final void d(String str) {
        this.f7073b = str;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String str;
        a aVar = (a) message.obj;
        if (aVar == null) {
            return false;
        }
        try {
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (message.what != 1) {
            return false;
        }
        Object obj = aVar.f7046b;
        c.f fVar = aVar.f7047c;
        Object[] objArr = new Object[2];
        objArr[0] = aVar;
        if (TextUtils.isEmpty(aVar.f)) {
            str = JsonUtils.EMPTY_JSON;
        } else {
            str = aVar.f;
        }
        objArr[1] = str;
        fVar.a(obj, objArr);
        return true;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final void a(WindVaneWebView windVaneWebView) {
        this.f7076e = windVaneWebView;
    }

    private void a(a aVar) {
        WindVaneWebView windVaneWebView = aVar.f7045a;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(aVar.f7048d);
        if (jsObject == null) {
            return;
        }
        try {
            c.f a10 = com.anythink.expressad.atsignalcommon.b.c.a(this.f7075d.getClassLoader(), jsObject.getClass().getName()).a(aVar.f7049e, Object.class, String.class);
            a10.a();
            if (jsObject instanceof l) {
                aVar.f7047c = a10;
                aVar.f7046b = jsObject;
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = aVar;
                this.f.sendMessage(obtain);
            }
        } catch (c.b.a e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private void b(a aVar) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = aVar;
        this.f.sendMessage(obtain);
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final String b() {
        return this.f7073b;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final void a(Pattern pattern) {
        this.f7072a = pattern;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final boolean a(String str) {
        if (!n.a(str)) {
            return false;
        }
        this.f7072a = n.b(str);
        this.f7073b = str;
        return true;
    }
}
