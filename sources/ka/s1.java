package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Content;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class s1 implements Runnable {
    public final /* synthetic */ Content A;
    public final /* synthetic */ Content B;
    public final /* synthetic */ int C;
    public final /* synthetic */ boolean D = false;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f31784s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AdContentRsp f31785t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f31786u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Content f31787v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f31788w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f31789x;
    public final /* synthetic */ String y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f31790z;

    public s1(int i10, int i11, Context context, Content content, Content content2, Content content3, AdContentRsp adContentRsp, String str, String str2, String str3, String str4) {
        this.f31784s = context;
        this.f31785t = adContentRsp;
        this.f31786u = str;
        this.f31787v = content;
        this.f31788w = str2;
        this.f31789x = str3;
        this.y = str4;
        this.f31790z = i10;
        this.A = content2;
        this.B = content3;
        this.C = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(r1.i(this.f31785t, this.f31786u, this.f31787v, this.f31788w, this.f31789x, this.y, this.f31790z));
        arrayList.add(r1.i(this.f31785t, this.f31786u, this.A, this.f31788w, this.f31789x, this.y, this.f31790z));
        arrayList.add(r1.i(this.f31785t, this.f31786u, this.B, this.f31788w, this.f31789x, this.y, this.f31790z));
        com.huawei.openalliance.ad.ppskit.utils.p2.a(new t1(this.C, 2, this.f31784s, this.f31785t.n(), arrayList, this.D), 5);
    }
}
