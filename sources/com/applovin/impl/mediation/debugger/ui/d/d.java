package com.applovin.impl.mediation.debugger.ui.d;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class d extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private List<c> f18166a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private Map<Integer, Integer> f18167b = CollectionUtils.map();

    /* renamed from: c, reason: collision with root package name */
    protected Context f18168c;

    /* renamed from: d, reason: collision with root package name */
    private a f18169d;

    /* loaded from: classes.dex */
    public interface a {
        void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar);
    }

    public d(Context context) {
        this.f18168c = context.getApplicationContext();
    }

    private com.applovin.impl.mediation.debugger.ui.d.a e(int i10) {
        for (int i11 = 0; i11 < e(); i11++) {
            Integer num = this.f18167b.get(Integer.valueOf(i11));
            if (num != null) {
                if (i10 <= num.intValue() + a(i11)) {
                    return new com.applovin.impl.mediation.debugger.ui.d.a(i11, i10 - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    public abstract int a(int i10);

    public void a(a aVar) {
        this.f18169d = aVar;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    public abstract c b(int i10);

    public abstract List<c> c(int i10);

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c getItem(int i10) {
        return this.f18166a.get(i10);
    }

    public abstract int e();

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f18166a.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i10) {
        return getItem(i10).i();
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        b bVar;
        c item = getItem(i10);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            bVar = new b();
            bVar.f18130a = (TextView) view.findViewById(R.id.text1);
            bVar.f18131b = (TextView) view.findViewById(R.id.text2);
            bVar.f18132c = (ImageView) view.findViewById(com.applovin.sdk.R.id.imageView);
            bVar.f18133d = (ImageView) view.findViewById(com.applovin.sdk.R.id.detailImageView);
            view.setTag(bVar);
            view.setOnClickListener(this);
        } else {
            bVar = (b) view.getTag();
        }
        bVar.a(i10);
        bVar.a(item);
        view.setEnabled(item.c());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return c.h();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i10) {
        return getItem(i10).c();
    }

    public void m() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.debugger.ui.d.d.1
            @Override // java.lang.Runnable
            public void run() {
                d.this.notifyDataSetChanged();
            }
        });
    }

    public c n() {
        return null;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i10;
        this.f18166a = new ArrayList();
        int e10 = e();
        this.f18167b = CollectionUtils.map(e10);
        c n10 = n();
        if (n10 != null) {
            this.f18166a.add(n10);
            i10 = 1;
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < e10; i11++) {
            int a10 = a(i11);
            if (a10 != 0) {
                this.f18166a.add(b(i11));
                this.f18166a.addAll(c(i11));
                this.f18167b.put(Integer.valueOf(i11), Integer.valueOf(i10));
                i10 = a10 + 1 + i10;
            }
        }
        this.f18166a.add(new e(""));
        super.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        b bVar = (b) view.getTag();
        c b10 = bVar.b();
        com.applovin.impl.mediation.debugger.ui.d.a e10 = e(bVar.a());
        a aVar = this.f18169d;
        if (aVar != null && e10 != null) {
            aVar.a(e10, b10);
        }
    }
}
