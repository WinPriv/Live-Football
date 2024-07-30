package com.google.android.material.switchmaterial;

import a0.a;
import android.R;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: classes2.dex */
public class SwitchMaterial extends SwitchCompat {
    public static final int[][] V = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList T;
    public boolean U;

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        a.K0(com.hamkho.livefoot.R.attr.colorSurface, this);
        a.K0(com.hamkho.livefoot.R.attr.colorControlActivated, this);
        getResources().getDimension(com.hamkho.livefoot.R.dimen.mtrl_switch_thumb_elevation);
        throw null;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.T == null) {
            int K0 = a.K0(com.hamkho.livefoot.R.attr.colorSurface, this);
            int K02 = a.K0(com.hamkho.livefoot.R.attr.colorControlActivated, this);
            int K03 = a.K0(com.hamkho.livefoot.R.attr.colorOnSurface, this);
            this.T = new ColorStateList(V, new int[]{a.S0(0.54f, K0, K02), a.S0(0.32f, K0, K03), a.S0(0.12f, K0, K02), a.S0(0.12f, K0, K03)});
        }
        return this.T;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.U && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.U && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.U = z10;
        if (z10) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }
}
