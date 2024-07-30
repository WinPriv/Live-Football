package com.huawei.openalliance.ad.ppskit.linked.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.hamkho.livefoot.R;
import ka.Cif;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f22681a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f22682a;

        /* renamed from: b, reason: collision with root package name */
        public int f22683b;
    }

    public b(Context context) {
        Resources resources;
        int i10;
        a aVar = new a();
        this.f22681a = aVar;
        if (Cif.a(context).g()) {
            resources = context.getResources();
            i10 = R.drawable.hiad_extand_landing_app_down_btn_normal_hm;
        } else {
            resources = context.getResources();
            i10 = R.drawable.hiad_extand_landing_app_down_btn_normal;
        }
        aVar.f22682a = resources.getDrawable(i10);
        aVar.f22683b = context.getResources().getColor(R.color.hiad_emui_white);
    }
}
