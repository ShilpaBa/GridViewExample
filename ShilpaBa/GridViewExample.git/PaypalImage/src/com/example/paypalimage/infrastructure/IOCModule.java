package com.example.paypalimage.infrastructure;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.example.paypalimage.implementations.CurrentAppData;
import com.example.paypalimage.interfaces.ICurrentAppData;

public class IOCModule implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(ICurrentAppData.class).to(CurrentAppData.class);
    }
}
