package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import d0.a;
import d6.g0;
import e6.n;
import j7.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k4.b1;
import k4.e1;
import k4.q1;
import k4.r1;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@Deprecated
/* loaded from: classes2.dex */
public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int R = 0;
    public final TextView A;
    public final PlayerControlView B;
    public final FrameLayout C;
    public final FrameLayout D;
    public e1 E;
    public boolean F;
    public PlayerControlView.d G;
    public boolean H;
    public Drawable I;
    public int J;
    public boolean K;
    public CharSequence L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;

    /* renamed from: s, reason: collision with root package name */
    public final a f20291s;

    /* renamed from: t, reason: collision with root package name */
    public final AspectRatioFrameLayout f20292t;

    /* renamed from: u, reason: collision with root package name */
    public final View f20293u;

    /* renamed from: v, reason: collision with root package name */
    public final View f20294v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f20295w;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f20296x;
    public final SubtitleView y;

    /* renamed from: z, reason: collision with root package name */
    public final View f20297z;

    /* loaded from: classes2.dex */
    public final class a implements e1.c, View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.d {

        /* renamed from: s, reason: collision with root package name */
        public final q1.b f20298s = new q1.b();

        /* renamed from: t, reason: collision with root package name */
        public Object f20299t;

        public a() {
        }

        @Override // k4.e1.c
        public final void D(int i10, boolean z10) {
            int i11 = PlayerView.R;
            PlayerView playerView = PlayerView.this;
            playerView.i();
            if (playerView.b() && playerView.O) {
                PlayerControlView playerControlView = playerView.B;
                if (playerControlView != null) {
                    playerControlView.c();
                    return;
                }
                return;
            }
            playerView.c(false);
        }

        @Override // k4.e1.c
        public final void F(int i10) {
            int i11 = PlayerView.R;
            PlayerView playerView = PlayerView.this;
            playerView.i();
            playerView.k();
            if (playerView.b() && playerView.O) {
                PlayerControlView playerControlView = playerView.B;
                if (playerControlView != null) {
                    playerControlView.c();
                    return;
                }
                return;
            }
            playerView.c(false);
        }

        @Override // k4.e1.c
        public final void M(r1 r1Var) {
            PlayerView playerView = PlayerView.this;
            e1 e1Var = playerView.E;
            e1Var.getClass();
            q1 I = e1Var.I();
            if (I.p()) {
                this.f20299t = null;
            } else {
                boolean isEmpty = e1Var.w().f30780s.isEmpty();
                q1.b bVar = this.f20298s;
                if (!isEmpty) {
                    this.f20299t = I.f(e1Var.j(), bVar, true).f30755t;
                } else {
                    Object obj = this.f20299t;
                    if (obj != null) {
                        int b10 = I.b(obj);
                        if (b10 != -1) {
                            if (e1Var.B() == I.f(b10, bVar, false).f30756u) {
                                return;
                            }
                        }
                        this.f20299t = null;
                    }
                }
            }
            playerView.l(false);
        }

        @Override // k4.e1.c
        public final void X() {
            View view = PlayerView.this.f20293u;
            if (view != null) {
                view.setVisibility(4);
            }
        }

        @Override // k4.e1.c
        public final void a(n nVar) {
            int i10 = PlayerView.R;
            PlayerView.this.h();
        }

        @Override // k4.e1.c
        public final void f0(int i10, e1.d dVar, e1.d dVar2) {
            PlayerControlView playerControlView;
            int i11 = PlayerView.R;
            PlayerView playerView = PlayerView.this;
            if (playerView.b() && playerView.O && (playerControlView = playerView.B) != null) {
                playerControlView.c();
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i10 = PlayerView.R;
            PlayerView.this.g();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            PlayerView.a((TextureView) view, PlayerView.this.Q);
        }

        @Override // k4.e1.c
        public final void u(r5.c cVar) {
            SubtitleView subtitleView = PlayerView.this.y;
            if (subtitleView != null) {
                subtitleView.setCues(cVar.f34917s);
            }
        }

        @Override // com.google.android.exoplayer2.ui.PlayerControlView.d
        public final void z() {
            int i10 = PlayerView.R;
            PlayerView.this.j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        boolean z17;
        int i17;
        boolean z18;
        a aVar = new a();
        this.f20291s = aVar;
        if (isInEditMode()) {
            this.f20292t = null;
            this.f20293u = null;
            this.f20294v = null;
            this.f20295w = false;
            this.f20296x = null;
            this.y = null;
            this.f20297z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            ImageView imageView = new ImageView(context);
            if (g0.f27302a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(g0.q(context, resources, R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(g0.q(context, resources2, R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        int i18 = R.layout.exo_player_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, androidx.activity.n.f515w, 0, 0);
            try {
                z13 = obtainStyledAttributes.hasValue(23);
                i12 = obtainStyledAttributes.getColor(23, 0);
                i18 = obtainStyledAttributes.getResourceId(12, R.layout.exo_player_view);
                z14 = obtainStyledAttributes.getBoolean(28, true);
                i15 = obtainStyledAttributes.getResourceId(6, 0);
                boolean z19 = obtainStyledAttributes.getBoolean(29, true);
                i13 = obtainStyledAttributes.getInt(24, 1);
                i11 = obtainStyledAttributes.getInt(14, 0);
                int i19 = obtainStyledAttributes.getInt(22, 5000);
                boolean z20 = obtainStyledAttributes.getBoolean(8, true);
                boolean z21 = obtainStyledAttributes.getBoolean(2, true);
                int integer = obtainStyledAttributes.getInteger(20, 0);
                this.K = obtainStyledAttributes.getBoolean(9, this.K);
                z10 = obtainStyledAttributes.getBoolean(7, true);
                obtainStyledAttributes.recycle();
                z12 = z20;
                i14 = integer;
                i10 = i19;
                z11 = z21;
                z15 = z19;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i10 = 5000;
            z10 = true;
            i11 = 0;
            i12 = 0;
            i13 = 1;
            i14 = 0;
            z11 = true;
            z12 = true;
            z13 = false;
            z14 = true;
            i15 = 0;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i18, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f20292t = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i11);
        }
        View findViewById = findViewById(R.id.exo_shutter);
        this.f20293u = findViewById;
        if (findViewById != null && z13) {
            findViewById.setBackgroundColor(i12);
        }
        if (aspectRatioFrameLayout != null && i13 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        this.f20294v = new SurfaceView(context);
                    } else {
                        try {
                            int i20 = VideoDecoderGLSurfaceView.f20387t;
                            this.f20294v = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                        } catch (Exception e10) {
                            throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e10);
                        }
                    }
                } else {
                    try {
                        int i21 = SphericalGLSurfaceView.D;
                        this.f20294v = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                        z16 = true;
                        this.f20294v.setLayoutParams(layoutParams);
                        this.f20294v.setOnClickListener(aVar);
                        i16 = 0;
                        this.f20294v.setClickable(false);
                        aspectRatioFrameLayout.addView(this.f20294v, 0);
                    } catch (Exception e11) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e11);
                    }
                }
            } else {
                this.f20294v = new TextureView(context);
            }
            z16 = false;
            this.f20294v.setLayoutParams(layoutParams);
            this.f20294v.setOnClickListener(aVar);
            i16 = 0;
            this.f20294v.setClickable(false);
            aspectRatioFrameLayout.addView(this.f20294v, 0);
        } else {
            i16 = 0;
            this.f20294v = null;
            z16 = false;
        }
        this.f20295w = z16;
        this.C = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.D = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f20296x = imageView2;
        if (z14 && imageView2 != null) {
            z17 = 1;
        } else {
            z17 = i16;
        }
        this.H = z17;
        if (i15 != 0) {
            Context context2 = getContext();
            Object obj = d0.a.f27248a;
            this.I = a.c.b(context2, i15);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.y = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View findViewById2 = findViewById(R.id.exo_buffering);
        this.f20297z = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.J = i14;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.A = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(R.id.exo_controller);
        View findViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (playerControlView != null) {
            this.B = playerControlView;
        } else if (findViewById3 != null) {
            PlayerControlView playerControlView2 = new PlayerControlView(context, attributeSet);
            this.B = playerControlView2;
            playerControlView2.setId(R.id.exo_controller);
            playerControlView2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(playerControlView2, indexOfChild);
        } else {
            this.B = null;
        }
        PlayerControlView playerControlView3 = this.B;
        if (playerControlView3 != null) {
            i17 = i10;
        } else {
            i17 = i16;
        }
        this.M = i17;
        this.P = z12;
        this.N = z11;
        this.O = z10;
        if (z15 && playerControlView3 != null) {
            z18 = 1;
        } else {
            z18 = i16;
        }
        this.F = z18;
        if (playerControlView3 != null) {
            playerControlView3.c();
            this.B.f20280t.add(aVar);
        }
        if (z15) {
            setClickable(true);
        }
        j();
    }

    public static void a(TextureView textureView, int i10) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != gl.Code && height != gl.Code && i10 != 0) {
            float f = width / 2.0f;
            float f10 = height / 2.0f;
            matrix.postRotate(i10, f, f10);
            RectF rectF = new RectF(gl.Code, gl.Code, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f10);
        }
        textureView.setTransform(matrix);
    }

    public final boolean b() {
        e1 e1Var = this.E;
        if (e1Var != null && e1Var.c() && this.E.g()) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        boolean z11;
        if ((!b() || !this.O) && m()) {
            PlayerControlView playerControlView = this.B;
            if (playerControlView.e() && playerControlView.getShowTimeoutMs() <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean e10 = e();
            if (z10 || z11 || e10) {
                f(e10);
            }
        }
    }

    @RequiresNonNull({"artworkView"})
    public final boolean d(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f20292t;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f);
                }
                ImageView imageView = this.f20296x;
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        e1 e1Var = this.E;
        if (e1Var != null && e1Var.c()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19 && keyCode != 270 && keyCode != 22 && keyCode != 271 && keyCode != 20 && keyCode != 269 && keyCode != 21 && keyCode != 268 && keyCode != 23) {
            z10 = false;
        } else {
            z10 = true;
        }
        PlayerControlView playerControlView = this.B;
        if (z10 && m() && !playerControlView.e()) {
            c(true);
        } else {
            if (m() && playerControlView.a(keyEvent)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && !super.dispatchKeyEvent(keyEvent)) {
                if (!z10 || !m()) {
                    return false;
                }
                c(true);
                return false;
            }
            c(true);
        }
        return true;
    }

    public final boolean e() {
        e1 e1Var = this.E;
        if (e1Var == null) {
            return true;
        }
        int v3 = e1Var.v();
        if (this.N && (v3 == 1 || v3 == 4 || !this.E.g())) {
            return true;
        }
        return false;
    }

    public final void f(boolean z10) {
        int i10;
        if (!m()) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = this.M;
        }
        PlayerControlView playerControlView = this.B;
        playerControlView.setShowTimeoutMs(i10);
        if (!playerControlView.e()) {
            playerControlView.setVisibility(0);
            Iterator<PlayerControlView.d> it = playerControlView.f20280t.iterator();
            while (it.hasNext()) {
                PlayerControlView.d next = it.next();
                playerControlView.getVisibility();
                next.z();
            }
            playerControlView.i();
            playerControlView.h();
            playerControlView.k();
            playerControlView.l();
            playerControlView.m();
            boolean f = playerControlView.f();
            View view = playerControlView.f20288x;
            View view2 = playerControlView.f20286w;
            if (!f && view2 != null) {
                view2.requestFocus();
            } else if (f && view != null) {
                view.requestFocus();
            }
            boolean f10 = playerControlView.f();
            if (!f10 && view2 != null) {
                view2.sendAccessibilityEvent(8);
            } else if (f10 && view != null) {
                view.sendAccessibilityEvent(8);
            }
        }
        playerControlView.d();
    }

    public final void g() {
        if (m() && this.E != null) {
            PlayerControlView playerControlView = this.B;
            if (!playerControlView.e()) {
                c(true);
            } else if (this.P) {
                playerControlView.c();
            }
        }
    }

    public List<com.google.android.exoplayer2.ui.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        if (this.D != null) {
            arrayList.add(new com.google.android.exoplayer2.ui.a(0));
        }
        if (this.B != null) {
            arrayList.add(new com.google.android.exoplayer2.ui.a());
        }
        return j0.C(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.C;
        d6.a.f(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.N;
    }

    public boolean getControllerHideOnTouch() {
        return this.P;
    }

    public int getControllerShowTimeoutMs() {
        return this.M;
    }

    public Drawable getDefaultArtwork() {
        return this.I;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.D;
    }

    public e1 getPlayer() {
        return this.E;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f20292t;
        d6.a.e(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.y;
    }

    public boolean getUseArtwork() {
        return this.H;
    }

    public boolean getUseController() {
        return this.F;
    }

    public View getVideoSurfaceView() {
        return this.f20294v;
    }

    public final void h() {
        n nVar;
        float f;
        e1 e1Var = this.E;
        if (e1Var != null) {
            nVar = e1Var.l();
        } else {
            nVar = n.f27842w;
        }
        int i10 = nVar.f27845s;
        float f10 = gl.Code;
        int i11 = nVar.f27846t;
        if (i11 != 0 && i10 != 0) {
            f = (i10 * nVar.f27848v) / i11;
        } else {
            f = 0.0f;
        }
        View view = this.f20294v;
        if (view instanceof TextureView) {
            int i12 = nVar.f27847u;
            if (f > gl.Code && (i12 == 90 || i12 == 270)) {
                f = 1.0f / f;
            }
            int i13 = this.Q;
            a aVar = this.f20291s;
            if (i13 != 0) {
                view.removeOnLayoutChangeListener(aVar);
            }
            this.Q = i12;
            if (i12 != 0) {
                view.addOnLayoutChangeListener(aVar);
            }
            a((TextureView) view, this.Q);
        }
        if (!this.f20295w) {
            f10 = f;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f20292t;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r5.E.g() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r5 = this;
            android.view.View r0 = r5.f20297z
            if (r0 == 0) goto L29
            k4.e1 r1 = r5.E
            r2 = 0
            if (r1 == 0) goto L20
            int r1 = r1.v()
            r3 = 2
            if (r1 != r3) goto L20
            int r1 = r5.J
            r4 = 1
            if (r1 == r3) goto L21
            if (r1 != r4) goto L20
            k4.e1 r1 = r5.E
            boolean r1 = r1.g()
            if (r1 == 0) goto L20
            goto L21
        L20:
            r4 = r2
        L21:
            if (r4 == 0) goto L24
            goto L26
        L24:
            r2 = 8
        L26:
            r0.setVisibility(r2)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerView.i():void");
    }

    public final void j() {
        String str = null;
        PlayerControlView playerControlView = this.B;
        if (playerControlView != null && this.F) {
            if (playerControlView.getVisibility() == 0) {
                if (this.P) {
                    str = getResources().getString(R.string.exo_controls_hide);
                }
                setContentDescription(str);
                return;
            }
            setContentDescription(getResources().getString(R.string.exo_controls_show));
            return;
        }
        setContentDescription(null);
    }

    public final void k() {
        TextView textView = this.A;
        if (textView != null) {
            CharSequence charSequence = this.L;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                e1 e1Var = this.E;
                if (e1Var != null) {
                    e1Var.z();
                }
                textView.setVisibility(8);
            }
        }
    }

    public final void l(boolean z10) {
        boolean z11;
        e1 e1Var = this.E;
        View view = this.f20293u;
        boolean z12 = false;
        ImageView imageView = this.f20296x;
        if (e1Var != null && e1Var.C(30) && !e1Var.w().f30780s.isEmpty()) {
            if (z10 && !this.K && view != null) {
                view.setVisibility(0);
            }
            if (e1Var.w().a(2)) {
                if (imageView != null) {
                    imageView.setImageResource(android.R.color.transparent);
                    imageView.setVisibility(4);
                    return;
                }
                return;
            }
            if (view != null) {
                view.setVisibility(0);
            }
            if (this.H) {
                d6.a.e(imageView);
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                byte[] bArr = e1Var.Q().B;
                if (bArr != null) {
                    z12 = d(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (z12 || d(this.I)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
                return;
            }
            return;
        }
        if (!this.K) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    public final boolean m() {
        if (this.F) {
            d6.a.e(this.B);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (m() && this.E != null) {
            c(true);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        g();
        return super.performClick();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.a aVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f20292t;
        d6.a.e(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(aVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.N = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.O = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        d6.a.e(this.B);
        this.P = z10;
        j();
    }

    public void setControllerShowTimeoutMs(int i10) {
        PlayerControlView playerControlView = this.B;
        d6.a.e(playerControlView);
        this.M = i10;
        if (playerControlView.e()) {
            f(e());
        }
    }

    public void setControllerVisibilityListener(PlayerControlView.d dVar) {
        PlayerControlView playerControlView = this.B;
        d6.a.e(playerControlView);
        PlayerControlView.d dVar2 = this.G;
        if (dVar2 == dVar) {
            return;
        }
        CopyOnWriteArrayList<PlayerControlView.d> copyOnWriteArrayList = playerControlView.f20280t;
        if (dVar2 != null) {
            copyOnWriteArrayList.remove(dVar2);
        }
        this.G = dVar;
        if (dVar != null) {
            copyOnWriteArrayList.add(dVar);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        boolean z10;
        if (this.A != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        this.L = charSequence;
        k();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.I != drawable) {
            this.I = drawable;
            l(false);
        }
    }

    public void setErrorMessageProvider(d6.i<? super b1> iVar) {
        if (iVar != null) {
            k();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            l(false);
        }
    }

    public void setPlayer(e1 e1Var) {
        boolean z10;
        boolean z11;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        if (e1Var != null && e1Var.J() != Looper.getMainLooper()) {
            z11 = false;
        } else {
            z11 = true;
        }
        d6.a.a(z11);
        e1 e1Var2 = this.E;
        if (e1Var2 == e1Var) {
            return;
        }
        View view = this.f20294v;
        a aVar = this.f20291s;
        if (e1Var2 != null) {
            e1Var2.s(aVar);
            if (e1Var2.C(27)) {
                if (view instanceof TextureView) {
                    e1Var2.k((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    e1Var2.E((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.y;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.E = e1Var;
        boolean m10 = m();
        PlayerControlView playerControlView = this.B;
        if (m10) {
            playerControlView.setPlayer(e1Var);
        }
        i();
        k();
        l(true);
        if (e1Var != null) {
            if (e1Var.C(27)) {
                if (view instanceof TextureView) {
                    e1Var.O((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    e1Var.p((SurfaceView) view);
                }
                h();
            }
            if (subtitleView != null && e1Var.C(28)) {
                subtitleView.setCues(e1Var.y().f34917s);
            }
            e1Var.q(aVar);
            c(false);
            return;
        }
        if (playerControlView != null) {
            playerControlView.c();
        }
    }

    public void setRepeatToggleModes(int i10) {
        PlayerControlView playerControlView = this.B;
        d6.a.e(playerControlView);
        playerControlView.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f20292t;
        d6.a.e(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.J != i10) {
            this.J = i10;
            i();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        PlayerControlView playerControlView = this.B;
        d6.a.e(playerControlView);
        playerControlView.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        PlayerControlView playerControlView = this.B;
        d6.a.e(playerControlView);
        playerControlView.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        PlayerControlView playerControlView = this.B;
        d6.a.e(playerControlView);
        playerControlView.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        PlayerControlView playerControlView = this.B;
        d6.a.e(playerControlView);
        playerControlView.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        PlayerControlView playerControlView = this.B;
        d6.a.e(playerControlView);
        playerControlView.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        PlayerControlView playerControlView = this.B;
        d6.a.e(playerControlView);
        playerControlView.setShowShuffleButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f20293u;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseArtwork(boolean z10) {
        boolean z11;
        if (z10 && this.f20296x == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        d6.a.d(z11);
        if (this.H != z10) {
            this.H = z10;
            l(false);
        }
    }

    public void setUseController(boolean z10) {
        boolean z11;
        boolean z12 = false;
        PlayerControlView playerControlView = this.B;
        if (z10 && playerControlView == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        d6.a.d(z11);
        if (z10 || hasOnClickListeners()) {
            z12 = true;
        }
        setClickable(z12);
        if (this.F == z10) {
            return;
        }
        this.F = z10;
        if (m()) {
            playerControlView.setPlayer(this.E);
        } else if (playerControlView != null) {
            playerControlView.c();
            playerControlView.setPlayer(null);
        }
        j();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f20294v;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }
}
