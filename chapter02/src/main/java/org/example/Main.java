package org.example;

import chapter02.*;

public class Main {
    public static void main(String[] args) {
        Variable01 v1 = new Variable01();
        v1.howToUseVariable();

        IntegerType i1 = new IntegerType();
        i1.useInteger();

        CharType c1 = new CharType();
        c1.useChar();

        FDType f1 = new FDType();
        f1.useFloatDouble();

        BooleanType b1 = new BooleanType();
        b1.useBoolean();

        StringType s1 = new StringType();
        s1.useString();

        Promotion p1 = new Promotion();
        p1.usePromotion();
        p1.usePromotion2();

    }


}