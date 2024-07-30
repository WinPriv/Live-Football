package com.anythink.expressad.mbbanner.a.d;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.p;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.foundation.h.w;
import com.anythink.expressad.foundation.h.x;
import com.anythink.expressad.mbbanner.a.b.e;
import com.anythink.expressad.mbbanner.a.c.d;
import com.anythink.expressad.mbbanner.a.c.f;
import com.anythink.expressad.mbbanner.a.c.g;
import com.anythink.expressad.videocommon.b.i;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10348a = "b";

    /* renamed from: b, reason: collision with root package name */
    private Context f10349b;

    /* renamed from: d, reason: collision with root package name */
    private e f10351d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.e.a f10352e;
    private com.anythink.expressad.mbbanner.a.c.b f;

    /* renamed from: g, reason: collision with root package name */
    private d f10353g;

    /* renamed from: c, reason: collision with root package name */
    private int f10350c = 0;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f10354h = false;

    /* renamed from: i, reason: collision with root package name */
    private Timer f10355i = new Timer();

    /* renamed from: j, reason: collision with root package name */
    private volatile List<String> f10356j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f10357k = false;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f10358l = false;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f10359m = false;

    /* renamed from: com.anythink.expressad.mbbanner.a.d.b$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10360a;

        public AnonymousClass1(String str) {
            this.f10360a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            if (!b.this.f10354h) {
                b.b(b.this);
                b.this.a(this.f10360a, -1, "", false);
            }
        }
    }

    /* renamed from: com.anythink.expressad.mbbanner.a.d.b$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f10362a;

        public AnonymousClass2(com.anythink.expressad.foundation.d.d dVar) {
            this.f10362a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList<com.anythink.expressad.foundation.d.c> arrayList;
            o.b(b.f10348a, "在单独子线程保存数据库 开始");
            com.anythink.expressad.foundation.d.d dVar = this.f10362a;
            if (dVar != null && (arrayList = dVar.J) != null && arrayList.size() > 0) {
                Context unused = b.this.f10349b;
                com.anythink.expressad.mbbanner.a.e.b.a();
            }
            o.b(b.f10348a, "在单独子线程保存数据库 完成");
        }
    }

    public b(Context context, e eVar, com.anythink.expressad.mbbanner.a.c.b bVar, com.anythink.expressad.mbbanner.a.e.a aVar) {
        this.f10349b = context.getApplicationContext();
        this.f10351d = eVar;
        this.f = bVar;
        this.f10352e = aVar;
    }

    public static /* synthetic */ boolean b(b bVar) {
        bVar.f10354h = true;
        return true;
    }

    private void d(String str) {
        this.f10351d.a(str);
    }

    private void b(String str) {
        String str2 = f10348a;
        o.b(str2, "在子线程处理业务逻辑 完成");
        o.b(str2, "downloadResource--> Fail");
        this.f10354h = true;
        this.f10352e.b(this.f, str);
        this.f10353g.a(str);
    }

    private void c(String str) {
        this.f10355i.schedule(new AnonymousClass1(str), 60000L);
    }

    private void a(String str) {
        if (this.f10359m) {
            return;
        }
        if ((this.f10357k || this.f10358l) && this.f10356j.size() == 0) {
            o.b(f10348a, "在子线程处理业务逻辑 完成");
            this.f10354h = true;
            this.f10359m = true;
            this.f10355i.cancel();
            this.f10352e.a(this.f, str);
            this.f10353g.a(str);
        }
    }

    private int c() {
        try {
            int b10 = this.f10351d.b();
            if (b10 > this.f10351d.c()) {
                return 0;
            }
            return b10;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private void b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        i.a().a(str2, new f(this, str));
    }

    private void b(com.anythink.expressad.foundation.d.d dVar) {
        new Thread(new AnonymousClass2(dVar)).start();
    }

    public final void a(String str, int i10, String str2, boolean z10) {
        if (!z10) {
            if (i10 == -1) {
                o.d(f10348a, " unitId =" + str + " --> time out!");
            }
            this.f10355i.cancel();
            String str3 = f10348a;
            o.b(str3, "在子线程处理业务逻辑 完成");
            o.b(str3, "downloadResource--> Fail");
            this.f10354h = true;
            this.f10352e.b(this.f, str);
            this.f10353g.a(str);
            return;
        }
        if (i10 == 1) {
            o.b(f10348a, "downloadResource--> Success Image");
            synchronized (this) {
                this.f10356j.remove(str2);
                if (this.f10356j.size() == 0) {
                    a(str);
                }
            }
            return;
        }
        if (i10 == 2) {
            o.b(f10348a, "downloadResource--> Success banner_html");
            this.f10358l = true;
            a(str);
        } else if (i10 == 3) {
            o.b(f10348a, "downloadResource--> Success banner_url");
            this.f10357k = true;
            a(str);
        }
    }

    private String b() {
        return this.f10351d.a();
    }

    private void b(String str, List<com.anythink.expressad.foundation.d.c> list) {
        int i10 = this.f10350c;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    i10 += list.size();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        if (i10 > this.f10351d.c()) {
            o.b(f10348a, "saveNextOffset 重置offset为0");
            i10 = 0;
        }
        o.b(f10348a, "saveNextOffset 算出 下次的offset是:".concat(String.valueOf(i10)));
        if (w.b(str)) {
            this.f10351d.a(i10);
        }
    }

    public final void a(String str, com.anythink.expressad.foundation.d.d dVar, d dVar2) {
        this.f10353g = dVar2;
        if (dVar == null) {
            this.f10352e.a(this.f, "campaignUnit is NULL!", str);
            this.f10353g.a(str);
            return;
        }
        List<com.anythink.expressad.foundation.d.c> a10 = a(dVar);
        new Thread(new AnonymousClass2(dVar)).start();
        if (a10.size() == 0) {
            o.b(f10348a, "tryDownloadOnLoadSuccess 返回的campaign 没有符合下载规则的");
            this.f10352e.a(this.f, com.anythink.expressad.reward.a.d.f10650a, str);
            this.f10353g.a(str);
            return;
        }
        String str2 = f10348a;
        o.b(str2, "在子线程处理业务逻辑 开始");
        this.f10355i.schedule(new AnonymousClass1(str), 60000L);
        this.f10351d.a(dVar.c());
        int i10 = this.f10350c;
        int i11 = 0;
        try {
            if (a10.size() > 0) {
                i10 += a10.size();
            }
            if (i10 > this.f10351d.c()) {
                o.b(str2, "saveNextOffset 重置offset为0");
                i10 = 0;
            }
            o.b(str2, "saveNextOffset 算出 下次的offset是:".concat(String.valueOf(i10)));
            if (w.b(str)) {
                this.f10351d.a(i10);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        com.anythink.expressad.foundation.d.c cVar = a10.get(0);
        String trim = cVar.p().trim();
        if (!TextUtils.isEmpty(trim)) {
            if (!TextUtils.isEmpty(trim)) {
                i.a().a(trim, new f(this, str));
            }
            if (a10.size() > 0) {
                while (i11 < a10.size()) {
                    a10.get(i11).d(cVar.p());
                    a10.get(i11).a(true);
                    i11++;
                }
            }
        } else {
            String trim2 = cVar.q().trim();
            if (!TextUtils.isEmpty(trim2)) {
                String a11 = a(str, trim2);
                if (a10.size() > 0) {
                    while (i11 < a10.size()) {
                        a10.get(i11).e(a11);
                        a10.get(i11).a(trim2.contains("<MBTPLMARK>"));
                        i11++;
                    }
                }
            } else {
                this.f10358l = true;
                this.f10357k = true;
            }
        }
        a(str, a10);
    }

    private List<com.anythink.expressad.foundation.d.c> a(com.anythink.expressad.foundation.d.d dVar) {
        ArrayList arrayList = new ArrayList();
        if (dVar != null) {
            try {
                ArrayList<com.anythink.expressad.foundation.d.c> arrayList2 = dVar.J;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList<com.anythink.expressad.foundation.d.c> arrayList3 = dVar.J;
                    o.b(f10348a, "getNeedShowList 总共返回的campaign有：" + arrayList3.size());
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        com.anythink.expressad.foundation.d.c cVar = arrayList3.get(i10);
                        if (cVar != null && cVar.O() != 99 && (!TextUtils.isEmpty(cVar.p()) || !TextUtils.isEmpty(cVar.q()) || !TextUtils.isEmpty(cVar.be()))) {
                            if (t.a(cVar)) {
                                cVar.i(t.a(this.f10349b, cVar.ba()) ? 1 : 2);
                            }
                            if (cVar.ae() != 1 && t.a(this.f10349b, cVar.ba())) {
                                if (t.a(cVar)) {
                                    arrayList.add(cVar);
                                }
                            }
                            arrayList.add(cVar);
                        }
                    }
                    o.b(f10348a, "getNeedShowList 返回有以下带有视频素材的campaign：" + arrayList.size());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return arrayList;
    }

    private void a(String str, List<com.anythink.expressad.foundation.d.c> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (com.anythink.expressad.foundation.d.c cVar : list) {
            if (!TextUtils.isEmpty(cVar.be())) {
                this.f10356j.add(cVar.be());
                com.anythink.expressad.foundation.g.d.b.a(this.f10349b).a(cVar.be(), new g(this, str));
            }
        }
    }

    private String a(String str, String str2) {
        File file;
        File file2;
        FileOutputStream fileOutputStream;
        String str3 = "";
        if (!TextUtils.isEmpty(str2)) {
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    String b10 = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
                    String a10 = p.a(x.a(str2));
                    if (TextUtils.isEmpty(a10)) {
                        a10 = String.valueOf(System.currentTimeMillis());
                    }
                    file2 = new File(b10, a10.concat(".html"));
                    Uri.parse(str2).getPath();
                    fileOutputStream = new FileOutputStream(file2);
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileOutputStream.write(str2.getBytes());
                fileOutputStream.flush();
                String absolutePath = file2.getAbsolutePath();
                try {
                    fileOutputStream.close();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                str3 = absolutePath;
            } catch (Exception e12) {
                e = e12;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Exception e13) {
                        e13.printStackTrace();
                    }
                }
                file = new File(str3);
                if (!file.exists()) {
                }
                a(str, 2, str2, false);
                return str3;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Exception e14) {
                        e14.printStackTrace();
                    }
                }
                throw th;
            }
            file = new File(str3);
            if (!file.exists() && file.isFile() && file.canRead()) {
                a(str, 2, str2, true);
            } else {
                a(str, 2, str2, false);
            }
        }
        return str3;
    }
}
