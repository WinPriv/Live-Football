package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* compiled from: MenuAdapter.java */
/* loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* renamed from: s, reason: collision with root package name */
    public final h f810s;

    /* renamed from: t, reason: collision with root package name */
    public int f811t = -1;

    /* renamed from: u, reason: collision with root package name */
    public boolean f812u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f813v;

    /* renamed from: w, reason: collision with root package name */
    public final LayoutInflater f814w;

    /* renamed from: x, reason: collision with root package name */
    public final int f815x;

    public g(h hVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f813v = z10;
        this.f814w = layoutInflater;
        this.f810s = hVar;
        this.f815x = i10;
        a();
    }

    public final void a() {
        h hVar = this.f810s;
        j jVar = hVar.f835v;
        if (jVar != null) {
            hVar.i();
            ArrayList<j> arrayList = hVar.f824j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayList.get(i10) == jVar) {
                    this.f811t = i10;
                    return;
                }
            }
        }
        this.f811t = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j getItem(int i10) {
        ArrayList<j> l10;
        boolean z10 = this.f813v;
        h hVar = this.f810s;
        if (z10) {
            hVar.i();
            l10 = hVar.f824j;
        } else {
            l10 = hVar.l();
        }
        int i11 = this.f811t;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return l10.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<j> l10;
        boolean z10 = this.f813v;
        h hVar = this.f810s;
        if (z10) {
            hVar.i();
            l10 = hVar.f824j;
        } else {
            l10 = hVar.l();
        }
        if (this.f811t < 0) {
            return l10.size();
        }
        return l10.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        boolean z10 = false;
        if (view == null) {
            view = this.f814w.inflate(this.f815x, viewGroup, false);
        }
        int i12 = getItem(i10).f842b;
        int i13 = i10 - 1;
        if (i13 >= 0) {
            i11 = getItem(i13).f842b;
        } else {
            i11 = i12;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f810s.m() && i12 != i11) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        n.a aVar = (n.a) view;
        if (this.f812u) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
