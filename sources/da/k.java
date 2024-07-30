package da;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.huawei.hms.ads.base.R;
import com.huawei.openalliance.ad.inter.data.PermissionEntity;
import java.util.List;

/* loaded from: classes2.dex */
public final class k extends BaseAdapter {

    /* renamed from: s, reason: collision with root package name */
    public final List<PermissionEntity> f27555s;

    /* renamed from: t, reason: collision with root package name */
    public final LayoutInflater f27556t;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f27557a;

        public a(View view) {
            this.f27557a = (TextView) view.findViewById(R.id.hiad_permissions_dialog_child_tv);
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f27558a;

        public b(View view) {
            this.f27558a = (TextView) view.findViewById(R.id.hiad_permissions_dialog_parent_tv);
        }
    }

    public k(Context context, List<PermissionEntity> list) {
        this.f27555s = list;
        this.f27556t = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List<PermissionEntity> list = this.f27555s;
        if (androidx.transition.n.h(list)) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        List<PermissionEntity> list = this.f27555s;
        if (androidx.transition.n.h(list)) {
            return null;
        }
        return list.get(i10);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        if (androidx.transition.n.h(this.f27555s)) {
            return 0L;
        }
        return i10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i10) {
        List<PermissionEntity> list = this.f27555s;
        if (!androidx.transition.n.h(list) && list.get(i10) != null) {
            return list.get(i10).p();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0067, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0068, code lost:
    
        r9.setText(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L25;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            java.util.List<com.huawei.openalliance.ad.inter.data.PermissionEntity> r0 = r6.f27555s
            java.lang.Object r0 = r0.get(r7)
            com.huawei.openalliance.ad.inter.data.PermissionEntity r0 = (com.huawei.openalliance.ad.inter.data.PermissionEntity) r0
            int r1 = r6.getItemViewType(r7)
            android.view.LayoutInflater r2 = r6.f27556t
            r3 = 1
            r4 = 0
            java.lang.String r5 = ""
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L17
            goto L6b
        L17:
            if (r8 != 0) goto L28
            int r8 = com.huawei.hms.ads.base.R.layout.hiad_permission_dialog_child_item
            android.view.View r8 = r2.inflate(r8, r9, r4)
            da.k$a r9 = new da.k$a
            r9.<init>(r8)
            r8.setTag(r9)
            goto L2e
        L28:
            java.lang.Object r9 = r8.getTag()
            da.k$a r9 = (da.k.a) r9
        L2e:
            if (r0 == 0) goto L35
            java.lang.String r0 = r0.k()
            goto L36
        L35:
            r0 = r5
        L36:
            android.widget.TextView r9 = r9.f27557a
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L67
            goto L68
        L3f:
            if (r8 != 0) goto L50
            int r8 = com.huawei.hms.ads.base.R.layout.hiad_permission_dialog_parent_item
            android.view.View r8 = r2.inflate(r8, r9, r4)
            da.k$b r9 = new da.k$b
            r9.<init>(r8)
            r8.setTag(r9)
            goto L56
        L50:
            java.lang.Object r9 = r8.getTag()
            da.k$b r9 = (da.k.b) r9
        L56:
            if (r0 == 0) goto L5d
            java.lang.String r0 = r0.k()
            goto L5e
        L5d:
            r0 = r5
        L5e:
            android.widget.TextView r9 = r9.f27558a
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L67
            goto L68
        L67:
            r5 = r0
        L68:
            r9.setText(r5)
        L6b:
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9[r4] = r0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9[r3] = r7
            java.lang.String r7 = "AppPermissionsDialog"
            java.lang.String r0 = "getView, time:%s, position:%s"
            com.huawei.hms.ads.ex.Code(r7, r0, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: da.k.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i10) {
        return false;
    }
}
