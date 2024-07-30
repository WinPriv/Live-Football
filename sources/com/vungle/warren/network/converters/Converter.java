package com.vungle.warren.network.converters;

import java.io.IOException;

/* loaded from: classes2.dex */
public interface Converter<In, Out> {
    Out convert(In in) throws IOException;
}
