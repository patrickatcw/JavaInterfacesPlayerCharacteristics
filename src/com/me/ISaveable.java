package com.me;

import java.util.List;

    //step 1 create interface
    public interface ISaveable {

        //step 2 specify methods
        List<String> write();
        void read(List<String> savedValues);

        //step 3 create classes

}
