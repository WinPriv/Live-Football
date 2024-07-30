package ra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.transition.n;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.inter.data.PermissionEntity;
import java.util.List;

/* loaded from: classes2.dex */
public final class h extends BaseAdapter {

    /* renamed from: s, reason: collision with root package name */
    public final List<PermissionEntity> f34970s;

    /* renamed from: t, reason: collision with root package name */
    public final LayoutInflater f34971t;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f34972a;

        public a(View view) {
            this.f34972a = (TextView) view.findViewById(R.id.hiad_permissions_dialog_child_tv);
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f34973a;

        public b(View view) {
            this.f34973a = (TextView) view.findViewById(R.id.hiad_permissions_dialog_parent_tv);
        }
    }

    public h(Context context, List<PermissionEntity> list) {
        this.f34970s = list;
        this.f34971t = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List<PermissionEntity> list = this.f34970s;
        if (n.M(list)) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        List<PermissionEntity> list = this.f34970s;
        if (n.M(list)) {
            return null;
        }
        return list.get(i10);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        if (n.M(this.f34970s)) {
            return 0L;
        }
        return i10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i10) {
        List<PermissionEntity> list = this.f34970s;
        if (!n.M(list) && list.get(i10) != null) {
            return list.get(i10).getType();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
    
        r9.setText(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
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
            java.util.List<com.huawei.openalliance.ad.ppskit.inter.data.PermissionEntity> r0 = r6.f34970s
            java.lang.Object r0 = r0.get(r7)
            com.huawei.openalliance.ad.ppskit.inter.data.PermissionEntity r0 = (com.huawei.openalliance.ad.ppskit.inter.data.PermissionEntity) r0
            int r1 = r6.getItemViewType(r7)
            android.view.LayoutInflater r2 = r6.f34971t
            r3 = 1
            r4 = 0
            java.lang.String r5 = ""
            if (r1 == 0) goto L40
            if (r1 == r3) goto L17
            goto L6d
        L17:
            if (r8 != 0) goto L29
            r8 = 2131558602(0x7f0d00ca, float:1.8742524E38)
            android.view.View r8 = r2.inflate(r8, r9, r4)
            ra.h$a r9 = new ra.h$a
            r9.<init>(r8)
            r8.setTag(r9)
            goto L2f
        L29:
            java.lang.Object r9 = r8.getTag()
            ra.h$a r9 = (ra.h.a) r9
        L2f:
            if (r0 == 0) goto L36
            java.lang.String r0 = r0.getName()
            goto L37
        L36:
            r0 = r5
        L37:
            android.widget.TextView r9 = r9.f34972a
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L69
            goto L6a
        L40:
            if (r8 != 0) goto L52
            r8 = 2131558604(0x7f0d00cc, float:1.8742529E38)
            android.view.View r8 = r2.inflate(r8, r9, r4)
            ra.h$b r9 = new ra.h$b
            r9.<init>(r8)
            r8.setTag(r9)
            goto L58
        L52:
            java.lang.Object r9 = r8.getTag()
            ra.h$b r9 = (ra.h.b) r9
        L58:
            if (r0 == 0) goto L5f
            java.lang.String r0 = r0.getName()
            goto L60
        L5f:
            r0 = r5
        L60:
            android.widget.TextView r9 = r9.f34973a
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L69
            goto L6a
        L69:
            r5 = r0
        L6a:
            r9.setText(r5)
        L6d:
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9[r4] = r0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9[r3] = r7
            java.lang.String r7 = "AppPermissionsDialog"
            java.lang.String r0 = "getView, time:%s, position:%s"
            ka.n7.c(r7, r0, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.h.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
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
