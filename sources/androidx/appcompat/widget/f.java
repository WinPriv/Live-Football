package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import androidx.appcompat.widget.d0;
import com.hamkho.livefoot.R;

/* compiled from: AppCompatDrawableManager.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f1158b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static f f1159c;

    /* renamed from: a, reason: collision with root package name */
    public d0 f1160a;

    /* compiled from: AppCompatDrawableManager.java */
    /* loaded from: classes.dex */
    public class a implements d0.b {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f1161a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b, reason: collision with root package name */
        public final int[] f1162b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c, reason: collision with root package name */
        public final int[] f1163c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d, reason: collision with root package name */
        public final int[] f1164d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e, reason: collision with root package name */
        public final int[] f1165e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        public final int[] f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int i10, int[] iArr) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(int i10, Context context) {
            int c10 = h0.c(R.attr.colorControlHighlight, context);
            return new ColorStateList(new int[][]{h0.f1184b, h0.f1186d, h0.f1185c, h0.f}, new int[]{h0.b(R.attr.colorButtonNormal, context), f0.a.b(c10, i10), f0.a.b(c10, i10), i10});
        }

        public static LayerDrawable c(d0 d0Var, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable f = d0Var.f(context, R.drawable.abc_star_black_48dp);
            Drawable f10 = d0Var.f(context, R.drawable.abc_star_half_black_48dp);
            if ((f instanceof BitmapDrawable) && f.getIntrinsicWidth() == dimensionPixelSize && f.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) f;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((f10 instanceof BitmapDrawable) && f10.getIntrinsicWidth() == dimensionPixelSize && f10.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) f10;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                f10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f10.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i10, PorterDuff.Mode mode) {
            int[] iArr = x.f1275a;
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = f.f1158b;
            }
            mutate.setColorFilter(f.c(i10, mode));
        }

        public final ColorStateList d(int i10, Context context) {
            if (i10 == R.drawable.abc_edit_text_material) {
                return d0.a.b(R.color.abc_tint_edittext, context);
            }
            if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
                return d0.a.b(R.color.abc_tint_switch_track, context);
            }
            if (i10 == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3];
                int[] iArr2 = new int[3];
                ColorStateList d10 = h0.d(R.attr.colorSwitchThumbNormal, context);
                if (d10 != null && d10.isStateful()) {
                    int[] iArr3 = h0.f1184b;
                    iArr[0] = iArr3;
                    iArr2[0] = d10.getColorForState(iArr3, 0);
                    iArr[1] = h0.f1187e;
                    iArr2[1] = h0.c(R.attr.colorControlActivated, context);
                    iArr[2] = h0.f;
                    iArr2[2] = d10.getDefaultColor();
                } else {
                    iArr[0] = h0.f1184b;
                    iArr2[0] = h0.b(R.attr.colorSwitchThumbNormal, context);
                    iArr[1] = h0.f1187e;
                    iArr2[1] = h0.c(R.attr.colorControlActivated, context);
                    iArr[2] = h0.f;
                    iArr2[2] = h0.c(R.attr.colorSwitchThumbNormal, context);
                }
                return new ColorStateList(iArr, iArr2);
            }
            if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(h0.c(R.attr.colorButtonNormal, context), context);
            }
            if (i10 == R.drawable.abc_btn_borderless_material) {
                return b(0, context);
            }
            if (i10 == R.drawable.abc_btn_colored_material) {
                return b(h0.c(R.attr.colorAccent, context), context);
            }
            if (i10 != R.drawable.abc_spinner_mtrl_am_alpha && i10 != R.drawable.abc_spinner_textfield_background_material) {
                if (a(i10, this.f1162b)) {
                    return h0.d(R.attr.colorControlNormal, context);
                }
                if (a(i10, this.f1165e)) {
                    return d0.a.b(R.color.abc_tint_default, context);
                }
                if (a(i10, this.f)) {
                    return d0.a.b(R.color.abc_tint_btn_checkable, context);
                }
                if (i10 == R.drawable.abc_seekbar_thumb_material) {
                    return d0.a.b(R.color.abc_tint_seek_thumb, context);
                }
                return null;
            }
            return d0.a.b(R.color.abc_tint_spinner, context);
        }
    }

    public static synchronized f a() {
        f fVar;
        synchronized (f.class) {
            if (f1159c == null) {
                d();
            }
            fVar = f1159c;
        }
        return fVar;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter g6;
        synchronized (f.class) {
            g6 = d0.g(i10, mode);
        }
        return g6;
    }

    public static synchronized void d() {
        synchronized (f.class) {
            if (f1159c == null) {
                f fVar = new f();
                f1159c = fVar;
                fVar.f1160a = d0.c();
                d0 d0Var = f1159c.f1160a;
                a aVar = new a();
                synchronized (d0Var) {
                    d0Var.f1152e = aVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, k0 k0Var, int[] iArr) {
        boolean z10;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = d0.f;
        int[] state = drawable.getState();
        int[] iArr2 = x.f1275a;
        if (drawable.mutate() == drawable) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z11 = k0Var.f1199d;
        if (!z11 && !k0Var.f1198c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z11) {
            colorStateList = k0Var.f1196a;
        } else {
            colorStateList = null;
        }
        if (k0Var.f1198c) {
            mode = k0Var.f1197b;
        } else {
            mode = d0.f;
        }
        if (colorStateList != null && mode != null) {
            porterDuffColorFilter = d0.g(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f1160a.f(context, i10);
    }
}
