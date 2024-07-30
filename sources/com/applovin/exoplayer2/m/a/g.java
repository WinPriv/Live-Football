package com.applovin.exoplayer2.m.a;

import com.applovin.exoplayer2.m.a.e;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f16408a = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f16409b = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: c, reason: collision with root package name */
    private static final float[] f16410c = {1.0f, gl.Code, gl.Code, gl.Code, -1.0f, gl.Code, gl.Code, 1.0f, 1.0f};

    /* renamed from: d, reason: collision with root package name */
    private static final float[] f16411d = {1.0f, gl.Code, gl.Code, gl.Code, -0.5f, gl.Code, gl.Code, 0.5f, 1.0f};

    /* renamed from: e, reason: collision with root package name */
    private static final float[] f16412e = {1.0f, gl.Code, gl.Code, gl.Code, -0.5f, gl.Code, gl.Code, 1.0f, 1.0f};
    private static final float[] f = {0.5f, gl.Code, gl.Code, gl.Code, -1.0f, gl.Code, gl.Code, 1.0f, 1.0f};

    /* renamed from: g, reason: collision with root package name */
    private static final float[] f16413g = {0.5f, gl.Code, gl.Code, gl.Code, -1.0f, gl.Code, 0.5f, 1.0f, 1.0f};

    public static boolean a(e eVar) {
        e.a aVar = eVar.f16399a;
        e.a aVar2 = eVar.f16400b;
        if (aVar.a() != 1 || aVar.a(0).f16404a != 0 || aVar2.a() != 1 || aVar2.a(0).f16404a != 0) {
            return false;
        }
        return true;
    }
}
