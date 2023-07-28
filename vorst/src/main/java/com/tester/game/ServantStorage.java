package com.tester.game;

import com.tester.basic.Servant;

import java.util.ArrayList;
import java.util.List;

public class ServantStorage {
    List<Servant> storage;

    public ServantStorage(){
        this.storage = new ArrayList<Servant>();
    }

    public List<Servant> getStorage() {
        return storage;
    }

    public void setStorage(List<Servant> storage) {
        this.storage = storage;
    }
}
