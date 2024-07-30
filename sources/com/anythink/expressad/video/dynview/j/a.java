package com.anythink.expressad.video.dynview.j;

import a3.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.anythink.core.common.b.n;
import com.anythink.core.common.k.d;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.p;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.foundation.h.x;
import com.anythink.expressad.video.dynview.f.e;
import com.anythink.expressad.video.dynview.g.a;
import com.anythink.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.anythink.expressad.videocommon.view.RoundImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11490a = "DataEnergizeWrapper";

    /* renamed from: k, reason: collision with root package name */
    private static boolean f11491k = false;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.expressad.video.dynview.i.c.b f11493c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Bitmap> f11494d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f11495e;
    private String f = "#FFFFFFFF";

    /* renamed from: g, reason: collision with root package name */
    private String f11496g = "#60000000";

    /* renamed from: h, reason: collision with root package name */
    private String f11497h = "#FF5F5F5F";

    /* renamed from: i, reason: collision with root package name */
    private String f11498i = "#90ECECEC";

    /* renamed from: j, reason: collision with root package name */
    private volatile long f11499j = 0;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.expressad.video.dynview.i.c.a f11500l = null;

    /* renamed from: m, reason: collision with root package name */
    private boolean f11501m = false;

    /* renamed from: n, reason: collision with root package name */
    private int f11502n = 0;

    /* renamed from: b, reason: collision with root package name */
    public com.anythink.expressad.video.dynview.e.a f11492b = new com.anythink.expressad.video.dynview.e.a() { // from class: com.anythink.expressad.video.dynview.j.a.1
        @Override // com.anythink.expressad.video.dynview.e.a
        public final void a() {
            if (a.this.f11501m && a.this.f11493c != null) {
                a.this.f11493c.a(a.this.f11502n * 1000, a.this.f11500l);
                a.this.f11501m = false;
            }
        }

        @Override // com.anythink.expressad.video.dynview.e.a
        public final void c() {
            if (a.this.f11493c != null) {
                a.this.f11493c.c();
                a.this.f11501m = true;
            }
        }

        @Override // com.anythink.expressad.video.dynview.e.a
        public final void b() {
        }
    };

    /* renamed from: com.anythink.expressad.video.dynview.j.a$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 extends com.anythink.expressad.widget.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f11518a;

        public AnonymousClass5(Map map) {
            this.f11518a = map;
        }

        @Override // com.anythink.expressad.widget.a
        public final void a(View view) {
            if (!a.this.f11495e) {
                a.f(a.this);
                a.a(a.this, this.f11518a);
            }
        }
    }

    public static /* synthetic */ boolean f(a aVar) {
        aVar.f11495e = true;
        return true;
    }

    public final void b(com.anythink.expressad.video.dynview.c cVar, View view, Map map, e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.anythink.expressad.video.dynview.c.b.NOT_FOUND_VIEWOPTION);
            return;
        }
        if (map != null && map.containsKey("is_dy_success")) {
            f11491k = ((Boolean) map.get("is_dy_success")).booleanValue();
        }
        f11491k = false;
        ImageView imageView = (ImageView) view.findViewById(a("anythink_reward_icon_riv"));
        TextView textView = (TextView) view.findViewById(a("anythink_reward_title_tv"));
        LinearLayout linearLayout = (LinearLayout) view.findViewById(a("anythink_reward_stars_mllv"));
        TextView textView2 = (TextView) view.findViewById(a("anythink_reward_click_tv"));
        ImageView imageView2 = (ImageView) view.findViewById(a("anythink_videoview_bg"));
        TextView textView3 = (TextView) view.findViewById(a("anythink_reward_desc_tv"));
        ArrayList arrayList = new ArrayList();
        List<com.anythink.expressad.foundation.d.c> g6 = cVar.g();
        if (g6 != null && g6.size() > 0) {
            com.anythink.expressad.foundation.d.c cVar2 = g6.get(0);
            if (cVar2 != null) {
                if (imageView != null) {
                    ((RoundImageView) imageView).setBorderRadius(10);
                    a(cVar2.bd(), imageView);
                }
                if (textView != null) {
                    textView.setText(cVar2.bb());
                }
                if (textView3 != null) {
                    textView3.setText(cVar2.bc());
                }
                if (linearLayout != null) {
                    double aX = cVar2.aX();
                    if (aX <= 0.0d) {
                        aX = 5.0d;
                    }
                    ((AnyThinkLevelLayoutView) linearLayout).setRatingAndUser(aX, cVar2.aY());
                }
                if (textView2 != null) {
                    textView2.setText(cVar2.cU);
                }
                int h10 = cVar.h();
                if (h10 == 102 || h10 == 202 || h10 == 302) {
                    if (textView2 != null) {
                        arrayList.add(textView2);
                    }
                } else if (h10 != 802) {
                    if (h10 == 904 && cVar.k()) {
                        arrayList.add(view);
                    }
                } else {
                    if (imageView != null) {
                        arrayList.add(imageView);
                    }
                    if (textView2 != null) {
                        arrayList.add(textView2);
                    }
                    a(imageView2, cVar2.be(), h10);
                }
                eVar.a(view, arrayList);
                return;
            }
            eVar.a(com.anythink.expressad.video.dynview.c.b.CAMPAIGNEX_IS_NULL);
            return;
        }
        eVar.a(com.anythink.expressad.video.dynview.c.b.CAMPAIGNEX_IS_NULL);
    }

    public final void c(com.anythink.expressad.video.dynview.c cVar, View view, final Map map, e eVar) {
        try {
            if (this.f11494d == null) {
                this.f11494d = new HashMap();
            }
            final List<com.anythink.expressad.foundation.d.c> g6 = cVar.g();
            if (view.getContext() == null) {
                eVar.a(com.anythink.expressad.video.dynview.c.b.NOT_FOUND_CONTEXT);
                return;
            }
            if (map != null && map.containsKey("is_dy_success")) {
                f11491k = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            f11491k = false;
            ListView listView = (ListView) view.findViewById(a("anythink_order_view_lv"));
            GridView gridView = (GridView) view.findViewById(a("anythink_order_view_h_lv"));
            ImageView imageView = (ImageView) view.findViewById(a("anythink_order_view_iv_close"));
            com.anythink.expressad.video.dynview.ordercamp.a.a aVar = new com.anythink.expressad.video.dynview.ordercamp.a.a(g6);
            if (cVar.e() == 1) {
                if (listView != null) {
                    listView.setAdapter((ListAdapter) aVar);
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.anythink.expressad.video.dynview.j.a.7
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView<?> adapterView, View view2, int i10, long j10) {
                            a.a(a.this, map, g6, i10);
                        }
                    });
                }
            } else if (gridView != null) {
                int d10 = (int) cVar.d();
                int size = d10 / g6.size();
                int i10 = size / 9;
                int i11 = i10 / 2;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) gridView.getLayoutParams();
                layoutParams.width = d10 - (i10 * 2);
                gridView.setLayoutParams(layoutParams);
                gridView.setColumnWidth((size - i10) - (i11 / 2));
                gridView.setHorizontalSpacing(i11);
                gridView.setStretchMode(0);
                gridView.setNumColumns(g6.size());
                gridView.setAdapter((ListAdapter) aVar);
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.anythink.expressad.video.dynview.j.a.8
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView<?> adapterView, View view2, int i12, long j10) {
                        a.a(a.this, map, g6, i12);
                    }
                });
            }
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.dynview.j.a.9
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        a.b(a.this, map);
                    }
                });
            }
            if (eVar != null) {
                eVar.a(view, null);
            }
        } catch (Exception unused) {
            if (eVar != null) {
                eVar.a(com.anythink.expressad.video.dynview.c.b.NOT_FOUND_VIEWOPTION);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.anythink.expressad.video.dynview.c r33, android.view.View r34, final java.util.Map r35, com.anythink.expressad.video.dynview.f.e r36) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.dynview.j.a.a(com.anythink.expressad.video.dynview.c, android.view.View, java.util.Map, com.anythink.expressad.video.dynview.f.e):void");
    }

    private void b(Map map) {
        if (map != null) {
            try {
                if (map.containsKey(com.anythink.expressad.video.dynview.a.a.E) && (map.get(com.anythink.expressad.video.dynview.a.a.E) instanceof com.anythink.expressad.video.dynview.f.c)) {
                    ((com.anythink.expressad.video.dynview.f.c) map.get(com.anythink.expressad.video.dynview.a.a.E)).a();
                    b();
                }
            } catch (Exception e10) {
                o.d(f11490a, e10.getMessage());
            }
        }
    }

    private static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    private static void b(com.anythink.expressad.video.dynview.c cVar, View view) {
        a.C0137a a10 = com.anythink.expressad.video.dynview.g.a.a();
        a10.a(cVar.e()).a();
        if (cVar.e() != 2) {
            a10.a(cVar.d()).b(cVar.c());
        } else if (cVar.d() > cVar.c()) {
            a10.a(cVar.d()).b(cVar.c());
        } else {
            a10.a(cVar.c()).b(cVar.d());
        }
        if (view.getBackground() == null) {
            view.setBackgroundDrawable(a10.b());
        }
    }

    /* renamed from: com.anythink.expressad.video.dynview.j.a$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements com.anythink.expressad.video.dynview.i.c.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f11520a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f11521b;

        public AnonymousClass6(TextView textView, Map map) {
            this.f11520a = textView;
            this.f11521b = map;
        }

        @Override // com.anythink.expressad.video.dynview.i.c.a
        public final void a(long j10) {
            String k10;
            a.this.f11502n = (int) (j10 / 1000);
            long j11 = a.this.f11502n;
            String f = d.f(this.f11520a.getContext());
            if (f.startsWith(com.anythink.expressad.video.dynview.a.a.V)) {
                if (!f.contains(com.anythink.expressad.video.dynview.a.a.f11380ad) && !f.contains(com.anythink.expressad.video.dynview.a.a.ae)) {
                    k10 = j11 + com.anythink.expressad.video.dynview.a.a.F;
                } else {
                    k10 = j11 + com.anythink.expressad.video.dynview.a.a.G;
                }
            } else if (f.startsWith(com.anythink.expressad.video.dynview.a.a.W)) {
                k10 = j11 + com.anythink.expressad.video.dynview.a.a.I;
            } else if (f.startsWith(com.anythink.expressad.video.dynview.a.a.X)) {
                k10 = l.k(com.anythink.expressad.video.dynview.a.a.J, j11, " Sekunden");
            } else if (f.startsWith(com.anythink.expressad.video.dynview.a.a.Y)) {
                k10 = j11 + com.anythink.expressad.video.dynview.a.a.K;
            } else if (f.startsWith(com.anythink.expressad.video.dynview.a.a.Z)) {
                k10 = l.k(com.anythink.expressad.video.dynview.a.a.L, j11, " secondes");
            } else if (f.startsWith(com.anythink.expressad.video.dynview.a.a.f11377aa)) {
                k10 = l.k(" ثوان", j11, com.anythink.expressad.video.dynview.a.a.M);
            } else if (f.startsWith(com.anythink.expressad.video.dynview.a.a.f11378ab)) {
                k10 = l.k(com.anythink.expressad.video.dynview.a.a.N, j11, " секунд");
            } else {
                k10 = l.k(com.anythink.expressad.video.dynview.a.a.H, j11, " s");
            }
            this.f11520a.setText(k10);
            a.this.f11499j++;
        }

        @Override // com.anythink.expressad.video.dynview.i.c.a
        public final void a() {
            a.a(a.this, this.f11521b);
        }
    }

    private void b() {
        com.anythink.expressad.video.dynview.i.a.a.a().b();
        com.anythink.expressad.video.dynview.i.c.b bVar = this.f11493c;
        if (bVar != null) {
            bVar.c();
            this.f11493c = null;
        }
        com.anythink.expressad.video.dynview.b.a.a().f11411a = null;
        if (this.f11492b != null) {
            this.f11492b = null;
        }
        Map<String, Bitmap> map = this.f11494d;
        if (map != null) {
            if (map.entrySet() != null) {
                try {
                    Iterator<Map.Entry<String, Bitmap>> it = this.f11494d.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, Bitmap> next = it.next();
                        if (next != null && next.getValue() != null && !next.getValue().isRecycled()) {
                            next.getValue().recycle();
                        }
                        it.remove();
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            this.f11494d.clear();
        }
    }

    public static /* synthetic */ void b(a aVar, Map map) {
        if (map != null) {
            try {
                if (map.containsKey(com.anythink.expressad.video.dynview.a.a.E) && (map.get(com.anythink.expressad.video.dynview.a.a.E) instanceof com.anythink.expressad.video.dynview.f.c)) {
                    ((com.anythink.expressad.video.dynview.f.c) map.get(com.anythink.expressad.video.dynview.a.a.E)).a();
                    aVar.b();
                }
            } catch (Exception e10) {
                o.d(f11490a, e10.getMessage());
            }
        }
    }

    public final void a(com.anythink.expressad.video.dynview.c cVar, View view, e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.anythink.expressad.video.dynview.c.b.NOT_FOUND_VIEWOPTION);
            return;
        }
        try {
            ImageView imageView = (ImageView) view.findViewById(a("anythink_iv_adbanner_bg"));
            if (imageView != null) {
                imageView.setBackgroundColor(Color.parseColor(this.f11498i));
            }
            ImageView imageView2 = (ImageView) view.findViewById(a("anythink_iv_adbanner"));
            if (imageView2 != null) {
                imageView2.setBackgroundColor(Color.parseColor(this.f11498i));
            }
            eVar.a(view, new ArrayList());
        } catch (Exception e10) {
            o.a(f11490a, e10.getMessage());
            eVar.a(com.anythink.expressad.video.dynview.c.b.NOT_FOUND_VIEWOPTION);
        }
    }

    private void a(String str, Context context, View view, int i10, Map map) {
        FrameLayout.LayoutParams layoutParams;
        String a10 = x.a(str, "cltp");
        long parseLong = !TextUtils.isEmpty(a10) ? Long.parseLong(a10) : 0L;
        if (parseLong != 0) {
            if (map != null && map.containsKey("is_dy_success")) {
                f11491k = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            f11491k = false;
            TextView textView = (TextView) view.findViewById(a("anythink_choice_one_countdown_tv"));
            textView.setTextSize(11.0f);
            textView.setTextColor(Color.parseColor(this.f));
            String str2 = this.f11496g;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor(str2));
            gradientDrawable.setCornerRadius(t.b(textView.getContext(), 12.0f));
            gradientDrawable.setStroke(t.b(textView.getContext(), 1.0f), Color.parseColor(str2));
            textView.setBackgroundDrawable(gradientDrawable);
            if (i10 == 2 && (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) != null) {
                int d10 = t.d(context);
                int b10 = t.b(context, 10.0f);
                layoutParams.setMargins(b10, b10, d10, b10);
            }
            textView.setVisibility(0);
            textView.setOnClickListener(new AnonymousClass5(map));
            this.f11500l = new AnonymousClass6(textView, map);
            com.anythink.expressad.video.dynview.i.c.b a11 = new com.anythink.expressad.video.dynview.i.c.b().a(parseLong * 1000).a().a(this.f11500l);
            this.f11493c = a11;
            a11.b();
        }
    }

    private void a(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        a(imageView, str, -1);
    }

    private void a(final ImageView imageView, String str, final int i10) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        com.anythink.expressad.foundation.g.d.b.a(imageView.getContext()).a(str, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.video.dynview.j.a.10
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str2) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    int i11 = i10;
                    if (i11 != 501 && i11 != 802) {
                        imageView.setImageBitmap(bitmap);
                        return;
                    }
                    ImageView imageView2 = imageView;
                    com.anythink.expressad.video.dynview.i.b.a();
                    imageView2.setImageBitmap(com.anythink.expressad.video.dynview.i.b.a(bitmap, 0));
                    return;
                }
                int a10 = i.a(imageView.getContext(), "anythink_icon_play_bg", i.f10125c);
                imageView.setBackgroundColor(Color.parseColor(a.this.f11497h));
                imageView.setImageResource(a10);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str2, String str3) {
                try {
                    int a10 = i.a(imageView.getContext(), "anythink_icon_play_bg", i.f10125c);
                    imageView.setBackgroundColor(Color.parseColor(a.this.f11497h));
                    imageView.setImageResource(a10);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                } catch (Exception e10) {
                    o.a(a.f11490a, e10.getMessage());
                }
            }
        });
    }

    private void a(final String str, final ImageView imageView, final com.anythink.expressad.video.dynview.c cVar, final View view) {
        com.anythink.expressad.foundation.g.d.b.a(imageView.getContext()).a(str, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.video.dynview.j.a.2
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str2, String str3) {
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str2) {
                ImageView imageView2;
                if (bitmap == null || bitmap.isRecycled() || (imageView2 = imageView) == null) {
                    return;
                }
                imageView2.setImageBitmap(bitmap);
                if (a.this.f11494d != null) {
                    a.this.f11494d.put(p.a(str), bitmap);
                    a.a(a.this, cVar, view);
                }
            }
        });
        if (a() != null) {
            b(cVar, view);
        }
    }

    private void a(Map map) {
        if (map != null) {
            try {
                if (map.containsKey(com.anythink.expressad.video.dynview.a.a.D) && (map.get(com.anythink.expressad.video.dynview.a.a.D) instanceof com.anythink.expressad.video.dynview.f.d)) {
                    ((com.anythink.expressad.video.dynview.f.d) map.get(com.anythink.expressad.video.dynview.a.a.D)).a();
                    b();
                }
            } catch (Exception e10) {
                o.d(f11490a, e10.getMessage());
            }
        }
    }

    private void a(Map map, List<com.anythink.expressad.foundation.d.c> list, int i10) {
        if (map == null || list == null || list.size() <= 1) {
            return;
        }
        if (map.containsKey(com.anythink.expressad.video.dynview.a.a.D) && (map.get(com.anythink.expressad.video.dynview.a.a.D) instanceof com.anythink.expressad.video.dynview.f.d)) {
            com.anythink.expressad.video.dynview.f.d dVar = (com.anythink.expressad.video.dynview.f.d) map.get(com.anythink.expressad.video.dynview.a.a.D);
            if (dVar != null) {
                dVar.a(list.get(i10));
            }
            b();
            return;
        }
        if (map.containsKey(com.anythink.expressad.video.dynview.a.a.E) && (map.get(com.anythink.expressad.video.dynview.a.a.E) instanceof com.anythink.expressad.video.dynview.f.c)) {
            com.anythink.expressad.video.dynview.f.c cVar = (com.anythink.expressad.video.dynview.f.c) map.get(com.anythink.expressad.video.dynview.a.a.E);
            if (cVar != null) {
                cVar.a(list.get(i10), i10);
            }
            b();
        }
    }

    private void a(com.anythink.expressad.video.dynview.c cVar, View view) {
        Map<String, Bitmap> map = this.f11494d;
        if (map == null || map.size() <= 1) {
            return;
        }
        new com.anythink.expressad.video.dynview.h.b();
        Map<String, Bitmap> map2 = this.f11494d;
        if (view != null) {
            com.anythink.expressad.video.dynview.i.a.a.a().a(map2, cVar, view);
        }
    }

    private static int a(String str) {
        return i.a(n.a().g(), str, "id");
    }

    private Bitmap a() {
        Bitmap bitmap = null;
        try {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
            bitmap.eraseColor(Color.parseColor(this.f11498i));
            return bitmap;
        } catch (Exception e10) {
            if (!com.anythink.expressad.a.f6552a) {
                return bitmap;
            }
            e10.printStackTrace();
            return bitmap;
        }
    }

    public static /* synthetic */ void a(a aVar, Map map, List list, int i10) {
        if (map == null || list == null || list.size() <= 1) {
            return;
        }
        if (map.containsKey(com.anythink.expressad.video.dynview.a.a.D) && (map.get(com.anythink.expressad.video.dynview.a.a.D) instanceof com.anythink.expressad.video.dynview.f.d)) {
            com.anythink.expressad.video.dynview.f.d dVar = (com.anythink.expressad.video.dynview.f.d) map.get(com.anythink.expressad.video.dynview.a.a.D);
            if (dVar != null) {
                dVar.a((com.anythink.expressad.foundation.d.c) list.get(i10));
            }
            aVar.b();
            return;
        }
        if (map.containsKey(com.anythink.expressad.video.dynview.a.a.E) && (map.get(com.anythink.expressad.video.dynview.a.a.E) instanceof com.anythink.expressad.video.dynview.f.c)) {
            com.anythink.expressad.video.dynview.f.c cVar = (com.anythink.expressad.video.dynview.f.c) map.get(com.anythink.expressad.video.dynview.a.a.E);
            if (cVar != null) {
                cVar.a((com.anythink.expressad.foundation.d.c) list.get(i10), i10);
            }
            aVar.b();
        }
    }

    public static /* synthetic */ void a(a aVar, Map map) {
        if (map != null) {
            try {
                if (map.containsKey(com.anythink.expressad.video.dynview.a.a.D) && (map.get(com.anythink.expressad.video.dynview.a.a.D) instanceof com.anythink.expressad.video.dynview.f.d)) {
                    ((com.anythink.expressad.video.dynview.f.d) map.get(com.anythink.expressad.video.dynview.a.a.D)).a();
                    aVar.b();
                }
            } catch (Exception e10) {
                o.d(f11490a, e10.getMessage());
            }
        }
    }

    public static /* synthetic */ void a(a aVar, com.anythink.expressad.video.dynview.c cVar, View view) {
        Map<String, Bitmap> map = aVar.f11494d;
        if (map == null || map.size() <= 1) {
            return;
        }
        new com.anythink.expressad.video.dynview.h.b();
        Map<String, Bitmap> map2 = aVar.f11494d;
        if (view != null) {
            com.anythink.expressad.video.dynview.i.a.a.a().a(map2, cVar, view);
        }
    }
}
