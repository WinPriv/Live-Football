package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import com.hamkho.livefoot.R;
import com.huawei.featurelayer.sharedfeature.xrkit.sdk.IArSceneView;
import com.huawei.featurelayer.sharedfeature.xrkit.sdk.IModel;
import com.huawei.featurelayer.sharedfeature.xrkit.sdk.IModelListener;
import com.huawei.openalliance.ad.ppskit.augreality.view.PPSArHorizontalScrollView;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.utils.e2;
import com.huawei.openalliance.ad.ppskit.views.VideoView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ka.n7;
import ka.o4;

/* loaded from: classes2.dex */
public class PPSArView extends AutoScaleSizeRelativeLayout implements IModelListener, VideoView.n {
    public static final /* synthetic */ int W = 0;
    public IArSceneView A;
    public PPSArHorizontalScrollView B;
    public o4 C;
    public ImageView D;
    public va.f E;
    public int F;
    public boolean G;
    public ContentRecord H;
    public Context I;
    public RelativeLayout J;
    public View K;
    public IModel L;
    public String M;
    public String N;
    public List<na.a> O;
    public final String P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final a U;
    public final b V;

    /* renamed from: x, reason: collision with root package name */
    public RadioGroup f23160x;
    public RadioButton y;

    /* renamed from: z, reason: collision with root package name */
    public RadioButton f23161z;

    /* loaded from: classes2.dex */
    public class a extends Handler {
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            PPSArView pPSArView = PPSArView.this;
            int i10 = pPSArView.Q;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = (pPSArView.O.size() - pPSArView.Q) - 1;
            }
            if (i10 == 0) {
                pPSArView.B.scrollTo(0, 0);
                return;
            }
            if (i10 > 0 && i10 < pPSArView.O.size() - 1) {
                PPSArHorizontalScrollView pPSArHorizontalScrollView = pPSArView.B;
                pPSArHorizontalScrollView.scrollTo((pPSArHorizontalScrollView.getmChildViewWidth() * i10) - ((pPSArView.B.getmScreenWitdh() - pPSArView.B.getmChildViewWidth()) / 2), 0);
            } else {
                PPSArHorizontalScrollView pPSArHorizontalScrollView2 = pPSArView.B;
                pPSArHorizontalScrollView2.scrollTo(((i10 + 1) * pPSArHorizontalScrollView2.getmChildViewWidth()) - pPSArView.B.getmScreenWitdh(), 0);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSArView pPSArView = PPSArView.this;
            pPSArView.A.removeModel(pPSArView.L);
            pPSArView.L = null;
            n7.c("PPSArView", "load model, position:%s", Integer.valueOf(pPSArView.F));
            pPSArView.M = ((na.a) pPSArView.O.get(pPSArView.F)).a();
            pPSArView.N = ((na.a) pPSArView.O.get(pPSArView.F)).b();
            if (!com.huawei.openalliance.ad.ppskit.utils.x.q(com.huawei.openalliance.ad.ppskit.utils.x.d(Uri.parse(pPSArView.N)))) {
                pPSArView.N = "file:///android_asset/ar/sceneBackground.png";
            }
            pPSArView.A.loadModel(pPSArView.M, (Object) null);
            pPSArView.A.setBackground(pPSArView.N);
        }
    }

    public PPSArView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = false;
        this.O = new ArrayList();
        this.P = "AR_LOAD_" + hashCode();
        this.T = 0;
        this.U = new a();
        this.V = new b();
        View.inflate(context, R.layout.hiad_ar_layout, this);
        this.I = context;
        this.J = (RelativeLayout) findViewById(R.id.arScenceLayout);
        this.f23160x = (RadioGroup) findViewById(R.id.arBtnGroup);
        this.y = (RadioButton) findViewById(R.id.ar_btn_3d);
        this.f23161z = (RadioButton) findViewById(R.id.ar_btn_ar);
        this.D = (ImageView) findViewById(R.id.ar_ad_close);
        this.B = (PPSArHorizontalScrollView) findViewById(R.id.scrollItemLayout);
        this.D.setOnClickListener(new i(this));
        this.I.getApplicationContext();
        if (n7.d()) {
            n7.b("PPSArView", "init radio listener");
        }
        this.f23160x.setOnCheckedChangeListener(new j(this));
        this.C = new o4(this.I);
    }

    public static void y(PPSArView pPSArView, int i10) {
        if (pPSArView.F != i10) {
            pPSArView.F = i10;
            pPSArView.b();
        }
    }

    public final void b() {
        if (this.O.size() == 0) {
            return;
        }
        String str = this.P;
        com.huawei.openalliance.ad.ppskit.utils.c0 c0Var = com.huawei.openalliance.ad.ppskit.utils.f1.f22845a;
        c0Var.d(str);
        c0Var.c(new c(), this.P, 500L);
    }

    public int getmCurrentIndex() {
        return this.Q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.e("PPSArView", "onAttachedToWindow");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n7.e("PPSArView", "onDetechedFromWindow");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
    }

    public final void r(IArSceneView iArSceneView, ArrayList arrayList, Map map, boolean z10) {
        String a10;
        String b10;
        iArSceneView.setModelListener(this);
        iArSceneView.setPlaneVisible(true);
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                break;
            }
            if ("1".equals(this.O.get(i10).c())) {
                this.T = i10;
                break;
            }
            i10++;
        }
        int i11 = this.Q;
        if (i11 == 0) {
            i11 = this.T;
        }
        this.Q = i11;
        this.S = i11;
        this.F = i11;
        if (this.O.size() == 0) {
            a10 = "";
        } else {
            a10 = this.O.get(this.Q).a();
        }
        this.M = a10;
        if (this.O.size() == 0) {
            b10 = "file:///android_asset/ar/sceneBackground.png";
        } else {
            b10 = this.O.get(this.Q).b();
        }
        this.N = b10;
        if (!com.huawei.openalliance.ad.ppskit.utils.x.q(com.huawei.openalliance.ad.ppskit.utils.x.d(Uri.parse(b10)))) {
            this.N = "file:///android_asset/ar/sceneBackground.png";
        }
        iArSceneView.loadModel(this.M, (Object) null);
        iArSceneView.setBackground(this.N);
        this.K = iArSceneView.getView();
        IArSceneView iArSceneView2 = this.A;
        if (z10) {
            iArSceneView2.setArMode(this.G);
        } else {
            iArSceneView2.setArMode(false);
        }
        this.J.addView(this.K, 0);
        na.d dVar = new na.d(getContext(), arrayList, this.H, map);
        this.B.setOnScrollChangeListener(new k(this));
        PPSArHorizontalScrollView pPSArHorizontalScrollView = this.B;
        pPSArHorizontalScrollView.f22437v = dVar;
        LinearLayout linearLayout = (LinearLayout) pPSArHorizontalScrollView.getChildAt(0);
        pPSArHorizontalScrollView.f22434s = linearLayout;
        View a11 = dVar.a(0, linearLayout);
        pPSArHorizontalScrollView.f22434s.addView(a11);
        if (pPSArHorizontalScrollView.f22435t == 0 && pPSArHorizontalScrollView.f22436u == 0) {
            a11.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            pPSArHorizontalScrollView.f22436u = a11.getMeasuredHeight();
            pPSArHorizontalScrollView.f22435t = a11.getMeasuredWidth() + ((int) e2.a(8, pPSArHorizontalScrollView.getContext()));
            n7.c("MyHorizontalScrollView", "%d,%d", Integer.valueOf(a11.getMeasuredWidth()), Integer.valueOf(a11.getMeasuredHeight()));
        }
        int size = dVar.f33487e.size();
        LinearLayout linearLayout2 = (LinearLayout) pPSArHorizontalScrollView.getChildAt(0);
        pPSArHorizontalScrollView.f22434s = linearLayout2;
        linearLayout2.removeAllViews();
        HashMap hashMap = pPSArHorizontalScrollView.y;
        hashMap.clear();
        if (size == 1) {
            View a12 = pPSArHorizontalScrollView.f22437v.a(0, pPSArHorizontalScrollView.f22434s);
            a12.setOnClickListener(pPSArHorizontalScrollView);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(a12.getLayoutParams());
            int i12 = pPSArHorizontalScrollView.f22435t;
            int i13 = pPSArHorizontalScrollView.f22438w;
            marginLayoutParams.setMargins(((i13 - i12) + ((int) e2.a(8, pPSArHorizontalScrollView.getContext()))) / 2, 0, ((i13 - pPSArHorizontalScrollView.f22435t) + ((int) e2.a(8, pPSArHorizontalScrollView.getContext()))) / 2, 0);
            pPSArHorizontalScrollView.f22434s.addView(a12, marginLayoutParams);
            hashMap.put(a12, 0);
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                View a13 = pPSArHorizontalScrollView.f22437v.a(i14, pPSArHorizontalScrollView.f22434s);
                a13.setOnClickListener(new com.huawei.openalliance.ad.ppskit.augreality.view.a(pPSArHorizontalScrollView, i14));
                pPSArHorizontalScrollView.f22434s.addView(a13);
                hashMap.put(a13, Integer.valueOf(i14));
            }
        }
        this.B.setClickItemKListener(new l(this));
        this.U.postDelayed(this.V, 300L);
    }

    public final void s(ContentRecord contentRecord, IArSceneView iArSceneView, ArrayList arrayList, int i10, Map map, boolean z10) {
        this.H = contentRecord;
        this.C.getClass();
        this.O = arrayList;
        this.A = iArSceneView;
        this.Q = i10;
        r(iArSceneView, arrayList, map, z10);
    }

    public void setOnArViewLitener(va.f fVar) {
        n7.e("PPSArView", "arViewLitener:" + fVar.hashCode());
        this.E = fVar;
    }

    public void setmCurrentIndex(int i10) {
        this.Q = i10;
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.VideoView.n
    public final void b(boolean z10) {
        if (z10) {
            return;
        }
        n7.e("PPSArView", "WIFI NOT CONNECTED");
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.VideoView.n
    public final void l() {
    }
}
