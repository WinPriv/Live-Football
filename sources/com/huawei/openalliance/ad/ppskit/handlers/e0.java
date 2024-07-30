package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ka.h6;
import ka.n7;
import ka.u4;
import ka.w4;

/* loaded from: classes2.dex */
public class e0 extends z implements h6 {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f22530c = new byte[0];

    public e0(Context context) {
        super(context);
    }

    public static ArrayList D(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ContentRecord) it.next()).h());
            }
            return arrayList2;
        }
        return null;
    }

    public final void A(List<ContentRecord> list) {
        e0 e0Var = this;
        long currentTimeMillis = System.currentTimeMillis();
        if (!androidx.transition.n.M(list) && e0Var.f22513b != null) {
            synchronized (f22530c) {
                ArrayList arrayList = new ArrayList();
                String simpleName = B().getSimpleName();
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    ContentRecord contentRecord = (ContentRecord) it.next();
                    String h12 = contentRecord.h1();
                    String h10 = contentRecord.h();
                    String p22 = contentRecord.p2();
                    arrayList.add(new w4(simpleName, "appPkgName=? and contentId=? and slotId=?", new String[]{h12, h10, p22}, "appPkgName=? and contentId=? and slotId=?", new String[]{h12, h10, p22}, contentRecord.l(e0Var.f22513b)));
                    e0Var = this;
                }
                u4 m10 = m();
                try {
                    m10.h(arrayList);
                    c0.g(m10);
                } catch (Throwable th) {
                    c0.g(m10);
                    throw th;
                }
            }
            n7.c("e0", "insertOrUpdateContents duration: %s ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public Class<? extends pa.a> B() {
        return ContentRecord.class;
    }

    public final ArrayList C(String str, int i10, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 != null) {
                    Iterator it2 = h(B(), new String[]{"contentId", ContentRecord.DISP_TIME}, 32, new String[]{str, String.valueOf(i10), str2}, null, null).iterator();
                    while (it2.hasNext()) {
                        arrayList.add((ContentRecord) it2.next());
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // ka.h6
    public ArrayList a(int i10) {
        return h(B(), null, 31, new String[]{String.valueOf(i10)}, null, null);
    }

    @Override // ka.h6
    public void b(ContentRecord contentRecord, ArrayList arrayList) {
        if (contentRecord == null) {
            return;
        }
        ContentValues l10 = contentRecord.l(this.f22513b);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l10.remove((String) it.next());
        }
        l(B(), l10, 7, new String[]{contentRecord.h1(), contentRecord.h(), contentRecord.p2()});
    }

    @Override // ka.h6
    public ContentRecord c(long j10, String str, String str2, String str3, String str4) {
        return null;
    }

    public final ContentRecord n(String str, String str2, String str3) {
        ArrayList h10 = h(B(), null, 7, new String[]{str, str2, str3}, null, null);
        if (!h10.isEmpty()) {
            return (ContentRecord) h10.get(0);
        }
        return null;
    }

    public final ContentRecord o(String str, String str2, String str3, String str4) {
        ArrayList h10 = h(B(), null, 56, new String[]{str, str2, str3, str4}, null, null);
        if (!h10.isEmpty()) {
            return (ContentRecord) h10.get(0);
        }
        return null;
    }

    public ArrayList p(int i10, long j10) {
        HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
        return h(B(), new String[]{"appPkgName", "contentId", "slotId", ContentRecord.SPLASH_MEDIA_PATH}, 19, new String[]{String.valueOf(System.currentTimeMillis() - j10), String.valueOf(i10)}, null, null);
    }

    public final ArrayList q(int i10, long j10, String str, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            String[] strArr = {"contentId"};
            if (str2 != null) {
                Iterator it2 = h(B(), strArr, 34, new String[]{str, String.valueOf(i10), str2, "0", String.valueOf(j10), String.valueOf(j10)}, null, null).iterator();
                while (it2.hasNext()) {
                    arrayList.add((ContentRecord) it2.next());
                }
            }
        }
        return D(arrayList);
    }

    public final void r(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return;
        }
        synchronized (f22530c) {
            String h10 = contentRecord.h();
            String p22 = contentRecord.p2();
            if (n(contentRecord.h1(), h10, p22) != null) {
                l(B(), contentRecord.l(this.f22513b), 7, new String[]{contentRecord.h1(), h10, p22});
            } else {
                d(B(), contentRecord.l(this.f22513b));
            }
        }
    }

    public final void s(ContentRecord contentRecord, String str, ArrayList arrayList) {
        if (contentRecord == null) {
            return;
        }
        ArrayList u2 = contentRecord.u();
        ContentValues l10 = contentRecord.l(this.f22513b);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u2.remove((String) it.next());
        }
        Iterator it2 = u2.iterator();
        while (it2.hasNext()) {
            l10.remove((String) it2.next());
        }
        l(B(), l10, 6, new String[]{contentRecord.h1(), str});
    }

    public final void t(ContentRecord contentRecord, ArrayList arrayList) {
        if (contentRecord == null) {
            return;
        }
        ArrayList u2 = contentRecord.u();
        ContentValues l10 = contentRecord.l(this.f22513b);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u2.remove((String) it.next());
        }
        Iterator it2 = u2.iterator();
        while (it2.hasNext()) {
            l10.remove((String) it2.next());
        }
        l(B(), l10, 7, new String[]{contentRecord.h1(), contentRecord.h(), contentRecord.p2()});
    }

    public final void u(List<ContentRecord> list, List<String> list2) {
        e0 e0Var = this;
        long currentTimeMillis = System.currentTimeMillis();
        if (!androidx.transition.n.M(list) && e0Var.f22513b != null) {
            synchronized (f22530c) {
                ArrayList arrayList = new ArrayList();
                String simpleName = B().getSimpleName();
                for (ContentRecord contentRecord : list) {
                    String h12 = contentRecord.h1();
                    String h10 = contentRecord.h();
                    String p22 = contentRecord.p2();
                    ContentValues l10 = contentRecord.l(e0Var.f22513b);
                    if (!androidx.transition.n.M(list2)) {
                        Iterator<String> it = list2.iterator();
                        while (it.hasNext()) {
                            l10.remove(it.next());
                        }
                    }
                    arrayList.add(new w4(simpleName, "appPkgName=? and contentId=? and slotId=?", new String[]{h12, h10, p22}, "appPkgName=? and contentId=? and slotId=?", new String[]{h12, h10, p22}, l10));
                    e0Var = this;
                }
                u4 m10 = m();
                try {
                    m10.h(arrayList);
                    c0.g(m10);
                } catch (Throwable th) {
                    c0.g(m10);
                    throw th;
                }
            }
            n7.c("e0", "insertOrUpdateContents duration: %s ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public final ContentRecord v(String str, int i10, String[] strArr) {
        Iterator it = h(B(), null, i10, strArr, "priority asc, displayCount asc, updateTime desc", String.valueOf(4)).iterator();
        while (it.hasNext()) {
            ContentRecord contentRecord = (ContentRecord) it.next();
            String m32 = contentRecord.m3();
            Context context = this.f22513b;
            if (!com.huawei.openalliance.ad.ppskit.utils.d0.m(context) && !TextUtils.isEmpty(m32) && m32.startsWith("content://")) {
                n7.b("e0", "queryShowContent valid, uri.");
                return contentRecord;
            }
            if (com.huawei.openalliance.ad.ppskit.utils.x.r(context, m32, "normal")) {
                n7.c("e0", "find cache ad:%s", contentRecord.h());
                return contentRecord;
            }
            n7.c("e0", "find invalid ad:%s", contentRecord.h() + ", path:" + m32);
            y(str, contentRecord.h(), contentRecord.p2(), "queryShowContent - file not exist");
        }
        return null;
    }

    public final ArrayList w(String str, int i10, List list) {
        ArrayList arrayList = new ArrayList();
        if (!androidx.transition.n.M(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 != null) {
                    Iterator it2 = h(B(), new String[]{"contentId", ContentRecord.DISP_TIME}, 33, new String[]{str, String.valueOf(i10), str2, ContentRecord.XRINFOLIST_NULL, ""}, null, null).iterator();
                    while (it2.hasNext()) {
                        arrayList.add((ContentRecord) it2.next());
                    }
                }
            }
        }
        return D(arrayList);
    }

    public final void x(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return;
        }
        synchronized (f22530c) {
            if (o(contentRecord.h1(), contentRecord.h(), contentRecord.Z0(), contentRecord.p2()) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(pa.a.ID);
                arrayList.add(ContentRecord.DISPLAY_COUNT);
                arrayList.add(ContentRecord.DISPLAY_DATE);
                arrayList.add(ContentRecord.SPLASH_MEDIA_PATH);
                arrayList.add(ContentRecord.LAST_SHOW_TIME);
                arrayList.add(ContentRecord.FC_CTRL_DATE);
                b(contentRecord, arrayList);
            } else {
                d(B(), contentRecord.l(this.f22513b));
            }
        }
    }

    public final void y(String str, String str2, String str3, String str4) {
        n7.f("e0", "deleteContentByIds appPkgName: %s id: %s id: %s reason: %s", str, str2, str3, str4);
        j(B(), 7, new String[]{str, str2, str3});
    }

    public final void z(String str) {
        ContentValues contentValues = new ContentValues();
        String j10 = com.huawei.openalliance.ad.ppskit.utils.d0.j("yyyy-MM-dd");
        contentValues.put(ContentRecord.DISPLAY_DATE, j10);
        contentValues.put(ContentRecord.DISPLAY_COUNT, (Integer) 0);
        l(B(), contentValues, 12, new String[]{str, j10});
    }

    @Override // ka.h6
    public void a(String str, String str2, String str3, String str4) {
    }
}
